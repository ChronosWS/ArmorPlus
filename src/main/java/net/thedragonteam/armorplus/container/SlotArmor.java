package net.thedragonteam.armorplus.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

/**
 * @author Sokratis Fotkatzikis - TheDragonTeam
 */
public class SlotArmor extends Slot {

    private final EntityPlayer player;
    private final EntityEquipmentSlot armorType;

    /**
     * Make a new instance.
     *
     * @param inventory The inventory this slot will be in.
     *                  *
     * @param index     The index of this slot.
     *                  *
     * @param x         X coordinate.
     *                  *
     * @param y         POS_Y coordinate.
     *                  *
     * @param player    The player entity.
     *                  *
     * @param armorType The armor type.
     */
    public SlotArmor(IInventory inventory, int index, int x, int y, EntityPlayer player, EntityEquipmentSlot armorType) {
        super(inventory, index, x, y);
        this.player = player;
        this.armorType = armorType;
    }

    @Override
    public int getSlotStackLimit() {
        return 1;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return !stack.isEmpty() && stack.getItem().isValidArmor(stack, armorType, player);
    }

    @Nullable
    @Override
    public String getSlotTexture() {
        return ItemArmor.EMPTY_SLOT_NAMES[armorType.getIndex()];
    }

}