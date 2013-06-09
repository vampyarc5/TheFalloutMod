package blfngl.fallout.world;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeWasteland extends BiomeGenBase
{
	public BiomeWasteland(int id)
	{
		super(id);
		topBlock = (byte) Block.dirt.blockID;
		fillerBlock = (byte) Block.sand.blockID;
		//tobBlock = (byte) Block.sand.blockID;
	}
}