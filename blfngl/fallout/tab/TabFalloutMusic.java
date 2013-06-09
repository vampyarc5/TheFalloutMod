package blfngl.fallout.tab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import blfngl.fallout.Fallout;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class TabFalloutMusic extends CreativeTabs
{
	public TabFalloutMusic(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return Block.jukebox.blockID;
	}

	public String getTranslatedTabLabel()
	{
		return "Fallout - Music";
	}
}