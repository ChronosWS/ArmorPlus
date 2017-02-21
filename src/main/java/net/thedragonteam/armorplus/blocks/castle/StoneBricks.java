/*
 * Copyright (c) TheDragonTeam 2016-2017.
 */

package net.thedragonteam.armorplus.blocks.castle;

import net.minecraft.block.material.MapColor;

public enum StoneBricks {
    WHITE("white", MapColor.SNOW),
    RED("red", MapColor.RED),
    BLACK("black", MapColor.BLACK),
    BLUE("blue", MapColor.BLUE),
    GREEN("green", MapColor.GREEN),
    YELLOW("yellow", MapColor.YELLOW),
    PURPLE("purple", MapColor.PURPLE);

    private final String name;
    /**
     * The color that represents this entry on a map.
     */
    private final MapColor mapColor;

    StoneBricks(String nameIn, MapColor mapColorIn) {
        this.name = nameIn;
        this.mapColor = mapColorIn;
    }

    /**
     * The color which represents this entry on a map.
     */
    public MapColor getMapColor() {
        return this.mapColor;
    }

    public String getName() {
        return this.name;
    }
}
