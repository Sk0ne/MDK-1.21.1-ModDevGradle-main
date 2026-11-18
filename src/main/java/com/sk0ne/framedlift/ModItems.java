package com.sk0ne.framedlift;

import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(FramedLiftMod.MOD_ID);

    public static final DeferredItem<BlockItem> LIFT_FRAMED_CUBE =
            ITEMS.registerSimpleBlockItem("lift_framed_cube", ModBlocks.LIFT_FRAMED_CUBE);

    private ModItems() {}
}
