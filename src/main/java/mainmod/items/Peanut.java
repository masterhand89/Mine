package mainmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Peanut extends ItemFood
	{
		public Peanut(int par1)
			{
				super(par1, 1, 1, false);
				this.setCreativeTab(CreativeTabs.tabFood);
				this.setUnlocalizedName("peanut");
				this.setTextureName("awmb:peanut");
			}
	}
