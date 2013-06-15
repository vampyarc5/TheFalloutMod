package blfngl.fallout;

import java.util.Arrays;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.common.MinecraftForge;
import blfngl.fallout.armor.ArmorBaseEnclave;
import blfngl.fallout.armor.ArmorBaseGecko1;
import blfngl.fallout.armor.ArmorBaseHellfire;
import blfngl.fallout.armor.ArmorBaseT45;
import blfngl.fallout.armor.ArmorBaseT51;
import blfngl.fallout.armor.ArmorBaseWinter;
import blfngl.fallout.block.BlockAlien;
import blfngl.fallout.block.BlockAsbestosDeposit;
import blfngl.fallout.block.BlockBPGlass;
import blfngl.fallout.block.BlockBananaYucca;
import blfngl.fallout.block.BlockBarrelCactus;
import blfngl.fallout.block.BlockBrocFlower;
import blfngl.fallout.block.BlockBuffaloGourd;
import blfngl.fallout.block.BlockCarbonDeposit;
import blfngl.fallout.block.BlockCaveFungus;
import blfngl.fallout.block.BlockJalapeno;
import blfngl.fallout.block.BlockPortalActivator;
import blfngl.fallout.block.BlockReloadBench;
import blfngl.fallout.block.BlockSaturniteOre;
import blfngl.fallout.block.BlockSiliconDeposit;
import blfngl.fallout.block.BlockTechnetiumOre;
import blfngl.fallout.block.BlockTungstenOre;
import blfngl.fallout.block.BlockUraniumOre;
import blfngl.fallout.block.BlockWastelandPortal;
import blfngl.fallout.block.BlockXanderRoot;
import blfngl.fallout.food.ItemFixer;
import blfngl.fallout.food.ItemHealingPowder;
import blfngl.fallout.food.ItemHydra;
import blfngl.fallout.food.ItemJet;
import blfngl.fallout.food.ItemMedEx;
import blfngl.fallout.food.ItemNukaQuartz;
import blfngl.fallout.food.ItemNukaVictory;
import blfngl.fallout.food.ItemPsycho;
import blfngl.fallout.food.ItemRocket;
import blfngl.fallout.food.ItemSlasher;
import blfngl.fallout.food.ItemStealthBoy;
import blfngl.fallout.food.ItemStimpak;
import blfngl.fallout.food.ItemSuperStimpak;
import blfngl.fallout.food.ItemTurbo;
import blfngl.fallout.food.ItemWeaponBinding;
import blfngl.fallout.food.ItembCaveFungus;
import blfngl.fallout.food.ItembXanderRoot;
import blfngl.fallout.gun.BaseGun;
import blfngl.fallout.gun.GunExplosive;
import blfngl.fallout.gun.GunIncinerator;
import blfngl.fallout.handler.ArmorHandler;
import blfngl.fallout.handler.BlockHandler;
import blfngl.fallout.handler.EntityHandler;
import blfngl.fallout.handler.FoodHandler;
import blfngl.fallout.handler.GunHandler;
import blfngl.fallout.handler.ItemHandler;
import blfngl.fallout.handler.PerkHandler;
import blfngl.fallout.handler.RecordHandler;
import blfngl.fallout.handler.ThrowingHandler;
import blfngl.fallout.handler.VanillaDropHandler;
import blfngl.fallout.handler.WeaponHandler;
import blfngl.fallout.handler.WorldHandler;
import blfngl.fallout.item.BaseDrink;
import blfngl.fallout.item.BaseFood;
import blfngl.fallout.item.BaseItem;
import blfngl.fallout.item.ItemImplant;
import blfngl.fallout.item.ItemPerk;
import blfngl.fallout.item.ItemPipboy;
import blfngl.fallout.item.ItemPortalActivator;
import blfngl.fallout.item.ItemSyringe;
import blfngl.fallout.melee.BaseMelee;
import blfngl.fallout.melee.WeapBallisticFist;
import blfngl.fallout.melee.WeapBotE;
import blfngl.fallout.melee.WeapDisplacerGlove;
import blfngl.fallout.melee.WeapFlamingShish;
import blfngl.fallout.proxy.ClientProxy;
import blfngl.fallout.proxy.CommonProxy;
import blfngl.fallout.tab.TabFalloutAmmo;
import blfngl.fallout.tab.TabFalloutArmor;
import blfngl.fallout.tab.TabFalloutEnergy;
import blfngl.fallout.tab.TabFalloutFood;
import blfngl.fallout.tab.TabFalloutHeavy;
import blfngl.fallout.tab.TabFalloutMisc;
import blfngl.fallout.tab.TabFalloutMusic;
import blfngl.fallout.tab.TabFalloutParts;
import blfngl.fallout.tab.TabFalloutPerk;
import blfngl.fallout.tab.TabFalloutPistol;
import blfngl.fallout.tab.TabFalloutRifle;
import blfngl.fallout.tab.TabFalloutSMG;
import blfngl.fallout.tab.TabFalloutShotgun;
import blfngl.fallout.tab.TabFalloutWeap;
import blfngl.fallout.throwing.ItemThrowingExplosive;
import blfngl.fallout.world.BiomeWasteland;
import blfngl.fallout.world.DimensionWastelandWorldHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * The Fallout Mod
 * 
 * @Author blfngl
 * @Partners Max_FF, TechSkeleton, Earthdog_Gir
 * @License Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * The code in this repository, in any form, is the copyright of blfngl
 **/

@Mod(modid = "fallout", name = "The Fallout Mod", version = "MC1.5.2 - TFMv1.7.3")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Fallout
{
	@Instance("fallout")
	public static Fallout instance;

	@SidedProxy(clientSide="blfngl.fallout.proxy.ClientProxy", serverSide="blfngl.fallout.proxy.CommonProxy")
	public static CommonProxy proxy;
	public static ClientProxy cproxy;

	public static boolean isScoped = false;
	public static boolean isReloading = false;
	public static int dimensionWasteland = 18;
	public static NBTTagCompound perkNBT;

	public static CreativeTabs TabFalloutArmor = new TabFalloutArmor(CreativeTabs.getNextID(), "TabFalloutArmor");
	public static CreativeTabs TabFalloutPistol = new TabFalloutPistol(CreativeTabs.getNextID(), "TabFalloutPistol");
	public static CreativeTabs TabFalloutRifle = new TabFalloutRifle(CreativeTabs.getNextID(), "TabFalloutRifle");
	public static CreativeTabs TabFalloutSMG = new TabFalloutSMG(CreativeTabs.getNextID(), "TabFalloutSMG");
	public static CreativeTabs TabFalloutShotgun = new TabFalloutShotgun(CreativeTabs.getNextID(), "TabFalloutShotgun");
	public static CreativeTabs TabFalloutEnergy = new TabFalloutEnergy(CreativeTabs.getNextID(), "TabFalloutEnergy");
	public static CreativeTabs TabFalloutHeavy = new TabFalloutHeavy(CreativeTabs.getNextID(), "TabFalloutHeavy");
	public static CreativeTabs TabFalloutFood = new TabFalloutFood(CreativeTabs.getNextID(), "TabFalloutFood");
	public static CreativeTabs TabFalloutMisc = new TabFalloutMisc(CreativeTabs.getNextID(), "TabFalloutMisc");
	public static CreativeTabs TabFalloutWeap = new TabFalloutWeap(CreativeTabs.getNextID(), "TabFalloutWeap");
	public static CreativeTabs TabFalloutAmmo = new TabFalloutAmmo(CreativeTabs.getNextID(), "TabFalloutAmmo");
	public static CreativeTabs TabFalloutMusic = new TabFalloutMusic(CreativeTabs.getNextID(), "TabFalloutMusic");
	public static CreativeTabs TabFalloutParts = new TabFalloutParts(CreativeTabs.getNextID(), "TabFalloutParts");
	public static CreativeTabs TabFalloutPerk = new TabFalloutPerk(CreativeTabs.getNextID(), "TabFalloutPerk");

	public static EnumToolMaterial SATHEAT = EnumHelper.addToolMaterial("SATHEAT", 0, 595, 10.0F, 8, 27);
	public static EnumToolMaterial PFIST = EnumHelper.addToolMaterial("PFIST", 0, 395, 10.0F, 7, 25);
	public static EnumToolMaterial SCI = EnumHelper.addToolMaterial("SCI", 0, 316, 5.0F, 1, 6);
	public static EnumToolMaterial SAT = EnumHelper.addToolMaterial("SAT", 0, 795, 10.0F, 8, 25);
	public static EnumToolMaterial CLEAVE = EnumHelper.addToolMaterial("CLEAVE", 0, 995, 10.0F, 3, 27);
	public static EnumToolMaterial COMKNIFE = EnumHelper.addToolMaterial("COMKNIFE", 0, 995, 5.0F, 4, 27);
	public static EnumToolMaterial BOTE = EnumHelper.addToolMaterial("BOTE", 0, 1024, 10.0F, 15, 27);
	public static EnumToolMaterial COS = EnumHelper.addToolMaterial("COS", 0, 995, 10.0F, 10, 27);
	public static EnumToolMaterial COSFIRE = EnumHelper.addToolMaterial("COSKNIFE", 0, 1024, 10.0F, 12, 27);
	public static EnumToolMaterial PINT = EnumHelper.addToolMaterial("PINT", 0, 100, 200.0F, 200, 10);
	public static EnumToolMaterial GUN = EnumHelper.addToolMaterial("GUN", 0, 0, 0.0F, 0, 0);

	public static EnumArmorMaterial T45POWER = EnumHelper.addArmorMaterial("T45POWER", 35, new int[]{2, 6, 5, 2}, 25);
	public static EnumArmorMaterial ENCLAVE = EnumHelper.addArmorMaterial("ENCLAVE", 37, new int[]{2, 6, 5, 2}, 28);
	public static EnumArmorMaterial T51POWER = EnumHelper.addArmorMaterial("T51POWER", 39, new int[]{2, 6, 5, 2}, 33);
	public static EnumArmorMaterial HELLFIRE = EnumHelper.addArmorMaterial("HELLFIRE", 41, new int []{2, 6, 5, 2}, 35);
	public static EnumArmorMaterial WINTER = EnumHelper.addArmorMaterial("WINTER", 42, new int []{2, 6, 5, 2}, 35);

	public static final Item cellEnergy = new BaseItem(448).setUnlocalizedName("ECell").setCreativeTab(TabFalloutAmmo);
	public static final Item a22LR = new BaseItem(443).setUnlocalizedName("22LRRound").setCreativeTab(TabFalloutAmmo);
	public static final Item a308 = new BaseItem(444).setUnlocalizedName("308Round").setCreativeTab(TabFalloutAmmo);
	public static final Item a357 = new BaseItem(445).setUnlocalizedName("357Round").setCreativeTab(TabFalloutAmmo);
	public static final Item a44 = new BaseItem(446).setUnlocalizedName("44Round").setCreativeTab(TabFalloutAmmo);
	public static final Item cellElectron = new BaseItem(450).setUnlocalizedName("EPack").setCreativeTab(TabFalloutAmmo);
	public static final Item rocketCanister = new BaseItem(637).setUnlocalizedName("RocketCanister").setCreativeTab(TabFalloutAmmo);
	public static final Item a45Auto = new BaseItem(638).setUnlocalizedName("45AutoRound").setCreativeTab(TabFalloutAmmo);
	public static final Item aBB = new BaseItem(639).setUnlocalizedName("BB").setCreativeTab(TabFalloutAmmo);
	public static final Item aGovt = new BaseItem(640).setUnlocalizedName("GovtRound").setCreativeTab(TabFalloutAmmo);
	public static final Item aRocket = new BaseItem(608).setUnlocalizedName("AmmoRocket").setCreativeTab(TabFalloutAmmo);
	public static final Item aMissile = new BaseItem(609).setUnlocalizedName("Missile").setCreativeTab(TabFalloutAmmo);
	public static final Item a127 = new BaseItem(610).setUnlocalizedName("127mmRound").setCreativeTab(TabFalloutAmmo);
	public static final Item a556 = new BaseItem(611).setUnlocalizedName("556mmRound").setCreativeTab(TabFalloutAmmo);
	public static final Item a5mm = new BaseItem(612).setUnlocalizedName("5mmRound").setCreativeTab(TabFalloutAmmo);
	public static final Item a9mm = new BaseItem(618).setUnlocalizedName("9mmRound").setCreativeTab(TabFalloutAmmo);
	public static final Item aAlien = new BaseItem(619).setUnlocalizedName("AlienCells").setCreativeTab(TabFalloutAmmo);
	public static final Item aGauge20 = new BaseItem(674).setUnlocalizedName("20Gauge").setCreativeTab(TabFalloutAmmo);
	public static final Item aNail = new BaseItem(665).setUnlocalizedName("Nails").setCreativeTab(TabFalloutAmmo);
	public static final Item a50MG = new BaseItem(644).setUnlocalizedName("50MG").setCreativeTab(TabFalloutAmmo);
	public static final Item cellMF = new BaseItem(413).setUnlocalizedName("MFCell").setCreativeTab(TabFalloutAmmo);
	public static final Item a32 = new BaseItem(728).setUnlocalizedName("32Caliber").setCreativeTab(TabFalloutAmmo);
	public static final Item aDart = new BaseItem(731).setUnlocalizedName("Dart").setCreativeTab(TabFalloutAmmo);

	public static final Item incinerator = new GunIncinerator(509).setUnlocalizedName("Incinerator").setCreativeTab(TabFalloutHeavy);
	public static final Item rifleLaserRCW = new BaseGun(510, 3, 60, 2, 0.3, "blfngl.LaserFire", "blfngl.RCWReload", cellMF, 1995).setUnlocalizedName("LaserRCW").setCreativeTab(TabFalloutEnergy);
	public static final Item pistolCompliance = new BaseGun(511, 2, 30, 2, 1, "blfngl.LaserPistolFire", "blfngl.ComplianceReload", cellEnergy, 995).setUnlocalizedName("Compliance").setCreativeTab(TabFalloutEnergy);
	public static final Item rifleLaser = new BaseGun(512, 6, 24, 3, 1, "blfngl.LaserFire", "blfngl.LaserReload", cellMF, 995).setUnlocalizedName("LaserRifle").setCreativeTab(TabFalloutEnergy);
	public static final Item pistol44 = new BaseGun(513, 5, 6, 3, 3, "blfngl.44Fire", "blfngl.44Reload", a44, 1245).setUnlocalizedName("Pistol44").setCreativeTab(TabFalloutPistol);
	public static final Item pistol357 = new BaseGun(514, 4, 6, 1, 2, "blfngl.357Fire", "blfngl.357Reload", a357, 995).setUnlocalizedName("Pistol357").setCreativeTab(TabFalloutPistol);
	public static final Item pistol22 = new BaseGun(515, 2, 12, 2, 1, "blfngl.Silenced22Fire", "blfngl.Silenced22Fire", a22LR, 495).setUnlocalizedName("Silenced22").setCreativeTab(TabFalloutPistol);
	public static final Item rifleSniper = new BaseGun(516, 11, 5, 3, 2, "blfngl.SniperFire", "blfngl.SniperReload", a308, 395).setUnlocalizedName("Sniper308").setCreativeTab(TabFalloutRifle);

	//TODO update effects/durability/damage
	public static final Item BotE = new WeapBotE(517, 3, -1, 1245, 1, 5).setUnlocalizedName("BotE").setCreativeTab(TabFalloutWeap);
	public static final Item BumperSword = new WeapBotE(518, 3, -1, 1245, 1, 5).setUnlocalizedName("BumperSword").setCreativeTab(TabFalloutWeap);
	public static final Item Cleaver = new BaseMelee(519, 3, -1, 1245, 1, 5, "LimbDamB", 0).setUnlocalizedName("Cleaver");
	public static final Item ComKnife = new BaseMelee(520, 3, 0, 445, 2, 5).setUnlocalizedName("ComKnife");
	public static final Item CosKnife = new BaseMelee(521, 3, 0, 745, 1, 5).setUnlocalizedName("CosKnife");
	public static final Item CosClean = new BaseMelee(522, 3, 0, 995, 1.2, 5).setUnlocalizedName("CosClean");
	public static final Item CosFire = new BaseMelee(523, 12, 0, 444, 1, 1, "Fire", 4).setUnlocalizedName("CosFire");
	public static final Item FireAxe = new BaseMelee(524, 12, -3, 995, 1, 5).setUnlocalizedName("FireAxe");
	public static final Item Knife = new BaseMelee(525, 2, 0, 745, 1, 5).setUnlocalizedName("Knife");
	public static final Item Machete = new BaseMelee(526, 4, 0, 245, 1.5, 10, "LimbDamB", 0).setUnlocalizedName("Machete");
	public static final Item Shishkebab = new BaseMelee(527, 15, 0, 444, 1, 1, "Fire", 4).setUnlocalizedName("Shishkebab");
	public static final Item StraightRazor = new BaseMelee(528, 1, 1, 370, 2, 15, "CritChaB", 0, "CritDamB", 0).setUnlocalizedName("StraightRazor");
	public static final Item Switchblade = new BaseMelee(529, 2, -1, 495, 2, 5).setUnlocalizedName("Switchblade");
	public static final Item PintSizedKnife = new BaseMelee(530, 11, 0, 1000, 1, 5).setUnlocalizedName("PintSizedKnife");

	public static final Item BallisticFist = new WeapBallisticFist(531, 16, -3, 1000, 4, 4).setUnlocalizedName("BallisticFist").setCreativeTab(TabFalloutWeap);
	public static final Item BladedGauntlet = new BaseMelee(532, 6, -2, 295, 2, 15, "CritChaB", 0, "CritDamB", 0).setUnlocalizedName("BladedGauntlet");
	public static final Item BoxingGloves = new BaseMelee(533, 0, -2, 995, 1, 5, "Knockout", 10).setUnlocalizedName("BoxingGloves");
	public static final Item BrassKnuckles = new BaseMelee(534, 4, -1, 995, 1, 5).setUnlocalizedName("BrassKnuckles");
	public static final Item DisplacerGlove = new WeapDisplacerGlove(535, PFIST).setUnlocalizedName("DisplacerGlove").setCreativeTab(TabFalloutWeap);
	public static final Item GoldenGloves = new BaseMelee(536, 0, -2, 1245, 2, 5, "Knockout", 15).setUnlocalizedName("GoldenGloves");
	public static final Item PowerFist = new BaseMelee(537, 9, -3, 395, 1, 5).setUnlocalizedName("PowerFist");
	public static final Item SatFist = new BaseMelee(538, 8, -2, 795, 1, 5).setUnlocalizedName("SatFist");
	public static final Item SatHeatFist = new BaseMelee(539, 12, -3, 595, 1, 5).setUnlocalizedName("SatHeatFist");
	public static final Item SciGlove = new BaseMelee(540,  3, -2, 666, 1, 1, "Stun", 15, "Stun", 15).setUnlocalizedName("SciGlove");
	public static final Item ZapGlove = new BaseMelee(541, 6, -2, 666, 1, 1, "Stun", 15).setUnlocalizedName("ZapGlove");

	public static final Item chunkTungsten = new BaseItem(400).setUnlocalizedName("TungstenRod").setCreativeTab(TabFalloutMisc);
	public static final Item ingotTungsten = new BaseItem(401).setUnlocalizedName("TungstenIngot").setCreativeTab(TabFalloutMisc);
	public static final Item chunkTechnetium = new BaseItem(402).setUnlocalizedName("TechnetiumChunk").setCreativeTab(TabFalloutMisc);
	public static final Item ingotTechnetium = new BaseItem(403).setUnlocalizedName("TechnetiumIngot").setCreativeTab(TabFalloutMisc);
	public static final Item chunkSilicon = new BaseItem(404).setUnlocalizedName("SiliconChunk").setCreativeTab(TabFalloutMisc);
	public static final Item barSilicon = new BaseItem(405).setUnlocalizedName("SiliconBar").setCreativeTab(TabFalloutMisc);
	public static final Item tungstenFilter = new BaseItem(406).setUnlocalizedName("TungstenFilter").setCreativeTab(TabFalloutMisc);
	public static final Item chunkAsbestos = new BaseItem(407).setUnlocalizedName("AsbestosChunk").setCreativeTab(TabFalloutMisc);
	public static final Item barAsbestos = new BaseItem(408).setUnlocalizedName("AsbestosBar").setCreativeTab(TabFalloutMisc);
	public static final Item ingotUranium = new BaseItem(409).setUnlocalizedName("UraniumIngot").setCreativeTab(TabFalloutMisc);
	public static final Item tungstenPlate = new BaseItem(410).setUnlocalizedName("TungstenPlate").setCreativeTab(TabFalloutMisc);
	public static final Item technetiumPlate = new BaseItem(411).setUnlocalizedName("TechnetiumPlate").setCreativeTab(TabFalloutMisc);
	public static final Item RAP = new BaseItem(412).setUnlocalizedName("RAP").setCreativeTab(CreativeTabs.tabMaterials).setCreativeTab(TabFalloutMisc);
	public static final Item MFPack = new BaseItem(414).setUnlocalizedName("MFPack").setCreativeTab(TabFalloutMisc);
	public static final Item carbon = new BaseItem(415).setUnlocalizedName("Carbon").setCreativeTab(TabFalloutMisc);
	public static final Item teflon = new BaseItem(416).setUnlocalizedName("Teflon").setCreativeTab(TabFalloutMisc);
	public static final Item polyethylene = new BaseItem(417).setUnlocalizedName("Polyethylene").setCreativeTab(TabFalloutMisc);
	public static final Item bottleCap = new BaseItem(418).setUnlocalizedName("BottleCap").setCreativeTab(TabFalloutMisc);
	public static final Item fan = new BaseItem(419).setUnlocalizedName("Fan").setCreativeTab(TabFalloutMisc);
	public static final Item gear = new BaseItem(420).setUnlocalizedName("Gear").setCreativeTab(TabFalloutMisc);
	public static final Item gyro = new BaseItem(421).setUnlocalizedName("Gyro").setCreativeTab(TabFalloutMisc);
	public static final Item MASM = new BaseItem(422).setUnlocalizedName("MASM").setCreativeTab(TabFalloutMisc);
	public static final Item TXMF = new BaseItem(423).setUnlocalizedName("TXMF").setCreativeTab(TabFalloutMisc);
	public static final Item card = new BaseItem(424).setUnlocalizedName("Card").setCreativeTab(TabFalloutMisc);
	public static final Item deck = new BaseItem(425).setUnlocalizedName("Deck").setCreativeTab(TabFalloutMisc);
	public static final Item cardboard = new BaseItem(426).setUnlocalizedName("Cardboard").setCreativeTab(TabFalloutMisc);
	public static final Item tinCan = new BaseItem(427).setUnlocalizedName("TinCan").setCreativeTab(TabFalloutMisc);
	public static final Item chunkSaturnite = new BaseItem(428).setUnlocalizedName("SatRod").setCreativeTab(TabFalloutMisc);
	public static final Item ingotSaturnite = new BaseItem(429).setUnlocalizedName("SatIngot").setCreativeTab(TabFalloutMisc);
	public static final Item saturniteAlloy = new BaseItem(430).setUnlocalizedName("SatAlloy").setCreativeTab(TabFalloutMisc);
	public static final Item syringeEmpty = new ItemSyringe(431).setUnlocalizedName("EmptySyringe").setCreativeTab(TabFalloutMisc);
	public static final Item syringeBloody = new BaseItem(432).setUnlocalizedName("BloodSyringe").setCreativeTab(TabFalloutMisc);
	public static final Item powerTorso  = new BaseItem(433).setUnlocalizedName("PTorso").setCreativeTab(TabFalloutMisc);
	public static final Item powerShoulders  = new BaseItem(434).setUnlocalizedName("PShoulders").setCreativeTab(TabFalloutMisc);
	public static final Item powerChest = new BaseItem(435).setUnlocalizedName("PChest").setCreativeTab(TabFalloutMisc);
	public static final Item upgradeT45 = new BaseItem(436).setUnlocalizedName("T45Upgrade").setCreativeTab(TabFalloutMisc);
	public static final Item upgradeEnclave = new BaseItem(437).setUnlocalizedName("EnclaveUpgrade").setCreativeTab(TabFalloutMisc);	
	public static final Item upgradeT51 = new BaseItem(438).setUnlocalizedName("T51Upgrade").setCreativeTab(TabFalloutMisc);
	public static final Item upgradeHellfire = new BaseItem(439).setUnlocalizedName("HellfireUpgrade").setCreativeTab(TabFalloutMisc);
	public static final Item upgradeWinterized = new BaseItem(440).setUnlocalizedName("WinterizedUpgrade").setCreativeTab(TabFalloutMisc);
	public static final Item nukaBottle = new BaseItem(441).setUnlocalizedName("NukaBottle").setCreativeTab(TabFalloutMisc);
	public static final Item abraxo = new BaseItem(442).setUnlocalizedName("Abraxo").setCreativeTab(TabFalloutMisc);
	public static final Item scrapMetal = new BaseItem(447).setUnlocalizedName("ScrapMetal").setCreativeTab(TabFalloutMisc);
	public static final Item homemadeFuel = new BaseItem(449).setUnlocalizedName("HomemadeFuel").setCreativeTab(TabFalloutAmmo);
	public static final Item leatherBelt = new BaseItem(451).setUnlocalizedName("LeatherBelt").setCreativeTab(TabFalloutMisc);
	public static final Item bottleCapMine = new ItemThrowingExplosive(452, 5, 6, 3, 3, "random.bow", "blfngl.44Reload", GUN).setUnlocalizedName("BottleCapMine").setCreativeTab(TabFalloutMisc);
	public static final Item grenadeFrag = new ItemThrowingExplosive(453, 5, 6, 3, 3, "random.bow", "blfngl.44Reload", GUN).setUnlocalizedName("FragGrenade").setCreativeTab(TabFalloutMisc);
	public static final Item lunchbox = new BaseItem(454).setUnlocalizedName("Lunchbox").setCreativeTab(TabFalloutMisc);
	public static final Item sensorModule = new BaseItem(455).setUnlocalizedName("SensorModule").setCreativeTab(TabFalloutMisc);
	public static final Item cherrybomb = new BaseItem(456).setUnlocalizedName("Cherrybomb").setCreativeTab(TabFalloutMisc);
	public static final Item nightstalkerBlood = new BaseItem(457).setUnlocalizedName("NightstalkerBlood").setCreativeTab(TabFalloutMisc);
	public static final Item jetInhaler = new BaseItem(458).setUnlocalizedName("JetInhaler").setCreativeTab(TabFalloutMisc);
	public static final Item wonderglue = new BaseItem(459).setUnlocalizedName("Wonderglue").setCreativeTab(TabFalloutMisc);
	public static final Item turpentine = new BaseItem(460).setUnlocalizedName("Turpentine").setCreativeTab(TabFalloutMisc);
	public static final Item geckoHide = new BaseItem(461).setUnlocalizedName("GeckoHide").setCreativeTab(TabFalloutMisc);

	//============================================Food and Chems==========================================================

	public static final Item Stimpak = new ItemStimpak(462).setUnlocalizedName("Stimpak").setCreativeTab(TabFalloutFood);
	public static final Item SuperStimpak = new ItemSuperStimpak(463).setUnlocalizedName("SuperStimpak").setCreativeTab(TabFalloutFood);
	public static final Item BCMAC = new BaseFood(464, 5, 0.3F, false).setUnlocalizedName("BCMAC").setCreativeTab(TabFalloutFood);
	public static final Item Cram = new BaseFood(465, 5, 0.3F, false).setUnlocalizedName("Cram").setCreativeTab(TabFalloutFood);
	public static final Item Instamash = new BaseFood(466, 5, 0.3F, false).setUnlocalizedName("Instamash").setCreativeTab(TabFalloutFood);
	public static final Item PorkBeans = new BaseFood(467, 5, 0.3F, false).setUnlocalizedName("PorkBeans").setCreativeTab(TabFalloutFood);
	public static final Item Salisbury = new BaseFood(468, 5, 0.3F, false).setUnlocalizedName("Salisbury").setCreativeTab(TabFalloutFood);
	public static final Item YumYum = new BaseFood(469, 5, 0.3F, false).setUnlocalizedName("YumYum").setCreativeTab(TabFalloutFood);
	public static final Item Psycho = new ItemPsycho(470).setUnlocalizedName("Psycho").setCreativeTab(TabFalloutFood);
	public static final Item MedEx = new ItemMedEx(471).setUnlocalizedName("MedEx").setCreativeTab(TabFalloutFood);
	public static final Item Slasher = new ItemSlasher(472).setUnlocalizedName("Slasher").setCreativeTab(TabFalloutFood);
	public static final Item Hydra = new ItemHydra(473).setUnlocalizedName("Hydra").setCreativeTab(TabFalloutFood);
	public static final Item NukaCola = new BaseFood(474, 7, 0.3F, false).setUnlocalizedName("NukaCola").setCreativeTab(TabFalloutFood);
	public static final Item HealingPowder = new ItemHealingPowder(475).setUnlocalizedName("HealingPowder").setCreativeTab(TabFalloutFood);
	public static final Item bBarrelCactus = new BaseFood(476, 8, 0.3F, false).setUnlocalizedName("bBarrelCactus").setCreativeTab(TabFalloutFood);
	public static final Item bBrocFlower = new BaseFood(477, 8, 0.3F, false).setUnlocalizedName("bBrocFlower").setCreativeTab(TabFalloutFood);
	public static final Item bXanderRoot = new ItembXanderRoot(478, 8, 0.3F, false).setUnlocalizedName("bXanderRoot").setCreativeTab(TabFalloutFood);
	public static final Item AntEgg = new BaseFood(479, 5, 0.3F, false).setUnlocalizedName("AntEgg").setCreativeTab(TabFalloutFood);
	public static final Item AntMeat = new BaseFood(480, 6, 0.3F, true).setUnlocalizedName("AntMeat").setCreativeTab(TabFalloutFood);
	public static final Item BighornerSteak = new BaseFood(481, 10, 0.3F, true).setUnlocalizedName("BighornerSteak").setCreativeTab(TabFalloutFood);
	public static final Item BloodSausage = new BaseFood(482, 16, 0.3F, true).setUnlocalizedName("BloodSausage").setCreativeTab(TabFalloutFood);
	public static final Item BlackBloodSausage = new BaseFood(483, 20, 0.3F, true).setUnlocalizedName("BlackBloodSausage").setCreativeTab(TabFalloutFood);
	public static final Item BighornerMeat = new BaseFood(484, 4, 0.3F, true).setUnlocalizedName("BighornerMeat").setCreativeTab(TabFalloutFood);
	public static final Item BrahminMeat = new BaseFood(485, 3, 0.3F, true).setUnlocalizedName("BrahminMeat").setCreativeTab(TabFalloutFood);
	public static final Item BrahminSteak = new BaseFood(486, 8, 0.3F, true).setUnlocalizedName("BrahminSteak").setCreativeTab(TabFalloutFood);
	public static final Item BrahminWellington = new BaseFood(487, 14, 0.3F, true).setUnlocalizedName("BrahminWellington").setCreativeTab(TabFalloutFood);
	public static final Item FireAntFricasse = new BaseFood(488, 12, 0.3F, false).setPotionEffect(Potion.fireResistance.id, 60, 0, 1F).setUnlocalizedName("FireAntFricasse").setCreativeTab(TabFalloutFood);
	public static final Item CaravanLunch = new BaseFood(489, 20, 0.3F, false).setUnlocalizedName("CaravanLunch").setCreativeTab(TabFalloutFood);
	public static final Item DandyApples = new BaseFood(490, 5, 0.3F, false).setUnlocalizedName("DandyApples").setCreativeTab(TabFalloutFood);
	public static final Item NightstalkerTail = new BaseFood(491, 6, 0.3F, false).setUnlocalizedName("NightstalkerTail").setCreativeTab(TabFalloutFood);
	public static final Item TrailMix = new BaseFood(492, 12, 0.3F, false).setUnlocalizedName("TrailMix").setCreativeTab(TabFalloutFood);
	public static final Item SugarBombs = new BaseFood(493, 8, 0.3F, false).setUnlocalizedName("SugarBombs").setCreativeTab(TabFalloutFood);
	public static final Item PotatoChips = new BaseFood(494, 5, 0.3F, false).setUnlocalizedName("PotatoChips").setCreativeTab(TabFalloutFood);
	public static final Item SunsetSass = new BaseDrink(495, 5, 0.3F, false).setUnlocalizedName("SunsetSass").setCreativeTab(TabFalloutFood);
	public static final Item bBananaYucca = new BaseFood(496, 6, 0.3F, false).setUnlocalizedName("bBananaYucca").setCreativeTab(TabFalloutFood);
	public static final Item bCaveFungus = new ItembCaveFungus(497, 6, 0.3F, false).setUnlocalizedName("bCaveFungus").setCreativeTab(TabFalloutFood);
	public static final Item bBuffaloGourd = new BaseFood(498, 4, 0.3F, false).setUnlocalizedName("bBuffaloGourd").setCreativeTab(TabFalloutFood);
	public static final Item bJalapeno = new BaseFood(499, 4, 0.3F, false).setUnlocalizedName("bJalapeno").setCreativeTab(TabFalloutFood);
	public static final Item Jet = new ItemJet(500).setUnlocalizedName("Jet").setCreativeTab(TabFalloutFood);
	public static final Item Rocket = new ItemRocket(501).setUnlocalizedName("Rocket").setCreativeTab(TabFalloutFood);
	public static final Item NukaQuartz = new ItemNukaQuartz(502, 1, false).setUnlocalizedName("NukaQuartz").setCreativeTab(TabFalloutFood);
	public static final Item NukaCold = new BaseDrink(503, 1, 0.3F, false).setUnlocalizedName("NukaCold").setCreativeTab(TabFalloutFood);
	public static final Item NukaVictory = new ItemNukaVictory(504, 1, false).setPotionEffect(Potion.digSpeed.id, 60, 0, 1F).setPotionEffect(Potion.moveSpeed.id, 60, 0, 1F).setUnlocalizedName("NukaVictory").setCreativeTab(TabFalloutFood);
	public static final Item WeaponBinding = new ItemWeaponBinding(505, 1, false).setUnlocalizedName("WeaponBinding").setCreativeTab(TabFalloutFood);
	public static final Item Vodka = new BaseDrink(506, 1, 0.3F, false).setPotionEffect(Potion.damageBoost.id, 60, 0, 1F).setPotionEffect(Potion.confusion.id, 60, 0, 1F).setPotionEffect(Potion.poison.id, 60, 0 , 1F).setUnlocalizedName("Vodka").setCreativeTab(TabFalloutFood);
	public static final Item StealthBoy = new ItemStealthBoy(507).setUnlocalizedName("StealthBoy").setCreativeTab(TabFalloutFood);
	public static final Item Turbo = new ItemTurbo(508).setUnlocalizedName("Turbo").setCreativeTab(TabFalloutFood);

	//============================================Armor==========================================================

	public static final Item T45Helm = new ArmorBaseT45(542, T45POWER, 1, 0).setUnlocalizedName("T45Helm").setCreativeTab(TabFalloutArmor);
	public static final Item T45Chest = new ArmorBaseT45(543, T45POWER, 1, 1).setUnlocalizedName("T45Chest").setCreativeTab(TabFalloutArmor);
	public static final Item T45Legs = new ArmorBaseT45(544, T45POWER, 1, 2).setUnlocalizedName("T45Legs").setCreativeTab(TabFalloutArmor);
	public static final Item T45Boots = new ArmorBaseT45(545, T45POWER, 1, 3).setUnlocalizedName("T45Boots").setCreativeTab(TabFalloutArmor);

	public static final Item T51Helm = new ArmorBaseT51(546, T51POWER, 1, 0).setUnlocalizedName("T51Helm").setCreativeTab(TabFalloutArmor);
	public static final Item T51Chest = new ArmorBaseT51(547, T51POWER, 1, 1).setUnlocalizedName("T51Chest").setCreativeTab(TabFalloutArmor);
	public static final Item T51Legs = new ArmorBaseT51(548, T51POWER, 1, 2).setUnlocalizedName("T51Legs").setCreativeTab(TabFalloutArmor);
	public static final Item T51Boots = new ArmorBaseT51(549, T51POWER, 1, 3).setUnlocalizedName("T51Boots").setCreativeTab(TabFalloutArmor);

	public static final Item G1Helm = new ArmorBaseGecko1(550, EnumArmorMaterial.CHAIN, 1, 0).setUnlocalizedName("G1Helm").setCreativeTab(TabFalloutArmor);
	public static final Item G1Chest = new ArmorBaseGecko1(551, EnumArmorMaterial.CHAIN, 1, 1).setUnlocalizedName("G1Chest").setCreativeTab(TabFalloutArmor);
	public static final Item G1Legs = new ArmorBaseGecko1(552, EnumArmorMaterial.CHAIN, 1, 2).setUnlocalizedName("G1Legs").setCreativeTab(TabFalloutArmor);
	public static final Item G1Boots = new ArmorBaseGecko1(553, EnumArmorMaterial.CHAIN, 1, 3).setUnlocalizedName("G1Boots").setCreativeTab(TabFalloutArmor);

	public static final Item HellHelm = new ArmorBaseHellfire(554, HELLFIRE, 1, 0).setUnlocalizedName("HellHelm").setCreativeTab(TabFalloutArmor);
	public static final Item HellChest = new ArmorBaseHellfire(555, HELLFIRE, 1, 1).setUnlocalizedName("HellChest").setCreativeTab(TabFalloutArmor);
	public static final Item HellLegs = new ArmorBaseHellfire(556, HELLFIRE, 1, 2).setUnlocalizedName("HellLegs").setCreativeTab(TabFalloutArmor);
	public static final Item HellBoots = new ArmorBaseHellfire(557, HELLFIRE, 1, 3).setUnlocalizedName("HellBoots").setCreativeTab(TabFalloutArmor);

	public static final Item WinterHelm = new ArmorBaseWinter(558, WINTER, 1, 0).setUnlocalizedName("WinterHelm").setCreativeTab(TabFalloutArmor);
	public static final Item WinterChest = new ArmorBaseWinter(559, WINTER, 1, 1).setUnlocalizedName("WinterChest").setCreativeTab(TabFalloutArmor);
	public static final Item WinterLegs = new ArmorBaseWinter(560, WINTER, 1, 2).setUnlocalizedName("WinterLegs").setCreativeTab(TabFalloutArmor);
	public static final Item WinterBoots = new ArmorBaseWinter(561, WINTER, 1, 3).setUnlocalizedName("WinterBoots").setCreativeTab(TabFalloutArmor);

	public static final Item EnclaveHelm = new ArmorBaseEnclave(562, ENCLAVE, 1, 0).setUnlocalizedName("EnclaveHelm").setCreativeTab(TabFalloutArmor);
	public static final Item EnclaveChest = new ArmorBaseEnclave(563, ENCLAVE, 1, 1).setUnlocalizedName("EnclaveChest").setCreativeTab(TabFalloutArmor);
	public static final Item EnclaveLegs = new ArmorBaseEnclave(564, ENCLAVE, 1, 2).setUnlocalizedName("EnclaveLegs").setCreativeTab(TabFalloutArmor);
	public static final Item EnclaveBoots = new ArmorBaseEnclave(565, ENCLAVE, 1, 3).setUnlocalizedName("EnclaveBoots").setCreativeTab(TabFalloutArmor);

	public static final BlockOre TungstenOre = (new BlockTungstenOre(170, 0, Material.rock));
	public static final BlockOre TechnetiumOre = (new BlockTechnetiumOre(171, 1, Material.rock));
	public static final BlockOre SaturniteOre = (new BlockSaturniteOre(172, 2, Material.rock));
	public static final BlockFlower BrocFlower = (BlockFlower) new BlockBrocFlower(174, 3).setUnlocalizedName("BrocFlower");
	public static final BlockOre BPGlass = (new BlockBPGlass(173, 4, Material.rock));
	public static final BlockFlower XanderRoot = (BlockFlower) new BlockXanderRoot(175 ,5).setUnlocalizedName("XanderRoot");
	public static final BlockOre UraniumOre = (new BlockUraniumOre(176,7, Material.rock));
	public static final BlockOre SiliconDeposit = (new BlockSiliconDeposit(177, 6, Material.rock));
	public static final BlockOre CarbonDeposit = (new BlockCarbonDeposit(178, 9, Material.rock));
	public static final BlockOre AsbestosDeposit = (new BlockAsbestosDeposit(179, 10, Material.rock));
	public static final BlockFlower BarrelCactus = (BlockFlower) new BlockBarrelCactus(180, 11).setUnlocalizedName("BarrelCactus");
	public static final BlockFlower BananaYucca = (BlockFlower) new BlockBananaYucca(181, 15).setUnlocalizedName("BananaYucca");
	public static final BlockFlower CaveFungus = (BlockFlower) new BlockCaveFungus(182, 29).setUnlocalizedName("CaveFungus");
	public static final BlockFlower BuffaloGourd = (BlockFlower) new BlockBuffaloGourd(183, 13).setUnlocalizedName("BuffaloGourd");
	public static final BlockFlower Jalapeno = (BlockFlower) new BlockJalapeno(184, 14).setUnlocalizedName("Jalapeno");
	//public static final Block benchReload = new BlockReloadBench(185).setCreativeTab(CreativeTabs.tabBlock);
	public static final BlockOre blockAlien = (BlockOre) new BlockAlien(185, 15, Material.rock).setUnlocalizedName("AlienBlock");
	public static final Block blockReload = new BlockReloadBench(186, Material.rock).setUnlocalizedName("Reload").setCreativeTab(CreativeTabs.tabBlock);

	public static final BiomeGenBase Wasteland = (new BiomeWasteland(100)).setColor(16421912).setBiomeName("Wasteland").setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.1F, 0.2F);

	public static final Item grip = new BaseItem(566).setUnlocalizedName("Grip").setCreativeTab(TabFalloutMisc);
	public static final Item barrel = new BaseItem(567).setUnlocalizedName("Barrel").setCreativeTab(TabFalloutMisc);
	public static final Item stockWood = new BaseItem(568).setUnlocalizedName("Stock").setCreativeTab(TabFalloutMisc);
	public static final Item crystalArray = new BaseItem(569).setUnlocalizedName("Magnifier").setCreativeTab(TabFalloutMisc);
	public static final Item hammer = new BaseItem(570).setUnlocalizedName("Hammer").setCreativeTab(TabFalloutMisc);
	public static final Item gasTank = new BaseItem(571).setUnlocalizedName("GasTank").setCreativeTab(TabFalloutMisc);

	public static final Item aGauge12 = new BaseItem(583).setUnlocalizedName("Gauge12").setCreativeTab(TabFalloutAmmo);
	public static final Item riflePlasma = new BaseGun(572, 7, 24, 2, 2, "blfngl.PlasmaRifleFire", "Blfngl.PlasmaRifleReload", cellMF, 370).setUnlocalizedName("PlasmaRifle").setCreativeTab(TabFalloutEnergy);
	public static final Item magRail = new BaseItem(573).setUnlocalizedName("MagRail").setCreativeTab(TabFalloutMisc);
	public static final Item a10mm = new BaseItem(575).setUnlocalizedName("10mmRound").setCreativeTab(TabFalloutAmmo);
	public static final Item pistol10mm = new BaseGun(574, 3, 12, 1, 1, "blfngl.10mmFire", "blfngl.10mmReload", a10mm, 395).setUnlocalizedName("10mmPistol").setCreativeTab(TabFalloutPistol);
	public static final Item shiskebabFlaming = new WeapFlamingShish(576).setUnlocalizedName("Shishkebabf").setCreativeTab(TabFalloutWeap);
	public static final Item rifleGauss = new BaseGun(577, 12, 1, 4, 3, "blfngl.GaussFire", "blfngl.GaussReload", cellMF, 395).setUnlocalizedName("GaussRifle").setCreativeTab(TabFalloutEnergy);
	public static final Item bubbleGum = new BaseFood(578, 1, 0.3F, false).setUnlocalizedName("BubbleGum").setCreativeTab(TabFalloutFood);
	public static final Item beer = new BaseDrink(579, 2, 0.3F, false).setUnlocalizedName("Beer").setCreativeTab(TabFalloutFood);
	public static final Item fiendStew = new BaseFood(580, 12, 0.3F, false).setUnlocalizedName("FiendStew").setCreativeTab(TabFalloutFood);
	public static final Item shotgunCombat = new BaseGun(581, 7, 12, 2, 2, "blfngl.ShotgunFire", "blfngl.ShotgunReload", aGauge12, 145).setUnlocalizedName("CombatShotgun").setCreativeTab(TabFalloutShotgun);
	public static final Item shotgunRiot = new BaseGun(582, 7, 12, 2, 1, "blfngl.HuntingShotgunFire", "blfngl.ShotgunReload", aGauge12, 870).setUnlocalizedName("RiotShotgun").setCreativeTab(TabFalloutShotgun);
	public static final Item powderRifle = new BaseItem(584).setUnlocalizedName("PowderRifle").setCreativeTab(TabFalloutMisc);
	public static final Item primerRifleL = new BaseItem(585).setUnlocalizedName("PrimerRifle").setCreativeTab(TabFalloutMisc);
	public static final Item lead = new BaseItem(586).setUnlocalizedName("Lead").setCreativeTab(TabFalloutMisc);
	public static final Item powderPistol = new BaseItem(587).setUnlocalizedName("PowderPistol").setCreativeTab(TabFalloutMisc);
	public static final Item primerPistolS = new BaseItem(588).setUnlocalizedName("PrimerPistol").setCreativeTab(TabFalloutMisc);

	public static final Item rifleTriBeam = new BaseGun(589, 10, 24, 2, 4, "blfngl.TriBeamFire", "Blfngl.TriBeamReload", cellMF, 245).setUnlocalizedName("TriBeamRifle").setCreativeTab(TabFalloutEnergy);
	public static final Item rifleMultiplas = new BaseGun(590, 13, 30, 3, 4, "blfngl.MultiplasFire", "Blfngl.PlasmaRifleReload", cellMF, 245).setUnlocalizedName("MultiplasRifle").setCreativeTab(TabFalloutEnergy);
	public static final Item rifleLAER = new BaseGun(591, 8, 20, 3, 2, "blfngl.PulseFire", "Blfngl.PlasmaRifleReload", cellMF, 370).setUnlocalizedName("LAER").setCreativeTab(TabFalloutEnergy);
	public static final Item rifleHolo = new BaseGun(592, 13, 4, 2, 3, "blfngl.HoloFire", "Blfngl.PlasmaRifleReload", cellMF, 495).setUnlocalizedName("Holorifle").setCreativeTab(TabFalloutEnergy);
	public static final Item minigun = new BaseGun(593, 3, 240, 4, 0.3, "blfngl.MinigunFire", "Blfngl.MinigunReload", a5mm, 5995).setUnlocalizedName("Minigun").setCreativeTab(TabFalloutHeavy);
	public static final Item cyberdog = new BaseGun(594, 3, 50, 4, 0.5, "blfngl.357Fire", "Blfngl.MinigunReload", a357, 2495).setUnlocalizedName("CyberdogGun").setCreativeTab(TabFalloutHeavy);
	public static final Item FIDO = new BaseGun(595, 4, 50, 4, 0.5, "blfngl.44Fire", "Blfngl.MinigunReload", a44, 2495).setUnlocalizedName("FIDO").setCreativeTab(TabFalloutHeavy);
	public static final Item plasmaCaster = new BaseGun(596, 14, 10, 3, 4, "blfngl.PlasmaCasterFire", "Blfngl.MinigunReload", cellMF, 395).setUnlocalizedName("PlasmaCaster").setCreativeTab(TabFalloutHeavy);
	public static final Item missileLauncher = new BaseGun(597, 14, 1, 4, 2, "blfngl.MissileFire", "Blfngl.MissileReload", aMissile, 245).setUnlocalizedName("MissileLauncher").setCreativeTab(TabFalloutHeavy);
	public static final Item redGlare = new BaseGun(598, 5, 13, 3, 2, "blfngl.RedGlareFire", "Blfngl.RedGlareReload", aRocket, 2245).setUnlocalizedName("RedGlare").setCreativeTab(TabFalloutHeavy);
	public static final Item pistol556 = new BaseGun(599, 5, 5, 2, 1, "blfngl.Pistol556Fire", "Blfngl.Pistol556Reload", a556, 870).setUnlocalizedName("556Pistol").setCreativeTab(TabFalloutPistol);
	public static final Item pistolThatGun = new BaseGun(600, 6, 7, 3, 1, "blfngl.Pistol556Fire", "Blfngl.Pistol556Reload", a556, 1120).setUnlocalizedName("ThatGun").setCreativeTab(TabFalloutPistol);
	public static final Item pistol127 = new BaseGun(601, 7, 7, 2, 1, "blfngl.44Fire", "Blfngl.9mmReload", a127, 395).setUnlocalizedName("127Pistol").setCreativeTab(TabFalloutPistol);
	public static final Item pistolLaser = new BaseGun(602, 4, 24, 3, 1, "blfngl.LaserPistolFire", "Blfngl.PlasmaRifleReload", cellEnergy, 995).setUnlocalizedName("LaserPistol").setCreativeTab(TabFalloutEnergy);
	public static final Item pistolDefender = new BaseGun(603, 6, 32, 2, 2, "blfngl.DefenderFire", "Blfngl.PlasmaPistolReload", cellEnergy, 495).setUnlocalizedName("PlasmaDefender").setCreativeTab(TabFalloutEnergy);
	public static final Item pistolPlasma = new BaseGun(604, 5, 32, 2, 1, "blfngl.PlasmaPistolFire", "Blfngl.PlasmaPistolReload", cellEnergy, 745).setUnlocalizedName("PlasmaPistol").setCreativeTab(TabFalloutEnergy);
	public static final Item teslaCannon = new BaseGun(605, 13, 5, 4, 3, "blfngl.TeslaFire", "Blfngl.TeslaReload", cellMF, 395).setUnlocalizedName("TeslaCannon").setCreativeTab(TabFalloutHeavy);
	public static final Item rifleRecharger = new BaseGun(606, 3, 7, 3, 2, "blfngl.RechargerFire", "Blfngl.PlasmaRifleReload", a556, 370).setUnlocalizedName("RechargerRifle").setCreativeTab(TabFalloutEnergy);
	public static final Item pistolRecharger = new BaseGun(607, 4, 20, 3, 1, "blfngl.RechargerFire", "Blfngl.PlasmaRifleReload", a556, 1495).setUnlocalizedName("RechargerPistol").setCreativeTab(TabFalloutEnergy);

	public static final Item shotgunHunting = new BaseGun(613, 13, 7, 3, 4, "blfngl.HuntingShotgunFire", "Blfngl.HuntingShotgunReload", aGauge12, 995).setUnlocalizedName("HuntingShotgun").setCreativeTab(TabFalloutShotgun);
	public static final Item shotgunDinnerBell = new BaseGun(614, 13, 7, 3, 4, "blfngl.HuntingShotgunFire", "Blfngl.HuntingShotgunReload", aGauge12, 745).setUnlocalizedName("DinnerBell").setCreativeTab(TabFalloutShotgun);
	public static final Item pistol9mm = new BaseGun(615, 2, 13, 3, 1, "blfngl.9mmFire", "Blfngl.9mmReload", a9mm, 745).setUnlocalizedName("9mmPistol").setCreativeTab(TabFalloutPistol);
	public static final Item pistolAlienBlaster = new BaseGun(616, 13, 10, 2, 1, "blfngl.AlienBlasterFire", "Blfngl.AlienBlasterReload", aAlien, 2495).setUnlocalizedName("AlienBlaster").setCreativeTab(TabFalloutPistol);
	public static final Item rifleHunting = new BaseGun(617, 6, 24, 3, 3, "blfngl.HuntingRifleFire", "Blfngl.HuntingRifleReload", a308, 1495).setUnlocalizedName("HuntingRifle").setCreativeTab(TabFalloutRifle);
	public static final Item pistolLucky = new BaseGun(620, 6, 6, 1, 2, "blfngl.357Fire", "Blfngl.357Reload", a357, 1120).setUnlocalizedName("Lucky").setCreativeTab(TabFalloutPistol);
	public static final Item pistol45Auto = new BaseGun(621, 5, 7, 2, 1, "blfngl.45Fire", "Blfngl.9mmReload", a45Auto, 745).setUnlocalizedName("45AutoPistol").setCreativeTab(TabFalloutPistol);
	public static final Item pistolLightDarkness = new BaseGun(622, 7, 7, 2, 1, "blfngl.45Fire", "Blfngl.9mmReload", a45Auto, 1245).setUnlocalizedName("LightDarkness").setCreativeTab(TabFalloutPistol);
	public static final Item pistolMaria = new BaseGun(623, 5, 13, 2, 2, "blfngl.9mmFire", "Blfngl.9mmReload", a9mm, 995).setUnlocalizedName("Maria").setCreativeTab(TabFalloutPistol);
	public static final Item pistolHuntingRevolver = new BaseGun(624, 8, 5, 3, 3, "blfngl.HuntingFire", "Blfngl.HuntingReload", aGovt, 545).setUnlocalizedName("HuntingRevolver").setCreativeTab(TabFalloutPistol);
	public static final Item pistolRangerSequoia = new BaseGun(625, 10, 5, 3, 3, "blfngl.RangerSequoiaFire", "Blfngl.HuntingReload", aGovt, 395).setUnlocalizedName("RangerSequoia").setCreativeTab(TabFalloutPistol);
	public static final Item pistolPolice = new BaseGun(626, 6, 6, 3, 2, "blfngl.357Fire", "Blfngl.357Reload", a357, 1120).setUnlocalizedName("PolicePistol").setCreativeTab(TabFalloutPistol);

	public static final Item rifleAutomatic = new BaseGun(627, 8, 20, 3, 0.5, "blfngl.AutomaticRifleFire", "Blfngl.PlasmaRifleReload", a308, 995).setUnlocalizedName("AutomaticRifle").setCreativeTab(TabFalloutRifle);
	public static final Item rifleBattle = new BaseGun(628, 6, 8, 2, 3, "blfngl.BattleRifleFire", "Blfngl.BattleRifleReload", a308, 1495).setUnlocalizedName("BattleRifle").setCreativeTab(TabFalloutRifle);
	public static final Item rifleThisMachine = new BaseGun(629, 7, 8, 2, 3, "blfngl.BattleRifleFire", "Blfngl.BattleRifleReload", a308, 2995).setUnlocalizedName("ThisMachine").setCreativeTab(TabFalloutRifle);
	public static final Item rifleBBGun = new BaseGun(630, 1, 100, 3, 1, "blfngl.BBGunFire", "Blfngl.BBGunReload", aBB, 245).setUnlocalizedName("BBGun").setCreativeTab(TabFalloutRifle);
	public static final Item rifleAbileneKid = new BaseGun(631, 2, 100, 3, 1, "blfngl.BBGunFire", "Blfngl.BBGunReload", aBB, 495).setUnlocalizedName("ABBGun").setCreativeTab(TabFalloutRifle);
	public static final Item rifleBrushGun = new BaseGun(632, 8, 6, 3, 2, "blfngl.BrushGunFire", "Blfngl.RepeaterReload", a308, 745).setUnlocalizedName("BrushGun").setCreativeTab(TabFalloutRifle);
	public static final Item rifleMedicineStick = new BaseGun(633, 9, 6, 3, 2, "blfngl.BrushGunFire", "Blfngl.RepeaterReload", aGovt, 995).setUnlocalizedName("MedicineStick").setCreativeTab(TabFalloutRifle);
	public static final Item rifleCowboyRepeater = new BaseGun(634, 4, 7, 3, 2, "blfngl.CowboyRepeaterFire", "Blfngl.RepeaterReload", a357, 595).setUnlocalizedName("CowboyRepeater").setCreativeTab(TabFalloutRifle);
	public static final Item rifleLongueCarabine = new BaseGun(635, 5, 11, 3, 2, "blfngl.BrushGunFire", "Blfngl.RepeaterReload", a357, 745).setUnlocalizedName("LongueCarabine").setCreativeTab(TabFalloutRifle);
	public static final Item riflePaciencia = new BaseGun(636, 7, 3, 3, 2, "blfngl.HuntingRifleFire", "Blfngl.HuntingRifleReload", a308, 1745).setUnlocalizedName("Paciencia").setCreativeTab(TabFalloutRifle);
	public static final Item stockMetal = new BaseItem(641).setUnlocalizedName("MetalStock").setCreativeTab(TabFalloutMisc);

	public static final Item pipboy = new ItemPipboy(642).setUnlocalizedName("Pipboy").setCreativeTab(TabFalloutMisc);
	public static final Item rifleAntiMateriel = new BaseGun(643, 20, 8, 2.5, 4, "blfngl.MaterielFire", "Blfngl.MaterielReload", a50MG, 470).setUnlocalizedName("AntiMaterielRifle").setCreativeTab(TabFalloutRifle);
	public static final Item rifleAssaultCarbine = new BaseGun(645, 6, 24, 2, 0.5, "blfngl.AssaultFire", "Blfngl.AssaultReload", a5mm, 3745).setUnlocalizedName("AssaultCarbine").setCreativeTab(TabFalloutRifle);
	public static final Item rifleLMG = new BaseGun(646, 6, 90, 2.2, 0.5, "blfngl.LMGFire", "Blfngl.LMGReload", a556, 3995).setUnlocalizedName("LMG").setCreativeTab(TabFalloutRifle);
	public static final Item rifleBozar = new BaseGun(647, 7, 30, 2.2, 0.5, "blfngl.LMGFire", "Blfngl.LMGReload", a556, 3995).setFull3D().setUnlocalizedName("Bozar").setCreativeTab(TabFalloutRifle);
	public static final Item rifleMarksmanCarbine = new BaseGun(648, 7, 20, 2.5, 1, "blfngl.MarksmanFire", "Blfngl.MarksmanReload", a556, 1995).setUnlocalizedName("MarksmanCarbine").setCreativeTab(TabFalloutRifle);
	public static final Item rifleAllAmerican = new BaseGun(649, 8, 24, 2.5, 1, "blfngl.MarksmanFire", "Blfngl.MarksmanReload", a556, 1995).setUnlocalizedName("AllAmerican").setCreativeTab(TabFalloutRifle);
	public static final Item rifleService = new BaseGun(650, 3, 20, 2, 0.7, "blfngl.AutomaticRifleFire", "Blfngl.MarksmanReload", a556, 1995).setUnlocalizedName("ServiceRifle").setCreativeTab(TabFalloutRifle);
	public static final Item rifleSurvival = new BaseGun(651, 7, 10, 2, 0.7, "blfngl.AutomaticRifleFire", "Blfngl.MarksmanReload", a127, 2495).setUnlocalizedName("SurvivalistsRifle").setCreativeTab(TabFalloutRifle);
	public static final Item rifleChristine = new BaseGun(652, 15, 5, 2, 3, "blfngl.ChristineFire", "Blfngl.ChristineReload", a308, 420).setUnlocalizedName("ChristinesRifle").setCreativeTab(TabFalloutRifle);
	public static final Item rifleGobi = new BaseGun(653, 14, 6, 2, 3, "blfngl.SniperFire", "Blfngl.SniperReload", a308, 795).setUnlocalizedName("GobiRifle").setCreativeTab(TabFalloutRifle);
	public static final Item rifleTrailCarbine = new BaseGun(654, 10, 8, 2, 2, "blfngl.TrailCarbineFire", "Blfngl.RepeaterReload", a44, 2495).setUnlocalizedName("TrailCarbine").setCreativeTab(TabFalloutRifle);
	public static final Item rifleVarmint = new BaseGun(655, 3, 5, 2.2, 2, "blfngl.VarmintRifleFire", "Blfngl.PlasmaRifleReload", a556, 595).setUnlocalizedName("VarmintRifle").setCreativeTab(TabFalloutRifle);
	public static final Item rifleRatslayer = new BaseGun(656, 5, 5, 2.2, 2, "blfngl.RatslayerFire", "Blfngl.PlasmaRifleReload", a556, 995).setUnlocalizedName("Ratslayer").setCreativeTab(TabFalloutRifle);

	public static final Item smg45Auto = new BaseGun(657, 6, 30, 2.2, 0.5, "blfngl.45Fire", "Blfngl.AssaultReload", a45Auto, 2995).setUnlocalizedName("45AutoSub").setCreativeTab(TabFalloutSMG);
	public static final Item smg9mm = new BaseGun(658, 2, 30, 2.7, 0.5, "blfngl.9mmFire", "Blfngl.9mmReload", a9mm, 2745).setUnlocalizedName("9mmSub").setCreativeTab(TabFalloutSMG);
	public static final Item smgVance = new BaseGun(659, 4, 60, 2.2, 0.5, "blfngl.9mmFire", "Blfngl.9mmReload", a9mm, 3745).setUnlocalizedName("VancesSub").setCreativeTab(TabFalloutSMG);
	public static final Item smg10mm = new BaseGun(660, 3, 30, 2.7, 0.5, "blfngl.10mmFire", "Blfngl.10mmReload", a10mm, 2495).setUnlocalizedName("10mmSub").setCreativeTab(TabFalloutSMG);
	public static final Item smgSleepytyme = new BaseGun(661, 5, 40, 2.7, 0.5, "blfngl.SleepytymeFire", "Blfngl.10mmReload", a10mm, 2495).setUnlocalizedName("Sleepytyme").setCreativeTab(TabFalloutSMG);
	public static final Item smg127 = new BaseGun(662, 8, 21, 2, 0.5, "blfngl.357Fire", "Blfngl.127SmgReload", a127, 2495).setUnlocalizedName("127Sub").setCreativeTab(TabFalloutSMG);
	public static final Item smgNailGun = new BaseGun(663, 2, 90, 2.7, 0.3, "blfngl.NailgunFire", "Blfngl.9mmReload", aNail, 2745).setUnlocalizedName("NailGun").setCreativeTab(TabFalloutSMG);
	public static final Item smg22 = new BaseGun(664, 1, 180, 2.3, 0.5, "blfngl.Silenced22Fire", "Blfngl.10mmReload", a22LR, 4995).setUnlocalizedName("22Sub").setCreativeTab(TabFalloutSMG);
	public static final Item CZ57 = new BaseGun(666, 5, 120, 4, 0.3, "blfngl.MinigunFire", "Blfngl.MinigunReload", a5mm, 7995).setUnlocalizedName("CZ57").setCreativeTab(TabFalloutHeavy);
	public static final Item pistolWeathered10mm = new BaseGun(667, 5, 12, 1.3, 1, "blfngl.10mmFire", "Blfngl.10mmReload", a10mm, 545).setUnlocalizedName("Weathered10mm").setCreativeTab(TabFalloutPistol);

	//KEY: ID, damage, clip size, reload time, fire time, fire sound, reload sound
	public static final Item shotgunCaravan = new BaseGun(668, 5, 2, 1.5, 1, "blfngl.CaravanShotgunFire", "Blfngl.CaravanShotgunReload", aGauge20, 695).setUnlocalizedName("CaravanShotgun").setCreativeTab(TabFalloutShotgun);
	public static final Item shotgunSturdyCaravan = new BaseGun(669, 7, 2, 1.5, 1, "blfngl.CaravanShotgunFire", "Blfngl.CaravanShotgunReload", aGauge20, 1495).setUnlocalizedName("SturdyCaravanShotgun").setCreativeTab(TabFalloutShotgun);
	public static final Item shotgunLever = new BaseGun(670, 6, 5, 2.5, 2, "blfngl.LeverShotgunFire", "Blfngl.LeverShotgunReload", aGauge20, 495).setUnlocalizedName("LeverActionShotgun").setCreativeTab(TabFalloutShotgun);
	public static final Item shotgunSawed = new BaseGun(671, 8, 2, 3.1, 0.1, "blfngl.SawedOffFire", "Blfngl.LeverShotgunReload", aGauge12, 395).setUnlocalizedName("SawedOffShotgun").setCreativeTab(TabFalloutShotgun);
	public static final Item shotgunBigBoomer = new BaseGun(672, 10, 2, 3.1, 0.1, "blfngl.SawedOffFire", "Blfngl.LeverShotgunReload", aGauge12, 395).setUnlocalizedName("BigBoomer").setCreativeTab(TabFalloutShotgun);
	public static final Item shotgunSingle = new BaseGun(673, 4, 1, 2, 2, "blfngl.LeverShotgunFire", "Blfngl.LeverShotgunReload", aGauge20, 995).setUnlocalizedName("SingleShotgun").setCreativeTab(TabFalloutShotgun);

	public static final Item rifleChineseAssault = new BaseGun(675, 4, 24, 2.2, 0.5, "blfngl.ChineseAssaultFire", "Blfngl.ChineseAssaultReload", a556, 1212).setUnlocalizedName("ChineseAssaultRifle").setCreativeTab(TabFalloutRifle);
	public static final Item pistolFlareGun = new BaseGun(676, 1, 1, 2.3, 2, "blfngl.FlareGunFire", "Blfngl.FlareGunReload", homemadeFuel, 245).setUnlocalizedName("FlareGun").setCreativeTab(TabFalloutPistol);
	public static final Item pistolPewPew = new BaseGun(677, 6, 2, 3, 1, "blfngl.LaserFire", "Blfngl.LaserPistolReload", cellEnergy, 395).setUnlocalizedName("PewPew").setCreativeTab(TabFalloutEnergy);
	public static final Item pistolPulseGun = new BaseGun(678, 3, 5, 2, 3, "blfngl.PulseFire", "Blfngl.PulseGunReload", cellEnergy, 495).setUnlocalizedName("PulseGun").setCreativeTab(TabFalloutEnergy);
	public static final Item pistolHyperbreederAlpha = new BaseGun(679, 4, 10, 3, 1, "blfngl.RechargerFire", "Blfngl.LeverShotgunReload", aGauge20, 3995).setUnlocalizedName("HyperbreederAlpha").setCreativeTab(TabFalloutEnergy);
	public static final Item pistolSonicEmitter = new BaseGun(680, 4, 24, 2, 2, "blfngl.PulseFire", "Blfngl.PulseGunReload", cellEnergy, 3500).setUnlocalizedName("SonicEmitter").setCreativeTab(TabFalloutEnergy);

	public static final Item fixer = new ItemFixer(681).setUnlocalizedName("Fixer").setCreativeTab(TabFalloutFood);

	public static final Item rifleYCS186 = new BaseGun(682, 14, 1, 2.3, 2.5, "blfngl.GaussFire", "Blfngl.GaussReload", cellMF, 495).setUnlocalizedName("YCS186").setCreativeTab(TabFalloutEnergy);
	public static final Item rifleAdvancedLAER = new BaseGun(683, 10, 15, 3, 1.5, "blfngl.PulseFire", "Blfngl.PlasmaRifleReload", cellMF, 245).setUnlocalizedName("AdvancedLAER").setCreativeTab(TabFalloutEnergy);
	public static final Item rifleAER14 = new BaseGun(684, 10, 12, 2.5, 1, "blfngl.LaserFire", "Blfngl.LaserReload", cellMF, 495).setUnlocalizedName("AER14").setCreativeTab(TabFalloutEnergy);

	public static final Item mod357LongBarrel = new BaseItem(685).setUnlocalizedName("357LongBarrel").setCreativeTab(TabFalloutParts);
	public static final Item mod357HDCylinder = new BaseItem(686).setUnlocalizedName("357HDCylinder").setCreativeTab(TabFalloutParts);
	public static final Item mod45APHDSlide = new BaseItem(688).setUnlocalizedName("45APHDSlide").setCreativeTab(TabFalloutParts);
	public static final Item mod45APSilencer = new BaseItem(689).setUnlocalizedName("45APSilencer").setCreativeTab(TabFalloutParts);
	public static final Item mod9mmPistolExtMag = new BaseItem(690).setUnlocalizedName("9mmPistolExtMag").setCreativeTab(TabFalloutParts);
	public static final Item mod10mmPistolExtenderMags = new BaseItem(691).setUnlocalizedName("10mmPistolExtMag").setCreativeTab(TabFalloutParts);
	public static final Item mod10mmPistolSilencer = new BaseItem(692).setUnlocalizedName("10mmPistolSilencer").setCreativeTab(TabFalloutParts);
	public static final Item mod127mmPistolSilencer = new BaseItem(693).setUnlocalizedName("127mmPistolsilencer").setCreativeTab(TabFalloutParts);
	public static final Item modHuntingRevolver6Shot = new BaseItem(694).setUnlocalizedName("HuntingRevolver6Shot").setCreativeTab(TabFalloutParts);

	public static final Item modAntiMaterielSupressor = new BaseItem(696).setUnlocalizedName("AntiMatSupressor").setCreativeTab(TabFalloutParts);
	public static final Item modAntiMaterielCustomBolt = new BaseItem(697).setUnlocalizedName("AntiMatBolt").setCreativeTab(TabFalloutParts);
	public static final Item modAssaultCarbineExtendedMags = new BaseItem(698).setUnlocalizedName("AssaultCarbineExtMag").setCreativeTab(TabFalloutParts);
	public static final Item modAssaultCarbineForgedReceiver = new BaseItem(699).setUnlocalizedName("AssaultCarbineReceiver").setCreativeTab(TabFalloutParts);
	public static final Item modAssaultCarbineLightBolt = new BaseItem(700).setUnlocalizedName("AssaultCarbineBolt").setCreativeTab(TabFalloutParts);
	public static final Item modAutomaticRifleInternals = new BaseItem(701).setUnlocalizedName("AutoRifleInt").setCreativeTab(TabFalloutParts);
	public static final Item modBrushGunForgedReceiver = new BaseItem(702).setUnlocalizedName("BrushGunReceiver").setCreativeTab(TabFalloutParts);
	public static final Item modCowboyRepeaterCustomAction = new BaseItem(703).setUnlocalizedName("CowboyAction").setCreativeTab(TabFalloutParts);
	public static final Item modCowboyRepeaterLongTube = new BaseItem(704).setUnlocalizedName("CowboyTube").setCreativeTab(TabFalloutParts);
	public static final Item modHuntingRifleExtendedMag = new BaseItem(705).setUnlocalizedName("HuntingRifleExtMag").setCreativeTab(TabFalloutParts);
	public static final Item modHuntingRifleCustomAction = new BaseItem(706).setUnlocalizedName("HuntingRifleAction").setCreativeTab(TabFalloutParts);
	public static final Item modLMGExpandedDrums = new BaseItem(707).setUnlocalizedName("LMGExpDrum").setCreativeTab(TabFalloutParts);
	public static final Item modServiceRifleForgedReceiver = new BaseItem(708).setUnlocalizedName("ServiceReceiver").setCreativeTab(TabFalloutParts);
	public static final Item modServiceRifleCustomSprings = new BaseItem(709).setUnlocalizedName("ServiceSprings").setCreativeTab(TabFalloutParts);
	public static final Item modSniperSupressor = new BaseItem(710).setUnlocalizedName("SniperSupressor").setCreativeTab(TabFalloutParts);
	//Id 711 is free
	public static final Item modVarmintNightScope = new BaseItem(712).setUnlocalizedName("VarmintScope").setCreativeTab(TabFalloutParts);
	public static final Item modVarmintExtendedMags = new BaseItem(713).setUnlocalizedName("VarmintExtMag").setCreativeTab(TabFalloutParts);
	public static final Item modVarmintSilencer = new BaseItem(714).setUnlocalizedName("VarmintSilencer").setCreativeTab(TabFalloutParts);

	public static final Item superconductor = new BaseItem(715).setUnlocalizedName("Superconductor").setCreativeTab(TabFalloutMisc);
	public static final Item plasmaChamber = new BaseItem(716).setUnlocalizedName("PlasmaChamber").setCreativeTab(TabFalloutMisc);
	public static final Item electromagnet = new BaseItem(717).setUnlocalizedName("Electromagnet").setCreativeTab(TabFalloutMisc);
	public static final Item magnetClaws = new BaseItem(718).setUnlocalizedName("MagnetClaws").setCreativeTab(TabFalloutMisc);
	public static final Item particleDiverter = new BaseItem(719).setUnlocalizedName("ParticleDiverter").setCreativeTab(TabFalloutMisc);
	public static final Item carbonFiberHousing = new BaseItem(720).setUnlocalizedName("CFHousing").setCreativeTab(TabFalloutMisc);
	public static final Item energyRifleBarrel = new BaseItem(721).setUnlocalizedName("ERBarrel").setCreativeTab(TabFalloutMisc);
	public static final Item drum = new BaseItem(722).setUnlocalizedName("Drum").setCreativeTab(TabFalloutMisc);
	public static final Item cylinder = new BaseItem(723).setUnlocalizedName("Cylinder").setCreativeTab(TabFalloutMisc);

	public static BlockPortalActivator blockPortalActivator = (BlockPortalActivator) new BlockPortalActivator(2008).setUnlocalizedName("BlockPortalActivator");
	public static BlockWastelandPortal portalWateland = (BlockWastelandPortal) new BlockWastelandPortal(2009).setUnlocalizedName("WastelandPortal");
	public static Item itemPortalActivator = new ItemPortalActivator(724).setUnlocalizedName("PortalActivator");

	//ID, damage, clip size, reloadtick, firemax, firesound, reloadsound, ammo, gun health
	public static final Item pistol32 = new BaseGun(725, 2, 5, 2.3, 2.5, "blfngl.32Fire", "Blfngl.32Reload", a32, 556).setUnlocalizedName("32Pistol").setCreativeTab(TabFalloutPistol);
	public static final Item pistolSilenced10mm = new BaseGun(726, 4, 12, 1.3, 1, "blfngl.Silenced10mmFire", "Blfngl.10mmReload", a10mm, 333).setUnlocalizedName("Silenced10mmPistol").setCreativeTab(TabFalloutPistol);
	public static final Item pistolChinese = new BaseGun(727, 3, 10, 2.5, 1, "blfngl.ChinesePistolFire", "Blfngl.10mmReload", a10mm, 1250).setUnlocalizedName("ChinesePistol").setCreativeTab(TabFalloutPistol);
	public static final Item pistolColonelAutumn10mm = new BaseGun(729, 5, 12, 1, 1, "blfngl.10mmFire", "Blfngl.10mmReload", a10mm, 577).setUnlocalizedName("CA10mmPistol").setCreativeTab(TabFalloutPistol);
	public static final Item pistolZhuRong = new BaseGun(730, 4, 10, 2.3, 2.5, "blfngl.ChinesePistolFire", "Blfngl.10mmReload", a10mm, 1667).setUnlocalizedName("ZhuRong").setCreativeTab(TabFalloutPistol);
	public static final Item pistolDartGun = new BaseGun(732, 3, 1, 2.3, 2.5, "blfngl.DartGunFire", "Blfngl.DartGunReload", aDart, 883).setUnlocalizedName("DartGun").setCreativeTab(TabFalloutPistol);
	public static final Item pistolScoped44 = new BaseGun(733, 5, 6, 3, 3, "blfngl.44Fire", "Blfngl.44Reload", a44, 229).setUnlocalizedName("Scoped44").setCreativeTab(TabFalloutPistol);
	public static final Item pistolBlackhawk = new BaseGun(734, 8, 6, 3, 3, "blfngl.44Fire", "Blfngl.44Reload", a44, 218).setUnlocalizedName("Blackhawk").setCreativeTab(TabFalloutPistol);
	public static final Item pistolCallahans = new BaseGun(735, 10, 6, 3, 3, "blfngl.44Fire", "Blfngl.44Reload", a44, 205).setUnlocalizedName("Callahans").setCreativeTab(TabFalloutPistol);
	public static final Item pistolPaulsons = new BaseGun(736, 7, 6, 3, 3, "blfngl.44Fire", "Blfngl.44Reload", a44, 178).setUnlocalizedName("Paulsons").setCreativeTab(TabFalloutPistol);

	public static final Item railwaySpikes = new BaseItem(737).setUnlocalizedName("RailwaySpikes").setCreativeTab(TabFalloutAmmo);
	public static final Item rifleOlPainless = new BaseGun(738, 9, 5, 2, 3, "blfngl.HuntingRifleFire", "Blfngl.HuntingRifleReload", a32, 556).setUnlocalizedName("OlPainless").setCreativeTab(TabFalloutRifle);
	public static final Item rifleLeverAction = new BaseGun(739, 7, 10, 3.3, 3, "blfngl.44Fire", "Blfngl.44Reload", a44, 200).setUnlocalizedName("LeverActionRifle").setCreativeTab(TabFalloutRifle);
	public static final Item rifleBackwater = new BaseGun(740, 8, 10, 3.3, 3, "blfngl.44Fire", "Blfngl.44Reload", a44, 519).setUnlocalizedName("Backwater").setCreativeTab(TabFalloutRifle);
	public static final Item rifleLincoln = new BaseGun(741, 12, 15, 3.3, 3, "blfngl.LincolnFire", "Blfngl.LincolnReload", a44, 400).setUnlocalizedName("LincolnRepeater").setCreativeTab(TabFalloutRifle);
	public static final Item rifleRailway = new BaseGun(742, 8, 8, 2.7, 3, "blfngl.RailwayFire", "Blfngl.RailwayReload", railwaySpikes, 224).setUnlocalizedName("RailwayRifle").setCreativeTab(TabFalloutRifle);
	public static final Item rifleXuanlong = new BaseGun(743, 7, 36, 2.2, 0.5, "blfngl.ChineseAssaultFire", "Blfngl.ChineseAssaultReload", a556, 1111).setUnlocalizedName("Xuanlong").setCreativeTab(TabFalloutRifle);
	public static final Item rifleInfiltrator = new BaseGun(744, 4, 24, 2, 0.5, "blfngl.InfiltratorFire", "Blfngl.InfiltratorReload", a556, 1429).setUnlocalizedName("Infiltrator").setCreativeTab(TabFalloutRifle);
	public static final Item riflePerforator = new BaseGun(745, 6, 24, 2, 0.5, "blfngl.InfiltratorFire", "Blfngl.InfiltratorReload", a556, 1000).setUnlocalizedName("Perforator").setCreativeTab(TabFalloutRifle);

	public static final Item minigunBarrel = new BaseItem(746).setUnlocalizedName("MinigunBarrel").setCreativeTab(TabFalloutMisc);
	public static final Item minigunFiringMechanism = new BaseItem(747).setUnlocalizedName("MiningunFiringMechanism").setCreativeTab(TabFalloutMisc);
	public static final Item dogBrain = new BaseItem(748).setUnlocalizedName("DogBrain").setCreativeTab(TabFalloutMisc);

	public static final Item shotgunKneecapper = new BaseGun(749, 12, 2, 3.1, 0.1, "blfngl.SawedOffFire", "Blfngl.LeverShotgunReload", aGauge12, 111).setUnlocalizedName("Kneecapper").setCreativeTab(TabFalloutShotgun);

	public static final Item case45Auto = new BaseItem(750).setUnlocalizedName("45AutoCase").setCreativeTab(TabFalloutMisc);
	public static final Item case9mm = new BaseItem(751).setUnlocalizedName("9mmCase").setCreativeTab(TabFalloutMisc);
	public static final Item case10mm = new BaseItem(752).setUnlocalizedName("10mmCase").setCreativeTab(TabFalloutMisc);
	public static final Item case357 = new BaseItem(753).setUnlocalizedName("357Case").setCreativeTab(TabFalloutMisc);
	public static final Item case44 = new BaseItem(754).setUnlocalizedName("44Case").setCreativeTab(TabFalloutMisc);
	public static final Item case308 = new BaseItem(755).setUnlocalizedName("308Case").setCreativeTab(TabFalloutMisc);
	public static final Item caseGovt = new BaseItem(756).setUnlocalizedName("GovtCase").setCreativeTab(TabFalloutMisc);
	public static final Item case50MG = new BaseItem(757).setUnlocalizedName("50MGCase").setCreativeTab(TabFalloutMisc);
	public static final Item case22LR = new BaseItem(758).setUnlocalizedName("22LRCase").setCreativeTab(TabFalloutMisc);
	public static final Item primerPistolL = new BaseItem(759).setUnlocalizedName("PistolPrimerL").setCreativeTab(TabFalloutMisc);

	public static final Item shotgunDoubleBarrel = new BaseGun(760, 15, 2, 2, 0.1, "blfngl.DoubleBarrelFire", "Blfngl.DoubleBarrelReload", aGauge12, 118).setUnlocalizedName("DoubleBarrelShotgun").setCreativeTab(TabFalloutShotgun);
	public static final Item smgUltra10mm = new BaseGun(761, 6, 30, 2.7, 0.5, "blfngl.10mmFire", "Blfngl.10mmReload", a10mm, 2495).setUnlocalizedName("Ultra10mmSub").setCreativeTab(TabFalloutSMG);

	public static final Item primer50MG = new BaseItem(762).setUnlocalizedName("50MGPrimer").setCreativeTab(TabFalloutMisc);
	public static final Item case5mm = new BaseItem(763).setUnlocalizedName("5mmCase").setCreativeTab(TabFalloutMisc);
	public static final Item primerRifleS = new BaseItem(764).setUnlocalizedName("RiflePrimerS").setCreativeTab(TabFalloutMisc);
	public static final Item case556 = new BaseItem(765).setUnlocalizedName("556Case").setCreativeTab(TabFalloutMisc);
	public static final Item case127 = new BaseItem(766).setUnlocalizedName("127Case").setCreativeTab(TabFalloutMisc);
	public static final Item hull12 = new BaseItem(767).setUnlocalizedName("12Hull").setCreativeTab(TabFalloutMisc);
	public static final Item hull20 = new BaseItem(768).setUnlocalizedName("20Hull").setCreativeTab(TabFalloutMisc);
	public static final Item primerShotgun = new BaseItem(769).setUnlocalizedName("ShotgunPrimer").setCreativeTab(TabFalloutMisc);
	public static final Item cellMFD = new BaseItem(770).setUnlocalizedName("DrainedMF").setCreativeTab(TabFalloutMisc);
	public static final Item cellECPD = new BaseItem(771).setUnlocalizedName("DrainedECP").setCreativeTab(TabFalloutMisc);
	public static final Item cellED = new BaseItem(772).setUnlocalizedName("DrainedE").setCreativeTab(TabFalloutMisc);

	public static final Item rifleAssault = new BaseGun(773, 4, 30, 2.7, 0.5, "blfngl.ChineseAssaultFire", "Blfngl.ChineseAssaultReload", a556, 2495).setUnlocalizedName("AssaultRifle").setCreativeTab(TabFalloutRifle);
	public static final Item explosiveThumpThump = new GunExplosive(774, 4, 30, 2.7, 2.0, "blfngl.ChineseAssaultFire", "Blfngl.ChineseAssaultReload", a556, 2495).setUnlocalizedName("ThumpThump").setCreativeTab(TabFalloutRifle);

	public static final Item perkLaserCommander = new ItemPerk(775).setUnlocalizedName("diamond");
	public static final Item perkNightFriend = new ItemPerk(776).setUnlocalizedName("coal");
	public static final Item perkBloodyMess = new ItemPerk(777).setUnlocalizedName("gold");
	public static final Item perkToughness = new ItemPerk(778).setUnlocalizedName("stick");
	public static final Item perkSolarPowered = new ItemPerk(779).setUnlocalizedName("lol");
	public static final Item perkVigilantRecycle = new ItemPerk(780).setUnlocalizedName("dddD");
	public static final Item perkImplantM5 = new ItemImplant(781, 100).setUnlocalizedName("asdasda");
	public static final Item perkGrunt = new ItemPerk(782).setUnlocalizedName("skfhs");
	public static final Item perkNerdRage = new ItemPerk(783).setUnlocalizedName("khhkjh");
	public static final Item perkCowboy = new ItemPerk(784).setUnlocalizedName("kuhfkauh");
	public static final Item perkWalkerInstinct = new ItemPerk(785).setUnlocalizedName("lklahf");

	public static final Item preWarBook = new BaseItem(786).setUnlocalizedName("PreWarBook").setCreativeTab(TabFalloutMisc);

	//Work on achievements?
	//static final Achievement getTungsten = new Achievement(2001, "getTungsten", 1, -2, ingotTungsten, null).registerAchievement();
	//public static AchievementPage page1 = new AchievementPage("Fallout Achievements", ach1, ach2, ach3, ach4);

	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		ModMetadata var2 = event.getModMetadata();
		var2.authorList = Arrays.asList(new String[] {"Blfngl, with Max_FF, TechSkeleton and Earthdog_Gir"});
		var2.autogenerated = false;
		var2.modId = "fallout";
		var2.name = "The Fallout Mod";
		var2.description = "A mod in which most of the items from all of the Fallout games will be added." +
				" Most everything will be there, but this will take a very long time, mainly because the Fallout universe is so huge. " +
				"I am 100% dedicated to this mod and one day it will be completed. After looking around for a Fallout mod and finding some, " +
				"but none that were fully completed or updated to the current version, I was very disappointed and hoped for one to be updated eventually. " +
				"Alas, none of that was true. So I took matters into my own hands and this was the product.";
		var2.version = "1.7.5";
		var2.credits = "Mojang, MinecraftForge and everyone that uses this mod :)";
		var2.logoFile = "/blfngl/fallout/textures/blflogo.png";
		var2.url = "http://www.minecraftforum.net/topic/1667023-";
		System.out.println("Fallout - Loading core files...");

		perkVigilantRecycle.setContainerItem(perkVigilantRecycle);
		proxy.registerSoundHandler();
		proxy.registerServerTickHandler();
		NetworkRegistry.instance().registerGuiHandler(this, this.proxy);
		instance = this;

		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		config.save();
	}

	@Init
	public void init(FMLInitializationEvent event)
	{
		RecordHandler.init();
		BlockHandler.init();
		WorldHandler.init();
		GunHandler.init();
		ItemHandler.init();
		WeaponHandler.init();
		FoodHandler.init();
		ArmorHandler.init();
		ThrowingHandler.init();
		EntityHandler.init();
		PerkHandler.init();
		MinecraftForge.EVENT_BUS.register(new VanillaDropHandler());

		LanguageRegistry.addName(RecordHandler.Track1, "Blue Moon");
		LanguageRegistry.addName(RecordHandler.Track2, "Hallo Mr X");
		LanguageRegistry.addName(RecordHandler.Track3, "Strahlende Trompete");
		LanguageRegistry.addName(RecordHandler.Track4, "Ain't That A Kick In The Head");
		LanguageRegistry.addName(RecordHandler.Track5, "American Swing");
		LanguageRegistry.addName(RecordHandler.Track6, "Big Iron");
		LanguageRegistry.addName(RecordHandler.Track7, "Cobwebs And Rainbows");
		LanguageRegistry.addName(RecordHandler.Track8, "Home On The Wastes");
		LanguageRegistry.addName(RecordHandler.Track9, "It's A Sin To Tell A Lie");
		LanguageRegistry.addName(RecordHandler.Track10, "It's A Sin");
		LanguageRegistry.addName(RecordHandler.Track11, "Jingle Jangle Jingle");
		LanguageRegistry.addName(RecordHandler.Track12, "In The Shadow Of The Valley");
		LanguageRegistry.addName(RecordHandler.Track13, "Sleepy Town Blues");
		LanguageRegistry.addName(RecordHandler.Track14, "Stars Of The Midnight Ranger");
		LanguageRegistry.addName(RecordHandler.Track15, "Streets Of New Reno");
		LanguageRegistry.addName(RecordHandler.Track16, "Why Don't You Do Right");

		DimensionManager.registerProviderType(dimensionWasteland, DimensionWastelandWorldHandler.class, true);
		DimensionManager.registerDimension(dimensionWasteland , dimensionWasteland);

		proxy.registerRenderers();
		System.out.println("Blfngl's Fallout Mod loaded succesfully. Lololololol.");
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event)
	{

	}

	public void saveNBTData(NBTTagCompound compound)
	{
		if (PerkHandler.friendOfNight == true)
		{
			perkNBT.setInteger("NightFriend", 1);
		}
	}

	public void loadNBTData(NBTTagCompound compound)
	{
		perkNBT.getInteger("NightFriend");
	}

	public String registerExtendedProperties(String identifier, IExtendedEntityProperties properties)
	{
		return null;

	}
}