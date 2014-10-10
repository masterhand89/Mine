package mainmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

public class ButterHoe extends ItemHoe
	{
		public ButterHoe(int par1, EnumToolMaterial material)
			{
				super(par1, material);
				this.setCreativeTab(CreativeTabs.tabTools);
				this.setUnlocalizedName("butterHoe");
				this.setMaxDamage(300);
				this.setMaxStackSize(1);
				this.setTextureName("awmb:butterhoe");
			}
	}
