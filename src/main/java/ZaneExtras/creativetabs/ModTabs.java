package ZaneExtras.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModTabs
	{
		public static CreativeTabs zaneTab = new ZaneTab(
				CreativeTabs.getNextID(), "zaneTab");

		public static void init()
			{
				LanguageRegistry.instance().addStringLocalization(
						"itemGroup." + "zaneTab", "en_US", "Zane's Extras");
			}
	}
