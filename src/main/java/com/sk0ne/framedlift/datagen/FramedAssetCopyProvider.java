package com.sk0ne.framedlift.datagen;

import com.sk0ne.framedlift.FramedLiftMod;
import com.sk0ne.framedlift.ModBlocks;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

/**
 * Копирует blockstate и item-модель оригинального блока FramedBlocks
 * в наш неймспейс. Blockstate ссылается на модели по полным именам
 * (framedblocks:...), поэтому камуфляж-рендер работает как у оригинала.
 */
public class FramedAssetCopyProvider implements DataProvider {

    private final PackOutput output;

    public FramedAssetCopyProvider(PackOutput output) {
        this.output = output;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput ignored) {
        try {
            for (DeferredBlock<Block> block : ModBlocks.BLOCKS.getEntries()) {
                String name = block.getId().getPath();
                String originalId = name.replaceFirst("^lift_", "");

                copy("blockstates", originalId + ".json", name + ".json", true);
                copy("models/item", originalId + ".json", name + ".json", false);
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка копирования ресурсов FramedBlocks", e);
        }
        return CompletableFuture.completedFuture(null);
    }

    private void copy(String srcDir, String srcName, String dstName, boolean fallbackToCube) throws IOException {
        Path target = output.getOutputFolder(PackOutput.Target.RESOURCE_PACK)
                .resolve(FramedLiftMod.MOD_ID)
                .resolve(srcDir)
                .resolve(dstName);

        try (InputStream in = getClass().getResourceAsStream("/assets/framedblocks/" + srcDir + "/" + srcName)) {
            if (in != null) {
                Files.createDirectories(target.getParent());
                Files.write(target, in.readAllBytes());
                return;
            }
        }

        if (fallbackToCube) {
            try (InputStream in = getClass().getResourceAsStream(
                    "/assets/framedblocks/blockstates/framed_cube.json")) {
                if (in != null) {
                    Files.createDirectories(target.getParent());
                    Files.write(target, in.readAllBytes());
                    return;
                }
            }
        }

        FramedLiftMod.LOGGER.warn("FramedAssetCopyProvider: нет исходника assets/framedblocks/{}/{} — файл пропущен", srcDir, srcName);
    }

    @Override
    public String getName() {
        return "FramedLift: copy FramedBlocks assets";
    }
}
