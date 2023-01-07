package net.github.finalproduction.rapacity.block;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class CrystalBlock extends Block implements Waterloggable {
  /*  public static final BooleanProperty WATERLOGGED;
    public static final DirectionProperty FACING;
    protected final VoxelShape northAabb;
    protected final VoxelShape southAabb;
    protected final VoxelShape eastAabb;
    protected final VoxelShape westAabb;
    protected final VoxelShape upAabb;
    protected final VoxelShape downAabb; */

    public CrystalBlock(int i, int j, Settings settings) {
        super(settings);
    /*    this.setDefaultState(this.getDefaultState().with(WATERLOGGED, false).with(FACING, Direction.UP));
        this.upAabb = Block.createCuboidShape(j, 0.0, j, 16 - j, i, 16 - j);
        this.downAabb = Block.createCuboidShape(j, 16 - i, j, 16 - j, 16.0, 16 - j);
        this.northAabb = Block.createCuboidShape(j, j, 16 - i, 16 - j, 16 - j, 16.0);
        this.southAabb = Block.createCuboidShape(j, j, 0.0, 16 - j, 16 - j, i);
        this.eastAabb = Block.createCuboidShape(0.0, j, j, i, 16 - j, 16 - j);
        this.westAabb = Block.createCuboidShape(16 - i, j, j, 16.0, 16 - j, 16 - j);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView level, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        switch (direction) {
            case NORTH:
                return this.northAabb;
            case SOUTH:
                return this.southAabb;
            case EAST:
                return this.eastAabb;
            case WEST:
                return this.westAabb;
            case DOWN:
                return this.downAabb;
            case UP:
            default:
                return this.upAabb;
        }
    }

    public boolean canPlaceAt(BlockState state, WorldView level, BlockPos pos) {
        Direction direction = state.get(FACING);
        BlockPos blockPos = pos.offset(direction.getOpposite());
        return level.getBlockState(blockPos).isSideSolidFullSquare(level, blockPos, direction);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess level, BlockPos currentPos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            level.createAndScheduleFluidTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(level));
        }

        return direction == state.get(FACING).getOpposite() && !state.canPlaceAt(level, currentPos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, level, currentPos, neighborPos);
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext context) {
        WorldAccess levelAccessor = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        return this.getDefaultState().with(WATERLOGGED, levelAccessor.getFluidState(blockPos).getFluid() == Fluids.WATER).with(FACING, context.getSide());
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, FACING);
    }

    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.DESTROY;
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
        FACING = Properties.FACING; */
    }
}

