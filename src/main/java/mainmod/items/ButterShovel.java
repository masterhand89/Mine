package mainmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class ButterShovel extends ItemSpade
	{
		public ButterShovel(int par1, EnumToolMaterial material)
			{
				super(par1, material);
				this.setCreativeTab(CreativeTabs.tabTools);
				this.setUnlocalizedName("butterShovel");
				this.setMaxDamage(300);
				this.setMaxStackSize(1);
				this.setTextureName("awmb:buttershovel");
			}
	}
