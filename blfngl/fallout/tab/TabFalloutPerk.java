package blfngl.fallout.tab;

import net.minecraft.creativetab.CreativeTabs;
import blfngl.fallout.Fallout;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class TabFalloutPerk extends CreativeTabs
{
	public TabFalloutPerk(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return Fallout.perkLaserCommander.itemID;
	}

	public String getTranslatedTabLabel()
	{
		return "Fallout - Perks and Skills";
	}
}