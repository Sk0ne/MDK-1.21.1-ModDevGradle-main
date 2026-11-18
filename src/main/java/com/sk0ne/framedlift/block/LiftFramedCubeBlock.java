package com.sk0ne.framedlift.block;

import com.sk0ne.framedlift.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import xfacthd.framedblocks.common.block.cube.FramedCubeBlock;

public class LiftFramedCubeBlock extends FramedCubeBlock {

    public LiftFramedCubeBlock() {
        super();
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ModBlockEntities.FRAMED_BLOCK.get().create(pos, state);
    }
}
