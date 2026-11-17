package com.example.framedlift;

import com.example.framedlift.block.FramedLiftBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(FramedLiftMod.MOD_ID);

    public static final DeferredBlock<Block> LIFT_FRAMED_CUBE = register("lift_framed_cube",
            () -> new FramedLiftBlocks.LiftFramedCube(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_SLOPE = register("lift_framed_double_slope",
            () -> new FramedLiftBlocks.LiftFramedDoubleSlope(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_CORNER = register("lift_framed_double_corner",
            () -> new FramedLiftBlocks.LiftFramedDoubleCorner(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_PRISM_CORNER = register("lift_framed_double_prism_corner",
            () -> new FramedLiftBlocks.LiftFramedDoublePrismCorner(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_THREEWAY_CORNER = register("lift_framed_double_threeway_corner",
            () -> new FramedLiftBlocks.LiftFramedDoubleThreewayCorner(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_ELEVATED_DOUBLE_SLOPE_EDGE = register("lift_framed_elevated_double_slope_edge",
            () -> new FramedLiftBlocks.LiftFramedElevatedDoubleSlopeEdge(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_ELEV_DOUBLE_CORNER_SLOPE_EDGE = register("lift_framed_elev_double_corner_slope_edge",
            () -> new FramedLiftBlocks.LiftFramedElevDoubleCornerSlopeEdge(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_ELEV_DOUBLE_INNER_CORNER_SLOPE_EDGE = register("lift_framed_elev_double_inner_corner_slope_edge",
            () -> new FramedLiftBlocks.LiftFramedElevDoubleInnerCornerSlopeEdge(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_SLAB = register("lift_framed_double_slab",
            () -> new FramedLiftBlocks.LiftFramedDoubleSlab(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_ADJ_DOUBLE_SLAB = register("lift_framed_adj_double_slab",
            () -> new FramedLiftBlocks.LiftFramedAdjDoubleSlab(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_ADJ_DOUBLE_COPYCAT_SLAB = register("lift_framed_adj_double_copycat_slab",
            () -> new FramedLiftBlocks.LiftFramedAdjDoubleCopycatSlab(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_PANEL = register("lift_framed_double_panel",
            () -> new FramedLiftBlocks.LiftFramedDoublePanel(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_ADJ_DOUBLE_PANEL = register("lift_framed_adj_double_panel",
            () -> new FramedLiftBlocks.LiftFramedAdjDoublePanel(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_ADJ_DOUBLE_COPYCAT_PANEL = register("lift_framed_adj_double_copycat_panel",
            () -> new FramedLiftBlocks.LiftFramedAdjDoubleCopycatPanel(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_STAIRS = register("lift_framed_double_stairs",
            () -> new FramedLiftBlocks.LiftFramedDoubleStairs(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_SLOPED_DOUBLE_STAIRS = register("lift_framed_sloped_double_stairs",
            () -> new FramedLiftBlocks.LiftFramedSlopedDoubleStairs(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_VERTICAL_DOUBLE_STAIRS = register("lift_framed_vertical_double_stairs",
            () -> new FramedLiftBlocks.LiftFramedVerticalDoubleStairs(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_VERTICAL_SLOPED_DOUBLE_STAIRS = register("lift_framed_vertical_sloped_double_stairs",
            () -> new FramedLiftBlocks.LiftFramedVerticalSlopedDoubleStairs(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_THREEWAY_CORNER_PILLAR = register("lift_framed_double_threeway_corner_pillar",
            () -> new FramedLiftBlocks.LiftFramedDoubleThreewayCornerPillar(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_SECRET_STORAGE = register("lift_framed_secret_storage",
            () -> new FramedLiftBlocks.LiftFramedSecretStorage(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_TANK = register("lift_framed_tank",
            () -> new FramedLiftBlocks.LiftFramedTank(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_BOUNCY_CUBE = register("lift_framed_bouncy_cube",
            () -> new FramedLiftBlocks.LiftFramedBouncyCube(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_REDSTONE_BLOCK = register("lift_framed_redstone_block",
            () -> new FramedLiftBlocks.LiftFramedRedstoneBlock(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_ELEVATED_INNER_DOUBLE_PRISM = register("lift_framed_elevated_inner_double_prism",
            () -> new FramedLiftBlocks.LiftFramedElevatedInnerDoublePrism(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_ELEVATED_INNER_DOUBLE_SLOPED_PRISM = register("lift_framed_elevated_inner_double_sloped_prism",
            () -> new FramedLiftBlocks.LiftFramedElevatedInnerDoubleSlopedPrism(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_ELEVATED_DOUBLE_SLOPE_SLAB = register("lift_framed_elevated_double_slope_slab",
            () -> new FramedLiftBlocks.LiftFramedElevatedDoubleSlopeSlab(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_FLAT_ELEV_DOUBLE_SLOPE_SLAB_CORNER = register("lift_framed_flat_elev_double_slope_slab_corner",
            () -> new FramedLiftBlocks.LiftFramedFlatElevDoubleSlopeSlabCorner(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_FLAT_ELEV_INNER_DOUBLE_SLOPE_SLAB_CORNER = register("lift_framed_flat_elev_inner_double_slope_slab_corner",
            () -> new FramedLiftBlocks.LiftFramedFlatElevInnerDoubleSlopeSlabCorner(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_EXTENDED_DOUBLE_SLOPE_PANEL = register("lift_framed_extended_double_slope_panel",
            () -> new FramedLiftBlocks.LiftFramedExtendedDoubleSlopePanel(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_FLAT_EXT_DOUBLE_SLOPE_PANEL_CORNER = register("lift_framed_flat_ext_double_slope_panel_corner",
            () -> new FramedLiftBlocks.LiftFramedFlatExtDoubleSlopePanelCorner(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_FLAT_EXT_INNER_DOUBLE_SLOPE_PANEL_CORNER = register("lift_framed_flat_ext_inner_double_slope_panel_corner",
            () -> new FramedLiftBlocks.LiftFramedFlatExtInnerDoubleSlopePanelCorner(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_EXT_DOUBLE_CORNER_SLOPE_PANEL = register("lift_framed_ext_double_corner_slope_panel",
            () -> new FramedLiftBlocks.LiftFramedExtDoubleCornerSlopePanel(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_EXT_DOUBLE_CORNER_SLOPE_PANEL_W = register("lift_framed_ext_double_corner_slope_panel_w",
            () -> new FramedLiftBlocks.LiftFramedExtDoubleCornerSlopePanelW(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_EXT_INNER_DOUBLE_CORNER_SLOPE_PANEL = register("lift_framed_ext_inner_double_corner_slope_panel",
            () -> new FramedLiftBlocks.LiftFramedExtInnerDoubleCornerSlopePanel(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_EXT_INNER_DOUBLE_CORNER_SLOPE_PANEL_W = register("lift_framed_ext_inner_double_corner_slope_panel_w",
            () -> new FramedLiftBlocks.LiftFramedExtInnerDoubleCornerSlopePanelW(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_GLOWING_CUBE = register("lift_framed_glowing_cube",
            () -> new FramedLiftBlocks.LiftFramedGlowingCube(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_TARGET = register("lift_framed_target",
            () -> new FramedLiftBlocks.LiftFramedTarget(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_BOOKSHELF = register("lift_framed_bookshelf",
            () -> new FramedLiftBlocks.LiftFramedBookshelf(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_CHISELED_BOOKSHELF = register("lift_framed_chiseled_bookshelf",
            () -> new FramedLiftBlocks.LiftFramedChiseledBookshelf(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_MASONRY_CORNER = register("lift_framed_masonry_corner",
            () -> new FramedLiftBlocks.LiftFramedMasonryCorner(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_CHECKERED_CUBE = register("lift_framed_checkered_cube",
            () -> new FramedLiftBlocks.LiftFramedCheckeredCube(props()));
    public static final DeferredBlock<Block> LIFT_FRAMED_ONE_WAY_WINDOW = register("lift_framed_one_way_window",
            () -> new FramedLiftBlocks.LiftFramedOneWayWindow(props()));

    private static DeferredBlock<Block> register(String name, Supplier<Block> supplier) {
        return BLOCKS.register(name, supplier);
    }

    private static BlockBehaviour.Properties props() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.STONE);
    }

    private ModBlocks() {}
}
