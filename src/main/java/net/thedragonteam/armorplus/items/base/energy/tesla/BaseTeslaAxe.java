/*
 * Copyright (c) TheDragonTeam 2016-2017.
 */

package net.thedragonteam.armorplus.items.base.energy.tesla;

import net.darkhax.tesla.api.implementation.BaseTeslaContainer;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fml.common.Optional.Method;
import net.thedragonteam.armorplus.ArmorPlus;
import net.thedragonteam.armorplus.base.BaseAPTeslaContainerProvider;
import net.thedragonteam.armorplus.items.base.BaseAxe;
import net.thedragonteam.armorplus.util.APTeslaUtils;

import javax.annotation.Nonnull;
import java.util.Set;

import static net.thedragonteam.armorplus.APConfig.teslaWeaponItemNameColor;
import static net.thedragonteam.armorplus.util.EnumHelperUtil.addRarity;

public class BaseTeslaAxe extends BaseAxe {

    public EnumRarity formattingName;
    private int maxCapacity;
    private int output;
    private int input;

    public BaseTeslaAxe(ToolMaterial material, String name, Set<Block> effectiveOn, int maxCapacity, int input, int output) {
        super(material, name);
        this.setCreativeTab(ArmorPlus.tabArmorplusTesla);
        this.setMaxStackSize(1);
        this.maxCapacity = maxCapacity;
        this.output = output;
        this.input = input;
        this.formattingName = addRarity("TESLA", teslaWeaponItemNameColor, "Tesla");
    }

    public BaseTeslaAxe(ToolMaterial material, String name, int maxCapacity, int input, int output) {
        this(material, name, null, maxCapacity, input, output);
        this.setCreativeTab(ArmorPlus.tabArmorplusTesla);
        this.setMaxStackSize(1);
        this.maxCapacity = maxCapacity;
        this.output = output;
        this.input = input;
    }

    @Override
    @Nonnull
    public EnumRarity getRarity(ItemStack stack) {
        return formattingName;
    }

    @Method(modid = "tesla")
    @Override
    public void getSubItems(@Nonnull Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems) {
        ItemStack powered = APTeslaUtils.INSTANCE.createChargedStack(new ItemStack(itemIn));
        ItemStack unpowered = new ItemStack(itemIn);
        subItems.add(powered);
        subItems.add(unpowered);
    }

    @Override
    public boolean isRepairable() {
        return true;
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return true;
    }

    @Override
    public int getItemEnchantability(ItemStack stack) {
        return 30;
    }

    @Method(modid = "tesla")
    @Override
    public double getDurabilityForDisplay(ItemStack stack) {
        return (1 - (double) APTeslaUtils.INSTANCE.getStoredPower(stack) / (double) APTeslaUtils.INSTANCE.getMaxCapacity(stack));
    }

    @Override
    public boolean showDurabilityBar(ItemStack stack) {
        return true;
    }

    @Method(modid = "tesla")
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, NBTTagCompound nbt) {
        return new BaseAPTeslaContainerProvider(new BaseTeslaContainer(), maxCapacity, output, input);
    }

    @Override
    public Item getItem() {
        return this;
    }
}