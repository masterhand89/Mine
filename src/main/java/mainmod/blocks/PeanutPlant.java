package mainmod.blocks;

import java.util.Random;

import mainmod.items.Items;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.creativetab.CreativeTabs;

public class PeanutPlant extends BlockFlower
	{

		public PeanutPlant(int par1)
			{
				super(par1);
				this.setCreativeTab(CreativeTabs.tabDecorations);
				this.setUnlocalizedName("peanutplant");
				this.setTextureName("awmb:peanutplant");
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
