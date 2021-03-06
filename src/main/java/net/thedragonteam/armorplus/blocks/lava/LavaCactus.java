package net.thedragonteam.armorplus.blocks.lava;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.armorplus.iface.IModdedBlock;

import java.util.Random;

import static net.minecraft.util.BlockRenderLayer.CUTOUT;
import static net.thedragonteam.armorplus.ArmorPlus.tabArmorplusBlocks;
import static net.thedragonteam.armorplus.util.Utils.setName;

/**
 * @author Sokratis Fotkatzikis - TheDragonTeam
 */
public class LavaCactus extends BlockCactus implements IModdedBlock {

    public LavaCactus() {
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockCactus.AGE, 0));
        this.setTickRandomly(true);
        this.setHardness(0.4f);
        this.setUnlocalizedName(setName("lava_cactus"));
        this.setRegistryName("lava_cactus");
        this.setCreativeTab(tabArmorplusBlocks);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void initModel() {
        this.initModel("lava", 0);
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        BlockPos blockpos = pos.up();

        if (worldIn.isAirBlock(blockpos)) {
            int i;

            i = 1;
            while (worldIn.getBlockState(pos.down(i)).getBlock() == this) {
                ++i;
            }

            if (i < 3) {
                int j = state.getValue(AGE);
                if (j == 15) {
                    worldIn.setBlockState(blockpos, this.getDefaultState());
                    IBlockState iblockstate = state.withProperty(AGE, 0);
                    worldIn.setBlockState(pos, iblockstate, 4);
                    iblockstate.neighborChanged(worldIn, blockpos, this, pos);
                } else {
                    worldIn.setBlockState(pos, state.withProperty(AGE, j + 1), 4);
                }
            }
        }
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return BlockCactus.CACTUS_AABB;
    }


    @Override
    public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World worldIn, BlockPos pos) {
        return BlockCactus.CACTUS_COLLISION_AABB.offset(pos);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return super.canPlaceBlockAt(worldIn, pos) && this.canBlockStay(worldIn, pos);
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        if (!this.canBlockStay(worldIn, pos)) worldIn.destroyBlock(pos, true);
    }

    @Override
    public boolean canBlockStay(World worldIn, BlockPos pos) {
        for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL) {
            Material material = worldIn.getBlockState(pos.offset(enumfacing)).getMaterial();

            if (material.isSolid() || material == Material.LAVA) {
                return true;
            }
        }

        IBlockState state = worldIn.getBlockState(pos.down());
        return state.getBlock().canSustainPlant(state, worldIn, pos.down(), EnumFacing.UP, this) && !worldIn.getBlockState(pos.up()).getMaterial().isLiquid();
    }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        entityIn.attackEntityFrom(net.minecraft.util.DamageSource.CACTUS, 1.0f);
        entityIn.setFire(2);
    }


    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(BlockCactus.AGE, meta);
    }


    @Override
    public BlockRenderLayer getBlockLayer() {
        return CUTOUT;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(BlockCactus.AGE);
    }


    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
        return EnumPlantType.Nether;
    }


    @Override
    public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
        return getDefaultState();
    }


    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, AGE);
    }


    @SuppressWarnings("deprecation")
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return MapColor.NETHERRACK;
    }
}
