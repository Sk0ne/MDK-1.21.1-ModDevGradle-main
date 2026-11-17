package com.example.framedlift;

import com.example.framedlift.datagen.LiftRecipeProvider;
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
        // Регистрация реестров
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        // Подключение datagen только на серверной стороне
        modEventBus.addListener(this::gatherData);
    }

    private void gatherData(GatherDataEvent event) {
        event.getGenerator().addProvider(
                event.includeServer(),
                new LiftRecipeProvider.Runner(
                        event.getGenerator().getPackOutput(),
                        event.getLookupProvider()
                )
        );
    }
}