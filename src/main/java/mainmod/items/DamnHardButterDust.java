package mainmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DamnHardButterDust extends Item
	{
		public DamnHardButterDust(int par1)
			{
				super(par1);
				this.setUnlocalizedName("damnhardbutterdust");
				this.setCreativeTab(CreativeTabs.tabMaterials);
				this.setTextureName("awmb:damnhardbutterdust");
				this.setMaxStackSize(64);
			}

	}
