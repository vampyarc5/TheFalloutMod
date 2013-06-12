package blfngl.fallout.handler;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import blfngl.fallout.Fallout;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SoundHandler
{
	@SideOnly(Side.CLIENT)
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event)
	{
		try 
		{
			event.manager.soundPoolSounds.addSound("blfngl/LaserFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/LaserFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/IncineratorShoot.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/IncineratorShoot.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/357Fire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/357Fire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/44Fire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/44Fire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/RCWFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/RCWFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/Silenced22Fire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/Silenced22Fire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/SniperFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/SniperFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/LaserPistolFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/LaserPistolFire.ogg"));

			event.manager.soundPoolSounds.addSound("blfngl/AntTalk.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/AntTalk.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/AntTalk1.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/AntTalk1.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/AntHurt.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/AntHurt.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/AntHurt2.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/AntHurt1.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/FGhoulTalk.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/FGhoulTalk.ogg"));         
			event.manager.soundPoolSounds.addSound("blfngl/FGhoulTalk1.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/FGhoulTalk1.ogg"));         
			event.manager.soundPoolSounds.addSound("blfngl/FGhoulTalk2.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/FGhoulTalk2.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/FGhoulHurt.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/FGhoulHurt.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/FGhoulHurt1.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/FGhoulHurt1.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/FGhoulHurt2.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/FGhoulHurt2.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/NightstalkerTalk.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/NightstalkerTalk.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/NightstalkerTalk1.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/NightstalkerTalk1.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/NightstalkerHurt.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/NightstalkerHurt.ogg"));

			//Version 1.7.1
			event.manager.soundPoolSounds.addSound("blfngl/RCWReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/RCWReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/ComplianceReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/ComplianceReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/44Reload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/44Reload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/357Reload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/357Reload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/SniperReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/SniperReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/10mmFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/10mmFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/10mmReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/10mmReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/ShotgunFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/ShotgunFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/ShotgunReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/ShotgunReload.ogg"));

			//Version 1.7.2
			event.manager.soundPoolSounds.addSound("blfngl/45Fire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/45Fire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/MinigunReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/MinigunReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/MultiplasFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/MultiplasFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/MysteriousMagnumThrown.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/MysteriousMagnumThrown.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/Pistol556Fire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/Pistol556Fire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/Pistol556Reload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/Pistol556Reload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/PlasmaCasterFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/PlasmaCasterFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/PlasmaRifleFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/PlasmaRifleFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/PlasmaRifleReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/PlasmaRifleReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/TriBeamFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/TriBeamFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/TriBeamReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/TriBeamReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/HoloFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/HoloFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/MinigunFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/MinigunFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/GaussFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/GaussFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/GaussReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/GaussReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/9mmFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/9mmFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/9mmReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/9mmReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/DefenderFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/DefenderFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/HuntingFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/HuntingFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/HuntingReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/HuntingReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/PlasmaPistolFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/PlasmaPistolFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/PlasmaPistolReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/PlasmaPistolReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/RechargerFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/RechargerFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/TeslaFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/TeslaFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/TeslaReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/TeslaReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/RedGlareFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/RedGlareFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/RedGlareReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/RedGlareReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/MissileFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/MissileFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/MissileReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/MissileReload.ogg"));

			event.manager.soundPoolSounds.addSound("blfngl/AutomaticRifleFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/AutomaticRifleFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/BattleRifleFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/BattleRifleFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/BattleRifleReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/BattleRifleReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/BrushGunFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/BrushGunFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/CowboyRepeaterFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/CowboyRepeaterFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/HuntingRifleFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/HuntingRifleFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/HuntingRifleReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/HuntingRifleReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/RepeaterReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/RepeaterReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/HuntingShotgunFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/HuntingShotgunFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/HuntingShotgunReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/HuntingShotgunReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/AlienBlasterFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/AlienBlasterFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/AlienBlasterReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/AlienBlasterReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/PulseFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/PulseFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/LaserPistolReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/LaserPistolReload.ogg"));

			//TODO Version 1.7.3
			event.manager.soundPoolSounds.addSound("blfngl/AssaultFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/AssaultFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/AssaultReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/AssaultReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/ChristineFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/ChristineFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/ChristineReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/ChristineReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/LMGFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/LMGFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/LMGReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/LMGReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/RatslayerFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/RatslayerFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/TrailCarbineFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/TrailCarbineFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/VarmintRifleFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/VarmintRifleFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/MaterielFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/MaterielFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/MaterialReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/MaterialReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/MarksmanFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/MarksmanFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/MarksmanReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/MarksmanReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/127SmgReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/127SmgReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/NailgunFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/NailgunFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/SleepytymeFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/SleepytymeFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/CaravanShotgunFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/CaravanShotgunFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/CaravanShotgunReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/CaravanShotgunReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/LeverShotgunFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/LeverShotgunFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/LeverShotgunReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/LeverShotgunReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/SingleShotgunReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/SingleShotgunReload.ogg"));

			event.manager.soundPoolSounds.addSound("blfngl/ChineseAssaultFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/ChineseAssaultFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/ChineseAssaultReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/ChineseAssaultReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/FlareGunFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/FlareGunFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/FlareGunReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/FlareGunReload.ogg"));

			event.manager.soundPoolSounds.addSound("blfngl/32Fire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/32Fire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/32Reload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/32Reload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/ChinesePistolFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/ChinesePistolFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/Silenced10mmFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/Silenced10mmFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/DartGunFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/DartGunFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/DartGunReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/DartGunReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/LincolnFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/LincolnFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/LincolnReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/LincolnReload.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/RailwayFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/RailwayFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/RailwayReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/RailwayReload.ogg"));

			event.manager.soundPoolSounds.addSound("blfngl/InfiltratorFire.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/InfiltratorFire.ogg"));
			event.manager.soundPoolSounds.addSound("blfngl/InfiltratorReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/InfiltratorReload.ogg"));

			event.manager.soundPoolSounds.addSound("blfngl/MrHandyTalk.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/MrHandyTalk.ogg"));
			//event.manager.soundPoolSounds.addSound("blfngl/InfiltratorReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/InfiltratorReload.ogg"));
			//event.manager.soundPoolSounds.addSound("blfngl/InfiltratorReload.ogg", Fallout.class.getResource("/blfngl/fallout/sounds/InfiltratorReload.ogg"));

		}

		catch (Exception e)
		{
			System.err.println("Failed to register one or more sounds.");
		}
	}
}