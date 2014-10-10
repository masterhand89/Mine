package mainmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRuby extends Item
	{
		public ItemRuby(int par1)
			{
				super(par1);
				this.setCreativeTab(CreativeTabs.tabMaterials);
				this.setUnlocalizedName("ruby");
				this.setTextureName("awmb:ruby");
			}
	}
