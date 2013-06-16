package blfngl.fallout.handler;

import net.minecraft.item.ItemStack;
import blfngl.fallout.Fallout;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class PerkHandler extends Fallout
{
	public static boolean laserCommander;
	public static boolean vigilantRecycle;
	public static boolean grunt;
	public static boolean cowboy;
	public static boolean bloodyMess;

	public static void init()
	{
		LanguageRegistry.addName(perkLaserCommander, "Perk - Laser Commander");
		LanguageRegistry.addName(perkNightFriend, "Perk - Friend of the Night");
		LanguageRegistry.addName(perkBloodyMess, "Perk - Bloody Mess");
		LanguageRegistry.addName(perkToughness, "Perk - Toughness");
		LanguageRegistry.addName(perkSolarPowered, "Perk - Solar Powered");
		LanguageRegistry.addName(perkVigilantRecycle, "Perk - Vigilant Recycler");
		GameRegistry.addShapelessRecipe(new ItemStack(cellMF), new Object [] {perkVigilantRecycle, cellMFD, cellMFD, cellMFD});
		GameRegistry.addShapelessRecipe(new ItemStack(cellEnergy), new Object [] {perkVigilantRecycle, cellED, cellED, cellED});
		GameRegistry.addShapelessRecipe(new ItemStack(cellElectron), new Object [] {perkVigilantRecycle, cellECPD, cellECPD, cellECPD});
		LanguageRegistry.addName(perkImplantM5, "Implant M-5");
		LanguageRegistry.addName(perkGrunt, "Perk - Grunt");
		LanguageRegistry.addName(perkNerdRage, "Perk - Nerd Rage!");
		LanguageRegistry.addName(perkCowboy, "Perk - Cowboy");
		LanguageRegistry.addName(perkWalkerInstinct, "Perk - Walker Instinct");
		LanguageRegistry.addName(perkRemover, "THIS WILL REMOVE YOUR PERKS");
	}

	public static void displayPerks()
	{
		//TODO display perk stats
	}
}
