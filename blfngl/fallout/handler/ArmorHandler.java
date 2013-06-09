package blfngl.fallout.handler;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import blfngl.fallout.Fallout;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ArmorHandler
{
	public static void init ()
	{
		LanguageRegistry.addName(Fallout.T45Helm, "T-45d Power Helmet");
		GameRegistry.addRecipe(new ItemStack(Fallout.T45Helm), new Object [] {"$*X", "X&X", " % ", 'X', Fallout.tungstenPlate, '*', Fallout.technetiumPlate, '&', Fallout.BPGlass, '%', Fallout.upgradeT45, '$', Item.lightStoneDust});
		LanguageRegistry.addName(Fallout.T45Chest, "T-45d Power Chestplate");
		GameRegistry.addRecipe(new ItemStack(Fallout.T45Chest, 1), new Object [] {" * ", "*X*", " * ", '*', Fallout.upgradeT45, 'X', Fallout.powerChest});
		LanguageRegistry.addName(Fallout.T45Legs, "T-45d Power Leggings");
		GameRegistry.addRecipe(new ItemStack(Fallout.T45Legs), new Object [] {"X*X", "% %", "X X", 'X', Fallout.tungstenPlate, '*', Fallout.upgradeT45, '%', Fallout.MASM});
		LanguageRegistry.addName(Fallout.T45Boots, "T-45d Power Boots");
		GameRegistry.addRecipe(new ItemStack(Fallout.T45Boots), new Object [] {"X*X", "X X", 'X', Fallout.tungstenPlate, '*', Fallout.upgradeT45});
		LanguageRegistry.addName(Fallout.T51Helm, "T-51b Power Helmet");
		GameRegistry.addRecipe(new ItemStack(Fallout.T51Helm, 1), new Object [] {" X ", "X*X", " X ", 'X', Fallout.upgradeT51, '*', Fallout.T45Helm});
		LanguageRegistry.addName(Fallout.T51Chest, "T-51b Power Chestplate");
		GameRegistry.addRecipe(new ItemStack(Fallout.T51Chest, 1), new Object [] {" X ", "X*X", " X ", 'X', Fallout.upgradeT51, '*', Fallout.T45Chest});
		LanguageRegistry.addName(Fallout.T51Legs, "T-51b Power Leggings");
		GameRegistry.addRecipe(new ItemStack(Fallout.T51Legs, 1), new Object [] {" X ", "X*X", " X ", 'X', Fallout.upgradeT51, '*', Fallout.T45Legs});
		LanguageRegistry.addName(Fallout.T51Boots, "T-51b Power Boots");
		GameRegistry.addRecipe(new ItemStack(Fallout.T51Boots, 1), new Object [] {" X ", "X*X", " X ", 'X', Fallout.upgradeT51, '*', Fallout.T45Boots});
		LanguageRegistry.addName(Fallout.G1Helm, "Gecko Backed Leather Cap");
		GameRegistry.addRecipe(new ItemStack(Fallout.G1Helm, 1), new Object [] {"XXX", "X*X", 'X', Fallout.geckoHide, '*', Item.helmetLeather});
		LanguageRegistry.addName(Fallout.G1Chest, "Gecko Backed Leather Tunic");
		GameRegistry.addRecipe(new ItemStack(Fallout.G1Chest, 1), new Object [] {"X X", "X*X", "XXX", 'X', Fallout.geckoHide, '*', Item.plateLeather});
		LanguageRegistry.addName(Fallout.G1Legs, "Gecko Backed Leather Leggings");
		GameRegistry.addRecipe(new ItemStack(Fallout.G1Legs, 1), new Object [] {"XXX", "X*X", "X X", 'X', Fallout.geckoHide, '*', Item.legsLeather});
		LanguageRegistry.addName(Fallout.G1Boots, "Gecko Backed Leather Boots");
		GameRegistry.addRecipe(new ItemStack(Fallout.G1Boots, 1), new Object [] {"X*X", "X X", 'X', Fallout.geckoHide, '*', Item.bootsLeather});
		LanguageRegistry.addName(Fallout.EnclaveHelm, "Enclave Powered Helmet");
		//GameRegistry.addRecipe(new ItemStack(FalloutMain.EnclaveHelm), new Object [] {});
		LanguageRegistry.addName(Fallout.EnclaveChest, "Enclave Powered Chestplate");
		//GameRegistry.addRecipe(new ItemStack(FalloutMain.EnclaveChest), new Object [] {});
		LanguageRegistry.addName(Fallout.EnclaveLegs, "Enclave Powered Leggings");
		//GameRegistry.addRecipe(new ItemStack(FalloutMain.EnclaveLegs), new Object [] {});
		LanguageRegistry.addName(Fallout.EnclaveBoots, "Enclave Powered Boots");
		//GameRegistry.addRecipe(new ItemStack(FalloutMain.EnclaveBoots), new Object [] {});
		LanguageRegistry.addName(Fallout.HellHelm, "Advanced Power Armor Helmet");
		//GameRegistry.addRecipe(new ItemStack(FalloutMain.HellHelm), new Object [] {});
		LanguageRegistry.addName(Fallout.HellChest, "Advanced Power Armor Chestplate");
		//GameRegistry.addRecipe(new ItemStack(FalloutMain.HellChest), new Object [] {});
		LanguageRegistry.addName(Fallout.HellLegs, "Advanced Power Armor Leggings");
		//GameRegistry.addRecipe(new ItemStack(FalloutMain.HellLegs), new Object [] {});
		LanguageRegistry.addName(Fallout.HellBoots, "Advanced Power Armor Boots");
		//GameRegistry.addRecipe(new ItemStack(FalloutMain.HellBoots), new Object [] {});
		LanguageRegistry.addName(Fallout.WinterHelm, "Winterized T-51b Helmet");
		//GameRegistry.addRecipe(new ItemStack(FalloutMain.WinterHelm), new Object [] {});
		LanguageRegistry.addName(Fallout.WinterChest, "Winterized T-51b Chestplate");
		//GameRegistry.addRecipe(new ItemStack(FalloutMain.WinterChest), new Object [] {});
		LanguageRegistry.addName(Fallout.WinterLegs, "Winterized T-51b Leggings");
		//GameRegistry.addRecipe(new ItemStack(FalloutMain.WinterLegs), new Object [] {});
		LanguageRegistry.addName(Fallout.WinterBoots, "Winterized T-51b Boots");
		//GameRegistry.addRecipe(new ItemStack(FalloutMain.WinterBoots), new Object [] {});

	}
}
