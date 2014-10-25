package ZaneExtras.items;

import net.minecraft.item.ItemFood;
import ZaneExtras.creativetabs.ModTabs;

public class ItemDamnHardButter extends ItemFood
	{
		public ItemDamnHardButter(int par1)
			{
				super(par1, 1, 50, false);
				this.setUnlocalizedName("itemDamnHardButter");
				this.setCreativeTab(ModTabs.zaneTab);
				this.setTextureName("Zane Extras:damnhardbutter");
				this.setMaxStackSize(64);
			}
	}
