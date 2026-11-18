package com.sk0ne.framedlift;

import com.sk0ne.framedlift.blockentity.LiftFramedBlockEntity;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public final class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BE_TYPES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, FramedLiftMod.MOD_ID);

    public static final Supplier<BlockEntityType<LiftFramedBlockEntity>> FRAMED_BLOCK =
            BE_TYPES.register("framed_block", () -> {
                Block[] blocks = ModBlocks.BLOCKS.getEntries().stream()
                        .map(Holder::value)
                        .toArray(Block[]::new);
                return BlockEntityType.Builder.of(LiftFramedBlockEntity::new, blocks).build(null);
            });

    private ModBlockEntities() {}
}
