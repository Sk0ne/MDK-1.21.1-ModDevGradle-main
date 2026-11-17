package com.sk0ne.framedlift;

import com.sk0ne.framedlift.block.FramedLiftBlocks;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(FramedLiftMod.MOD_ID);

    public static final DeferredBlock<Block> LIFT_FRAMED_CUBE = register("lift_framed_cube", FramedLiftBlocks.LiftFramedCube::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_SLOPE = register("lift_framed_double_slope", FramedLiftBlocks.LiftFramedDoubleSlope::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_CORNER = register("lift_framed_double_corner", FramedLiftBlocks.LiftFramedDoubleCorner::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_PRISM_CORNER = register("lift_framed_double_prism_corner", FramedLiftBlocks.LiftFramedDoublePrismCorner::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_THREEWAY_CORNER = register("lift_framed_double_threeway_corner", FramedLiftBlocks.LiftFramedDoubleThreewayCorner::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_ELEVATED_DOUBLE_SLOPE_EDGE = register("lift_framed_elevated_double_slope_edge", FramedLiftBlocks.LiftFramedElevatedDoubleSlopeEdge::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_ELEV_DOUBLE_CORNER_SLOPE_EDGE = register("lift_framed_elev_double_corner_slope_edge", FramedLiftBlocks.LiftFramedElevatedDoubleCornerSlopeEdge::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_ELEV_DOUBLE_INNER_CORNER_SLOPE_EDGE = register("lift_framed_elev_double_inner_corner_slope_edge", FramedLiftBlocks.LiftFramedElevatedDoubleInnerCornerSlopeEdge::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_SLAB = register("lift_framed_double_slab", FramedLiftBlocks.LiftFramedDoubleSlab::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_ADJ_DOUBLE_SLAB = register("lift_framed_adj_double_slab", FramedLiftBlocks.LiftFramedAdjustableDoubleSlab::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_ADJ_DOUBLE_COPYCAT_SLAB = register("lift_framed_adj_double_copycat_slab", FramedLiftBlocks.LiftFramedAdjustableDoubleSlab::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_PANEL = register("lift_framed_double_panel", FramedLiftBlocks.LiftFramedDoublePanel::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_ADJ_DOUBLE_PANEL = register("lift_framed_adj_double_panel", FramedLiftBlocks.LiftFramedAdjustableDoublePanel::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_ADJ_DOUBLE_COPYCAT_PANEL = register("lift_framed_adj_double_copycat_panel", FramedLiftBlocks.LiftFramedAdjustableDoublePanel::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_STAIRS = register("lift_framed_double_stairs", FramedLiftBlocks.LiftFramedDoubleStairs::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_SLOPED_DOUBLE_STAIRS = register("lift_framed_sloped_double_stairs", FramedLiftBlocks.LiftFramedSlopedDoubleStairs::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_VERTICAL_DOUBLE_STAIRS = register("lift_framed_vertical_double_stairs", FramedLiftBlocks.LiftFramedVerticalDoubleStairs::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_VERTICAL_SLOPED_DOUBLE_STAIRS = register("lift_framed_vertical_sloped_double_stairs", FramedLiftBlocks.LiftFramedVerticalSlopedDoubleStairs::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_DOUBLE_THREEWAY_CORNER_PILLAR = register("lift_framed_double_threeway_corner_pillar", FramedLiftBlocks.LiftFramedDoubleThreewayCornerPillar::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_SECRET_STORAGE = register("lift_framed_secret_storage", FramedLiftBlocks.LiftFramedSecretStorage::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_TANK = register("lift_framed_tank", FramedLiftBlocks.LiftFramedTank::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_BOUNCY_CUBE = register("lift_framed_bouncy_cube", FramedLiftBlocks.LiftFramedBouncyCube::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_REDSTONE_BLOCK = register("lift_framed_redstone_block", FramedLiftBlocks.LiftFramedRedstoneBlock::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_ELEVATED_INNER_DOUBLE_PRISM = register("lift_framed_elevated_inner_double_prism", FramedLiftBlocks.LiftFramedElevatedDoublePrism::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_ELEVATED_INNER_DOUBLE_SLOPED_PRISM = register("lift_framed_elevated_inner_double_sloped_prism", FramedLiftBlocks.LiftFramedElevatedDoubleSlopedPrism::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_ELEVATED_DOUBLE_SLOPE_SLAB = register("lift_framed_elevated_double_slope_slab", FramedLiftBlocks.LiftFramedElevatedDoubleSlopeSlab::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_FLAT_ELEV_DOUBLE_SLOPE_SLAB_CORNER = register("lift_framed_flat_elev_double_slope_slab_corner", FramedLiftBlocks.LiftFramedFlatElevatedDoubleSlopeSlabCorner::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_FLAT_ELEV_INNER_DOUBLE_SLOPE_SLAB_CORNER = register("lift_framed_flat_elev_inner_double_slope_slab_corner", FramedLiftBlocks.LiftFramedFlatElevatedDoubleSlopeSlabCorner::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_EXTENDED_DOUBLE_SLOPE_PANEL = register("lift_framed_extended_double_slope_panel", FramedLiftBlocks.LiftFramedExtendedDoubleSlopePanel::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_FLAT_EXT_DOUBLE_SLOPE_PANEL_CORNER = register("lift_framed_flat_ext_double_slope_panel_corner", FramedLiftBlocks.LiftFramedFlatExtendedDoubleSlopePanelCorner::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_FLAT_EXT_INNER_DOUBLE_SLOPE_PANEL_CORNER = register("lift_framed_flat_ext_inner_double_slope_panel_corner", FramedLiftBlocks.LiftFramedFlatExtendedDoubleSlopePanelCorner::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_EXT_DOUBLE_CORNER_SLOPE_PANEL = register("lift_framed_ext_double_corner_slope_panel", FramedLiftBlocks.LiftFramedExtendedDoubleCornerSlopePanel::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_EXT_DOUBLE_CORNER_SLOPE_PANEL_W = register("lift_framed_ext_double_corner_slope_panel_w", FramedLiftBlocks.LiftFramedExtendedDoubleCornerSlopePanelWall::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_EXT_INNER_DOUBLE_CORNER_SLOPE_PANEL = register("lift_framed_ext_inner_double_corner_slope_panel", FramedLiftBlocks.LiftFramedLargeInnerCornerSlopePanel::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_EXT_INNER_DOUBLE_CORNER_SLOPE_PANEL_W = register("lift_framed_ext_inner_double_corner_slope_panel_w", FramedLiftBlocks.LiftFramedLargeInnerCornerSlopePanelWall::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_GLOWING_CUBE = register("lift_framed_glowing_cube", FramedLiftBlocks.LiftFramedGlowingCube::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_TARGET = register("lift_framed_target", FramedLiftBlocks.LiftFramedTarget::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_BOOKSHELF = register("lift_framed_bookshelf", FramedLiftBlocks.LiftFramedBookshelf::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_CHISELED_BOOKSHELF = register("lift_framed_chiseled_bookshelf", FramedLiftBlocks.LiftFramedChiseledBookshelf::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_MASONRY_CORNER = register("lift_framed_masonry_corner", FramedLiftBlocks.LiftFramedMasonryCorner::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_CHECKERED_CUBE = register("lift_framed_checkered_cube", FramedLiftBlocks.LiftFramedCheckeredCube::new);
    public static final DeferredBlock<Block> LIFT_FRAMED_ONE_WAY_WINDOW = register("lift_framed_one_way_window", FramedLiftBlocks.LiftFramedOneWayWindow::new);

    private static DeferredBlock<Block> register(String name, Supplier<? extends Block> supplier) {
        return BLOCKS.register(name, supplier);
    }

    private ModBlocks() {}
}
