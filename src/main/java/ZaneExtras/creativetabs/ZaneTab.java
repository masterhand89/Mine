package ZaneExtras.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import ZaneExtras.items.Items;

public class ZaneTab extends CreativeTabs
	{
		public ZaneTab(int par1, String par2Str)
			{
				super(par1, par2Str);
			}

		@Override
		public int getTabIconItemIndex()
			{
				return Items.damnHardButter.itemID;
			}
	}
