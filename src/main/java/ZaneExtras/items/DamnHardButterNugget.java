package ZaneExtras.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ZaneExtras.creativetabs.ModTabs;
import ZaneExtras.entity.EntityDamnHardGoldNugget;

public class DamnHardButterNugget extends Item
	{
		public DamnHardButterNugget(int par1)
			{
				super(par1);
				this.setCreativeTab(ModTabs.zaneTab);
				this.setUnlocalizedName("damnhardbutternugget");
				this.setTextureName("Zane Extras:damnhardbutternugget");
			}

		@Override
		public ItemStack onItemRightClick(ItemStack par1ItemStack,
				World par2World, EntityPlayer par3EntityPlayer)
			{
				if (!par3EntityPlayer.capabilities.isCreativeMode)
					{
						--par1ItemStack.stackSize;
					}
				par2World.playSoundAtEntity(par3EntityPlayer, "random.bow",
						0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
				if (!par2World.isRemote)
					{
						par2World
								.spawnEntityInWorld(new EntityDamnHardGoldNugget(
										par2World, par3EntityPlayer));
					}
				return par1ItemStack;
			}
	}
