package com.sk0ne.framedlift;

import com.sk0ne.framedlift.block.LiftFramedCubeBlock;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(FramedLiftMod.MOD_ID);

    public static final DeferredHolder<Block, LiftFramedCubeBlock> LIFT_FRAMED_CUBE =
            BLOCKS.register("lift_framed_cube", LiftFramedCubeBlock::new);

    private ModBlocks() {}
}
