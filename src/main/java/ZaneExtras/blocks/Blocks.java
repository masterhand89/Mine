package ZaneExtras.blocks;

import net.minecraft.block.Block;
import ZaneExtras.blocks.ores.DamnHardButterNetherOre;
import ZaneExtras.blocks.ores.DamnHardButterOre;
import ZaneExtras.lib.Ids;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks
	{
		public static final Block damnHardButterOre = new DamnHardButterOre(
				Ids.blockDamnHardButterOreID);
		public static final Block damnHardButterNetherOre = new DamnHardButterNetherOre(
				Ids.blockDamnHardButterNetherOreID);
		public static final Block peanutPlant = new PeanutPlant(
				Ids.itemPeanutPlant);

		public static void init()
			{
				addBlock(damnHardButterOre, "Damn Hard Butter Ore");
				addBlock(damnHardButterNetherOre, "Damn Hard Nether Butter Ore");
				addBlock(peanutPlant, "PeanutPlant");
			}
		public static void addBlock(Block block, String name)
			{
				GameRegistry.registerBlock(block, name);
				LanguageRegistry.addName(block, name);
			}

	}
