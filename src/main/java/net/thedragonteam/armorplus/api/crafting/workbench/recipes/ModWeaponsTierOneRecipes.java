/*
 * Copyright (c) TheDragonTeam 2016-2017.
 */

package net.thedragonteam.armorplus.api.crafting.workbench.recipes;

import net.thedragonteam.armorplus.api.crafting.base.BaseCraftingManager;

import static net.thedragonteam.armorplus.ModConfig.RegistryConfig.global_registry;
import static net.thedragonteam.armorplus.ModConfig.RegistryConfig.recipes;
import static net.thedragonteam.armorplus.ModConfig.getRD;
import static net.thedragonteam.armorplus.api.crafting.workbench.recipes.WBRecipesHelper.*;
import static net.thedragonteam.armorplus.registry.APItems.*;

public class ModWeaponsTierOneRecipes {
    public void addRecipes(BaseCraftingManager manager) {
        switch (getRD()) {
            case EASY: {
                if (recipes.enableSwordsRecipes) {
                    if (global_registry.enableCoalWeapons[0]) {
                        createSwordRecipe(manager, "itemCoal", coalSword);
                    }
                    if (global_registry.enableLapisWeapons[0]) {
                        createSwordRecipe(manager, "gemLapis", lapisSword);
                    }
                    if (global_registry.enableRedstoneWeapons[0]) {
                        createSwordRecipe(manager, "dustRedstone", redstoneSword);
                    }
                }
                if (recipes.enableBattleAxesRecipes) {
                    if (global_registry.enableCoalWeapons[1]) {
                        createBattleAxeRecipe(manager, "itemCoal", coalBattleAxe);
                    }
                    if (global_registry.enableLapisWeapons[1]) {
                        createBattleAxeRecipe(manager, "gemLapis", lapisBattleAxe);
                    }
                    if (global_registry.enableRedstoneWeapons[1]) {
                        createBattleAxeRecipe(manager, "dustRedstone", redstoneBattleAxe);
                    }
                }
                if (recipes.enableBowsRecipes) {
                    if (global_registry.enableCoalWeapons[2]) {
                        createBowRecipes(manager, "itemCoal", coalBow);
                    }
                    if (global_registry.enableLapisWeapons[2]) {
                        createBowRecipes(manager, "gemLapis", lapisBow);
                    }
                    if (global_registry.enableRedstoneWeapons[2]) {
                        createBowRecipes(manager, "dustRedstone", redstoneBow);
                    }
                }
                break;
            }
            case EXPERT:
            case HELLISH: {
                if (recipes.enableSwordsRecipes) {
                    if (global_registry.enableCoalWeapons[0]) {
                        createSwordRecipe(manager, "blockCoal", coalSword);
                    }
                    if (global_registry.enableLapisWeapons[0]) {
                        createSwordRecipe(manager, "blockLapis", lapisSword);
                    }
                    if (global_registry.enableRedstoneWeapons[0]) {
                        createSwordRecipe(manager, "blockRedstone", redstoneSword);
                    }
                }
                if (recipes.enableBattleAxesRecipes) {
                    if (global_registry.enableCoalWeapons[1]) {
                        createBattleAxeRecipe(manager, "blockCoal", coalBattleAxe);
                    }
                    if (global_registry.enableLapisWeapons[1]) {
                        createBattleAxeRecipe(manager, "blockLapis", lapisBattleAxe);
                    }
                    if (global_registry.enableRedstoneWeapons[1]) {
                        createBattleAxeRecipe(manager, "blockRedstone", redstoneBattleAxe);
                    }
                }
                if (recipes.enableBowsRecipes) {
                    if (global_registry.enableCoalWeapons[2]) {
                        createBowRecipes(manager, "blockCoal", coalBow);
                    }
                    if (global_registry.enableLapisWeapons[2]) {
                        createBowRecipes(manager, "blockLapis", lapisBow);
                    }
                    if (global_registry.enableRedstoneWeapons[2]) {
                        createBowRecipes(manager, "blockRedstone", redstoneBow);
                    }
                }
                break;
            }
        }
    }
}
