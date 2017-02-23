/*
 * Copyright (c) TheDragonTeam 2016-2017.
 */

package net.thedragonteam.armorplus.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.thedragonteam.armorplus.iface.IModelHelper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static net.thedragonteam.armorplus.util.Utils.INSTANCE;

public class BlockContainerBase extends Block implements ITileEntityProvider, IModelHelper {

    private TileEntity tileEntity;

    public BlockContainerBase(Material materialIn, TileEntity tileEntity, String name, double resistance, double hardness, BlockBase.ToolType toolType, int harvestLevel) {
        super(materialIn);
        this.tileEntity = tileEntity;
        this.setRegistryName(name);
        this.setUnlocalizedName(INSTANCE.setName(name));
        this.setResistance((float) resistance);
        this.setHardness((float) hardness);
        this.setHarvestLevel(toolType.getTool(), harvestLevel);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(@Nonnull World worldIn, int meta) {
        return this.tileEntity;
    }

    public void initModel() {
        this.initModel(this, getRegistryName(), 0);
    }
}
