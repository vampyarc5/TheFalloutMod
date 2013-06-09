package blfngl.fallout.handler;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.src.ModLoader;
import blfngl.fallout.Fallout;
import blfngl.fallout.entity.EntityBOSPaladin;
import blfngl.fallout.entity.EntityBrahmin;
import blfngl.fallout.entity.EntityBullet;
import blfngl.fallout.entity.EntityFGhoul;
import blfngl.fallout.entity.EntityGecko;
import blfngl.fallout.entity.EntityGiantAnt;
import blfngl.fallout.entity.EntityGlowingOne;
import blfngl.fallout.entity.EntityNightStalker;
import blfngl.fallout.entity.EntityRadroach;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class EntityHandler
{
	public static void init()
	{
		EntityRegistry.registerGlobalEntityID(EntityFGhoul.class, "FGhoul", ModLoader.getUniqueEntityId(), 230, 78);
		LanguageRegistry.instance().addStringLocalization("entity.FGhoul.name", "en_US", "Feral Ghoul");
		EntityRegistry.addSpawn(EntityFGhoul.class, 5, 1, 2, EnumCreatureType.monster, Fallout.Wasteland);

		EntityRegistry.registerGlobalEntityID(EntityGlowingOne.class, "GlowingOne", ModLoader.getUniqueEntityId(), 230, 78);
		LanguageRegistry.instance().addStringLocalization("entity.GlowingOne.name", "en_US", "Glowing One");
		EntityRegistry.addSpawn(EntityGlowingOne.class, 5, 1, 2, EnumCreatureType.creature, Fallout.Wasteland);

		EntityRegistry.registerGlobalEntityID(EntityNightStalker.class, "Nightstalker", ModLoader.getUniqueEntityId(), 230, 78);
		ModLoader.addLocalization("entity.NightStalker.name", "en_US", "Nightstalker");
		EntityRegistry.addSpawn(EntityNightStalker.class, 5, 1, 2, EnumCreatureType.creature, Fallout.Wasteland);

		EntityRegistry.registerGlobalEntityID(EntityBrahmin.class, "Brahmin", ModLoader.getUniqueEntityId(), 230, 78);
		LanguageRegistry.instance().addStringLocalization("entity.Brahmin.name", "en_US", "Brahmin");
		EntityRegistry.addSpawn(EntityBrahmin.class, 5, 1, 2, EnumCreatureType.creature, Fallout.Wasteland);

		EntityRegistry.registerGlobalEntityID(EntityGiantAnt.class, "GiantAnt", ModLoader.getUniqueEntityId(), 230, 78);
		LanguageRegistry.instance().addStringLocalization("entity.GiantAnt.name", "en_US", "Giant Ant");
		EntityRegistry.addSpawn(EntityGiantAnt.class, 5, 1, 2, EnumCreatureType.creature, Fallout.Wasteland);

		EntityRegistry.registerGlobalEntityID(EntityBOSPaladin.class, "BOSPaladin", ModLoader.getUniqueEntityId(), 230, 78);
		LanguageRegistry.instance().addStringLocalization("entity.BOSPaladin.name", "en_US", "Brotherhood of Steel Paladin");
		EntityRegistry.addSpawn(EntityBOSPaladin.class, 5, 1, 2, EnumCreatureType.creature, Fallout.Wasteland);

		EntityRegistry.registerGlobalEntityID(EntityRadroach.class, "Radroach", ModLoader.getUniqueEntityId(), 230, 78);
		LanguageRegistry.instance().addStringLocalization("entity.Radroach.name", "en_US", "Radroach");
		EntityRegistry.addSpawn(EntityRadroach.class, 5, 1, 2, EnumCreatureType.creature, Fallout.Wasteland);

		EntityRegistry.registerGlobalEntityID(EntityGecko.class, "Gecko", ModLoader.getUniqueEntityId(), 230, 78);
		LanguageRegistry.instance().addStringLocalization("entity.Gecko.name", "en_US", "Young Gecko");
		EntityRegistry.addSpawn(EntityRadroach.class, 5, 1, 2, EnumCreatureType.creature, Fallout.Wasteland);

		EntityRegistry.registerGlobalEntityID(EntityBullet.class, "Bullet", ModLoader.getUniqueEntityId());
		LanguageRegistry.instance().addStringLocalization("entity.Bullet.name", "en_US", "Bullet");
	}
}
