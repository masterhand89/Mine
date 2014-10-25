package ZaneExtras.items;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import ZaneExtras.creativetabs.ModTabs;

public class ButterAxe extends ItemAxe
	{
		public ButterAxe(int id, EnumToolMaterial material)
			{
				super(id, material);
				this.setCreativeTab(ModTabs.zaneTab);
				this.setUnlocalizedName("butterAxe");
				this.setMaxDamage(300);
				this.setMaxStackSize(1);
				this.setTextureName("Zane Extras:butteraxe");
			}
	}
