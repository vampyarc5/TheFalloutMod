package blfngl.fallout.entity;

import javax.swing.text.html.parser.Entity;

import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import blfngl.fallout.Fallout;

public class EntityGlowingOne extends EntityMob
{
	public EntityGlowingOne(World par1World)
	{
		super(par1World);
		this.texture = "/blfngl/fallout/textures/GlowingOne.png";
		this.moveSpeed = 1f;
		isImmuneToFire = false;

		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.tasks.addTask(2, new EntityAIMoveTwardsRestriction(this, this.moveSpeed));
		this.tasks.addTask(3, new EntityAIWander(this, this.moveSpeed));
		this.tasks.addTask(4, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 25.0F, 0, true));

	}

	public int getAttackStrength(Entity par1Entity)
	{
		return 15;
	}
	
	public int func_82193_c(Entity par1Entity)
	{
		return 12;
	}

	protected void fall(float par1) {}
	public int getMaxHealth()
	{
		return 70;
	}

	protected String getLivingSound()
	{
		return "blfngl.fallout.sounds.FGhoulLive";
	}

	protected String getHurtSound()
	{
		return "mob.ghoul.FGhoulHurt";
	}

	protected String getDeathSound()
	{
		return "mob.ghoul.FGhoulDeath";
	}

	protected int getDropItemId()
	{
		return Fallout.bottleCap.itemID;
	}

	protected void dropRareDrop(int par1)
	{
		switch (this.rand.nextInt(3))
		{
		case 0:
			this.dropItem(Fallout.BCMAC.itemID, 1);
			break;

		case 1:
			this.dropItem(Fallout.Salisbury.itemID, 1);
			break;

		case 2:
			this.dropItem(Fallout.YumYum.itemID, 1);
		}
	}

	protected boolean canDespawn()
	{
		return true;
	}

	protected boolean isAIEnabled()
	{
		return false;
	}
}