/*
 * Copyright (c) TheDragonTeam 2016-2017.
 */

package net.thedragonteam.armorplus.api.crafting.ultitechbench.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.thedragonteam.armorplus.APConfig;
import net.thedragonteam.armorplus.api.crafting.ultitechbench.ShapedOreRecipe;
import net.thedragonteam.armorplus.api.crafting.ultitechbench.UltiTechBenchCraftingManager;
import net.thedragonteam.armorplus.registry.ModItems;

import static net.thedragonteam.armorplus.APConfig.enableEnderDragonArmorElytra;
import static net.thedragonteam.armorplus.APConfig.enableEnderDragonArmorRecipes;

public class ModEnderDragonRecipes {
    public void addRecipes(UltiTechBenchCraftingManager manager) {
        /* Ender Dragon Armor */
        if (APConfig.enableEnderDragonArmor) {
            if (APConfig.gameMode == 0 && enableEnderDragonArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonHelmet, 1),
                        "EEEEE",
                        "E   E",
                        "     ",
                        "     ",
                        "     ",
                        'E', "scaleEnderDragon"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonHelmet, 1),
                        "     ",
                        "     ",
                        "EEEEE",
                        "E   E",
                        'E', "scaleEnderDragon"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonChestplate, 1),
                        "E   E",
                        "E   E",
                        "EEEEE",
                        "EEEEE",
                        "EEEEE",
                        'E', "scaleEnderDragon"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonLeggings, 1),
                        "EEEEE",
                        "EEEEE",
                        "E   E",
                        "E   E",
                        "E   E",
                        'E', "scaleEnderDragon"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonBoots, 1),
                        "E   E",
                        "E   E",
                        "     ",
                        "     ",
                        "     ",
                        'E', "scaleEnderDragon"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonBoots, 1),
                        "     ",
                        "     ",
                        "     ",
                        "E   E",
                        "E   E",
                        'E', "scaleEnderDragon"));
            }
            if (APConfig.gameMode == 1 && enableEnderDragonArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonHelmet, 1),
                        "CEEEC",
                        "ES SE",
                        "     ",
                        "     ",
                        "     ",
                        'E', "scaleEnderDragon",
                        'S', Items.ENDER_EYE,
                        'C', Items.END_CRYSTAL));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonHelmet, 1),
                        "     ",
                        "     ",
                        "     ",
                        "CEEEC",
                        "ES SE",
                        'E', "scaleEnderDragon",
                        'S', Items.ENDER_EYE,
                        'C', Items.END_CRYSTAL));
                if (enableEnderDragonArmorElytra) {
                    manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonChestplate, 1),
                            "S   S",
                            "E   E",
                            "EEEEE",
                            "ELSLE",
                            "EEEEE",
                            'E', "scaleEnderDragon",
                            'S', Items.ENDER_EYE,
                            'L', Items.ELYTRA));
                } else {
                    manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonChestplate, 1),
                            "S   S",
                            "E   E",
                            "EEEEE",
                            "ECSCE",
                            "EEEEE",
                            'E', "scaleEnderDragon",
                            'S', Items.ENDER_EYE,
                            'C', Items.END_CRYSTAL));
                }
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonLeggings, 1),
                        "SEEES",
                        "ECSCE",
                        "E   E",
                        "E   E",
                        "E   E",
                        'E', "scaleEnderDragon",
                        'S', Items.ENDER_EYE,
                        'C', Items.END_CRYSTAL));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonBoots, 1),
                        "S   S",
                        "E   E",
                        "E   E",
                        "C   C",
                        "     ",
                        'E', "scaleEnderDragon",
                        'S', Items.ENDER_EYE,
                        'C', Items.END_CRYSTAL));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonBoots, 1),
                        "     ",
                        "S   S",
                        "E   E",
                        "E   E",
                        "C   C",
                        'E', "scaleEnderDragon",
                        'S', Items.ENDER_EYE,
                        'C', Items.END_CRYSTAL));
            }
        }
    }
}
