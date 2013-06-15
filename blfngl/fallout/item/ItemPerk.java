package blfngl.fallout.item;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import blfngl.fallout.Fallout;
import blfngl.fallout.handler.PerkHandler;

public class ItemPerk extends Item
{
	public ItemPerk(int par1)
	{
		super(par1);
		setCreativeTab(Fallout.TabFalloutPerk);
		setMaxStackSize(1);
	}

	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (par1ItemStack.stackTagCompound == null){par1ItemStack.setTagCompound(new NBTTagCompound());}
		par1ItemStack.stackTagCompound.setString("Owner", par3EntityPlayer.username);
		par1ItemStack.stackTagCompound.setInteger("NightFriend", 0);
		par1ItemStack.stackTagCompound.setInteger("SolarPowered", 0);
		par1ItemStack.stackTagCompound.setInteger("LaserCommander", 0);
		par1ItemStack.stackTagCompound.setInteger("Toughness", 0);
	}

	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		if (itemID == Fallout.perkLaserCommander.itemID && var3.experienceLevel >= 22 && PerkHandler.laserCommander == false)
		{
			var1.stackTagCompound.setInteger( "LaserCommander", 1);
			PerkHandler.laserCommander = true;
			var3.experienceLevel -= 22;
			var3.addChatMessage("Laser Commander Activated!");
		}

		if (itemID == Fallout.perkNightFriend.itemID && var3.experienceLevel >= 2 && var1.stackTagCompound.getInteger("NightFriend") == 0)
		{
			var1.stackTagCompound.setInteger("NightFriend", 1);
			PerkHandler.friendOfNight = true;
			var3.experienceLevel -= 2;
			var3.addChatMessage("Friend of the Night Activated!");
		}

		if (itemID == Fallout.perkBloodyMess.itemID && var3.experienceLevel >= 6 && PerkHandler.bloodyMess == false)
		{
			var1.stackTagCompound.setInteger("BloodyMess", 1);
			PerkHandler.bloodyMess = true;
			var3.experienceLevel -= 6;
			var3.addChatMessage("Bloody Mess Activated!");
		}

		if (itemID == Fallout.perkToughness.itemID && var3.experienceLevel >= 3 && PerkHandler.toughness == false)
		{
			var1.stackTagCompound.setInteger("Toughness", 1);
			PerkHandler.toughness = true;
			var3.experienceLevel -= 3;
			var3.addChatMessage("Toughness Activated!");
		}

		if (itemID == Fallout.perkSolarPowered.itemID && var3.experienceLevel >= 28 && var1.stackTagCompound.getInteger("SolarPowered") == 0)
		{
			var1.stackTagCompound.setInteger("SolarPowered", 1);
			PerkHandler.solarPowered = true;
			var3.experienceLevel -= 28;
			var3.addChatMessage("Solar Powered Activated!");
		}

		if (itemID == Fallout.perkVigilantRecycle.itemID && var3.experienceLevel >= 6 && PerkHandler.vigilantRecycle == false)
		{
			var1.stackTagCompound.setInteger("VigilantRecycle", 1);
			PerkHandler.vigilantRecycle = true;
			var3.experienceLevel -= 6;
			var3.addChatMessage("Vigilant Recycler Activated!");
		}

		if (itemID == Fallout.perkGrunt.itemID && var3.experienceLevel >= 8 && PerkHandler.grunt == false)
		{
			var1.stackTagCompound.setInteger("Grunt", 1);
			PerkHandler.grunt = true;
			var3.experienceLevel -= 8;
			var3.addChatMessage("Grunt Activated!");
		}

		if (itemID == Fallout.perkNerdRage.itemID && var3.experienceLevel >= 10 && PerkHandler.nerdRage == false)
		{
			var1.stackTagCompound.setInteger("NerdRage", 1);
			PerkHandler.nerdRage = true;
			var3.experienceLevel -= 10;
			var3.addChatMessage("Nerd Rage! Activated!");
		}

		if (itemID == Fallout.perkCowboy.itemID && var3.experienceLevel >= 8 && PerkHandler.cowboy == false)
		{
			var1.stackTagCompound.setInteger("Cowboy", 1);
			PerkHandler.cowboy = true;
			var3.experienceLevel -= 8;
			var3.addChatMessage("Cowboy Activated!");
		}

		if (itemID == Fallout.perkWalkerInstinct.itemID && var3.experienceLevel >= 18 && PerkHandler.walkerInstinct == false)
		{
			var1.stackTagCompound.setInteger("WalkerInstinct", 1);
			PerkHandler.walkerInstinct = true;
			var3.experienceLevel -= 18;
			var3.addChatMessage("Walker Instinct Activated!");
		}

		return var1;
	}

	public void onUpdate(ItemStack par1ItemStack, World var2, Entity par3, int par4, boolean par5) 
	{
		if (par1ItemStack.stackTagCompound == null){par1ItemStack.setTagCompound(new NBTTagCompound());}

		if (par1ItemStack.stackTagCompound.getInteger("NightFriend") == 1)
		{
			((EntityLiving) par3).addPotionEffect((new PotionEffect(Potion.nightVision.getId(), 20 * 15, 0)));
		}

		if (par1ItemStack.stackTagCompound.getInteger("SolarPowered") == 1 && var2.provider.isDaytime()
				&& var2.canBlockSeeTheSky(MathHelper.floor_double(par3.posX), MathHelper.floor_double(par3.posY), MathHelper.floor_double(par3.posZ)))
		{
			((EntityLiving) par3).addPotionEffect((new PotionEffect(Potion.regeneration.getId(), 20, 0)));
		}

		if (par1ItemStack.stackTagCompound.getInteger("Toughness") == 1){((EntityLiving) par3).addPotionEffect(new PotionEffect(Potion.resistance.getId(), 20, 0));}
		//if (par1ItemStack.stackTagCompound.getInteger("ImplantM5") == 1){((EntityLiving) par3).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 0));}
		if (par1ItemStack.stackTagCompound.getInteger("NerdRage") == 1){((EntityLiving) par3).addPotionEffect(new PotionEffect(Potion.resistance.getId(), 20, 4));}
		if (par1ItemStack.stackTagCompound.getInteger("WalkerInstinct") == 1){((EntityLiving) par3).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 0));}
	}

	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		if (itemID == Fallout.perkSolarPowered.itemID)
		{
			var3.add("\u00A7eWhen in direct sunlight you slowly regenerate");
			var3.add("\u00A7eLost health at a rate of half a heart every second");
		}
	}
}