package mainmod.blocks;

import mainmod.blocks.ores.BlockRubyOre;
import mainmod.lib.Ids;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks
	{
		public static final Block rubyBlock = new BlockRuby(Ids.blockRubyID);
		public static final Block rubyOre = new BlockRubyOre(Ids.blockRubyOreID);

		public static void init()
			{
				addBlock(rubyBlock, "Ruby Block");
				addBlock(rubyOre, "Ruby Ore");
			}
		public static void addBlock(Block block, String name)
			{
				GameRegistry.registerBlock(block, name);
				LanguageRegistry.addName(block, name);
			}

	}
