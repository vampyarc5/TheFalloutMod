package blfngl.fallout.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityRadroach extends EntityMob
{
	public EntityRadroach (World world)
	{
		super (world);
		texture = "/blfngl/fallout/textures/Radroach.png";
		moveSpeed = 2.5F;
	}
	public int getMaxHealth()
	{
		return 7;
	}
	public int getAttackStrength(Entity par1Entity)
	{
		return 7;
	}
	protected String getHurtSound()
	{
		return "mob.zombiehurt";
	}
	protected String getDeathSound()
	{
		return "mob.zombiedeath";
	}
}	
