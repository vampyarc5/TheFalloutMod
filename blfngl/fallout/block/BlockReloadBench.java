package blfngl.fallout.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import blfngl.fallout.Fallout;

public class BlockReloadBench extends Block
{
	public BlockReloadBench(int par1, Material par2Material)
	{
		super(par1, par2Material);
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c)
	{
		player.openGui(Fallout.instance, 1, world, x, y, z);
		return true;
	}
}
