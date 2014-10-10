package mainmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemDamnHardButter extends ItemFood
	{
		public ItemDamnHardButter(int par1)
			{
				super(par1, 1, 50, false);
				this.setUnlocalizedName("itemDamnHardButter");
				this.setCreativeTab(CreativeTabs.tabFood);
				this.setTextureName("awmb:damnhardbutterignot");
				this.setMaxStackSize(64);
			}
	}
