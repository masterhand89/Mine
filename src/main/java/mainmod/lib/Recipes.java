package mainmod.lib;

import mainmod.blocks.Blocks;
import mainmod.items.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
	{
		public static void init()
			{

				// Block
				// This recipe turns the 9 rubies into 1 block. Notice that
				// there are
				// three R's in three spaces; a 3x3 grid, just like a Crafting
				// Table.
				// You MUST use EACH of the slots, even if just for a space. If
				// you
				// leave one out, the game will crash. As long as it's three
				// characters
				// long, you're fine. If there's a space that doesn't use an
				// item (such
				// as a blank slot), then just use a space, but do not go above
				// or below
				// the three slots per each parameter. The next thing after that
				// is
				// where you define what the character (in this case, the 'R')
				// is meant
				// as a placeholder for, which in this case is ruby. If we
				// wanted to use
				// a different letter for a different item, we could. As long as
				// you fit
				// the three spaces, and define what item or block each of the
				// letters
				// are for, you're good. Note that the 'R' must be a char data
				// type,
				// which means you have to use single quotes (') and not double
				// (").
				GameRegistry.addRecipe(new ItemStack(Blocks.rubyBlock, 1),
						new Object[]{"RRR", "RRR", "RRR", 'R', Items.ruby});

				GameRegistry.addRecipe(new ItemStack(Items.butterPickaxe),
						new Object[]{"BBB", " S ", " S ", 'B',
								Items.damnHardButter, 'S', Item.stick});

				GameRegistry.addRecipe(new ItemStack(Items.butterAxe, 1),
						new Object[]{"BB ", "BS ", " S ", 'B',
								Items.damnHardButter, 'S', Item.stick});

				GameRegistry.addRecipe(new ItemStack(Items.butterAxe, 1),
						new Object[]{" BB", " SB", " S ", 'B',
								Items.damnHardButter, 'S', Item.stick});

				GameRegistry.addRecipe(new ItemStack(Items.butterHoe, 1),
						new Object[]{" BB", " S ", " S ", 'B',
								Items.damnHardButter, 'S', Item.stick});
				GameRegistry.addRecipe(new ItemStack(Items.butterHoe, 1),
						new Object[]{"BB ", " S ", " S ", 'B',
								Items.damnHardButter, 'S', Item.stick});

				GameRegistry.addRecipe(new ItemStack(Items.butterShovel, 1),
						new Object[]{" B ", " S ", " S ", 'B',
								Items.damnHardButter, 'S', Item.stick});

				GameRegistry
						.addRecipe(new ItemStack(Items.butter, 1),
								new Object[]{"BBB", "BBB", "B", 'B',
										Items.butterNugget});

				// Gem
				// This is a shapeless recipe, so we don't need to use the grid.
				// We just
				// define what it's using and it does the rest. Shapeless
				// recipes are
				// typically used to craft things in the player's inventory,
				// without a
				// crafting table interface.
				GameRegistry.addShapelessRecipe(new ItemStack(Items.ruby, 9),
						new Object[]{Blocks.rubyBlock});

				GameRegistry.addShapelessRecipe(new ItemStack(
						Items.butteredPotato, 1), new Object[]{
						Item.bakedPotato, Items.butter});

				GameRegistry.addShapelessRecipe(new ItemStack(
						Items.butterNugget, 9), new Object[]{Items.butter});

				// Smelting Recipes
				int rubyOre = Blocks.rubyOre.blockID;
				ItemStack rubyItem = new ItemStack(Items.ruby, 1);
				float xpGiven1 = 5F;
				GameRegistry.addSmelting(rubyOre, rubyItem, xpGiven1);

				int milk = Item.bucketMilk.itemID;
				ItemStack butterItem = new ItemStack(Items.butter, 1);
				float xpGiven2 = 1F;
				GameRegistry.addSmelting(milk, butterItem, xpGiven2);

				// Pulvrizing Recipes
			}
	}
