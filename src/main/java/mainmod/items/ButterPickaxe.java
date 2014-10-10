package mainmod.items;

import mainmod.blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.MinecraftForge;

public class ButterPickaxe extends ItemTool
	{
		public static final Block[] blocksEffectiveAgainst = new Block[]{
				Block.cobblestone, Block.stoneDoubleSlab,
				Block.stoneSingleSlab, Block.stone, Block.sandStone,
				Block.cobblestoneMossy, Block.oreIron, Block.blockIron,
				Block.oreCoal, Block.blockGold, Block.oreGold,
				Block.oreDiamond, Block.blockDiamond, Block.ice,
				Block.netherrack, Block.oreLapis, Block.blockLapis,
				Block.oreRedstone, Block.oreRedstoneGlowing, Block.rail,
				Block.railDetector, Block.railPowered, Block.railActivator,
				Blocks.rubyBlock, Blocks.rubyOre};

		public ButterPickaxe(int par1)
			{
				super(par1, 4.0F, EnumToolMaterial.IRON, blocksEffectiveAgainst);
				this.setCreativeTab(CreativeTabs.tabTools);
				this.setUnlocalizedName("pickaxebutter");
				this.setMaxDamage(300);
				this.setTextureName("awmb:butterpickaxe");
				MinecraftForge.setToolClass(this, "pickaxe", 2);
			}

		/**
		 * Returns if the item (tool) can harvest results from the block type.
		 */
		@Override
		public boolean canHarvestBlock(Block par1Block)
			{
				return par1Block == Block.obsidian
						? this.toolMaterial.getHarvestLevel() == 3
						: (par1Block != Block.blockDiamond
								&& par1Block != Block.oreDiamond
								? (par1Block != Block.oreEmerald
										&& par1Block != Block.blockEmerald
										? (par1Block != Block.blockGold
												&& par1Block != Block.oreGold
												? (par1Block != Block.blockIron
														&& par1Block != Block.oreIron
														? (par1Block != Block.blockLapis
																&& par1Block != Block.oreLapis
																? (par1Block != Block.oreRedstone
																		&& par1Block != Block.oreRedstoneGlowing
																		? (par1Block.blockMaterial == Material.rock
																				? true
																				: (par1Block.blockMaterial == Material.iron
																						? true
																						: par1Block.blockMaterial == Material.anvil))
																		: this.toolMaterial
																				.getHarvestLevel() >= 2)
																: this.toolMaterial
																		.getHarvestLevel() >= 1)
														: this.toolMaterial
																.getHarvestLevel() >= 1)
												: this.toolMaterial
														.getHarvestLevel() >= 2)
										: this.toolMaterial.getHarvestLevel() >= 2)
								: this.toolMaterial.getHarvestLevel() >= 2);

			}

		@Override
		public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
			{
				return par2Block != null
						&& (par2Block.blockMaterial == Material.iron
								|| par2Block.blockMaterial == Material.anvil || par2Block.blockMaterial == Material.rock)
						? this.efficiencyOnProperMaterial
						: super.getStrVsBlock(par1ItemStack, par2Block);
			}
	}
