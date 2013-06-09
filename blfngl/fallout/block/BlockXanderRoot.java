package blfngl.fallout.block;

import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import blfngl.fallout.Fallout;

public class BlockXanderRoot extends BlockFlower
{

	public BlockXanderRoot(int id, int iconindex)
	{
		super(id);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	public int idDropped(int i, Random random, int j)
	{
		return Fallout.bXanderRoot.itemID;
	}

	public void func_94332_a(IconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon("blfngl" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

}