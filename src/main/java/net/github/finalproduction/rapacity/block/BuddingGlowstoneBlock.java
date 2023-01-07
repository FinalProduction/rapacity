package net.github.finalproduction.rapacity.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

public class BuddingGlowstoneBlock extends Block {
    public BuddingGlowstoneBlock(Settings settings) {
        super(settings);
    }
   /* public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingGlowstoneBlock(Settings settings) {
        super(settings);
    }

    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.DESTROY;
    }

    public void randomTick(BlockState state, ServerWorld level, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = level.getBlockState(blockPos);
            Block block = null;
            if (canClusterGrowAtState(blockState)) {
                block = BlockRegistry.SMALL_GLOWSTONE_BUD.get();
            } else if (blockState.isOf(BlockRegistry.SMALL_GLOWSTONE_BUD.get()) && blockState.get(CrystalBlock.FACING) == direction) {
                block = BlockRegistry.MEDIUM_GLOWSTONE_BUD.get();
            } else if (blockState.isOf(BlockRegistry.MEDIUM_GLOWSTONE_BUD.get()) && blockState.get(CrystalBlock.FACING) == direction) {
                block = BlockRegistry.LARGE_GLOWSTONE_BUD.get();
            } else if (blockState.isOf(BlockRegistry.LARGE_GLOWSTONE_BUD.get()) && blockState.get(CrystalBlock.FACING) == direction) {
                block = BlockRegistry.GLOWSTONE_CLUSTER.get();
            }

            if (block != null) {
                BlockState blockState2 = block.getDefaultState().with(CrystalBlock.FACING, direction).with(CrystalBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
                level.setBlockState(blockPos, blockState2);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    } */
}
