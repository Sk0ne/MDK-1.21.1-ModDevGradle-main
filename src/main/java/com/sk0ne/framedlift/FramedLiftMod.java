package com.sk0ne.framedlift.block;

import xfacthd.framedblocks.common.block.cube.*;
import xfacthd.framedblocks.common.block.interactive.FramedChiseledBookshelfBlock;
import xfacthd.framedblocks.common.block.pillar.FramedDoubleThreewayCornerPillarBlock;
import xfacthd.framedblocks.common.block.prism.FramedElevatedDoublePrismBlock;
import xfacthd.framedblocks.common.block.prism.FramedElevatedDoubleSlopedPrismBlock;
import xfacthd.framedblocks.common.block.slab.*;
import xfacthd.framedblocks.common.block.slope.*;
import xfacthd.framedblocks.common.block.slopeedge.*;
import xfacthd.framedblocks.common.block.slopepanel.*;
import xfacthd.framedblocks.common.block.slopepanelcorner.*;
import xfacthd.framedblocks.common.block.slopeslab.*;
import xfacthd.framedblocks.common.block.stairs.standard.*;
import xfacthd.framedblocks.common.block.stairs.vertical.*;

public final class FramedLiftBlocks {

    // ─── Кубы ───────────────────────────────────────────────
    public static class LiftFramedCube extends FramedCubeBlock implements LiftProvider {
        public LiftFramedCube() { super(); }
    }
    public static class LiftFramedBouncyCube extends FramedBouncyCubeBlock implements LiftProvider {
        public LiftFramedBouncyCube() { super(); }
    }
    public static class LiftFramedGlowingCube extends FramedGlowingCubeBlock implements LiftProvider {
        public LiftFramedGlowingCube() { super(); }
    }
    public static class LiftFramedCheckeredCube extends FramedCheckeredCubeBlock implements LiftProvider {
        public LiftFramedCheckeredCube() { super(); }
    }

    // ─── Наклонные блоки ────────────────────────────────────
    public static class LiftFramedDoubleSlope extends FramedDoubleSlopeBlock implements LiftProvider {
        public LiftFramedDoubleSlope() { super(); }
    }
    public static class LiftFramedDoubleCorner extends FramedDoubleCornerBlock implements LiftProvider {
        public LiftFramedDoubleCorner() { super(); }
    }
    public static class LiftFramedDoublePrismCorner extends FramedDoublePrismCornerBlock implements LiftProvider {
        public LiftFramedDoublePrismCorner() { super(); }
    }
    public static class LiftFramedDoubleThreewayCorner extends FramedDoubleThreewayCornerBlock implements LiftProvider {
        public LiftFramedDoubleThreewayCorner() { super(); }
    }

    // ─── Slope Edge ─────────────────────────────────────────
    public static class LiftFramedElevatedDoubleSlopeEdge extends FramedElevatedDoubleSlopeEdgeBlock implements LiftProvider {
        public LiftFramedElevatedDoubleSlopeEdge() { super(); }
    }
    public static class LiftFramedElevatedDoubleCornerSlopeEdge extends FramedElevatedDoubleCornerSlopeEdgeBlock implements LiftProvider {
        public LiftFramedElevatedDoubleCornerSlopeEdge() { super(); }
    }
    public static class LiftFramedElevatedDoubleInnerCornerSlopeEdge extends FramedElevatedDoubleInnerCornerSlopeEdgeBlock implements LiftProvider {
        public LiftFramedElevatedDoubleInnerCornerSlopeEdge() { super(); }
    }

    // ─── Плиты и панели ─────────────────────────────────────
    public static class LiftFramedDoubleSlab extends FramedDoubleSlabBlock implements LiftProvider {
        public LiftFramedDoubleSlab() { super(); }
    }
    public static class LiftFramedAdjustableDoubleSlab extends FramedAdjustableDoubleSlabBlock implements LiftProvider {
        public LiftFramedAdjustableDoubleSlab() { super(); }
    }
    public static class LiftFramedDoublePanel extends FramedDoublePanelBlock implements LiftProvider {
        public LiftFramedDoublePanel() { super(); }
    }
    public static class LiftFramedAdjustableDoublePanel extends FramedAdjustableDoublePanelBlock implements LiftProvider {
        public LiftFramedAdjustableDoublePanel() { super(); }
    }
    public static class LiftFramedMasonryCorner extends FramedMasonryCornerBlock implements LiftProvider {
        public LiftFramedMasonryCorner() { super(); }
    }

    // ─── Ступени ────────────────────────────────────────────
    public static class LiftFramedDoubleStairs extends FramedDoubleStairsBlock implements LiftProvider {
        public LiftFramedDoubleStairs() { super(); }
    }
    public static class LiftFramedSlopedDoubleStairs extends FramedSlopedDoubleStairsBlock implements LiftProvider {
        public LiftFramedSlopedDoubleStairs() { super(); }
    }
    public static class LiftFramedVerticalDoubleStairs extends FramedVerticalDoubleStairsBlock implements LiftProvider {
        public LiftFramedVerticalDoubleStairs() { super(); }
    }
    public static class LiftFramedVerticalSlopedDoubleStairs extends FramedVerticalSlopedDoubleStairsBlock implements LiftProvider {
        public LiftFramedVerticalSlopedDoubleStairs() { super(); }
    }

    // ─── Специальные ────────────────────────────────────────
    public static class LiftFramedDoubleThreewayCornerPillar extends FramedDoubleThreewayCornerPillarBlock implements LiftProvider {
        public LiftFramedDoubleThreewayCornerPillar() { super(); }
    }
    public static class LiftFramedSecretStorage extends FramedStorageBlock implements LiftProvider {
        public LiftFramedSecretStorage() { super(); }
    }
    public static class LiftFramedTank extends FramedTankBlock implements LiftProvider {
        public LiftFramedTank() { super(); }
    }
    public static class LiftFramedRedstoneBlock extends FramedRedstoneBlock implements LiftProvider {
        public LiftFramedRedstoneBlock() { super(); }
    }
    public static class LiftFramedTarget extends FramedTargetBlock implements LiftProvider {
        public LiftFramedTarget() { super(); }
    }
    public static class LiftFramedBookshelf extends FramedBookshelfBlock implements LiftProvider {
        public LiftFramedBookshelf() { super(); }
    }
    public static class LiftFramedChiseledBookshelf extends FramedChiseledBookshelfBlock implements LiftProvider {
        public LiftFramedChiseledBookshelf() { super(); }
    }
    public static class LiftFramedOneWayWindow extends FramedOneWayWindowBlock implements LiftProvider {
        public LiftFramedOneWayWindow() { super(); }
    }

    // ─── Призмы ─────────────────────────────────────────────
    public static class LiftFramedElevatedDoublePrism extends FramedElevatedDoublePrismBlock implements LiftProvider {
        public LiftFramedElevatedDoublePrism() { super(); }
    }
    public static class LiftFramedElevatedDoubleSlopedPrism extends FramedElevatedDoubleSlopedPrismBlock implements LiftProvider {
        public LiftFramedElevatedDoubleSlopedPrism() { super(); }
    }

    // ─── Slope Slab ─────────────────────────────────────────
    public static class LiftFramedElevatedDoubleSlopeSlab extends FramedElevatedDoubleSlopeSlabBlock implements LiftProvider {
        public LiftFramedElevatedDoubleSlopeSlab() { super(); }
    }
    public static class LiftFramedFlatElevatedDoubleSlopeSlabCorner extends FramedFlatElevatedDoubleSlopeSlabCornerBlock implements LiftProvider {
        public LiftFramedFlatElevatedDoubleSlopeSlabCorner() { super(); }
    }

    // ─── Slope Panel ────────────────────────────────────────
    public static class LiftFramedExtendedDoubleSlopePanel extends FramedExtendedDoubleSlopePanelBlock implements LiftProvider {
        public LiftFramedExtendedDoubleSlopePanel() { super(); }
    }
    public static class LiftFramedFlatExtendedDoubleSlopePanelCorner extends FramedFlatExtendedDoubleSlopePanelCornerBlock implements LiftProvider {
        public LiftFramedFlatExtendedDoubleSlopePanelCorner() { super(); }
    }

    // ─── Slope Panel Corner ─────────────────────────────────
    public static class LiftFramedExtendedDoubleCornerSlopePanel extends FramedExtendedDoubleCornerSlopePanelBlock implements LiftProvider {
        public LiftFramedExtendedDoubleCornerSlopePanel() { super(); }
    }
    public static class LiftFramedExtendedDoubleCornerSlopePanelWall extends FramedExtendedDoubleCornerSlopePanelWallBlock implements LiftProvider {
        public LiftFramedExtendedDoubleCornerSlopePanelWall() { super(); }
    }
    public static class LiftFramedLargeInnerCornerSlopePanel extends FramedLargeInnerCornerSlopePanelBlock implements LiftProvider {
        public LiftFramedLargeInnerCornerSlopePanel() { super(); }
    }
    public static class LiftFramedLargeInnerCornerSlopePanelWall extends FramedLargeInnerCornerSlopePanelWallBlock implements LiftProvider {
        public LiftFramedLargeInnerCornerSlopePanelWall() { super(); }
    }

    private FramedLiftBlocks() {}
}
