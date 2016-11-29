/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.api.crafting.workbench.recipes;

import net.minecraft.item.ItemStack;
import net.thedragonteam.armorplus.ARPConfig;
import net.thedragonteam.armorplus.api.crafting.workbench.ShapedOreRecipe;
import net.thedragonteam.armorplus.api.crafting.workbench.WorkbenchCraftingManager;
import net.thedragonteam.armorplus.registry.ModItems;

public class ModOriginRecipes {

    public void addRecipes(WorkbenchCraftingManager manager) {
        /* Coal Armor */
        if (ARPConfig.enableCoalArmor) {
            if (ARPConfig.recipes == 0 && ARPConfig.enableCoalArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalHelmet, 1), "   ", "CCC", "C C", 'C', "itemCoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalHelmet, 1), "CCC", "C C", "   ", 'C', "itemCoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalChestplate, 1), "C C", "CCC", "CCC", 'C', "itemCoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalLeggings, 1), "CCC", "C C", "C C", 'C', "itemCoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalBoots, 1), "   ", "C C", "C C", 'C', "itemCoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalBoots, 1), "C C", "C C", "   ", 'C', "itemCoal"));
            }
            if (ARPConfig.recipes == 0 && ARPConfig.enableCharcoalCoalArmorRecipe) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalHelmet, 1), "   ", "CCC", "C C", 'C', "itemCharcoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalHelmet, 1), "CCC", "C C", "   ", 'C', "itemCharcoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalChestplate, 1), "C C", "CCC", "CCC", 'C', "itemCharcoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalLeggings, 1), "CCC", "C C", "C C", 'C', "itemCharcoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalBoots, 1), "   ", "C C", "C C", 'C', "itemCharcoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalBoots, 1), "C C", "C C", "   ", 'C', "itemCharcoal"));
            }
            if (ARPConfig.recipes == 1 && ARPConfig.enableCoalArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalHelmet, 1), "   ", "CCC", "C C", 'C', "blockCoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalHelmet, 1), "CCC", "C C", "   ", 'C', "blockCoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalChestplate, 1), "C C", "CCC", "CCC", 'C', "blockCoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalLeggings, 1), "CCC", "C C", "C C", 'C', "blockCoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalBoots, 1), "C C", "C C", 'C', "blockCoal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coalBoots, 1), "C C", "C C", "   ", 'C', "blockCoal"));
            }
        }
        /* Lapis Armor */
        if (ARPConfig.enableLapisArmor) {
            if (ARPConfig.recipes == 0 && ARPConfig.enableLapisArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisHelmet, 1), "   ", "LLL", "L L", 'L', "gemLapis"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisHelmet, 1), "LLL", "L L", "   ", 'L', "gemLapis"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisChestplate, 1), "L L", "LLL", "LLL", 'L', "gemLapis"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisLeggings, 1), "LLL", "L L", "L L", 'L', "gemLapis"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisBoots, 1), "   ", "L L", "L L", 'L', "gemLapis"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisBoots, 1), "L L", "L L", "   ", 'L', "gemLapis"));
            }
            if (ARPConfig.recipes == 1 && ARPConfig.enableLapisArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisHelmet, 1), "   ", "LLL", "L L", 'L', "blockLapis"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisHelmet, 1), "LLL", "L L", "   ", 'L', "blockLapis"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisChestplate, 1), "L L", "LLL", "LLL", 'L', "blockLapis"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisLeggings, 1), "LLL", "L L", "L L", 'L', "blockLapis"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisBoots, 1), "   ", "L L", "L L", 'L', "blockLapis"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisBoots, 1), "L L", "L L", "   ", 'L', "blockLapis"));
            }
        }
        /* Redstone Armor */
        if (ARPConfig.enableRedstoneArmor) {
            if (ARPConfig.recipes == 0 && ARPConfig.enableRedstoneArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneHelmet, 1), "   ", "RRR", "R R", 'R', "dustRedstone"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneHelmet, 1), "RRR", "R R", "   ", 'R', "dustRedstone"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneChestplate, 1), "R R", "RRR", "RRR", 'R', "dustRedstone"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneLeggings, 1), "RRR", "R R", "R R", 'R', "dustRedstone"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneBoots, 1), "   ", "R R", "R R", 'R', "dustRedstone"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneBoots, 1), "R R", "R R", "   ", 'R', "dustRedstone"));
            }
            if (ARPConfig.recipes == 1 && ARPConfig.enableRedstoneArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneHelmet, 1), "   ", "RRR", "R R", 'R', "blockRedstone"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneHelmet, 1), "RRR", "R R", "   ", 'R', "blockRedstone"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneChestplate, 1), "R R", "RRR", "RRR", 'R', "blockRedstone"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneLeggings, 1), "RRR", "R R", "R R", 'R', "blockRedstone"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneBoots, 1), "   ", "R R", "R R", 'R', "blockRedstone"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneBoots, 1), "R R", "R R", "   ", 'R', "blockRedstone"));
            }
        }
        /* Emerald Armor */
        if (ARPConfig.enableEmeraldArmor) {
            if (ARPConfig.recipes == 0 && ARPConfig.enableEmeraldArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHelmet, 1), "   ", "EEE", "E E", 'E', "gemEmerald"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHelmet, 1), "EEE", "E E", "   ", 'E', "gemEmerald"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldChestplate, 1), "E E", "EEE", "EEE", 'E', "gemEmerald"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldLeggings, 1), "EEE", "E E", "E E", 'E', "gemEmerald"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldBoots, 1), "   ", "E E", "E E", 'E', "gemEmerald"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldBoots, 1), "E E", "E E", "   ", 'E', "gemEmerald"));
            }
            if (ARPConfig.recipes == 1 && ARPConfig.enableEmeraldArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHelmet, 1), "   ", "EEE", "E E", 'E', "blockEmerald"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHelmet, 1), "EEE", "E E", "   ", 'E', "blockEmerald"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldChestplate, 1), "E E", "EEE", "EEE", 'E', "blockEmerald"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldLeggings, 1), "EEE", "E E", "E E", 'E', "blockEmerald"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldBoots, 1), "   ", "E E", "E E", 'E', "blockEmerald"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldBoots, 1), "E E", "E E", "   ", 'E', "blockEmerald"));
            }
        }
        /* Obsidian Armor */
        if (ARPConfig.enableObsidianArmor) {
            if (ARPConfig.recipes == 0 && ARPConfig.enableObsidianArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianHelmet, 1), "   ", "OOO", "O O", 'O', "obsidian"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianHelmet, 1), "OOO", "O O", "   ", 'O', "obsidian"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianChestplate, 1), "O O", "OOO", "OOO", 'O', "obsidian"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianLeggings, 1), "OOO", "O O", "O O", 'O', "obsidian"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianBoots, 1), "   ", "O O", "O O", 'O', "obsidian"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianBoots, 1), "O O", "O O", "   ", 'O', "obsidian"));
            }
            if (ARPConfig.recipes == 1 && ARPConfig.enableObsidianArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianHelmet, 1), "   ", "OOO", "O O", 'O', "blockCompressedObsidian"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianHelmet, 1), "OOO", "O O", "   ", 'O', "blockCompressedObsidian"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianChestplate, 1), "O O", "OOO", "OOO", 'O', "blockCompressedObsidian"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianLeggings, 1), "OOO", "O O", "O O", 'O', "blockCompressedObsidian"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianBoots, 1), "   ", "O O", "O O", 'O', "blockCompressedObsidian"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidianBoots, 1), "O O", "O O", "   ", 'O', "blockCompressedObsidian"));
            }
        }
        /* Lava Armor */
        if (ARPConfig.enableLavaArmor) {
            if (ARPConfig.recipes == 0 && ARPConfig.enableLavaArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lavaHelmet, 1), "   ", "CCC", "C C", 'C', "gemLavaCrystal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lavaHelmet, 1), "CCC", "C C", "   ", 'C', "gemLavaCrystal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lavaChestplate, 1), "C C", "CCC", "CCC", 'C', "gemLavaCrystal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lavaLeggings, 1), "CCC", "C C", "C C", 'C', "gemLavaCrystal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lavaBoots, 1), "   ", "C C", "C C", 'C', "gemLavaCrystal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lavaBoots, 1), "C C", "C C", "   ", 'C', "gemLavaCrystal"));
            }
            if (ARPConfig.recipes == 1 && ARPConfig.enableLavaArmorRecipes) {
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lavaHelmet, 1), "   ", "CCC", "C C", 'C', "gemChargedLavaCrystal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lavaHelmet, 1), "CCC", "C C", "   ", 'C', "gemChargedLavaCrystal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lavaChestplate, 1), "C C", "CCC", "CCC", 'C', "gemChargedLavaCrystal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lavaLeggings, 1), "CCC", "C C", "C C", 'C', "gemChargedLavaCrystal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lavaBoots, 1), "   ", "C C", "C C", 'C', "gemChargedLavaCrystal"));
                manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lavaBoots, 1), "C C", "C C", "   ", 'C', "gemChargedLavaCrystal"));
            }
        }
    }
}