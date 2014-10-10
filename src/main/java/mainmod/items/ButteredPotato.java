package mainmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ButteredPotato extends ItemFood
	{
		public ButteredPotato(int par1)
			{
				super(par1, 4, 8, false);
				this.setUnlocalizedName("itemButteredPotato");
				this.setCreativeTab(CreativeTabs.tabFood);
				this.setTextureName("awmb:butteredpotato");
				this.setMaxStackSize(64);
			}
	}
