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
import net.neoforged.neoforge.client.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
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
            event.accept(ModItems.LIFT_FRAMED_CUBE);
        }
    }

    private void gatherData(GatherDataEvent event) {
        var gen = event.getGenerator();
        PackOutput output = gen.getPackOutput();
        ExistingFileHelper exHelper = event.getExistingFileHelper();

        gen.addProvider(event.includeServer(), new LiftRecipeProvider(output));
        gen.addProvider(event.includeServer(), new LiftLootProvider(output));
        gen.addProvider(event.includeClient(), new FramedAssetCopyProvider(output));
        gen.addProvider(event.includeClient(), new LiftLangProvider(output));
    }
}
