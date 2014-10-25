package ZaneExtras.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ZaneExtras.creativetabs.ModTabs;

public class BottleOfPeanutButter extends ItemFood
	{
		public BottleOfPeanutButter(int par1)
			{
				super(par1, 4, 30, false);
				this.setCreativeTab(ModTabs.zaneTab);
				this.setUnlocalizedName("bottleofpeanutbutter");
				this.setTextureName("Zane Extras:bottleofpeanutbutter");
				this.setMaxStackSize(64);
			}
		public ItemStack onEaten(ItemStack par1ItemStack, World par2World,
				EntityPlayer par3EntityPlayer)
			{
				super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
				return new ItemStack(Item.glassBottle);
			}
	}
