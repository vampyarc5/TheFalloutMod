package blfngl.fallout.handler;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import blfngl.fallout.Fallout;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHandler extends Fallout
{
	public static void init()
	{
		LanguageRegistry.addName(TungstenOre, "Tungsten Ore");
		MinecraftForge.setBlockHarvestLevel(TungstenOre, "pickaxe", 2);
		GameRegistry.registerBlock(TungstenOre);
		LanguageRegistry.addName(TechnetiumOre, "Technetium Ore");
		MinecraftForge.setBlockHarvestLevel(TechnetiumOre, "pickaxe", 3);
		GameRegistry.registerBlock(TechnetiumOre);
		LanguageRegistry.addName(SaturniteOre, "Saturnite Ore");
		MinecraftForge.setBlockHarvestLevel(SaturniteOre, "pickaxe", 3);
		GameRegistry.registerBlock(SaturniteOre);
		LanguageRegistry.addName(BrocFlower, "Broc Flower");
		GameRegistry.registerBlock(BrocFlower);
		LanguageRegistry.addName(XanderRoot, "Xander Root");
		GameRegistry.registerBlock(XanderRoot);
		LanguageRegistry.addName(BPGlass, "Bulletproof Glass");
		MinecraftForge.setBlockHarvestLevel(BPGlass, "pickaxe", 3);
		GameRegistry.registerBlock(BPGlass);
		GameRegistry.addRecipe(new ItemStack(BPGlass), new Object [] {"***", "*X*", "***", 'X', Block.glass, '*', tungstenPlate});
		LanguageRegistry.addName(UraniumOre, "Uranium Ore");
		MinecraftForge.setBlockHarvestLevel(UraniumOre, "pickaxe", 2);
		GameRegistry.registerBlock(UraniumOre);
		LanguageRegistry.addName(SiliconDeposit, "Silicon Deposit");
		MinecraftForge.setBlockHarvestLevel(TungstenOre, "pickaxe", 2);
		GameRegistry.registerBlock(SiliconDeposit);
		LanguageRegistry.addName(CarbonDeposit, "Carbon Deposit");
		MinecraftForge.setBlockHarvestLevel(CarbonDeposit, "pickaxe", 1);
		GameRegistry.registerBlock(CarbonDeposit);
		LanguageRegistry.addName(AsbestosDeposit, "Asbestos Deposit");
		MinecraftForge.setBlockHarvestLevel(AsbestosDeposit, "pickaxe", 2);
		GameRegistry.registerBlock(AsbestosDeposit);
		LanguageRegistry.addName(BarrelCactus, "Barrel Cactus");
		GameRegistry.registerBlock(BarrelCactus);
		LanguageRegistry.addName(BananaYucca, "Banna Yucca Plant");
		GameRegistry.registerBlock(BananaYucca);
		LanguageRegistry.addName(CaveFungus, "Cave Fungus");
		GameRegistry.registerBlock(CaveFungus);
		LanguageRegistry.addName(BuffaloGourd, "Buffalo Gourd Plant");
		GameRegistry.registerBlock(BuffaloGourd);
		LanguageRegistry.addName(Jalapeno, "Jalapeno Plant");
		GameRegistry.registerBlock(Jalapeno);
	}
}
