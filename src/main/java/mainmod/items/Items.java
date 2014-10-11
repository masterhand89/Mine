package mainmod.items;

import mainmod.lib.Ids;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items
	{

		public static final Item ruby = new ItemRuby(Ids.itemRubyID);
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

		public static void init()
			{
				addItem(ruby, "Ruby");
				addItem(butter, "Butter Ingot");
				addItem(butterPickaxe, "Butter Pickaxe");
				addItem(butterAxe, "Butter Axe");
				addItem(butterShovel, "Butter Shovel");
				addItem(butterHoe, "Butter Hoe");
				addItem(butteredPotato, "Buttered Potato");
				addItem(damnHardButter, "Damn Hard Butter");
				addItem(butterNugget, "Butter Nugget");
				addItem(damnHardButterNugget, "Damn Hard Butter Nugget");
			}
		public static void addItem(Item item, String name)
			{
				LanguageRegistry.addName(item, name);
			}
	}
