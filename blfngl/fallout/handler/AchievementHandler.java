package blfngl.fallout.handler;

import blfngl.fallout.Fallout;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class AchievementHandler extends Fallout
{
	private void addAchievementName(String ach, String name)
	{
		LanguageRegistry.instance().addStringLocalization("getTungsten" + ach, "en_US", name);
	}

	private void addAchievementDesc(String ach, String desc)
	{
		LanguageRegistry.instance().addStringLocalization("getTungsten" + ach + ".desc", "en_US", desc);
	}
}
