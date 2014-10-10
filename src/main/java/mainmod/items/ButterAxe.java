package mainmod.items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class ButterAxe extends ItemAxe
	{
		public ButterAxe(int id, EnumToolMaterial material)
			{
				super(id, material);
				this.setCreativeTab(CreativeTabs.tabTools);
				this.setUnlocalizedName("butterAxe");
				this.setMaxDamage(300);
				this.setMaxStackSize(1);
				this.setTextureName("awmb:butteraxe");
			}
	}
