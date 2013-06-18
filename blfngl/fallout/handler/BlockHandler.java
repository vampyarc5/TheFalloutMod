package blfngl.fallout.handler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import blfngl.fallout.Fallout;
import blfngl.fallout.block.BlockAlien;
import blfngl.fallout.block.BlockAsbestosDeposit;
import blfngl.fallout.block.BlockBPGlass;
import blfngl.fallout.block.BlockBananaYucca;
import blfngl.fallout.block.BlockBarrelCactus;
import blfngl.fallout.block.BlockBrocFlower;
import blfngl.fallout.block.BlockBuffaloGourd;
import blfngl.fallout.block.BlockCarbonDeposit;
import blfngl.fallout.block.BlockCaveFungus;
import blfngl.fallout.block.BlockIrrWater;
import blfngl.fallout.block.BlockJalapeno;
import blfngl.fallout.block.BlockSaturniteOre;
import blfngl.fallout.block.BlockSiliconDeposit;
import blfngl.fallout.block.BlockTechnetiumOre;
import blfngl.fallout.block.BlockTungstenOre;
import blfngl.fallout.block.BlockUraniumOre;
import blfngl.fallout.block.BlockXanderRoot;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHandler extends Fallout
{
	public static void init()
	{
		TungstenOre = (new BlockTungstenOre(oreTungstenID, 0, Material.rock));
		TechnetiumOre = (new BlockTechnetiumOre(oreTechnetiumID, 1, Material.rock));
		SaturniteOre = (new BlockSaturniteOre(oreSaturniteID, 2, Material.rock));
		BrocFlower = (BlockFlower) new BlockBrocFlower(plantBrocFlowerID, 3).setUnlocalizedName("BrocFlower");
		BPGlass = (new BlockBPGlass(blockBulletproofGlassID, 4, Material.rock));
		XanderRoot = (BlockFlower) new BlockXanderRoot(plantXanderRootID ,5).setUnlocalizedName("XanderRoot");
		UraniumOre = (new BlockUraniumOre(oreUraniumID,7, Material.rock));
		SiliconDeposit = (new BlockSiliconDeposit(oreSiliconID, 6, Material.rock));
		CarbonDeposit = (new BlockCarbonDeposit(oreCarbonID, 9, Material.rock));
		AsbestosDeposit = (new BlockAsbestosDeposit(oreAsbestosID, 10, Material.rock));
		BarrelCactus = (BlockFlower) new BlockBarrelCactus(plantBarrelCactusID, 11).setUnlocalizedName("BarrelCactus");
		BananaYucca = (BlockFlower) new BlockBananaYucca(plantBananaYuccaID, 15).setUnlocalizedName("BananaYucca");
		CaveFungus = (BlockFlower) new BlockCaveFungus(plantCaveFungusID, 29).setUnlocalizedName("CaveFungus");
		BuffaloGourd = (BlockFlower) new BlockBuffaloGourd(plantBuffaloGourdID, 13).setUnlocalizedName("BuffaloGourd");
		Jalapeno = (BlockFlower) new BlockJalapeno(plantJalapenoID, 14).setUnlocalizedName("Jalapeno");
		blockAlien = (BlockOre) new BlockAlien(blockAlienID, 15, Material.rock).setUnlocalizedName("AlienBlock");
		
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
		GameRegistry.addRecipe(new ItemStack(BPGlass, 8), new Object [] {"***", "*X*", "***", 'X', Block.glass, '*', tungstenPlate});
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
		//LanguageRegistry.addName(blockReload, "Reload Bench");
		//GameRegistry.registerBlock(blockReload);
		
		System.out.println("Fallout: Block system loaded. So blocky so nice.");
	}
}
