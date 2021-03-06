package net.thedragonteam.armorplus.util;

import static net.minecraftforge.fml.common.Loader.isModLoaded;
import static net.thedragonteam.armorplus.ModConfig.IntegrationsConfig.enableTConstructIntegration;
import static net.thedragonteam.armorplus.ModConfig.IntegrationsConfig.enableTOPIntegration;

/**
 * @author Sokratis Fotkatzikis - TheDragonTeam
 **/
public class LoaderUtils {

    public static boolean isTiCIntegrationEnabled() {
        return LoaderUtils.isTiCLoaded() && enableTConstructIntegration;
    }

    public static boolean isTOPIntegrationEnabled() {
        return LoaderUtils.isTOPLoaded() && enableTOPIntegration;
    }

    public static boolean isTeslaLoaded() {
        return isModLoaded("tesla");
    }

    public static boolean isBaublesLoaded() {
        return isModLoaded("baubles");
    }

    public static boolean isTiCLoaded() {
        return isModLoaded("tconstruct");
    }

    public static boolean isTDLLoaded() {
        return isModLoaded("thedragonlib");
    }

    public static boolean isTOPLoaded() {
        return isModLoaded("theoneprobe");
    }

}
