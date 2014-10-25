package ZaneExtras.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ZaneExtras.creativetabs.ModTabs;

public class DamnHardButterNetherOre extends Block
	{
		public DamnHardButterNetherOre(int par1)
			{
				super(par1, Material.rock);
				this.setCreativeTab(ModTabs.zaneTab);
				this.setUnlocalizedName("damnhardbutternetherore");
				this.setHardness(4.5F);
				this.setResistance(3.5F);
				this.setStepSound(Block.soundStoneFootstep);
				this.setTextureName("Zane Extras:damnhardbutternetherore");
			}
	}
