package mainmod.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRuby extends Block
	{
		public BlockRuby(int par1)
			{
				super(par1, Material.iron);
				this.setCreativeTab(CreativeTabs.tabBlock);
				this.setUnlocalizedName("rubyblock");
				this.setResistance(4.0F);
				this.setHardness(4.0F);
				this.setStepSound(Block.soundMetalFootstep);
				this.setTextureName("awmb:rubyblock");
			}
	}
