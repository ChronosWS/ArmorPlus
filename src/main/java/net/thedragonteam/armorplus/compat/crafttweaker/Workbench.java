/*
 * Copyright (c) TheDragonTeam 2016-2017.
 */

package net.thedragonteam.armorplus.compat.crafttweaker;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.IAction;
import crafttweaker.api.item.IIngredient;
import crafttweaker.api.item.IItemStack;
import net.minecraft.item.ItemStack;
import net.thedragonteam.armorplus.ArmorPlus;
import net.thedragonteam.armorplus.api.crafting.IRecipe;
import net.thedragonteam.armorplus.api.crafting.workbench.WBShapedOreRecipe;
import net.thedragonteam.armorplus.api.crafting.workbench.WBShapelessOreRecipe;
import net.thedragonteam.armorplus.api.crafting.workbench.WorkbenchCraftingManager;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import static net.thedragonteam.armorplus.compat.crafttweaker.CTArmorPlusPlugin.toWorkbenchShapedObjects;
import static net.thedragonteam.armorplus.compat.crafttweaker.InputHelper.toObjects;
import static net.thedragonteam.armorplus.compat.crafttweaker.InputHelper.toStack;


@ZenClass("mods." + ArmorPlus.MODID + ".Workbench")
public class Workbench {

    @ZenMethod
    public static void addShapeless(IItemStack output, IIngredient[] ingredients) {
        CraftTweakerAPI.apply(new Add(new WBShapelessOreRecipe(toStack(output), toObjects(ingredients))));
    }

    @ZenMethod
    public static void addShaped(IItemStack output, IIngredient[][] ingredients) {
        CraftTweakerAPI.apply(new Add(new WBShapedOreRecipe(toStack(output), toWorkbenchShapedObjects(ingredients))));
    }

    @ZenMethod
    public static void remove(IItemStack target) {
        CraftTweakerAPI.apply(new Remove(toStack(target)));
    }

    private static class Add implements IAction {
        IRecipe recipe;

        public Add(IRecipe add) {
            recipe = add;
        }

        @Override
        public void apply() {
            WorkbenchCraftingManager.getInstance().getRecipeList().add(recipe);
        }

        @Override
        public String describe() {
            return "Adding Workbench Recipe for " + recipe.getRecipeOutput().getDisplayName();
        }

    }

    private static class Remove implements IAction {
        IRecipe recipe = null;
        ItemStack remove;

        public Remove(ItemStack rem) {
            remove = rem;
        }

        @Override
        public void apply() {

            for (Object obj : WorkbenchCraftingManager.getInstance().getRecipeList()) {
                if (obj instanceof IRecipe) {
                    IRecipe craft = (IRecipe) obj;
                    if (craft.getRecipeOutput().isItemEqual(remove)) {
                        recipe = craft;
                        WorkbenchCraftingManager.getInstance().getRecipeList().remove(obj);
                        break;
                    }
                }
            }
        }

        @Override
        public String describe() {
            return "Removing Workbench Recipe for " + remove.getDisplayName();
        }

    }
}