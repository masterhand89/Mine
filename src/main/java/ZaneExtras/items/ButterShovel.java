package ZaneExtras.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import ZaneExtras.creativetabs.ModTabs;

public class ButterShovel extends ItemSpade
	{
		public ButterShovel(int par1, EnumToolMaterial material)
			{
				super(par1, material);
				this.setCreativeTab(ModTabs.zaneTab);
				this.setUnlocalizedName("butterShovel");
				this.setMaxDamage(300);
				this.setMaxStackSize(1);
				this.setTextureName("Zane Extras:buttershovel");
			}
	}
