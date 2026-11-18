package com.sk0ne.framedlift;

import com.mojang.logging.LogUtils;
import com.sk0ne.framedlift.datagen.FramedAssetCopyProvider;
import com.sk0ne.framedlift.datagen.LiftLangProvider;
import com.sk0ne.framedlift.datagen.LiftLootProvider;
import com.sk0ne.framedlift.datagen.LiftRecipeProvider;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

@Mod(FramedLiftMod.MOD_ID)
public class FramedLiftMod {

    public static final String MOD_ID = "framedlift";
    public static final Logger LOGGER = LogUtils.getLogger();

    public FramedLiftMod(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModBlockEntities.BE_TYPES.register(modEventBus);

        modEventBus.addListener(this::gatherData);
        modEventBus.addListener(this::addCreative);

        LOGGER.info("FramedLift loaded");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            ModItems.ITEMS.getEntries().forEach(entry -> event.accept(entry.get()));
        }
    }

    private void gatherData(GatherDataEvent event) {
        PackOutput output = event.getGenerator().getPackOutput();

        event.getGenerator().addProvider(event.includeServer(), new LiftRecipeProvider(output));
        event.getGenerator().addProvider(event.includeServer(), new LiftLootProvider(output));
        event.getGenerator().addProvider(event.includeClient(), new FramedAssetCopyProvider(output));
        event.getGenerator().addProvider(event.includeClient(), new LiftLangProvider(output));
    }
}
