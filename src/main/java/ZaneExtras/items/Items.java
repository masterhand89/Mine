package ZaneExtras.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import ZaneExtras.lib.Ids;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items
	{
		public static final Item butter = new ItemButter(Ids.itemButterID);
		public static final Item butterPickaxe = new ButterPickaxe(
				Ids.itemButterPickaxeID);
		public static final Item butterAxe = new ButterAxe(Ids.itemButterAxeID,
				EnumToolMaterial.IRON);
		public static final Item butterShovel = new ButterShovel(
				Ids.itemButterShovelID, EnumToolMaterial.IRON);
		public static final Item butterHoe = new ButterHoe(Ids.itemButterHoeID,
				EnumToolMaterial.IRON);
		public static final Item butteredPotato = new ButteredPotato(
				Ids.itemButteredPotato);
		public static final Item damnHardButter = new ItemDamnHardButter(
				Ids.itemDamnHardButterID);
		public static final Item butterNugget = new ButterNugget(
				Ids.itemButterNuggetID);
		public static final Item damnHardButterNugget = new DamnHardButterNugget(
				Ids.itemDamnHardButterNuggetID);
		public static final Item damnHardButterSword = new DamnHardButterSword(
				Ids.itemDamnHardButterSwordID, EnumToolMaterial.IRON);
		public static final Item damnHardButterBow = new DamnHardButterBow(
				Ids.itemDamnHardButterBowID);
		public static final Item peanut = new Peanut(Ids.itemPeanutID);
		public static final Item bottleOfPeanutButter = new BottleOfPeanutButter(
				Ids.itemBottleOfPeanutButterID);
		public static final Item damnHardButterDust = new DamnHardButterDust(
				Ids.itemDamnHardButterDustID);

		public static void init()
			{
				addItem(butter, "Butter Ingot");
				addItem(butterPickaxe, "Butter Pickaxe");
				addItem(butterAxe, "Butter Axe");
				addItem(butterShovel, "Butter Shovel");
				addItem(butterHoe, "Butter Hoe");
				addItem(butteredPotato, "Buttered Potato");
				addItem(damnHardButter, "Damn Hard Butter");
				addItem(butterNugget, "Butter Nugget");
				addItem(damnHardButterNugget, "Damn Hard Butter Nugget");
				addItem(damnHardButterSword, "Damn Hard Butter Sword");
				addItem(damnHardButterBow, "Damn Hard Butter Bow");
				addItem(peanut, "Peanut");
				addItem(bottleOfPeanutButter, "Bottle of Peanut Butter");
				addItem(damnHardButterDust, "Damn Hard Butter Dust");
			}
		public static void addItem(Item item, String name)
			{
				LanguageRegistry.addName(item, name);
			}
	}
