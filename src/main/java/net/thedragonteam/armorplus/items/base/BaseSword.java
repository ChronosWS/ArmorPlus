/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.items.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.armorplus.ARPConfig;
import net.thedragonteam.armorplus.ArmorPlus;

import static net.thedragonteam.armorplus.util.Utils.setName;
import static net.thedragonteam.thedragonlib.util.TextHelper.localize;

public class BaseSword extends ItemSword implements IItemHelper {

    public Item itemEasy;
    public Item itemExpert;
    public TextFormatting formatting;
    public String effect;

    public BaseSword(ToolMaterial material, String name, Item repairEasy, Item repairExpert, TextFormatting textFormatting, String effectName) {
        super(material);
        this.itemEasy = repairEasy;
        this.itemExpert = repairExpert;
        this.formatting = textFormatting;
        this.effect = effectName;
        setRegistryName(name);
        setUnlocalizedName(setName(name));
        GameRegistry.register(this);
        this.setCreativeTab(ArmorPlus.tabArmorplusWeapons);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return (formatting + localize(this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        switch (ARPConfig.recipes) {
            case 0:
                return repair.getItem() == itemEasy;
            case 1:
                return repair.getItem() == itemExpert;
        }
        return true;
    }

    @Override
    public void getItemStack(ItemStack stack) {
    }

    @Override
    public void getItem(Item item) {
    }

    @Override
    public ItemStack getItemStack() {
        return new ItemStack(this);
    }

    @Override
    public Item getItem() {
        return this;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
