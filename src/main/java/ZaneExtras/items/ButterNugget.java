package ZaneExtras.items;

import net.minecraft.item.ItemFood;
import ZaneExtras.creativetabs.ModTabs;

public class ButterNugget extends ItemFood
	{
		public ButterNugget(int par1)
			{
				super(par1, 1, 1, false);
				this.setUnlocalizedName("itemButterNugget");
				this.setCreativeTab(ModTabs.zaneTab);
				this.setTextureName("Zane Extras:butternugget");
				this.setMaxStackSize(64);
			}
	}
