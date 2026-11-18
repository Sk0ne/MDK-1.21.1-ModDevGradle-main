package com.sk0ne.framedlift;

import com.sk0ne.framedlift.block.LiftFramedCubeBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FramedLiftMod.MOD_ID);

    public static final DeferredBlock<LiftFramedCubeBlock> LIFT_FRAMED_CUBE =
            BLOCKS.register("lift_framed_cube", LiftFramedCubeBlock::new);

    // Чтобы добавить ещё блок:
    // public static final DeferredBlock<LiftFramedCubeBlock> LIFT_FRAMED_STAIRS =
    //         BLOCKS.register("lift_framed_stairs", LiftFramedCubeBlock::new);
    // (не забудь пару в ModItems — иначе не будет BlockItem и крафта)

    private ModBlocks() {}
}
