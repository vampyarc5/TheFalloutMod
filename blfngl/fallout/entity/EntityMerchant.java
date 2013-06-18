package blfngl.fallout.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;
import blfngl.fallout.Fallout;

public abstract class EntityMerchant extends EntityMob implements IMerchant
{
    private EntityPlayer buyingPlayer;

	public EntityMerchant (World world)
	{
		super (world);
		texture = "/blfngl/fallout/textures/T45.png";
		moveSpeed = 0.5F;
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.tasks.addTask(2, new EntityAIMoveTwardsRestriction(this, this.moveSpeed));
		this.tasks.addTask(3, new EntityAIWander(this, this.moveSpeed));
		this.tasks.addTask(4, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 25.0F, 0, true));
	}

	@Override
	public void initCreature()
	{
		super.initCreature();
		this.setCurrentItemOrArmor(0, new ItemStack(Item.swordDiamond));    	

		for (int i = 0; i < this.equipmentDropChances.length; ++i)
		{
			this.equipmentDropChances[i] = 0F;
		}
	}

	public boolean isAIEnabled()
	{
		return true;
	}

	public void setAttackTarget(EntityLiving par1EntityLiving)
	{
		super.setAttackTarget(par1EntityLiving);
	}

	public int getMaxHealth()
	{
		return 100;
	}

	protected String getHurtSound()
	{
		return "mob.zombiehurt";
	}

	protected String getDeathSound()
	{
		return "mob.zombiedeath";
	}

	public int getAttackStrength(Entity par1Entity)
	{
		return 7;
	}

	protected int getDropItemId()
	{
		return Fallout.ingotTungsten.itemID;
	}

	protected void dropRareDrop(int par1)
	{
		switch (this.rand.nextInt(3))
		{
		case 0:
			//this.dropItem(FalloutMain.LaserRifle.itemID, 1);
			break;

		case 1:
			this.dropItem(Fallout.cellMF.itemID, 3);
			break;

		case 2:
			//this.dropItem(FalloutMain.Incinerator.itemID, 1);
		}
	}
	
	public boolean isTrading()
    {
        return this.buyingPlayer != null;
    }

	public boolean interact(EntityPlayer par1EntityPlayer)
	{
		ItemStack itemstack = par1EntityPlayer.inventory.getCurrentItem();
		boolean flag = itemstack != null && itemstack.itemID == Item.monsterPlacer.itemID;

		if (!flag && this.isEntityAlive() && !this.isTrading() && !this.isChild())
		{
			if (!this.worldObj.isRemote)
			{
				this.setCustomer(par1EntityPlayer);
				par1EntityPlayer.displayGUIMerchant(this, this.func_94057_bL());
			}

			return true;
		}
		else
		{
			return super.interact(par1EntityPlayer);
		}
	}

	@Override
	public void setCustomer(EntityPlayer entityplayer) {
		// TODO Auto-generated method stub

	}

	@Override
	public EntityPlayer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MerchantRecipeList getRecipes(EntityPlayer entityplayer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void useRecipe(MerchantRecipe merchantrecipe) {
		// TODO Auto-generated method stub

	}
} 