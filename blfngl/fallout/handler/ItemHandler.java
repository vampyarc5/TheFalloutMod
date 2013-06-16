package blfngl.fallout.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import blfngl.fallout.Fallout;
import blfngl.fallout.item.BaseItem;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHandler extends Fallout
{
	public static void init()
	{
		LanguageRegistry.addName(a22LR, ".22 Ammo");
		GameRegistry.addShapelessRecipe(new ItemStack(a22LR, 12), new Object [] {powderPistol, primerPistolS, case22LR});
		LanguageRegistry.addName(a357, ".357 Ammo");
		GameRegistry.addShapelessRecipe(new ItemStack(a357, 3), new Object [] {case357, primerPistolS, powderPistol, powderPistol, lead, lead, lead});
		LanguageRegistry.addName(a44, ".44 Ammo");
		GameRegistry.addShapelessRecipe(new ItemStack(a44, 3), new Object [] {case44, primerPistolL, powderPistol, powderPistol, lead, lead, lead, powderPistol});
		LanguageRegistry.addName(a308, ".308 Ammo");
		GameRegistry.addShapelessRecipe(new ItemStack(a308, 2), new Object [] {case308, primerRifleL, powderRifle, powderRifle, lead, lead, lead});
		LanguageRegistry.addName(homemadeFuel, "Flamer Fuel");
		GameRegistry.addShapelessRecipe(new ItemStack(homemadeFuel), new Object [] {abraxo, Item.sugar, Item.wheat});
		LanguageRegistry.addName(chunkTungsten, "Tungsten Rod");
		LanguageRegistry.addName(ingotTungsten, "Tungsten Ingot");
		GameRegistry.addRecipe(new ItemStack(ingotTungsten), new Object [] {"XXX", "XXX", 'X', chunkTungsten});
		LanguageRegistry.addName(chunkTechnetium, "Technetium Chunk");
		LanguageRegistry.addName(ingotTechnetium, "Technetium Ingot");
		GameRegistry.addRecipe(new ItemStack(ingotTechnetium), new Object [] {"###", "###", '#', chunkTechnetium});
		LanguageRegistry.addName(chunkSilicon, "Silicon Chunk");
		LanguageRegistry.addName(barSilicon, "Silicon Bar");
		GameRegistry.addRecipe(new ItemStack(barSilicon), new Object [] {"###", "###", '#', chunkSilicon});
		LanguageRegistry.addName(tungstenFilter, "Tungsten Filter");
		GameRegistry.addRecipe(new ItemStack(tungstenFilter), new Object [] {"###", "###", "###", '#', chunkTungsten});
		LanguageRegistry.addName(chunkAsbestos, "Asbestos Chunk");
		LanguageRegistry.addName(barAsbestos, "Asbestos Bar");
		GameRegistry.addSmelting(chunkAsbestos.itemID, new ItemStack(barAsbestos), 1.5F);
		GameRegistry.addRecipe(new ItemStack(barAsbestos), new Object [] {"XXX", "XXX", 'X', chunkAsbestos});
		LanguageRegistry.addName(ingotUranium, "Uranium Ingot");
		LanguageRegistry.addName(tungstenPlate, "Tungsten Plate");
		GameRegistry.addRecipe(new ItemStack(tungstenPlate), new Object [] {"XX", "XX", 'X', ingotTungsten});
		LanguageRegistry.addName(technetiumPlate, "Technetium Plate");
		GameRegistry.addRecipe(new ItemStack(technetiumPlate, 1), new Object [] {"XX", "XX", 'X', ingotTechnetium});
		LanguageRegistry.addName(RAP, "Reinforced Alloy Plate");
		GameRegistry.addRecipe(new ItemStack(RAP, 2), new Object [] {"X*", "*X", 'X', tungstenPlate, '*', technetiumPlate});
		LanguageRegistry.addName(cellMF, "Microfusion Cell");
		GameRegistry.addRecipe(new ItemStack(cellMF, 5), new Object [] {" * ", "*&*", " * ", '&', ingotUranium, '*', tungstenPlate});
		GameRegistry.addShapelessRecipe(new ItemStack(cellMF), new Object [] {cellMFD, cellMFD, cellMFD, cellMFD});
		LanguageRegistry.addName(MFPack, "MicroFusion Pack");
		GameRegistry.addRecipe(new ItemStack(MFPack),new Object [] {" X ", "&&&", " X ", 'X', RAP, '&', cellMF});
		LanguageRegistry.addName(carbon, "Carbon");
		LanguageRegistry.addName(teflon, "Teflon");
		GameRegistry.addRecipe(new ItemStack(teflon, 2), new Object [] {"**", "##", "**", '*', Item.silk, '#', carbon});
		LanguageRegistry.addName(polyethylene, "Polyethylene");
		GameRegistry.addRecipe(new ItemStack(polyethylene), new Object [] {"X*X", "*X*", 'X', carbon, '*', teflon});
		LanguageRegistry.addName(bottleCap, "Bottle Cap");
		LanguageRegistry.addName(fan, "Fan");
		GameRegistry.addRecipe(new ItemStack(fan), new Object [] {" * ", "*X*", " * ", '*', chunkTungsten, 'X', Item.ingotIron});
		LanguageRegistry.addName(gear, "Gear");
		GameRegistry.addRecipe(new ItemStack(gear, 2), new Object [] {"***", "*#*", "***", '*', chunkTungsten, '#', ingotTungsten});
		LanguageRegistry.addName(gyro, "Gyroscope");
		GameRegistry.addRecipe(new ItemStack(gyro), new Object [] {" X ", "X*X", " & ", 'X', Item.ingotGold, '*', barSilicon, '&', Item.stick});
		LanguageRegistry.addName(MASM, "Motion-Assist Servo Motor");
		GameRegistry.addRecipe(new ItemStack(MASM), new Object [] {" XX", "*&X", " XX", 'X', barSilicon, '*', Item.stick, '&', gear});
		LanguageRegistry.addName(TXMF, "TX-28 MicroFusion Pack");
		GameRegistry.addRecipe(new ItemStack(TXMF, 1), new Object [] {" X ", "&&&", " X ", 'X', RAP, '&', MFPack});
		LanguageRegistry.addName(card, "Caravan Card");
		ModLoader.addRecipe(new ItemStack(card, 1), new Object [] {"XXX", "X*X", "XXX", 'X', Item.paper, '*', Item.coal});
		LanguageRegistry.addName(deck, "Caravan Deck");
		GameRegistry.addRecipe(new ItemStack(deck, 1), new Object [] {"XXX", "XXX", "XXX", 'X', card});
		LanguageRegistry.addName(cardboard, "Cardboard");
		GameRegistry.addRecipe(new ItemStack(cardboard, 4), new Object [] {"XXX", "X X", "XXX", 'X', Item.paper});
		LanguageRegistry.addName(tinCan, "Tin Can");
		GameRegistry.addRecipe(new ItemStack(tinCan, 4), new Object [] {"X X", " X ", 'X', ingotTungsten});
		LanguageRegistry.addName(chunkSaturnite, "Saturnite Rod");
		LanguageRegistry.addName(ingotSaturnite, "Saturnite Ingot");
		GameRegistry.addRecipe(new ItemStack(ingotSaturnite), new Object [] {"XXX", "XXX", 'X', chunkSaturnite});
		LanguageRegistry.addName(saturniteAlloy, "Saturnite Alloy");
		GameRegistry.addRecipe(new ItemStack(saturniteAlloy), new Object [] {"XX", "XX", 'X', ingotSaturnite});
		LanguageRegistry.addName(syringeEmpty, "Empty Syringe");
		GameRegistry.addRecipe(new ItemStack(syringeEmpty), new Object [] {"  &", " * ", "X  ", '*', chunkSilicon, 'X', Item.ingotIron, '&', chunkTungsten});
		LanguageRegistry.addName(syringeBloody, "Blood Syringe");
		LanguageRegistry.addName(powerTorso, "Base Power Torso");
		GameRegistry.addRecipe(new ItemStack(powerTorso, 1), new Object [] {"X X", "*&*", " $ ", 'X', RAP, '&', fan, '*', RAP, '$', TXMF});
		LanguageRegistry.addName(powerShoulders, "Base Power Shoulders");
		GameRegistry.addRecipe(new ItemStack(powerShoulders, 1), new Object [] {"X X", "& &", 'X', RAP, '&', tungstenPlate});
		LanguageRegistry.addName(powerChest, "Base Power Chest");
		GameRegistry.addRecipe(new ItemStack(powerChest, 1),new Object [] {"X", "*", 'X', powerShoulders, '*', powerTorso});
		LanguageRegistry.addName(upgradeT45, "Type 45-d Power Armor Upgrade Plate");
		GameRegistry.addRecipe(new ItemStack(upgradeT45, 1), new Object [] {" X ", "&*&", " X ", 'X', tungstenPlate, '&', technetiumPlate, '*', RAP});
		LanguageRegistry.addName(upgradeEnclave, "Enclave Power Armor Upgrade Plate");
		GameRegistry.addRecipe(new ItemStack(upgradeEnclave, 1), new Object [] {" X ", "&*&", " X ", 'X', tungstenPlate, '&', technetiumPlate, '*', upgradeT45});
		LanguageRegistry.addName(upgradeT51, "Type 51-b Power Armor Upgrade Plate");
		GameRegistry.addRecipe(new ItemStack(upgradeT51, 1), new Object [] {" X ", "&*&", " X ", 'X', tungstenPlate, '&', technetiumPlate, '*', upgradeEnclave});
		LanguageRegistry.addName(upgradeHellfire, "Enclave Hellfire Power Armor Upgrade Plate");
		GameRegistry.addRecipe(new ItemStack(upgradeHellfire, 1), new Object [] {" X ", "&*&", " X ", 'X', tungstenPlate, '&', technetiumPlate, '*', upgradeT51});
		LanguageRegistry.addName(upgradeWinterized, "Winterized Type 51-b Power Armor Upgrade Plate");
		GameRegistry.addRecipe(new ItemStack(upgradeWinterized, 1), new Object [] {" X ", "&*&", " X ", 'X', tungstenPlate, '&', technetiumPlate, '*', upgradeHellfire});
		LanguageRegistry.addName(nukaBottle, "Nuka Cola Bottle");
		GameRegistry.addShapelessRecipe(new ItemStack(nukaBottle), new Object [] {bottleCap, Item.glassBottle});
		LanguageRegistry.addName(abraxo, "Abraxo Cleaner");
		GameRegistry.addRecipe(new ItemStack(abraxo), new Object [] {" X ", "***", " X ", 'X', cardboard, '*', Item.sugar});
		LanguageRegistry.addName(scrapMetal, "Scrap Metal");
		GameRegistry.addShapelessRecipe(new ItemStack(scrapMetal, 1), new Object[] {ingotTungsten, Item.ingotIron});
		LanguageRegistry.addName(lunchbox, "Lunchbox");
		GameRegistry.addRecipe(new ItemStack(lunchbox), new Object [] {" X ", "X X", "XXX", 'X', Item.ingotIron});
		LanguageRegistry.addName(sensorModule, "Sensor Module");
		GameRegistry.addRecipe(new ItemStack(sensorModule), new Object [] {" XX", "*&X", " XX", 'X', ingotTungsten, '*', Item.redstoneRepeater, '&', Item.redstone});
		LanguageRegistry.addName(cherrybomb, "Cherry Bomb");
		GameRegistry.addRecipe(new ItemStack(cherrybomb, 3), new Object [] {"X", 'X', Block.tnt});
		LanguageRegistry.addName(nightstalkerBlood, "Nightstalker Blood");
		LanguageRegistry.addName(jetInhaler, "Jet Inhaler");
		GameRegistry.addRecipe(new ItemStack(jetInhaler), new Object [] {"X  ", "X  ", "X& ", 'X', barSilicon, '&', Block.dispenser});
		LanguageRegistry.addName(wonderglue, "Wonderglue");
		GameRegistry.addRecipe(new ItemStack(wonderglue), new Object [] {"X*X", "X*X", " & ", 'X', barSilicon, '*', Item.slimeBall, '&', syringeEmpty});
		LanguageRegistry.addName(turpentine, "Turpentine");
		GameRegistry.addShapelessRecipe(new ItemStack(turpentine), new Object [] {Item.coal, Item.coal, Item.coal, Item.coal, Block.wood});
		LanguageRegistry.addName(geckoHide, "Gecko Hide");
		GameRegistry.addShapelessRecipe(new ItemStack(geckoHide), new Object [] {Block.cactus, Item.leather});
		LanguageRegistry.addName(leatherBelt, "Leather Belt");
		GameRegistry.addRecipe(new ItemStack(leatherBelt), new Object [] {"X*X", 'X', Item.leather, '*', Item.ingotIron});
		LanguageRegistry.addName(cellElectron, "Electron Charge Pack");
		GameRegistry.addRecipe(new ItemStack(cellElectron, 5), new Object [] {"XX", "**", "XX", 'X', tungstenPlate, '*', ingotUranium});
		GameRegistry.addShapelessRecipe(new ItemStack(cellElectron), new Object [] {cellECPD, cellECPD, cellECPD, cellECPD});
		LanguageRegistry.addName(cellEnergy, "Energy Cell");
		GameRegistry.addRecipe(new ItemStack(cellEnergy, 10), new Object [] {"X*", "*X", '*', ingotUranium, 'X', ingotTechnetium});
		GameRegistry.addShapelessRecipe(new ItemStack(cellEnergy), new Object [] {cellED, cellED, cellED, cellED});

		//TODO Version 1.7
		LanguageRegistry.addName(grip, "Gun Grip");
		GameRegistry.addRecipe(new ItemStack(grip), new Object [] {"X*X", "X*X", " X*", 'X', Item.leather, '*', ingotTungsten});
		LanguageRegistry.addName(stockWood, "Stock");
		GameRegistry.addRecipe(new ItemStack(stockWood), new Object [] {"XXX", " XX", 'X', Block.planks});
		LanguageRegistry.addName(barrel, "Gun Barrel");
		GameRegistry.addRecipe(new ItemStack(barrel), new Object [] {"XXX", "   ", "XXX", 'X', Item.ingotIron});
		LanguageRegistry.addName(crystalArray, "Crystal Array");
		GameRegistry.addRecipe(new ItemStack(crystalArray), new Object [] {"X X", " * ", "X X", 'X', ingotTechnetium, '*', Item.diamond});
		LanguageRegistry.addName(hammer, "Hammer");
		GameRegistry.addRecipe(new ItemStack(hammer), new Object [] {"  X", "XX ", " X ", 'X', Item.ingotIron});
		LanguageRegistry.addName(gasTank, "Motorcycle Gas Tank");
		GameRegistry.addRecipe(new ItemStack(gasTank), new Object [] {" X ", "X*X", "XXX", 'X', ingotTungsten, '*', homemadeFuel});

		LanguageRegistry.addName(magRail, "Magnifier Rail");
		GameRegistry.addRecipe(new ItemStack(magRail), new Object [] {"XXX", 'X', crystalArray});
		LanguageRegistry.addName(powderRifle, "Powder - Rifle");
		GameRegistry.addShapelessRecipe(new ItemStack(powderRifle, 5), new Object [] {Item.gunpowder, Item.gunpowder});
		LanguageRegistry.addName(primerRifleL, "Primer - Rifle(Large)");
		GameRegistry.addShapelessRecipe(new ItemStack(primerRifleL, 3), new Object [] {powderRifle, powderRifle, ingotTungsten});
		LanguageRegistry.addName(lead, "Lead");
		GameRegistry.addShapelessRecipe(new ItemStack(lead, 2), new Object [] {scrapMetal, ingotTungsten});
		LanguageRegistry.addName(powderPistol, "Powder - Pistol");
		GameRegistry.addShapelessRecipe(new ItemStack(powderPistol, 3), new Object [] {Item.gunpowder});
		LanguageRegistry.addName(primerPistolS, "Primer - Pistol (Small)");
		GameRegistry.addShapelessRecipe(new ItemStack(primerPistolS, 3), new Object [] {powderPistol, powderPistol, ingotTungsten});
		LanguageRegistry.addName(primerPistolL, "Primer - Pistol (Large)");
		GameRegistry.addShapelessRecipe(new ItemStack(primerPistolL, 3), new Object [] {powderPistol, powderPistol, ingotTungsten, powderPistol, ingotTungsten});

		//TODO 1.7.3
		LanguageRegistry.addName(mod357LongBarrel, ".357 Long Barrel");
		LanguageRegistry.addName(mod357HDCylinder, ".357 HD Cylinder");
		LanguageRegistry.addName(mod45APHDSlide, ".45 AP Slide");
		LanguageRegistry.addName(mod45APSilencer, ".45 AP Silencer");
		LanguageRegistry.addName(mod9mmPistolExtMag, "9mm Pistol Extended Mags");
		LanguageRegistry.addName(mod10mmPistolExtenderMags, "10mm Pistol Extended Mags");
		LanguageRegistry.addName(mod10mmPistolSilencer, "10mm Pistol Silencer");
		LanguageRegistry.addName(mod127mmPistolSilencer, "12.7mm Pistol Silencer");
		LanguageRegistry.addName(modHuntingRevolver6Shot, "Hunting Revolver Six Shot Cylinder");

		LanguageRegistry.addName(modAntiMaterielSupressor, "Anti Materiel Rifle Supressor");
		LanguageRegistry.addName(modAntiMaterielCustomBolt, "Anti Materiel Rifle Custom Bolt");
		LanguageRegistry.addName(modAssaultCarbineExtendedMags, "Assault Carbine Extended Mags");
		LanguageRegistry.addName(modAssaultCarbineForgedReceiver, "Assault Carbine Forged Receiver");
		LanguageRegistry.addName(modAssaultCarbineLightBolt, "Assault Cabine Light Bolt");
		LanguageRegistry.addName(modAutomaticRifleInternals, "Automatic Rifle Upgraded Internals");
		LanguageRegistry.addName(modBrushGunForgedReceiver, "Brush Gun Forged Receiver");
		LanguageRegistry.addName(modCowboyRepeaterCustomAction, "Cowboy Repeater Custom Action");
		LanguageRegistry.addName(modCowboyRepeaterLongTube, "Cowboy Repeater Long Tube");
		LanguageRegistry.addName(modHuntingRifleExtendedMag, "Hunting Rifle Extended Mags");
		LanguageRegistry.addName(modHuntingRifleCustomAction, "Hunting Rifle Custom Action");
		LanguageRegistry.addName(modLMGExpandedDrums, "Light Machine Gun Expanded Drums");
		LanguageRegistry.addName(modServiceRifleForgedReceiver, "Service Rifle Forged Receiver");
		LanguageRegistry.addName(modServiceRifleCustomSprings, "Service Rifle Custom Springs");
		LanguageRegistry.addName(modSniperSupressor, "Sniper Rifle Supressor");
		LanguageRegistry.addName(modVarmintNightScope, "Varmint Rifle Night Scope");
		LanguageRegistry.addName(modVarmintExtendedMags, "Varmint Rifle Extended Mags");
		LanguageRegistry.addName(modVarmintSilencer, "Varmint Rifle Silencer");

		LanguageRegistry.addName(fixer, "Fixer");

		LanguageRegistry.addName(superconductor, "Super Conductor");
		GameRegistry.addRecipe(new ItemStack(superconductor), new Object [] {"X*X", "X*X", 'X', Item.ingotIron, '*', Item.ingotGold});
		LanguageRegistry.addName(plasmaChamber, "Plasma Chamber");
		GameRegistry.addRecipe(new ItemStack(plasmaChamber), new Object [] {"XXX", "* *", "XXX", 'X', technetiumPlate, '*', ingotTungsten});
		LanguageRegistry.addName(electromagnet, "Electromagnet");
		GameRegistry.addRecipe(new ItemStack(electromagnet), new Object [] {"X**", "* &", "***", '*', Item.redstone, 'X', railwaySpikes, '&', cellMF});
		LanguageRegistry.addName(magnetClaws, "Electromagnetic Claws");
		GameRegistry.addRecipe(new ItemStack(magnetClaws), new Object [] {"X X", "   ", " X ", 'X', electromagnet});
		LanguageRegistry.addName(particleDiverter, "Particle Diverter");
		GameRegistry.addRecipe(new ItemStack(particleDiverter), new Object [] {"X X", "   ", " X ", 'X', crystalArray});
		LanguageRegistry.addName(carbonFiberHousing, "Carbon Fiber Housing");
		GameRegistry.addRecipe(new ItemStack(carbonFiberHousing), new Object [] {" X ", "X*X", "&&&", 'X', carbon, '*', Item.diamond, '&', tungstenPlate});
		LanguageRegistry.addName(energyRifleBarrel, "Energy Rifle Barrel");
		GameRegistry.addShapelessRecipe(new ItemStack(energyRifleBarrel), new Object [] {particleDiverter, carbonFiberHousing, plasmaChamber, superconductor});
		LanguageRegistry.addName(drum, "Drum");
		GameRegistry.addRecipe(new ItemStack(drum), new Object [] {"X*X", "* *", "X*X", 'X', Item.leather, '*', Item.ingotIron});
		LanguageRegistry.addName(cylinder, "Cylinder");
		GameRegistry.addRecipe(new ItemStack(cylinder), new Object [] {"XXX", "X*X", 'X', Item.ingotIron, '*', ingotTungsten});

		LanguageRegistry.addName(aGauge20, "20 Gauge Shotgun Shells");
		GameRegistry.addShapelessRecipe(new ItemStack(aGauge20), new Object [] {hull20, primerShotgun, powderPistol, lead, lead, lead});
		LanguageRegistry.addName(itemPortalActivator, "Portal Activator");
		LanguageRegistry.addName(pipboy, "Pipboy 3000 (WIP)");
		LanguageRegistry.addName(a32, ".32 Caliber Rounds");
		LanguageRegistry.addName(aDart, "Dart");
		GameRegistry.addShapelessRecipe(new ItemStack(aDart, 8), new Object [] {Item.arrow, Item.flint});
		LanguageRegistry.addName(railwaySpikes, "Railway Spikes");
		GameRegistry.addShapelessRecipe(new ItemStack(railwaySpikes, 8), new Object [] {Block.railPowered, Item.ingotIron});

		LanguageRegistry.addName(minigunBarrel, "Minigun Barrel");
		GameRegistry.addRecipe(new ItemStack(minigunBarrel), new Object [] {"XX*", "XX ", "XX*", 'X', barrel, '*', RAP});
		LanguageRegistry.addName(minigunFiringMechanism, "Minigun Firing Mechanism");
		GameRegistry.addRecipe(new ItemStack(minigunFiringMechanism), new Object [] {"X*&", 'X', gear, '*', cylinder, '&', Block.lever});

		LanguageRegistry.addName(aRocket, "Rocket");
		LanguageRegistry.addName(aMissile, "Missile");
		LanguageRegistry.addName(a127, "12.7mm Rounds");
		GameRegistry.addShapelessRecipe(new ItemStack(a127), new Object [] {case127, primerPistolL, powderPistol, powderPistol, lead, lead, lead, lead});
		LanguageRegistry.addName(a556, "5.56mm Rounds");
		GameRegistry.addShapelessRecipe(new ItemStack(a556), new Object [] {case556, primerRifleS, powderRifle, lead, lead});
		LanguageRegistry.addName(a5mm, "5mm Rounds");
		GameRegistry.addShapelessRecipe(new ItemStack(a5mm), new Object [] {case5mm, primerRifleS, powderRifle, lead, lead});
		LanguageRegistry.addName(a9mm, "9mm Rounds");
		GameRegistry.addShapelessRecipe(new ItemStack(a9mm), new Object [] {case9mm, primerPistolS, powderPistol, lead});
		LanguageRegistry.addName(aAlien, "Alien Power Cells");
		LanguageRegistry.addName(a45Auto, ".45 Auto Rounds");
		GameRegistry.addShapelessRecipe(new ItemStack(a45Auto), new Object [] {case45Auto, primerPistolL, powderPistol, powderPistol, lead, lead, lead});
		LanguageRegistry.addName(aBB, "BBs");
		LanguageRegistry.addName(aGovt, ".40-.70 Govt. Rounds");
		GameRegistry.addShapelessRecipe(new ItemStack(aGovt), new Object [] {caseGovt, primerPistolL, powderRifle, powderRifle, powderRifle, lead, lead, lead, lead});
		LanguageRegistry.addName(stockMetal, "Metal Stock");
		GameRegistry.addRecipe(new ItemStack(stockMetal), new Object [] {"XXX", " XX", 'X', ingotTungsten});
		LanguageRegistry.addName(a50MG, ".50MG");
		GameRegistry.addShapelessRecipe(new ItemStack(a50MG), new Object [] {case50MG, primer50MG, powderRifle, powderRifle, powderRifle, lead, lead, lead, lead});
		LanguageRegistry.addName(aNail, "Nails");
		GameRegistry.addShapelessRecipe(new ItemStack(aNail, 8), new Object [] {railwaySpikes});
		LanguageRegistry.addName(a10mm, "10mm Rounds");
		GameRegistry.addShapelessRecipe(new ItemStack(a10mm), new Object [] {case10mm, primerPistolL, powderPistol, lead, lead});
		LanguageRegistry.addName(aGauge12, "12 Gauge Shotgun Shells");
		GameRegistry.addShapelessRecipe(new ItemStack(aGauge12), new Object [] {hull20, primerShotgun, powderPistol, powderPistol, lead, lead, lead, lead});
		LanguageRegistry.addName(primer50MG, "Primer - .50MG");
		LanguageRegistry.addName(primerRifleS, "Primer - Rifle(Small)");
		LanguageRegistry.addName(primerShotgun, "Primer - Shotgun");
		GameRegistry.addShapelessRecipe(new ItemStack(primerShotgun), new Object [] {ingotTechnetium, Item.gunpowder, Item.gunpowder, Item.gunpowder});

		LanguageRegistry.addName(cellMFD, "Drained Microfusion Cell");
		LanguageRegistry.addName(cellECPD, "Drained Electron Charge Pack");
		LanguageRegistry.addName(cellED, "Drained Small Energy Cell");

		LanguageRegistry.addName(case45Auto, "Case - .45 Auto");
		LanguageRegistry.addName(case9mm, "Case - 9mm");
		LanguageRegistry.addName(case10mm, "Case - 10mm");
		LanguageRegistry.addName(case357, "Case -.357");
		LanguageRegistry.addName(case44, "Case - .44");
		LanguageRegistry.addName(case308, "Case - .308");
		LanguageRegistry.addName(caseGovt, "Case - .45-.70");
		LanguageRegistry.addName(case50MG, "Case - .50MG");
		LanguageRegistry.addName(case22LR, "Case - .22LR");
		LanguageRegistry.addName(primerPistolL, "Primer - Pistol(Large)");
		LanguageRegistry.addName(dogBrain, "Dog Brain");

		LanguageRegistry.addName(case5mm, "Case - 5mm");
		LanguageRegistry.addName(primerRifleS, "Primer - Rifle(Small)");
		LanguageRegistry.addName(case556, "Case - 5.56mm");
		LanguageRegistry.addName(case127, "Case - 12.7mm");
		LanguageRegistry.addName(hull12, "Hull - 12 Gauge");
		LanguageRegistry.addName(hull20, "Hull - 20 Gauge");
		LanguageRegistry.addName(primerShotgun, "Primer - Shotgun");

		System.out.println("Fallout: Item system loaded. Craft ALL the items!");
	}
}
