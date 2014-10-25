package ZaneExtras.items;

import net.minecraft.item.Item;
import ZaneExtras.creativetabs.ModTabs;

public class DamnHardButterDust extends Item
	{
		public DamnHardButterDust(int par1)
			{
				super(par1);
				this.setUnlocalizedName("damnhardbutterdust");
				this.setCreativeTab(ModTabs.zaneTab);
				this.setTextureName("Zane Extras:damnhardbutterdust");
				this.setMaxStackSize(64);
			}

	}
