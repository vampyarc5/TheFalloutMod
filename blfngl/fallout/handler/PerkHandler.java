package blfngl.fallout.handler;

import blfngl.fallout.Fallout;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class PerkHandler extends Fallout
{
	public static boolean laserCommander;
	public static boolean friendOfNight;
	public static boolean bloodyMess;
	public static boolean toughness;
	public static boolean vigilantRecycle;
	public static boolean solarPowered;
	public static boolean slayer;

	public static void init()
	{
		LanguageRegistry.addName(perkLaserCommander, "Perk - Laser Commander");
		LanguageRegistry.addName(perkNightFriend, "Perk - Friend of the Night");
		LanguageRegistry.addName(perkBloodyMess, "Perk - Bloody Mess");
		LanguageRegistry.addName(perkToughness, "Perk - Toughness");
		LanguageRegistry.addName(perkSolarPowered, "Perk - Solar Powered");
		LanguageRegistry.addName(perkVigilantRecycle, "Perk - Vigilant Recycler");
	}

	public static void displayPerks()
	{
		//TODO display perk stats
	}
}
