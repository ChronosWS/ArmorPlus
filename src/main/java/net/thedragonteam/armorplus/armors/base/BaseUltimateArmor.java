/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.armors.base;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.armorplus.ARPConfig;
import net.thedragonteam.armorplus.ArmorPlus;
import net.thedragonteam.armorplus.util.PotionUtils;
import net.thedragonteam.armorplus.util.Utils;

import java.util.List;

import static net.thedragonteam.armorplus.ARPConfig.*;
import static net.thedragonteam.armorplus.ArmorPlus.getArmorPlusLocation;
import static net.thedragonteam.armorplus.registry.ModItems.*;
import static net.thedragonteam.armorplus.util.PotionUtils.EffectType.BAD;
import static net.thedragonteam.armorplus.util.Utils.setName;
import static net.thedragonteam.thedragonlib.util.TextHelper.localize;

public class BaseUltimateArmor extends ItemArmor {

    public static ItemArmor.ArmorMaterial theUltimateArmor = EnumHelper.addArmorMaterial("theUltimateArmor", getArmorPlusLocation("the_ultimate_armor"), 160,
            ARPConfig.theUltimateArmorProtectionPoints, 1, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, (float) ARPConfig.theUltimateArmorToughnessPoints);

    public BaseUltimateArmor(EntityEquipmentSlot slot) {
        super(theUltimateArmor, 0, slot);
        setMaxStackSize(1);
        switch (slot) {
            case FEET:
                String boots = "the_ultimate_boots";
                setRegistryName(boots);
                setUnlocalizedName(setName(boots));
                break;
            case LEGS:
                String leggings = "the_ultimate_leggings";
                setRegistryName(leggings);
                setUnlocalizedName(setName(leggings));
                break;
            case CHEST:
                String chestplate = "the_ultimate_chestplate";
                setRegistryName(chestplate);
                setUnlocalizedName(setName(chestplate));
                break;
            case HEAD:
                String helmet = "the_ultimate_helmet";
                setRegistryName(helmet);
                setUnlocalizedName(setName(helmet));
                break;
        }
        GameRegistry.register(this);
        setCreativeTab(ArmorPlus.tabArmorplus);
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return false;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        final KeyBinding keyBindSneak = Minecraft.getMinecraft().gameSettings.keyBindSneak;

        if (GameSettings.isKeyDown(keyBindSneak)) {
            tooltip.add("\2479Ability: " + "\247rThe Most OverPowered Armor");
            tooltip.add("\2473Use: " + "\247rEquip The Full Set");
        } else
            tooltip.add(I18n.format("tooltip.shift.showinfo", TextFormatting.getValueByName(theUltimateArmorItemNameColor), keyBindSneak.getDisplayName(), TextFormatting.GRAY, TextFormatting.GREEN));
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (makeTheUltimateArmorUnbreakable)
            Utils.setUnbreakable(stack);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
        ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
        if (ARPConfig.enableFlightAbility)
            if (head.getCount() > 0 && head.getItem() == theUltimateHelmet && chest.getCount() > 0 && chest.getItem() == theUltimateChestplate && legs.getCount() > 0 && legs.getItem() == theUltimateLeggings && feet.getCount() > 0 && feet.getItem() == theUltimateBoots || entity.capabilities.isCreativeMode || entity.isSpectator())
                entity.capabilities.allowFlying = true;
            else {
                entity.capabilities.isFlying = false;
                entity.capabilities.allowFlying = false;
            }
        if (ARPConfig.enableTheUltimateArmorInvincibility)
            if (head.getCount() > 0 && head.getItem() == theUltimateHelmet && chest.getCount() > 0 && chest.getItem() == theUltimateChestplate && legs.getCount() > 0 && legs.getItem() == theUltimateLeggings && feet.getCount() > 0 && feet.getItem() == theUltimateBoots || entity.capabilities.isCreativeMode || entity.isSpectator())
                entity.capabilities.disableDamage = true;
            else entity.capabilities.disableDamage = false;
        if (head.getCount() > 0 && head.getItem() == theUltimateHelmet && chest.getCount() > 0 && chest.getItem() == theUltimateChestplate && legs.getCount() > 0 && legs.getItem() == theUltimateLeggings && feet.getCount() > 0 && feet.getItem() == theUltimateBoots || entity.capabilities.isCreativeMode || entity.isSpectator()) {
        } else if (enableTheUltimateArmorDeBuffs) {
            PotionUtils.addEffect(entity, MobEffects.POISON, 60, 2, BAD);
            PotionUtils.addEffect(entity, MobEffects.SLOWNESS, 60, 2, BAD);
            PotionUtils.addEffect(entity, MobEffects.BLINDNESS, 60, 0, BAD);

            entity.motionX = 0;
            if (entity.onGround)
                entity.motionY = 0;
            entity.motionZ = 0;
            entity.velocityChanged = true; // assumes that entity instanceof EntityPlayer
        }
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return (TextFormatting.getValueByName(theUltimateArmorItemNameColor) + localize(this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        switch (ARPConfig.recipes) {
            case 0:
                return repair.getItem() == new ItemStack(materials, 1, 4).getItem();
            case 1:
                return repair.getItem() == new ItemStack(materials, 1, 4).getItem();
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
