package blfngl.fallout.world;

import java.util.Random;

import net.minecraft.block.BlockSand;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import blfngl.fallout.Fallout;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenAsbestosDeposit implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
		{
		case 0:
			generateSurface(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}

	public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{
		for (int i = 0; i < 16; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(48);
			int randPosZ = chunkZ + rand.nextInt(16);

			(new WorldGenMinable(Fallout.AsbestosDeposit.blockID, 10)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
	}
}