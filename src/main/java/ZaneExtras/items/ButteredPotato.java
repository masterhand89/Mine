package ZaneExtras.items;

import net.minecraft.item.ItemFood;
import ZaneExtras.creativetabs.ModTabs;

public class ButteredPotato extends ItemFood
	{
		public ButteredPotato(int par1)
			{
				super(par1, 4, 8, false);
				this.setUnlocalizedName("itemButteredPotato");
				this.setCreativeTab(ModTabs.zaneTab);
				this.setTextureName("Zane Extras:butteredpotato");
				this.setMaxStackSize(64);
			}
	}
