package blfngl.fallout.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import blfngl.fallout.Fallout;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class WeaponHandler extends Fallout
{
	public static void init()
	{
		LanguageRegistry.addName(Cleaver, "Cleaver");
		GameRegistry.addRecipe(new ItemStack(Cleaver), new Object [] {"XX", "XX", " *", 'X', Item.ingotIron, '*', Item.stick});
		LanguageRegistry.addName(ComKnife, "Combat Knife");
		GameRegistry.addRecipe(new ItemStack(ComKnife), new Object [] {"X", "*", 'X', ingotTungsten, '*', Item.stick});
		LanguageRegistry.addName(BotE, "Blade of the East");
		LanguageRegistry.addName(CosKnife, "Cosmic Knife");
		GameRegistry.addRecipe(new ItemStack(CosKnife), new Object [] {"X", "X", "&", 'X', ingotSaturnite, '&', Item.ingotIron});
		LanguageRegistry.addName(CosClean, "Cosmic Knife (Clean)");
		GameRegistry.addShapelessRecipe(new ItemStack(CosClean), new Object[] {CosKnife, abraxo});
		LanguageRegistry.addName(CosFire, "Cosmic Knife (Super Heated)");
		GameRegistry.addShapelessRecipe(new ItemStack(CosFire), new Object [] {CosClean, Item.bucketLava});
		LanguageRegistry.addName(PintSizedKnife, "Pint Sized Slasher's Knife");
		LanguageRegistry.addName(BumperSword, "Bumper Sword");
		GameRegistry.addRecipe(new ItemStack(BumperSword), new Object [] {" X ", "X*X", "X&X", 'X', tungstenPlate, '*', ItemSword.swordDiamond, '&', chunkTungsten});
		LanguageRegistry.addName(FireAxe, "Fire Axe");
		GameRegistry.addRecipe(new ItemStack(FireAxe), new Object [] {"*XX", "*^ ", " ^ ", 'X', ingotTungsten, '*', chunkTechnetium, '^', chunkTungsten});
		LanguageRegistry.addName(Knife, "Knife");
		GameRegistry.addRecipe(new ItemStack(Knife), new Object [] {"X*", 'X', ingotTungsten, '*', chunkTungsten});
		LanguageRegistry.addName(Machete, "Machete");
		GameRegistry.addRecipe(new ItemStack(Machete), new Object [] {"X", "X", "*", 'X', ingotTungsten, '*', chunkTungsten});
		LanguageRegistry.addName(Shishkebab, "Shishkebab");
		//GameRegistry.addRecipe(new ItemStack(Shishkebab), new Object [] {" X ", "X*X", "X&X", 'X', tungstenPlate, '*', ItemSword.swordDiamond, '&', chunkTungsten});
		LanguageRegistry.addName(StraightRazor, "Straight Razor");
		GameRegistry.addRecipe(new ItemStack(StraightRazor), new Object [] {"X  ", " X ", " * ", 'X', Item.ingotIron, '*', chunkSilicon});
		LanguageRegistry.addName(Switchblade, "Switchblade");
		GameRegistry.addRecipe(new ItemStack(Switchblade), new Object [] {"X*X", 'X', chunkSilicon, '*', Item.ingotIron});

		LanguageRegistry.addName(BallisticFist, "Ballistic Fist");
		GameRegistry.addRecipe(new ItemStack(BallisticFist), new Object [] {"*X*", "X%X", "###", 'X', Block.pistonBase, '*', Block.tnt, '#', tungstenPlate, '%', Item.redstoneRepeater});
		LanguageRegistry.addName(BladedGauntlet, "Bladed Gauntlet");
		GameRegistry.addRecipe(new ItemStack(BladedGauntlet), new Object [] {" * ", "*X*", '*', Knife, 'X', BoxingGloves});
		LanguageRegistry.addName(BoxingGloves, "Boxing Gloves");
		GameRegistry.addRecipe(new ItemStack(BoxingGloves), new Object [] {" * ", "*X*", " * ", 'X', BrassKnuckles, '*', Item.leather});
		LanguageRegistry.addName(BrassKnuckles, "Brass Knuckles");
		GameRegistry.addRecipe(new ItemStack(BrassKnuckles), new Object [] {"XXX", "* *", 'X', Item.ingotGold, '*', ingotTungsten});
		LanguageRegistry.addName(DisplacerGlove, "Displacer Glove");
		LanguageRegistry.addName(GoldenGloves, "Golden Gloves");
		GameRegistry.addRecipe(new ItemStack(GoldenGloves), new Object [] {"XXX", "X*X", "XXX", 'X', Item.goldNugget, '*', BoxingGloves});
		LanguageRegistry.addName(SatFist, "Saturnite Power Fist");
		GameRegistry.addRecipe(new ItemStack(SatFist), new Object [] {"XXX", "%*%", 'X', saturniteAlloy, '%', Block.pistonBase, '*', PowerFist});
		LanguageRegistry.addName(SatHeatFist, "Saturnite Fist (Super Heated)");
		GameRegistry.addRecipe(new ItemStack(SatHeatFist), new Object [] {"^^^", "X*X", "& &", 'X', Block.furnaceIdle, '&', ingotSaturnite, '*', SatFist, '^', saturniteAlloy});
		LanguageRegistry.addName(PowerFist, "Power Fist");
		GameRegistry.addRecipe(new ItemStack(PowerFist), new Object [] {"X*X", "&*&", "&*&", 'X', Block.pistonBase, '&', ingotTungsten, '*', Item.redstone});
		LanguageRegistry.addName(SciGlove, "Scientist's Glove");
		GameRegistry.addRecipe(new ItemStack(SciGlove), new Object [] {"X*X", "X X", "X X", 'X', polyethylene, '*', ingotTungsten});
		LanguageRegistry.addName(ZapGlove, "Zap Glove");
		GameRegistry.addRecipe(new ItemStack(ZapGlove), new Object [] {"XXX", "*&*", 'X', Block.blockRedstone, '*', tungstenPlate, '&', PowerFist});

		LanguageRegistry.addName(shiskebabFlaming, "Shishkebab (Flaming)");

	}
}
