/*******************************************************************************
 * Copyright (c) TheDragonTeam 2016.
 ******************************************************************************/

package net.thedragonteam.armorplus.armors.reinforced.rcarmor;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.armorplus.ArmorPlus;
import net.thedragonteam.armorplus.registry.ModItems;

/**
 * net.thedragonteam.armorplus.armors.reinforced.rcarmor
 * ArmorPlus created by sokratis12GR on 7/25/2016 10:08 AM.
 * - TheDragonTeam
 */
public class RCHelmet extends ItemArmor {

    public static int armorPreffix = 0;

    public RCHelmet() {
        super(ModItems.RC_ARMOR_MATERIAL, armorPreffix, EntityEquipmentSlot.HEAD);
        setMaxStackSize(1);
        setRegistryName("reinforced_chain_helmet");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName("RCHelmet");     // Used for localization (en_US.lang)
        GameRegistry.register(this);
        setCreativeTab(ArmorPlus.TAB_ARMORPLUS);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation("armorplus:RCHelmet", "inventory"));
    }

    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == ModItems.CHAINMAIL;
    }
}