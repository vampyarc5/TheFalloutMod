package blfngl.fallout.handler;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import blfngl.fallout.Fallout;
import blfngl.fallout.food.WorldGenBrocFlower;
import blfngl.fallout.world.WorldGenFallout;
import blfngl.fallout.world.WorldGenCarbonDeposit;
import blfngl.fallout.world.WorldGenSatOre;
import blfngl.fallout.world.WorldGenSiliconDeposit;
import blfngl.fallout.world.WorldGenTechOre;
import blfngl.fallout.world.WorldGenTungstenOre;
import blfngl.fallout.world.WorldGenUraniumOre;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldHandler extends Fallout
{
	public static void init()
	{
		GameRegistry.addBiome(Fallout.Wasteland);
		//GameRegistry.registerWorldGenerator(new WorldGenTungstenOre());
		//GameRegistry.registerWorldGenerator(new WorldGenTechOre());
		//GameRegistry.registerWorldGenerator(new WorldGenSatOre());
		//GameRegistry.registerWorldGenerator(new WorldGenUraniumOre());
		//GameRegistry.registerWorldGenerator(new WorldGenBrocFlower());
		//GameRegistry.registerWorldGenerator(new WorldGenSiliconDeposit());
		GameRegistry.registerWorldGenerator(new WorldGenFallout());
		//GameRegistry.registerWorldGenerator(new WorldGenCarbonDeposit());

		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(itemPortalActivator), 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(itemPortalActivator), 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(itemPortalActivator), 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(itemPortalActivator), 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(itemPortalActivator), 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(itemPortalActivator), 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(itemPortalActivator), 1, 1, 1));

		System.out.println("Fallout: World generation loaded. Welcome to the wasteland.");
	}
}
