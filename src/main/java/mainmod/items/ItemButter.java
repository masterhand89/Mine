package mainmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemButter extends ItemFood
	{
		public ItemButter(int par1)
			{
				super(par1, 2, 4, false);
				this.setUnlocalizedName("itemButter");
				this.setCreativeTab(CreativeTabs.tabFood);
				this.setTextureName("awmb:butteringot");
				this.setMaxStackSize(64);
			}
	}
