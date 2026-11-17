package com.sk0ne.framedlift.block;

import dev.ryanhcode.sable.api.block.BlockSubLevelLiftProvider;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public interface LiftProvider extends BlockSubLevelLiftProvider {

    @Override
    default float sable$getLiftScalar() {
        return 0.475f;
    }

    @Override
    default float sable$getParallelDragScalar() {
        return 1.75f;
    }

    @Override
    default @NotNull Direction sable$getNormal(BlockState state) {
        return Direction.UP;
    }
}
