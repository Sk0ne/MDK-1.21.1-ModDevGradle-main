package com.example.framedlift.block;

import dev.ryanhcode.sable.api.block.BlockSubLevelLiftProvider;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public interface LiftProvider extends BlockSubLevelLiftProvider {

    @Override
    default float sable$getLiftScalar() {
        return 0.475f; // подъёмная сила, как у обычного паруса
    }

    @Override
    default float sable$getParallelDragScalar() {
        return 1.75f; // сопротивление, как у симметричного паруса
    }

    @Override
    default @NotNull Direction sable$getNormal(BlockState state) {
        return Direction.UP; // для кубов; для наклонных блоков можно переопределить
    }
}
