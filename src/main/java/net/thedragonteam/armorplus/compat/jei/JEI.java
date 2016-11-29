/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.compat.jei;

import mezz.jei.api.*;
import mezz.jei.api.ingredients.IModIngredientRegistration;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;
import net.thedragonteam.armorplus.registry.ModItems;

import javax.annotation.Nonnull;

@Optional.Interface(iface = "mezz.jei.api.IItemBlacklist", modid = "jei", striprefs = true)
@JEIPlugin
public class JEI implements IModPlugin {
    @Optional.Method(modid = "jei")
    public void register(@Nonnull IModRegistry registry) {
        IJeiHelpers helpers = registry.getJeiHelpers();
        IItemBlacklist blacklist = helpers.getItemBlacklist();
        blacklist.addItemToBlacklist(new ItemStack(ModItems.moddedCityItem, 1));
        blacklist.addItemToBlacklist(new ItemStack(ModItems.jonBamsItem, 1));
        blacklist.addItemToBlacklist(new ItemStack(ModItems.jonBamsItem, 1, 1));
        blacklist.addItemToBlacklist(new ItemStack(ModItems.theDragonTeamItem, 1));
        blacklist.addItemToBlacklist(new ItemStack(ModItems.twitchItem, 1));
        blacklist.addItemToBlacklist(new ItemStack(ModItems.beamItem, 1));
        blacklist.addItemToBlacklist(new ItemStack(ModItems.nbtItem, 1));
    }

    @Optional.Method(modid = "jei")
    public void onRuntimeAvailable(IJeiRuntime jeiRuntime) {
    }

    @Optional.Method(modid = "jei")
    public void registerIngredients(IModIngredientRegistration registry) {
    }

    @Optional.Method(modid = "jei")
    @Override
    public void registerItemSubtypes(ISubtypeRegistry subtypeRegistry) {
    }
}