package ZaneExtras.lib;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ZaneExtras.blocks.Blocks;
import ZaneExtras.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
	{
		public static void init()
			{

				// Butter Pickaxe
				GameRegistry.addRecipe(new ItemStack(Items.butterPickaxe),
						new Object[]{"BBB", " S ", " S ", 'B',
								Items.damnHardButter, 'S', Item.stick});

				// Butter Axe
				GameRegistry.addRecipe(new ItemStack(Items.butterAxe, 1),
						new Object[]{"BB ", "BS ", " S ", 'B',
								Items.damnHardButter, 'S', Item.stick});

				// Butter Axe
				GameRegistry.addRecipe(new ItemStack(Items.butterAxe, 1),
						new Object[]{" BB", " SB", " S ", 'B',
								Items.damnHardButter, 'S', Item.stick});

				// Butter Hoe
				GameRegistry.addRecipe(new ItemStack(Items.butterHoe, 1),
						new Object[]{" BB", " S ", " S ", 'B',
								Items.damnHardButter, 'S', Item.stick});

				// Butter Hoe
				GameRegistry.addRecipe(new ItemStack(Items.butterHoe, 1),
						new Object[]{"BB ", " S ", " S ", 'B',
								Items.damnHardButter, 'S', Item.stick});

				// Butter Shovel
				GameRegistry.addRecipe(new ItemStack(Items.butterShovel, 1),
						new Object[]{" B ", " S ", " S ", 'B',
								Items.damnHardButter, 'S', Item.stick});

				// Butter Nugget
				GameRegistry.addRecipe(new ItemStack(Items.butter, 1),
						new Object[]{"BBB", "BBB", "BBB", 'B',
								Items.butterNugget});

				// Damn Hard Butter Nugget
				GameRegistry.addRecipe(new ItemStack(Items.damnHardButter, 1),
						new Object[]{"BBB", "BBB", "BBB", 'B',
								Items.damnHardButterNugget});

				// Damn Hard Butter Sword
				GameRegistry.addRecipe(new ItemStack(Items.damnHardButterSword,
						1), new Object[]{" B ", " B ", " S ", 'B',
						Items.damnHardButter, 'S', Item.stick});

				// Bottle of Peanut Butter
				GameRegistry.addRecipe(new ItemStack(
						Items.bottleOfPeanutButter, 1), new Object[]{"BB ",
						"PP ", "G  ", 'B', Items.butter, 'P', Items.peanut,
						'G', Item.glassBottle});

				// Damn Hard butter Bow
				GameRegistry.addRecipe(
						new ItemStack(Items.damnHardButterBow, 1),
						new Object[]{" BS", "B S", " BS", 'B',
								Items.damnHardButter, 'S', Item.silk});

				// Buttered Potato
				GameRegistry.addShapelessRecipe(new ItemStack(
						Items.butteredPotato, 1), new Object[]{
						Item.bakedPotato, Items.butter});

				// Butter Nugget
				GameRegistry.addShapelessRecipe(new ItemStack(
						Items.butterNugget, 9), new Object[]{Items.butter});

				// Damn Hard Butter Nugget
				GameRegistry.addShapelessRecipe(new ItemStack(
						Items.damnHardButterNugget, 9),
						new Object[]{Items.damnHardButter});

				// Smelting Recipes

				// Butter
				int milk = Item.bucketMilk.itemID;
				ItemStack butterItem = new ItemStack(Items.butter, 4);
				float xpGiven2 = 1F;
				GameRegistry.addSmelting(milk, butterItem, xpGiven2);

				// Inducting Recipes

				// Damn Hard Butter
				ThermalExpansionHelper.addSmelterRecipe(5000, new ItemStack(
						Items.butter, 1), new ItemStack(Item.ingotIron, 1),
						new ItemStack(Items.damnHardButter, 1));

				// Pulverizing Recipes

				// Butter
				ThermalExpansionHelper.addPulverizerRecipe(5000, new ItemStack(
						Item.bucketMilk, 1), new ItemStack(Items.butter, 8));

				// Damn Hard Butter Dust
				ThermalExpansionHelper.addPulverizerRecipe(5000, new ItemStack(
						Blocks.damnHardButterNetherOre, 1), new ItemStack(
						Items.damnHardButterDust, 1));

				// Redstone Furnace Recipes

				// Damn Hard Butter
				ThermalExpansionHelper.addFurnaceRecipe(5000, new ItemStack(
						Items.damnHardButterDust, 1), new ItemStack(
						Items.damnHardButter, 1));
			}
	}
