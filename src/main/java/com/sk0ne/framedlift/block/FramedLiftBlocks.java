package com.sk0ne.framedlift.block;

import xfacthd.framedblocks.common.block.cube.FramedBouncyCubeBlock;
import xfacthd.framedblocks.common.block.cube.FramedCubeBlock;
import xfacthd.framedblocks.common.block.cube.FramedGlowingCubeBlock;
import xfacthd.framedblocks.common.block.slope.FramedDoubleSlopeBlock;
import xfacthd.framedblocks.common.block.slab.FramedDoubleSlabBlock;

// Заглушки наследуются от FramedCubeBlock: базовый FramedBlock не реализует
// абстрактный IFramedBlock#getJadeRenderState(BlockState), а FramedCubeBlock — реализует.
// Когда появятся реальные классы FramedBlocks для нужных форм, замените родителя на них.

public final class FramedLiftBlocks {

    // --- Кубы ---
    public static class LiftFramedCube extends FramedCubeBlock implements LiftProvider {
        public LiftFramedCube() { super(); }
    }
    public static class LiftFramedBouncyCube extends FramedBouncyCubeBlock implements LiftProvider {
        public LiftFramedBouncyCube() { super(); }
    }
    public static class LiftFramedGlowingCube extends FramedGlowingCubeBlock implements LiftProvider {
        public LiftFramedGlowingCube() { super(); }
    }
    public static class LiftFramedCheckeredCube extends FramedCubeBlock implements LiftProvider {
        public LiftFramedCheckeredCube() { super(); }
    }

    // --- Наклонные блоки ---
    public static class LiftFramedDoubleSlope extends FramedDoubleSlopeBlock implements LiftProvider {
        public LiftFramedDoubleSlope() { super(); }
    }
    public static class LiftFramedElevatedDoubleSlopeEdge extends FramedCubeBlock implements LiftProvider {
        public LiftFramedElevatedDoubleSlopeEdge() { super(); }
    }
    public static class LiftFramedElevDoubleCornerSlopeEdge extends FramedCubeBlock implements LiftProvider {
        public LiftFramedElevDoubleCornerSlopeEdge() { super(); }
    }
    public static class LiftFramedElevDoubleInnerCornerSlopeEdge extends FramedCubeBlock implements LiftProvider {
        public LiftFramedElevDoubleInnerCornerSlopeEdge() { super(); }
    }

    // --- Углы и грани (заглушки) ---
    public static class LiftFramedDoubleCorner extends FramedCubeBlock implements LiftProvider {
        public LiftFramedDoubleCorner() { super(); }
    }
    public static class LiftFramedDoublePrismCorner extends FramedCubeBlock implements LiftProvider {
        public LiftFramedDoublePrismCorner() { super(); }
    }
    public static class LiftFramedDoubleThreewayCorner extends FramedCubeBlock implements LiftProvider {
        public LiftFramedDoubleThreewayCorner() { super(); }
    }
    public static class LiftFramedDoubleThreewayCornerPillar extends FramedCubeBlock implements LiftProvider {
        public LiftFramedDoubleThreewayCornerPillar() { super(); }
    }
    public static class LiftFramedMasonryCorner extends FramedCubeBlock implements LiftProvider {
        public LiftFramedMasonryCorner() { super(); }
    }

    // --- Плиты и панели ---
    public static class LiftFramedDoubleSlab extends FramedDoubleSlabBlock implements LiftProvider {
        public LiftFramedDoubleSlab() { super(); }
    }
    public static class LiftFramedAdjDoubleSlab extends FramedCubeBlock implements LiftProvider {
        public LiftFramedAdjDoubleSlab() { super(); }
    }
    public static class LiftFramedAdjDoubleCopycatSlab extends FramedCubeBlock implements LiftProvider {
        public LiftFramedAdjDoubleCopycatSlab() { super(); }
    }
    public static class LiftFramedDoublePanel extends FramedCubeBlock implements LiftProvider {
        public LiftFramedDoublePanel() { super(); }
    }
    public static class LiftFramedAdjDoublePanel extends FramedCubeBlock implements LiftProvider {
        public LiftFramedAdjDoublePanel() { super(); }
    }
    public static class LiftFramedAdjDoubleCopycatPanel extends FramedCubeBlock implements LiftProvider {
        public LiftFramedAdjDoubleCopycatPanel() { super(); }
    }

    // --- Ступени (заглушки) ---
    public static class LiftFramedDoubleStairs extends FramedCubeBlock implements LiftProvider {
        public LiftFramedDoubleStairs() { super(); }
    }
    public static class LiftFramedSlopedDoubleStairs extends FramedCubeBlock implements LiftProvider {
        public LiftFramedSlopedDoubleStairs() { super(); }
    }
    public static class LiftFramedVerticalDoubleStairs extends FramedCubeBlock implements LiftProvider {
        public LiftFramedVerticalDoubleStairs() { super(); }
    }
    public static class LiftFramedVerticalSlopedDoubleStairs extends FramedCubeBlock implements LiftProvider {
        public LiftFramedVerticalSlopedDoubleStairs() { super(); }
    }

    // --- Специальные блоки (заглушки) ---
    public static class LiftFramedSecretStorage extends FramedCubeBlock implements LiftProvider {
        public LiftFramedSecretStorage() { super(); }
    }
    public static class LiftFramedTank extends FramedCubeBlock implements LiftProvider {
        public LiftFramedTank() { super(); }
    }
    public static class LiftFramedRedstoneBlock extends FramedCubeBlock implements LiftProvider {
        public LiftFramedRedstoneBlock() { super(); }
    }
    public static class LiftFramedTarget extends FramedCubeBlock implements LiftProvider {
        public LiftFramedTarget() { super(); }
    }
    public static class LiftFramedBookshelf extends FramedCubeBlock implements LiftProvider {
        public LiftFramedBookshelf() { super(); }
    }
    public static class LiftFramedChiseledBookshelf extends FramedCubeBlock implements LiftProvider {
        public LiftFramedChiseledBookshelf() { super(); }
    }
    public static class LiftFramedOneWayWindow extends FramedCubeBlock implements LiftProvider {
        public LiftFramedOneWayWindow() { super(); }
    }

    // --- Призмы и сложные формы (заглушки) ---
    public static class LiftFramedElevatedInnerDoublePrism extends FramedCubeBlock implements LiftProvider {
        public LiftFramedElevatedInnerDoublePrism() { super(); }
    }
    public static class LiftFramedElevatedInnerDoubleSlopedPrism extends FramedCubeBlock implements LiftProvider {
        public LiftFramedElevatedInnerDoubleSlopedPrism() { super(); }
    }
    public static class LiftFramedElevatedDoubleSlopeSlab extends FramedCubeBlock implements LiftProvider {
        public LiftFramedElevatedDoubleSlopeSlab() { super(); }
    }
    public static class LiftFramedFlatElevDoubleSlopeSlabCorner extends FramedCubeBlock implements LiftProvider {
        public LiftFramedFlatElevDoubleSlopeSlabCorner() { super(); }
    }
    public static class LiftFramedFlatElevInnerDoubleSlopeSlabCorner extends FramedCubeBlock implements LiftProvider {
        public LiftFramedFlatElevInnerDoubleSlopeSlabCorner() { super(); }
    }
    public static class LiftFramedExtendedDoubleSlopePanel extends FramedCubeBlock implements LiftProvider {
        public LiftFramedExtendedDoubleSlopePanel() { super(); }
    }
    public static class LiftFramedFlatExtDoubleSlopePanelCorner extends FramedCubeBlock implements LiftProvider {
        public LiftFramedFlatExtDoubleSlopePanelCorner() { super(); }
    }
    public static class LiftFramedFlatExtInnerDoubleSlopePanelCorner extends FramedCubeBlock implements LiftProvider {
        public LiftFramedFlatExtInnerDoubleSlopePanelCorner() { super(); }
    }
    public static class LiftFramedExtDoubleCornerSlopePanel extends FramedCubeBlock implements LiftProvider {
        public LiftFramedExtDoubleCornerSlopePanel() { super(); }
    }
    public static class LiftFramedExtDoubleCornerSlopePanelW extends FramedCubeBlock implements LiftProvider {
        public LiftFramedExtDoubleCornerSlopePanelW() { super(); }
    }
    public static class LiftFramedExtInnerDoubleCornerSlopePanel extends FramedCubeBlock implements LiftProvider {
        public LiftFramedExtInnerDoubleCornerSlopePanel() { super(); }
    }
    public static class LiftFramedExtInnerDoubleCornerSlopePanelW extends FramedCubeBlock implements LiftProvider {
        public LiftFramedExtInnerDoubleCornerSlopePanelW() { super(); }
    }

    private FramedLiftBlocks() {}
}
