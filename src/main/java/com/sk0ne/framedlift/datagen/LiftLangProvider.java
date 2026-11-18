package com.sk0ne.framedlift.datagen;

import com.sk0ne.framedlift.FramedLiftMod;
import com.sk0ne.framedlift.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredHolder;

public class LiftLangProvider extends LanguageProvider {

    public LiftLangProvider(PackOutput output) {
        super(output, FramedLiftMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        for (DeferredHolder<Block, ? extends Block> block : ModBlocks.BLOCKS.getEntries()) {
            String path = block.getId().getPath();
            add("block." + FramedLiftMod.MOD_ID + "." + path, prettify(path));
        }
    }

    private static String prettify(String path) {
        String name = path.replaceFirst("^lift_framed_", "").replace('_', ' ');
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
}
