/*
 * Copyright (c) TheDragonTeam 2016-2017.
 */

package net.thedragonteam.armorplus.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.lang.String.format;
import static net.minecraft.util.text.TextFormatting.GRAY;
import static net.thedragonteam.armorplus.util.TextUtils.formattedText;

/**
 * @author Sokratis Fotkatzikis - TheDragonTeam
 **/
@SideOnly(Side.CLIENT)
public final class ToolTipUtils {

    public static void showInfo(List<String> tooltip, KeyBinding keyBinding, TextFormatting formatting) {
        tooltip.add(MessageFormat.format("{0}{1} {2}{3} {4}{5}", GRAY, formattedText("tooltip.shift.showinfo.text_one"), formatting, keyBinding.getDisplayName(), GRAY, formattedText("tooltip.shift.showinfo.text_two")));
    }

    public static void addToolTipFull(List<String> tooltip, String ability, int amplifier) {
        addToolTipFull(tooltip, ability + " " + level(amplifier));
    }

    public static void addToolTipFull(List<String> tooltip, String ability) {
        addToolTip(tooltip,
            format("\u00a79Ability: \u00a7r%s", ability),
            "\u00a73Use: \u00a7rEquip The Full Set"
        );
    }

    public static void addToolTipFull(List<String> tooltip, List<String> abilities) {
        addToolTip(tooltip, "\u00a79Abilities:");
        abilities.forEach(ability -> addToolTip(tooltip, "\u00a79" + ability));
        addToolTip(tooltip, "\u00a73Use: \u00a7rEquip The Full Set");
    }

    public static void addToolTipFull(List<String> tooltip, List<String> abilities, List<Integer> amplifier) {
        addToolTip(tooltip, "\u00a79Abilities:");
        IntStream.range(0, abilities.size()).forEach(i -> addToolTip(tooltip, "\u00a79" + abilities.get(i) + " " + level(amplifier.get(i))));
        addToolTip(tooltip, "\u00a73Use: \u00a7rEquip The Full Set");
    }

    public static void addToolTipPiece(List<String> tooltip, String ability, int amplifier) {
        addToolTipPiece(tooltip, ability + " " + level(amplifier));
    }

    public static void addToolTipPiece(List<String> tooltip, String ability) {
        addToolTip(tooltip,
            format("\u00a79Ability: \u00a7r%s", ability),
            "\u00a73Use: \u00a7rEquip A Piece"
        );
    }

    public static void addToolTipPiece(List<String> tooltip, List<String> abilities) {
        addToolTip(tooltip, "\u00a79Abilities:");
        abilities.forEach(ability -> addToolTip(tooltip, "\u00a79" + ability));
        addToolTip(tooltip, "\u00a73Use: \u00a7rEquip A Piece");
    }

    public static void addToolTipPiece(List<String> tooltip, List<String> abilities, List<Integer> amplifier) {
        addToolTip(tooltip, "\u00a79Abilities:");
        IntStream.range(0, abilities.size()).forEach(i -> addToolTip(tooltip, "\u00a79" + abilities.get(i) + " " + level(amplifier.get(i))));
        addToolTip(tooltip, "\u00a73Use: \u00a7rEquip A Piece");
    }

    public static void addWeaponToolTip(List<String> tooltip, List<String> effects, TextFormatting formatting){
        final KeyBinding keyBindSneak = Minecraft.getMinecraft().gameSettings.keyBindSneak;
        if (GameSettings.isKeyDown(keyBindSneak)) {
            tooltip.add("\2479Abilities:");
            effects.forEach(ability -> addToolTip(tooltip, "\u00a79" + ability));
            tooltip.add("\2473Use: " + "\247rHit a Target");
        } else {
            showInfo(tooltip, keyBindSneak, formatting);
        }
    }

    public static boolean isKeyDown() {
        final KeyBinding keyBindSneak = Minecraft.getMinecraft().gameSettings.keyBindSneak;
        return GameSettings.isKeyDown(keyBindSneak);
    }

    private static int level(int amplifier) {
        return amplifier + 1;
    }

    public static void addToolTip(List<String> tooltip, String... lines) {
        tooltip.addAll(Arrays.asList(lines));
    }
}
