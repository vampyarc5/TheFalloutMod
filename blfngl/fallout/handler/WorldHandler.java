package blfngl.fallout.handler;

import blfngl.fallout.Fallout;
import blfngl.fallout.food.WorldGenBrocFlower;
import blfngl.fallout.world.WorldGenAsbestosDeposit;
import blfngl.fallout.world.WorldGenCarbonDeposit;
import blfngl.fallout.world.WorldGenSatOre;
import blfngl.fallout.world.WorldGenSiliconDeposit;
import blfngl.fallout.world.WorldGenTechOre;
import blfngl.fallout.world.WorldGenTungstenOre;
import blfngl.fallout.world.WorldGenUraniumOre;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldHandler
{
	public static void init()
	{
		//GameRegistry.addBiome(Fallout.Wasteland);
		GameRegistry.registerWorldGenerator(new WorldGenTungstenOre());
		GameRegistry.registerWorldGenerator(new WorldGenTechOre());
		GameRegistry.registerWorldGenerator(new WorldGenSatOre());
		GameRegistry.registerWorldGenerator(new WorldGenUraniumOre());
		GameRegistry.registerWorldGenerator(new WorldGenBrocFlower());
		GameRegistry.registerWorldGenerator(new WorldGenSiliconDeposit());
		GameRegistry.registerWorldGenerator(new WorldGenAsbestosDeposit());
		GameRegistry.registerWorldGenerator(new WorldGenCarbonDeposit());
	}
}
