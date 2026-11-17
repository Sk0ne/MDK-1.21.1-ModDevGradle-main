package com.example.framedlift.block;

import io.github.xfacthd.framedblocks.common.block.*;
import io.github.xfacthd.framedblocks.common.block.cube.FramedCubeBlock;
import io.github.xfacthd.framedblocks.common.block.slope.FramedSlopeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class FramedLiftBlocks {

    // ─── Кубы ───────────────────────────────────────────────
    public static class LiftFramedCube extends FramedCubeBlock implements LiftProvider {
        public LiftFramedCube(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedBouncyCube extends FramedBouncyCubeBlock implements LiftProvider {
        public LiftFramedBouncyCube(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedGlowingCube extends FramedGlowingCubeBlock implements LiftProvider {
        public LiftFramedGlowingCube(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedCheckeredCube extends FramedCheckeredCubeBlock implements LiftProvider {
        public LiftFramedCheckeredCube(BlockBehaviour.Properties p) { super(p); }
    }

    // ─── Наклонные блоки ────────────────────────────────────
    public static class LiftFramedSlope extends FramedSlopeBlock implements LiftProvider {
        public LiftFramedSlope(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedDoubleSlope extends FramedDoubleSlopeBlock implements LiftProvider {
        public LiftFramedDoubleSlope(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedElevatedDoubleSlopeEdge extends FramedElevatedDoubleSlopeEdgeBlock implements LiftProvider {
        public LiftFramedElevatedDoubleSlopeEdge(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedElevDoubleCornerSlopeEdge extends FramedElevDoubleCornerSlopeEdgeBlock implements LiftProvider {
        public LiftFramedElevDoubleCornerSlopeEdge(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedElevDoubleInnerCornerSlopeEdge extends FramedElevDoubleInnerCornerSlopeEdgeBlock implements LiftProvider {
        public LiftFramedElevDoubleInnerCornerSlopeEdge(BlockBehaviour.Properties p) { super(p); }
    }

    // ─── Углы и грани ───────────────────────────────────────
    public static class LiftFramedDoubleCorner extends FramedDoubleCornerBlock implements LiftProvider {
        public LiftFramedDoubleCorner(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedDoublePrismCorner extends FramedDoublePrismCornerBlock implements LiftProvider {
        public LiftFramedDoublePrismCorner(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedDoubleThreewayCorner extends FramedDoubleThreewayCornerBlock implements LiftProvider {
        public LiftFramedDoubleThreewayCorner(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedDoubleThreewayCornerPillar extends FramedDoubleThreewayCornerPillarBlock implements LiftProvider {
        public LiftFramedDoubleThreewayCornerPillar(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedMasonryCorner extends FramedMasonryCornerBlock implements LiftProvider {
        public LiftFramedMasonryCorner(BlockBehaviour.Properties p) { super(p); }
    }

    // ─── Плиты и панели ─────────────────────────────────────
    public static class LiftFramedDoubleSlab extends FramedDoubleSlabBlock implements LiftProvider {
        public LiftFramedDoubleSlab(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedAdjDoubleSlab extends FramedAdjDoubleSlabBlock implements LiftProvider {
        public LiftFramedAdjDoubleSlab(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedAdjDoubleCopycatSlab extends FramedAdjDoubleCopycatSlabBlock implements LiftProvider {
        public LiftFramedAdjDoubleCopycatSlab(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedDoublePanel extends FramedDoublePanelBlock implements LiftProvider {
        public LiftFramedDoublePanel(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedAdjDoublePanel extends FramedAdjDoublePanelBlock implements LiftProvider {
        public LiftFramedAdjDoublePanel(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedAdjDoubleCopycatPanel extends FramedAdjDoubleCopycatPanelBlock implements LiftProvider {
        public LiftFramedAdjDoubleCopycatPanel(BlockBehaviour.Properties p) { super(p); }
    }

    // ─── Ступени ────────────────────────────────────────────
    public static class LiftFramedDoubleStairs extends FramedDoubleStairsBlock implements LiftProvider {
        public LiftFramedDoubleStairs(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedSlopedDoubleStairs extends FramedSlopedDoubleStairsBlock implements LiftProvider {
        public LiftFramedSlopedDoubleStairs(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedVerticalDoubleStairs extends FramedVerticalDoubleStairsBlock implements LiftProvider {
        public LiftFramedVerticalDoubleStairs(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedVerticalSlopedDoubleStairs extends FramedVerticalSlopedDoubleStairsBlock implements LiftProvider {
        public LiftFramedVerticalSlopedDoubleStairs(BlockBehaviour.Properties p) { super(p); }
    }

    // ─── Специальные блоки ──────────────────────────────────
    public static class LiftFramedSecretStorage extends FramedSecretStorageBlock implements LiftProvider {
        public LiftFramedSecretStorage(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedTank extends FramedTankBlock implements LiftProvider {
        public LiftFramedTank(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedRedstoneBlock extends FramedRedstoneBlock implements LiftProvider {
        public LiftFramedRedstoneBlock(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedTarget extends FramedTargetBlock implements LiftProvider {
        public LiftFramedTarget(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedBookshelf extends FramedBookshelfBlock implements LiftProvider {
        public LiftFramedBookshelf(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedChiseledBookshelf extends FramedChiseledBookshelfBlock implements LiftProvider {
        public LiftFramedChiseledBookshelf(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedOneWayWindow extends FramedOneWayWindowBlock implements LiftProvider {
        public LiftFramedOneWayWindow(BlockBehaviour.Properties p) { super(p); }
    }

    // ─── Призмы и сложные формы ─────────────────────────────
    public static class LiftFramedElevatedInnerDoublePrism extends FramedElevatedInnerDoublePrismBlock implements LiftProvider {
        public LiftFramedElevatedInnerDoublePrism(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedElevatedInnerDoubleSlopedPrism extends FramedElevatedInnerDoubleSlopedPrismBlock implements LiftProvider {
        public LiftFramedElevatedInnerDoubleSlopedPrism(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedElevatedDoubleSlopeSlab extends FramedElevatedDoubleSlopeSlabBlock implements LiftProvider {
        public LiftFramedElevatedDoubleSlopeSlab(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedFlatElevDoubleSlopeSlabCorner extends FramedFlatElevDoubleSlopeSlabCornerBlock implements LiftProvider {
        public LiftFramedFlatElevDoubleSlopeSlabCorner(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedFlatElevInnerDoubleSlopeSlabCorner extends FramedFlatElevInnerDoubleSlopeSlabCornerBlock implements LiftProvider {
        public LiftFramedFlatElevInnerDoubleSlopeSlabCorner(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedExtendedDoubleSlopePanel extends FramedExtendedDoubleSlopePanelBlock implements LiftProvider {
        public LiftFramedExtendedDoubleSlopePanel(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedFlatExtDoubleSlopePanelCorner extends FramedFlatExtDoubleSlopePanelCornerBlock implements LiftProvider {
        public LiftFramedFlatExtDoubleSlopePanelCorner(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedFlatExtInnerDoubleSlopePanelCorner extends FramedFlatExtInnerDoubleSlopePanelCornerBlock implements LiftProvider {
        public LiftFramedFlatExtInnerDoubleSlopePanelCorner(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedExtDoubleCornerSlopePanel extends FramedExtDoubleCornerSlopePanelBlock implements LiftProvider {
        public LiftFramedExtDoubleCornerSlopePanel(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedExtDoubleCornerSlopePanelW extends FramedExtDoubleCornerSlopePanelWBlock implements LiftProvider {
        public LiftFramedExtDoubleCornerSlopePanelW(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedExtInnerDoubleCornerSlopePanel extends FramedExtInnerDoubleCornerSlopePanelBlock implements LiftProvider {
        public LiftFramedExtInnerDoubleCornerSlopePanel(BlockBehaviour.Properties p) { super(p); }
    }
    public static class LiftFramedExtInnerDoubleCornerSlopePanelW extends FramedExtInnerDoubleCornerSlopePanelWBlock implements LiftProvider {
        public LiftFramedExtInnerDoubleCornerSlopePanelW(BlockBehaviour.Properties p) { super(p); }
    }

    private FramedLiftBlocks() {}
}