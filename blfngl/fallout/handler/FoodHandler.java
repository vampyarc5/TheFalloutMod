package blfngl.fallout.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import blfngl.fallout.Fallout;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FoodHandler extends Fallout
{
	public static void init()
	{
		LanguageRegistry.addName(Psycho, "Psycho");
		GameRegistry.addShapelessRecipe(new ItemStack(Psycho, 2), new Object [] {Item.slimeBall, Item.slimeBall, Item.slimeBall, Item.slimeBall, Item.lightStoneDust, syringeEmpty, Item.redstone, Item.lightStoneDust});
		LanguageRegistry.addName(MedEx, "Med-X");
		GameRegistry.addShapelessRecipe(new ItemStack(MedEx, 2), new Object [] {Stimpak, syringeEmpty, bBananaYucca, bBananaYucca});
		LanguageRegistry.addName(Slasher, "Slasher");
		GameRegistry.addShapelessRecipe(new ItemStack(Slasher), new Object [] {Psycho, MedEx});
		LanguageRegistry.addName(Stimpak, "Stimpak");
		GameRegistry.addShapelessRecipe(new ItemStack(Stimpak), new Object [] {bBrocFlower, bXanderRoot, syringeEmpty});
		LanguageRegistry.addName(SuperStimpak, "Super Stimpak");
		GameRegistry.addShapelessRecipe(new ItemStack(SuperStimpak), new Object [] {Stimpak, leatherBelt, NukaCola});
		LanguageRegistry.addName(BCMAC, "Blam Co. Mac and Cheese");
		GameRegistry.addRecipe(new ItemStack(BCMAC, 3), new Object [] {"#X#", "***", "#X#", 'X', Item.bucketMilk, '*', Item.wheat, '#', cardboard});
		LanguageRegistry.addName(Cram, "Cram");
		GameRegistry.addRecipe(new ItemStack(Cram, 12), new Object [] {" # ", " * ", " X ", 'X', tinCan, '#', Item.beefCooked, '*', Item.porkCooked});
		LanguageRegistry.addName(Instamash, "Instamash");
		GameRegistry.addRecipe(new ItemStack(Instamash, 5), new Object [] {"X*X", "***", "X*X", 'X', cardboard, '*', Item.potato});
		LanguageRegistry.addName(PorkBeans, "Pork 'n' Beans");
		GameRegistry.addRecipe(new ItemStack(PorkBeans, 9), new Object [] {" # ", " * ", " X ", 'X', tinCan, '#', Item.porkCooked, '*', new ItemStack(Item.dyePowder, 1, 3)});
		LanguageRegistry.addName(Salisbury, "Salisbury Steak");
		GameRegistry.addRecipe(new ItemStack(Salisbury, 12), new Object [] {"X*X", "#*#", "X*X", 'X', cardboard, '#', Item.potato, '*', Item.beefCooked});
		LanguageRegistry.addName(YumYum, "Yum Yum Deviled Eggs");
		GameRegistry.addRecipe(new ItemStack(YumYum, 3), new Object [] {"X*X", "*#*", "X*X", 'X', cardboard, '*', Item.egg, '#', Item.bucketMilk});
		LanguageRegistry.addName(Hydra, "Hydra");
		GameRegistry.addShapelessRecipe(new ItemStack(Hydra), new Object [] {nightstalkerBlood, nightstalkerBlood, bCaveFungus, Item.spiderEye, Item.glassBottle});
		LanguageRegistry.addName(NukaCola, "Nuka Cola");
		//GameRegistry.addShapelessRecipe(new ItemStack(NukaCola), new Object [] {"X*%", " & ", 'X', Item.sugar, '*', Item.bucketWater, '&', nukaBottle, '%', ingotUranium});
		LanguageRegistry.addName(HealingPowder, "Healing Powder");
		GameRegistry.addShapelessRecipe(new ItemStack(HealingPowder), new Object[] {bXanderRoot, bBrocFlower});
		LanguageRegistry.addName(bBarrelCactus, "Barrel Cactus Fruit");
		LanguageRegistry.addName(bBrocFlower, "Broc Flower");
		LanguageRegistry.addName(bXanderRoot, "Xander Root");
		LanguageRegistry.addName(AntMeat, "Ant Meat");
		LanguageRegistry.addName(AntEgg, "Ant Egg");
		LanguageRegistry.addName(BloodSausage, "Blood Sausage");
		LanguageRegistry.addName(BlackBloodSausage, "Black Blood Sausage");
		LanguageRegistry.addName(BrahminMeat, "Brahmin Meat");
		LanguageRegistry.addName(BrahminSteak, "Brahmin Steak");
		GameRegistry.addSmelting(BrahminMeat.itemID, new ItemStack(BrahminSteak), 5);
		LanguageRegistry.addName(BighornerMeat, "Bighorner Meat");
		LanguageRegistry.addName(BighornerSteak, "Bighorner Steak");
		GameRegistry.addSmelting(BighornerMeat.itemID, new ItemStack(BighornerSteak), 5);
		LanguageRegistry.addName(BrahminWellington, "Brahmin Wellington");
		GameRegistry.addShapelessRecipe(new ItemStack(BrahminWellington), new Object [] {BrahminSteak, AntEgg, BCMAC});
		LanguageRegistry.addName(FireAntFricasse, "Fire Ant Fricasse");
		GameRegistry.addShapelessRecipe(new ItemStack(FireAntFricasse), new Object [] {Cram, AntMeat, Item.wheat});
		LanguageRegistry.addName(CaravanLunch, "Caravan Lunch");
		GameRegistry.addShapelessRecipe(new ItemStack(CaravanLunch), new Object [] {Cram, Instamash, PorkBeans, cardboard});
		LanguageRegistry.addName(DandyApples, "Dandy Boy Apples");
		GameRegistry.addRecipe(new ItemStack(DandyApples, 3), new Object [] {"X*X", "*#*", "X*X", 'X', cardboard, '*', Item.appleRed, '#', Item.sugar});
		LanguageRegistry.addName(NightstalkerTail, "Nightstalker Tail");
		LanguageRegistry.addName(TrailMix, "Trail Mix");
		GameRegistry.addShapelessRecipe(new ItemStack(TrailMix), new Object [] {SugarBombs, Item.appleRed, Item.blazePowder, Item.seeds});
		LanguageRegistry.addName(SugarBombs, "Sugar Bombs");
		GameRegistry.addRecipe(new ItemStack(SugarBombs, 3), new Object [] {"X*X", "*#*", "X*X", 'X', cardboard, '*', Item.sugar, '#', Item.wheat});
		LanguageRegistry.addName(PotatoChips, "Potato Crisps");
		GameRegistry.addRecipe(new ItemStack(PotatoChips, 3), new Object [] {"X*X", "*#*", "X*X", 'X', cardboard, '*', Item.potato, '#', Item.poisonousPotato});
		LanguageRegistry.addName(SunsetSass, "Sunset Sasparilla");
		GameRegistry.addShapelessRecipe(new ItemStack(SunsetSass), new Object [] {bottleCap, XanderRoot, XanderRoot, Item.glassBottle, Item.appleRed});
		LanguageRegistry.addName(bBananaYucca, "Banna Yucca Fruit");
		LanguageRegistry.addName(bCaveFungus, "Cave Fungus");
		LanguageRegistry.addName(bBuffaloGourd, "Buffalo Gourd Seed");
		LanguageRegistry.addName(bJalapeno, "Jalapeno");
		LanguageRegistry.addName(Jet, "Jet");
		GameRegistry.addShapelessRecipe(new ItemStack(Jet), new Object [] {jetInhaler, abraxo, abraxo, Item.sugar});
		LanguageRegistry.addName(Rocket, "Rocket");
		GameRegistry.addShapelessRecipe(new ItemStack(Rocket), new Object [] {Jet, abraxo, NukaCola});
		LanguageRegistry.addName(NukaCold, "Ice Cold Nuka Cola");
		GameRegistry.addShapelessRecipe(new ItemStack(NukaCold), new Object [] {NukaCola, Block.ice});
		LanguageRegistry.addName(NukaQuartz, "Nuka Cola Quartz");
		GameRegistry.addShapelessRecipe(new ItemStack(NukaQuartz), new Object [] {NukaCola, NukaCola, NukaCola, new ItemStack(Item.dyePowder, 1, 12)});
		LanguageRegistry.addName(NukaVictory, "Nuka Cola Victory");
		GameRegistry.addShapelessRecipe(new ItemStack(NukaVictory), new Object [] {NukaCola, NukaCola, NukaCola, new ItemStack(Item.dyePowder, 1, 1)});
		LanguageRegistry.addName(WeaponBinding, "Weapon Binding Ritual");
		GameRegistry.addShapelessRecipe(new ItemStack(WeaponBinding), new Object [] {Cleaver, leatherBelt, HealingPowder, wonderglue});
		LanguageRegistry.addName(Vodka, "Vodka");
		GameRegistry.addShapelessRecipe(new ItemStack(Vodka), new Object [] {Block.mushroomBrown, Block.mushroomRed, Item.glassBottle, Item.sugar, Item.bucketWater, Item.wheat});
		LanguageRegistry.addName(StealthBoy, "Stealth Boy");
		//TODO GameRegistry.addRecipe(new ItemStack(StealthBoy), new Object [] {});
		LanguageRegistry.addName(Turbo, "Turbo");
		GameRegistry.addShapelessRecipe(new ItemStack(Turbo), new Object [] {Jet, BrocFlower, Item.spiderEye, turpentine});

		LanguageRegistry.addName(bubbleGum, "Bubble Gum");
		LanguageRegistry.addName(beer, "Beer");
		LanguageRegistry.addName(fiendStew, "Cook Cook's Fiend Stew");
		GameRegistry.addShapelessRecipe(new ItemStack(fiendStew), new Object [] {beer, beer, Item.potato, BrahminMeat, bJalapeno});

	}
}
