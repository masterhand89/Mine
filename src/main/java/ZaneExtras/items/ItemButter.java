package ZaneExtras.items;

import net.minecraft.item.ItemFood;
import ZaneExtras.creativetabs.ModTabs;

public class ItemButter extends ItemFood
	{
		public ItemButter(int par1)
			{
				super(par1, 2, 4, false);
				this.setUnlocalizedName("itemButter");
				this.setCreativeTab(ModTabs.zaneTab);
				this.setTextureName("Zane Extras:butteringot");
				this.setMaxStackSize(64);
			}
	}
