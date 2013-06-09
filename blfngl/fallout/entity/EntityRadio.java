package blfngl.fallout.entity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityRadio extends EntityMob
{
	public boolean field_70885_d = false;
	public float field_70886_e = 0.0F;
	public float destPos = 0.0F;
	public float field_70884_g;
	public float field_70888_h;
	public float field_70889_i = 1.0F;

	/** The time until the next egg is spawned. */
	public int timeUntilNextEgg;

	public EntityRadio(World par1World)
	{
		super(par1World);
		this.texture = "/mob/chicken.png";
		this.preventEntitySpawning = true;
	}

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	public boolean isAIEnabled()
	{
		return true;
	}

	public int getMaxHealth()
	{
		return 1;
	}

	protected String getLivingSound()
	{
		return "mob.chicken.say";
	}

	protected int getDropItemId()
	{
		return Item.feather.itemID;
	}
}