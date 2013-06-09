package blfngl.fallout.tab;

import net.minecraft.creativetab.CreativeTabs;
import blfngl.fallout.Fallout;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class TabFalloutEnergy extends CreativeTabs
{
	public TabFalloutEnergy(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return Fallout.rifleHolo.itemID;
	}

	public String getTranslatedTabLabel()
	{
		return "Fallout - Energy Weapons";
	}
}