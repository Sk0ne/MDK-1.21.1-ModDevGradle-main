package com.sk0ne.framedlift.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import xfacthd.framedblocks.common.block.cube.FramedBouncyCubeBlock;
import xfacthd.framedblocks.common.block.cube.FramedCubeBlock;
import xfacthd.framedblocks.common.block.cube.FramedGlowingCubeBlock;
import xfacthd.framedblocks.common.block.slope.FramedDoubleSlopeBlock;
import xfacthd.framedblocks.common.block.slab.FramedDoubleSlabBlock;
import xfacthd.framedblocks.common.block.FramedBlock;
import xfacthd.framedblocks.common.data.BlockType;

// ВАЖНО: классы с пометкой "заглушка" наследуют FramedBlock с BlockType.FRAMED_CUBE —
// это даёт им форму и поведение полного куба, а не реальную форму (ступени, панель, призма).
// По мере появления реальных классов FramedBlocks заменяйте super-тип и конструктор.

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
    // Заглушка: реального FramedCheckeredCubeBlock в этой версии нет
    public static class LiftFramedCheckeredCube extends FramedBlock implements LiftProvider {
        public LiftFramedCheckeredCube() { super(BlockType.FRAMED_CUBE); }
    }

    // --- Наклонные блоки ---
    public static class LiftFramedDoubleSlope extends FramedDoubleSlopeBlock implements LiftProvider {
        public LiftFramedDoubleSlope() { super(); }
    }
    // Заглушки
    public static class LiftFramedElevatedDoubleSlopeEdge extends FramedBlock implements LiftProvider {
        public LiftFramedElevatedDoubleSlopeEdge() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedElevDoubleCornerSlopeEdge extends FramedBlock implements LiftProvider {
        public LiftFramedElevDoubleCornerSlopeEdge() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedElevDoubleInnerCornerSlopeEdge extends FramedBlock implements LiftProvider {
        public LiftFramedElevDoubleInnerCornerSlopeEdge() { super(BlockType.FRAMED_CUBE); }
    }

    // --- Углы и грани (заглушки) ---
    public static class LiftFramedDoubleCorner extends FramedBlock implements LiftProvider {
        public LiftFramedDoubleCorner() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedDoublePrismCorner extends FramedBlock implements LiftProvider {
        public LiftFramedDoublePrismCorner() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedDoubleThreewayCorner extends FramedBlock implements LiftProvider {
        public LiftFramedDoubleThreewayCorner() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedDoubleThreewayCornerPillar extends FramedBlock implements LiftProvider {
        public LiftFramedDoubleThreewayCornerPillar() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedMasonryCorner extends FramedBlock implements LiftProvider {
        public LiftFramedMasonryCorner() { super(BlockType.FRAMED_CUBE); }
    }

    // --- Плиты и панели ---
    public static class LiftFramedDoubleSlab extends FramedDoubleSlabBlock implements LiftProvider {
        public LiftFramedDoubleSlab() { super(); }
    }
    // Заглушки (копи-кэт-версии пока неотличимы от обычных — это известное ограничение)
    public static class LiftFramedAdjDoubleSlab extends FramedBlock implements LiftProvider {
        public LiftFramedAdjDoubleSlab() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedAdjDoubleCopycatSlab extends FramedBlock implements LiftProvider {
        public LiftFramedAdjDoubleCopycatSlab() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedDoublePanel extends FramedBlock implements LiftProvider {
        public LiftFramedDoublePanel() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedAdjDoublePanel extends FramedBlock implements LiftProvider {
        public LiftFramedAdjDoublePanel() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedAdjDoubleCopycatPanel extends FramedBlock implements LiftProvider {
        public LiftFramedAdjDoubleCopycatPanel() { super(BlockType.FRAMED_CUBE); }
    }

    // --- Ступени (заглушки) ---
    public static class LiftFramedDoubleStairs extends FramedBlock implements LiftProvider {
        public LiftFramedDoubleStairs() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedSlopedDoubleStairs extends FramedBlock implements LiftProvider {
        public LiftFramedSlopedDoubleStairs() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedVerticalDoubleStairs extends FramedBlock implements LiftProvider {
        public LiftFramedVerticalDoubleStairs() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedVerticalSlopedDoubleStairs extends FramedBlock implements LiftProvider {
        public LiftFramedVerticalSlopedDoubleStairs() { super(BlockType.FRAMED_CUBE); }
    }

    // --- Специальные блоки (заглушки) ---
    public static class LiftFramedSecretStorage extends FramedBlock implements LiftProvider {
        public LiftFramedSecretStorage() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedTank extends FramedBlock implements LiftProvider {
        public LiftFramedTank() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedRedstoneBlock extends FramedBlock implements LiftProvider {
        public LiftFramedRedstoneBlock() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedTarget extends FramedBlock implements LiftProvider {
        public LiftFramedTarget() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedBookshelf extends FramedBlock implements LiftProvider {
        public LiftFramedBookshelf() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedChiseledBookshelf extends FramedBlock implements LiftProvider {
        public LiftFramedChiseledBookshelf() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedOneWayWindow extends FramedBlock implements LiftProvider {
        public LiftFramedOneWayWindow() { super(BlockType.FRAMED_CUBE); }
    }

    // --- Призмы и сложные формы (заглушки) ---
    public static class LiftFramedElevatedInnerDoublePrism extends FramedBlock implements LiftProvider {
        public LiftFramedElevatedInnerDoublePrism() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedElevatedInnerDoubleSlopedPrism extends FramedBlock implements LiftProvider {
        public LiftFramedElevatedInnerDoubleSlopedPrism() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedElevatedDoubleSlopeSlab extends FramedBlock implements LiftProvider {
        public LiftFramedElevatedDoubleSlopeSlab() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedFlatElevDoubleSlopeSlabCorner extends FramedBlock implements LiftProvider {
        public LiftFramedFlatElevDoubleSlopeSlabCorner() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedFlatElevInnerDoubleSlopeSlabCorner extends FramedBlock implements LiftProvider {
        public LiftFramedFlatElevInnerDoubleSlopeSlabCorner() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedExtendedDoubleSlopePanel extends FramedBlock implements LiftProvider {
        public LiftFramedExtendedDoubleSlopePanel() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedFlatExtDoubleSlopePanelCorner extends FramedBlock implements LiftProvider {
        public LiftFramedFlatExtDoubleSlopePanelCorner() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedFlatExtInnerDoubleSlopePanelCorner extends FramedBlock implements LiftProvider {
        public LiftFramedFlatExtInnerDoubleSlopePanelCorner() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedExtDoubleCornerSlopePanel extends FramedBlock implements LiftProvider {
        public LiftFramedExtDoubleCornerSlopePanel() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedExtDoubleCornerSlopePanelW extends FramedBlock implements LiftProvider {
        public LiftFramedExtDoubleCornerSlopePanelW() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedExtInnerDoubleCornerSlopePanel extends FramedBlock implements LiftProvider {
        public LiftFramedExtInnerDoubleCornerSlopePanel() { super(BlockType.FRAMED_CUBE); }
    }
    public static class LiftFramedExtInnerDoubleCornerSlopePanelW extends FramedBlock implements LiftProvider {
        public LiftFramedExtInnerDoubleCornerSlopePanelW() { super(BlockType.FRAMED_CUBE); }
    }

    private FramedLiftBlocks() {}
}
