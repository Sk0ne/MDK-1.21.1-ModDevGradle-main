package com.sk0ne.framedlift.blockentity;

import com.sk0ne.framedlift.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import xfacthd.framedblocks.common.blockentity.FramedBlockEntity;

/**
 * Наследник штатного FramedBlockEntity с СВОИМ BlockEntityType.
 * У FramedBlockEntity есть protected-конструктор с BlockEntityType<?>
 * именно для такого расширения — валидация vanilla проходит,
 * потому что наш блок заявлен в validBlocks нашего BE-типа.
 */
public class LiftFramedBlockEntity extends FramedBlockEntity {

    public LiftFramedBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.FRAMED_BLOCK.get(), pos, state);
    }
}
