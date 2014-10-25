package ZaneExtras.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import ZaneExtras.creativetabs.ModTabs;

public class ButterHoe extends ItemHoe
	{
		public ButterHoe(int par1, EnumToolMaterial material)
			{
				super(par1, material);
				this.setCreativeTab(ModTabs.zaneTab);
				this.setUnlocalizedName("butterHoe");
				this.setMaxDamage(300);
				this.setMaxStackSize(1);
				this.setTextureName("Zane Extras:butterhoe");
			}
	}
