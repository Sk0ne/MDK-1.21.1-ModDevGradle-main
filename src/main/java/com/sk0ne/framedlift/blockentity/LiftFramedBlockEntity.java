package com.sk0ne.framedlift.blockentity;

import com.sk0ne.framedlift.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import xfacthd.framedblocks.api.blockentity.FramedBlockEntity;

public class LiftFramedBlockEntity extends FramedBlockEntity {

    public LiftFramedBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.FRAMED_BLOCK.get(), pos, state);
    }
}
