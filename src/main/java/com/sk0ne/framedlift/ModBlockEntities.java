package com.sk0ne.framedlift;

import com.sk0ne.framedlift.blockentity.LiftFramedBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BE_TYPES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, FramedLiftMod.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LiftFramedBlockEntity>> FRAMED_BLOCK =
            BE_TYPES.register("framed_block", () -> BlockEntityType.Builder
                    .of(LiftFramedBlockEntity::new, ModBlocks.LIFT_FRAMED_CUBE.get())
                    .build(null));

    private ModBlockEntities() {}
}
