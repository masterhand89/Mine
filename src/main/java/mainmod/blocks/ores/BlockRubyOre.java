package mainmod.blocks.ores;

import java.util.Random;

import mainmod.items.Items;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class BlockRubyOre extends BlockOre
	{
		public BlockRubyOre(int par1)
			{
				super(par1);
				this.setCreativeTab(CreativeTabs.tabBlock);
				this.setUnlocalizedName("blockrubyore");
				this.setTextureName("awmb:rubyore");
				this.setHardness(1.2F);
				this.setResistance(2.0F);
				MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 2);
			}

		@Override
		public int idDropped(int par1, Random par2Random, int par3)
			{
				return Items.ruby.itemID;
			}

		@Override
		public void onBlockDestroyedByPlayer(World world, int x, int y, int z,
				int meta)
			{
				this.dropXpOnBlockBreak(world, x, y, z, 10);
			}
	}
