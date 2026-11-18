package com.sk0ne.framedlift;

import com.sk0ne.framedlift.blockentity.LiftFramedBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public final class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BE_TYPES =
            DeferredRegister.create(BlockEntityType.class, FramedLiftMod.MOD_ID);

    public static final Supplier<BlockEntityType<LiftFramedBlockEntity>> FRAMED_BLOCK =
            BE_TYPES.register("framed_block", () ->
                    BlockEntityType.Builder.of(
                            LiftFramedBlockEntity::new,
                            ModBlocks.BLOCKS.getEntries().stream()
                                    .map(DeferredHolder::value)
                                    .toArray(Block[]::new)
                    ).build(null)
            );

    private ModBlockEntities() {}
}
