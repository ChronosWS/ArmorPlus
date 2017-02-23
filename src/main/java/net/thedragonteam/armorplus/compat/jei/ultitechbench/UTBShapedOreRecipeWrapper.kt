/*
 * Copyright (c) TheDragonTeam 2016-2017.
 */

package net.thedragonteam.armorplus.compat.jei.ultitechbench

import mezz.jei.api.IJeiHelpers
import mezz.jei.api.ingredients.IIngredients
import mezz.jei.api.recipe.BlankRecipeWrapper
import mezz.jei.api.recipe.wrapper.IShapedCraftingRecipeWrapper
import mezz.jei.util.BrokenCraftingRecipeException
import mezz.jei.util.ErrorUtil
import net.minecraft.item.ItemStack
import net.thedragonteam.armorplus.api.crafting.ultitechbench.ShapedOreRecipe
import java.util.*

class UTBShapedOreRecipeWrapper(private val jeiHelpers: IJeiHelpers, private val recipe: ShapedOreRecipe) : BlankRecipeWrapper(), IShapedCraftingRecipeWrapper {

    init {
        this.recipe.input
                .asSequence()
                .filterIsInstance<ItemStack>()
                .filter { it.count != 1 }
                .forEach { it.count = 1 }
    }

    override fun getIngredients(ingredients: IIngredients) {
        val stackHelper = jeiHelpers.stackHelper
        val recipeOutput = recipe.recipeOutput

        try {
            val inputs = stackHelper.expandRecipeItemStackInputs(Arrays.asList(*recipe.input))
            ingredients.setInputLists(ItemStack::class.java, inputs)
            ingredients.setOutput(ItemStack::class.java, recipeOutput)
        } catch (e: RuntimeException) {
            val info = ErrorUtil.getInfoFromBrokenCraftingRecipe(recipe, Arrays.asList(*recipe.input), recipeOutput)
            throw BrokenCraftingRecipeException(info, e)
        }

    }

    override fun getWidth(): Int {
        return recipe.width
    }

    override fun getHeight(): Int {
        return recipe.height
    }

}