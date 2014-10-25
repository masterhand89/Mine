package ZaneExtras.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import ZaneExtras.creativetabs.ModTabs;
import ZaneExtras.items.Items;

public class PeanutPlant extends BlockFlower
	{

		public PeanutPlant(int par1)
			{
				super(par1);
				this.setCreativeTab(ModTabs.zaneTab);
				this.setUnlocalizedName("peanutplant");
				this.setTextureName("Zane Extras:peanutplant");
				this.setResistance(0F);
				this.setHardness(0F);
				this.setStepSound(Block.soundGrassFootstep);
			}

		@Override
		public int idDropped(int par1, Random par2Random, int par3)
			{
				return Items.peanut.itemID;
			}
	}
