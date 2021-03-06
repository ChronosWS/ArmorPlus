package net.thedragonteam.armorplus.armors.horse;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.armorplus.armors.APArmorMaterial;
import net.thedragonteam.armorplus.items.base.BaseItem;

import static net.thedragonteam.armorplus.armors.APArmorMaterial.*;
import static net.thedragonteam.armorplus.util.EnumHelperUtil.addHorseArmor;

public class ItemHorseArmor extends BaseItem {

    public static HorseArmorType coal = addHorseArmor(COAL, 1);
    public static HorseArmorType lapis = addHorseArmor(LAPIS, 3);
    public static HorseArmorType redstone = addHorseArmor(REDSTONE, 3);
    public static HorseArmorType emerald = addHorseArmor(EMERALD, 11);
    public static HorseArmorType obsidian = addHorseArmor(OBSIDIAN, 13);
    public static HorseArmorType lava = addHorseArmor(LAVA, 15);
    public static HorseArmorType guardian = addHorseArmor(GUARDIAN, 18);
    public static HorseArmorType super_star = addHorseArmor(SUPER_STAR, 18);
    public static HorseArmorType ender_dragon = addHorseArmor(ENDER_DRAGON, 18);
    private APArmorMaterial material;

    public ItemHorseArmor(APArmorMaterial material) {
        super(material.getName() + "_horse_armor");
        this.material = material;
    }

    @Override
    public HorseArmorType getHorseArmorType(ItemStack stack) {
        switch (material) {
            case COAL:
                return coal;
            case LAPIS:
                return lapis;
            case REDSTONE:
                return redstone;
            case EMERALD:
                return emerald;
            case OBSIDIAN:
                return obsidian;
            case LAVA:
                return lava;
            case GUARDIAN:
                return guardian;
            case SUPER_STAR:
                return super_star;
            case ENDER_DRAGON:
                return ender_dragon;
        }
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getHorseArmorTexture(EntityLiving wearer, ItemStack stack) {
        return super.getHorseArmorTexture(wearer, stack);
    }

    @Override
    public void onHorseArmorTick(World world, EntityLiving wearer, ItemStack itemStack) {
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void initModel() {
        this.initModel(material.getName());
    }
}