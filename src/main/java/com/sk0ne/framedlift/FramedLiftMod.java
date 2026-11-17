package com.sk0ne.framedlift;

import com.sk0ne.framedlift.datagen.LiftRecipeProvider;
import net.minecraft.data.DataProvider;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(FramedLiftMod.MOD_ID)
public class FramedLiftMod {
    public static final String MOD_ID = "framedlift";
    public static final Logger LOGGER = LogUtils.getLogger();

    public FramedLiftMod(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        modEventBus.addListener(this::gatherData);
        LOGGER.info("FramedLift loaded");
    }

    private void gatherData(GatherDataEvent event) {
        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<LiftRecipeProvider>) output ->
                        new LiftRecipeProvider(output, event.getLookupProvider())
        );
    }
}
