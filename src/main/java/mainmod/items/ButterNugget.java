package mainmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ButterNugget extends ItemFood
	{
		public ButterNugget(int par1)
			{
				super(par1, 1, 1, false);
				this.setUnlocalizedName("itemButterNugget");
				this.setCreativeTab(CreativeTabs.tabFood);
				this.setTextureName("awmb:butternugget");
				this.setMaxStackSize(64);
			}
	}
