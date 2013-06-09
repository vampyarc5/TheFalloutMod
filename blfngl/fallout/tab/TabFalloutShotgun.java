package blfngl.fallout.tab;

import net.minecraft.creativetab.CreativeTabs;
import blfngl.fallout.Fallout;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class TabFalloutShotgun extends CreativeTabs
{
	public TabFalloutShotgun(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return Fallout.shotgunHunting.itemID;
	}

	public String getTranslatedTabLabel()
	{
		return "Fallout - Shotguns";
	}
}