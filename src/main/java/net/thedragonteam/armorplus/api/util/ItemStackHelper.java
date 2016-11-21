/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.api.util;

import net.minecraft.item.ItemStack;

/**
 * net.thedragonteam.armorplus.api.util
 * ArmorPlus created by sokratis12GR on 6/21/2016 4:04 PM.
 * - TheDragonTeam
 */
public class ItemStackHelper {

    public static ItemStack getAndSplit(ItemStack[] stacks, int index, int amount) {
        if (index >= 0 && index < stacks.length && stacks[index] != null && amount > 0) {
            ItemStack itemstack = stacks[index].splitStack(amount);

            if (stacks[index].getCount() == 0) stacks[index] = null;

            return itemstack;
        } else return null;
    }

    public static ItemStack getAndRemove(ItemStack[] stacks, int index) {
        if (index >= 0 && index < stacks.length) {
            ItemStack itemstack = stacks[index];
            stacks[index] = null;
            return itemstack;
        } else return null;
    }
}