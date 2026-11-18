package com.sk0ne.framedlift.block;

import com.sk0ne.framedlift.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import xfacthd.framedblocks.common.block.cube.FramedCubeBlock;
import xfacthd.framedblocks.common.data.BlockType;

/**
 * Аэродинамическая копия framed_cube.
 *
 * ВАЖНО: если компиляция ругнётся на импорт FramedCubeBlock —
 * открой в декомпилированных исходниках FBContent и посмотри,
 * в каком пакете лежит FramedCubeBlock (Ctrl+N -> FramedCubeBlock),
 * и поправь импорт. Это единственная строка, которую нужно сверить.
 */
public class LiftFramedCubeBlock extends FramedCubeBlock {

    public LiftFramedCubeBlock() {
        super(BlockType.FRAMED_CUBE);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        // Свой BE-тип, в validBlocks которого входит этот блок.
        // Именно это устраняет крэш "Invalid block entity" при установке.
        return ModBlockEntities.FRAMED_BLOCK.get().create(pos, state);
    }

    // TODO: сюда переносится аэродинамическая логика
    // (реализация интерфейса лифта из Sable / Create: Aeronautics,
    //  если она была в старых заглушках).
}
