package com.sk0ne.framedlift.datagen;

import com.sk0ne.framedlift.FramedLiftMod;
import com.sk0ne.framedlift.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredBlock;

public class LiftLangProvider extends LanguageProvider {

    public LiftLangProvider(PackOutput output) {
        super(output, FramedLiftMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        for (DeferredBlock<Block> block : ModBlocks.BLOCKS.getEntries()) {
            addBlock(block.get(), prettify(block.getId().getPath()));
        }
    }

    private static String prettify(String path) {
        String name = path.replaceFirst("^lift_", "").replace('_', ' ');
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
}
