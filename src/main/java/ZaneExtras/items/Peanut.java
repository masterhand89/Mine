package ZaneExtras.items;

import net.minecraft.item.ItemFood;
import ZaneExtras.creativetabs.ModTabs;

public class Peanut extends ItemFood
	{
		public Peanut(int par1)
			{
				super(par1, 1, 1, false);
				this.setCreativeTab(ModTabs.zaneTab);
				this.setUnlocalizedName("peanut");
				this.setTextureName("Zane Extras:peanut");
			}
	}
