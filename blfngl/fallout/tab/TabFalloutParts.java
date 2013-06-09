package blfngl.fallout.tab;

import net.minecraft.creativetab.CreativeTabs;
import blfngl.fallout.Fallout;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabFalloutParts extends CreativeTabs
{
	public TabFalloutParts(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return Fallout.mod357LongBarrel.itemID;
	}

	public String getTranslatedTabLabel()
	{
		return "Fallout - Weapon Mods";
	}
}
