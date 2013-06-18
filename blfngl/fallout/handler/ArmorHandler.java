package blfngl.fallout.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import blfngl.fallout.Fallout;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ArmorHandler extends Fallout
{
	public static void init ()
	{
		LanguageRegistry.addName(T45Helm, "T-45d Power Armor Helmet");
		GameRegistry.addRecipe(new ItemStack(T45Helm), new Object [] {"$XX", "X&X", " % ", 'X', RAP, '&', BPGlass, '%', upgradeT45, '$', Item.lightStoneDust});
		LanguageRegistry.addName(T45Chest, "T-45d Power Armor Chestplate");
		GameRegistry.addRecipe(new ItemStack(T45Chest, 1), new Object [] {" * ", "*X*", " * ", '*', upgradeT45, 'X', powerChest});
		LanguageRegistry.addName(T45Legs, "T-45d Power Armor Leggings");
		GameRegistry.addRecipe(new ItemStack(T45Legs), new Object [] {"X*X", "% %", "X X", 'X', tungstenPlate, '*', upgradeT45, '%', MASM});
		LanguageRegistry.addName(T45Boots, "T-45d Power Armor Boots");
		GameRegistry.addRecipe(new ItemStack(T45Boots), new Object [] {"X*X", "X X", 'X', tungstenPlate, '*', upgradeT45});
		LanguageRegistry.addName(T51Helm, "T-51b Power Armor Helmet");
		GameRegistry.addRecipe(new ItemStack(T51Helm, 1), new Object [] {" X ", "X*X", " X ", 'X', upgradeT51, '*', EnclaveHelm});
		LanguageRegistry.addName(T51Chest, "T-51b Power Armor Chestplate");
		GameRegistry.addRecipe(new ItemStack(T51Chest, 1), new Object [] {" X ", "X*X", " X ", 'X', upgradeT51, '*', EnclaveChest});
		LanguageRegistry.addName(T51Legs, "T-51b Power Armor Leggings");
		GameRegistry.addRecipe(new ItemStack(T51Legs, 1), new Object [] {" X ", "X*X", " X ", 'X', upgradeT51, '*', EnclaveLegs});
		LanguageRegistry.addName(T51Boots, "T-51b Power Armor Boots");
		GameRegistry.addRecipe(new ItemStack(T51Boots, 1), new Object [] {" X ", "X*X", " X ", 'X', upgradeT51, '*', EnclaveBoots});
		LanguageRegistry.addName(G1Helm, "Gecko Backed Leather Cap");
		GameRegistry.addRecipe(new ItemStack(G1Helm, 1), new Object [] {"XXX", "X*X", 'X', geckoHide, '*', Item.helmetLeather});
		LanguageRegistry.addName(G1Chest, "Gecko Backed Leather Tunic");
		GameRegistry.addRecipe(new ItemStack(G1Chest, 1), new Object [] {"X X", "X*X", "XXX", 'X', geckoHide, '*', Item.plateLeather});
		LanguageRegistry.addName(G1Legs, "Gecko Backed Leather Leggings");
		GameRegistry.addRecipe(new ItemStack(G1Legs, 1), new Object [] {"XXX", "X*X", "X X", 'X', geckoHide, '*', Item.legsLeather});
		LanguageRegistry.addName(G1Boots, "Gecko Backed Leather Boots");
		GameRegistry.addRecipe(new ItemStack(G1Boots, 1), new Object [] {"X*X", "X X", 'X', geckoHide, '*', Item.bootsLeather});
		LanguageRegistry.addName(EnclaveHelm, "Enclave Power Armor Helmet");
		GameRegistry.addRecipe(new ItemStack(EnclaveHelm), new Object [] {" X ", "X*X", " X ", 'X', upgradeEnclave, '*', T45Helm});
		LanguageRegistry.addName(EnclaveChest, "Enclave Power Armor Chestplate");
		GameRegistry.addRecipe(new ItemStack(EnclaveChest), new Object [] {" X ", "X*X", " X ", 'X', upgradeEnclave, '*', T45Chest});
		LanguageRegistry.addName(EnclaveLegs, "Enclave Power Armor Leggings");
		GameRegistry.addRecipe(new ItemStack(EnclaveLegs), new Object [] {" X ", "X*X", " X ", 'X', upgradeEnclave, '*', T45Legs});
		LanguageRegistry.addName(EnclaveBoots, "Enclave Power Armor Boots");
		GameRegistry.addRecipe(new ItemStack(EnclaveBoots), new Object [] {" X ", "X*X", " X ", 'X', upgradeEnclave, '*', T45Boots});
		LanguageRegistry.addName(HellHelm, "Hellfire Power Armor Helmet");
		GameRegistry.addRecipe(new ItemStack(HellHelm), new Object [] {" X ", "X*X", " X ", 'X', upgradeHellfire, '*', T51Helm});
		LanguageRegistry.addName(HellChest, "Hellfire Power Armor Chestplate");
		GameRegistry.addRecipe(new ItemStack(HellChest), new Object [] {" X ", "X*X", " X ", 'X', upgradeHellfire, '*', T51Chest});
		LanguageRegistry.addName(HellLegs, "Hellfire Power Armor Leggings");
		GameRegistry.addRecipe(new ItemStack(HellLegs), new Object [] {" X ", "X*X", " X ", 'X', upgradeHellfire, '*', T51Legs});
		LanguageRegistry.addName(HellBoots, "Hellfire Power Armor Boots");
		GameRegistry.addRecipe(new ItemStack(HellBoots), new Object [] {" X ", "X*X", " X ", 'X', upgradeHellfire, '*', T51Boots});
		LanguageRegistry.addName(WinterHelm, "Winterized T-51b Helmet");
		GameRegistry.addRecipe(new ItemStack(WinterHelm), new Object [] {"%X%", "X*X", "%X%", 'X', upgradeWinterized, '*', HellHelm, '%', Block.ice});
		LanguageRegistry.addName(WinterChest, "Winterized T-51b Chestplate");
		GameRegistry.addRecipe(new ItemStack(WinterChest), new Object [] {"%X%", "X*X", "%X%", 'X', upgradeWinterized, '*', HellChest, '%', Block.ice});
		LanguageRegistry.addName(WinterLegs, "Winterized T-51b Leggings");
		GameRegistry.addRecipe(new ItemStack(WinterLegs), new Object [] {"%X%", "X*X", "%X%", 'X', upgradeWinterized, '*', HellLegs, '%', Block.ice});
		LanguageRegistry.addName(WinterBoots, "Winterized T-51b Boots");
		GameRegistry.addRecipe(new ItemStack(WinterBoots), new Object [] {"%X%", "X*X", "%X%", 'X', upgradeWinterized, '*', HellBoots, '%', Block.ice});

		System.out.println("Fallout: Armor system loaded. Kapwing.");
	}
}
