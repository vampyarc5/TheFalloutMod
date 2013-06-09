package blfngl.fallout.world;

import blfngl.fallout.Fallout;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeAlien extends BiomeGenBase
{
	public BiomeAlien(int id)
	{
		super(id);
		topBlock = (byte) Fallout.blockAlien.blockID;
		fillerBlock = (byte) Fallout.blockAlien.blockID;
	}
}