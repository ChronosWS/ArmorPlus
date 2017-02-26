/*
 * Copyright (c) TheDragonTeam 2016-2017.
 */

package net.thedragonteam.armorplus.compat.baubles

import net.thedragonteam.armorplus.compat.ICompatibility

/**
 * net.thedragonteam.armorplus.compat.jei
 * ArmorPlus created by sokratis12GR on 6/21/2016 10:54 PM.
 * - TheDragonTeam
 */
class CompatibilityBaubles : ICompatibility {

    override fun loadCompatibility(phase: ICompatibility.InitializationPhase) {}

    override val modid: String
        get() = "baubles"

    override fun enableCompat(): Boolean {
        return true
    }
}