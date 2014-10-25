package ZaneExtras.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import ZaneExtras.creativetabs.ModTabs;
import ZaneExtras.items.Items;

public class DamnHardButterOre extends BlockOre
	{
		public DamnHardButterOre(int par1)
			{
				super(par1);
				this.setCreativeTab(ModTabs.zaneTab);
				this.setUnlocalizedName("blockdamnhardbutterore");
				this.setTextureName("Zane Extras:damnhardbutterore");
				this.setHardness(1.2F);
				this.setResistance(2.0F);
				MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 2);
				this.setStepSound(Block.soundStoneFootstep);
			}

		@Override
		public int idDropped(int par1, Random par2Random, int par3)
			{
				return Items.damnHardButterNugget.itemID;
			}

		@Override
		public void onBlockDestroyedByPlayer(World world, int x, int y, int z,
				int meta)
			{
				this.dropXpOnBlockBreak(world, x, y, z, 10);
			}
	}
