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
		par1ItemStack.stackTagCompound.setInteger("VigilantRecycle", 0);
		par1ItemStack.stackTagCompound.setInteger("Grunt", 0);
		par1ItemStack.stackTagCompound.setInteger("Cowboy", 0);
		par1ItemStack.stackTagCompound.setInteger("BloodyMess", 0);
	}

	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		if (itemID == Fallout.perkLaserCommander.itemID && var3.experienceLevel >= 22 && var1.stackTagCompound.getInteger("LaserCommander") == 0)
		{
			var1.stackTagCompound.setInteger("LaserCommander", 1);
			var3.experienceLevel -= 22;
			var3.addChatMessage("Laser Commander Activated!");
		}

		if (itemID == Fallout.perkNightFriend.itemID && var3.experienceLevel >= 2 && var1.stackTagCompound.getInteger("NightFriend") == 0)
		{
			var1.stackTagCompound.setInteger("NightFriend", 1);
			var3.experienceLevel -= 2;
			var3.addChatMessage("Friend of the Night Activated!");
		}

		if (itemID == Fallout.perkBloodyMess.itemID && var3.experienceLevel >= 6 && var1.stackTagCompound.getInteger("BloodyMess")== 0)
		{
			var1.stackTagCompound.setInteger("BloodyMess", 1);
			PerkHandler.bloodyMess = true;
			var3.experienceLevel -= 6;
			var3.addChatMessage("Bloody Mess Activated!");
		}

		if (itemID == Fallout.perkToughness.itemID && var3.experienceLevel >= 3 && var1.stackTagCompound.getInteger("Toughness") == 0)
		{
			var1.stackTagCompound.setInteger("Toughness", 1);
			var3.experienceLevel -= 3;
			var3.addChatMessage("Toughness Activated!");
		}

		if (itemID == Fallout.perkSolarPowered.itemID && var3.experienceLevel >= 28 && var1.stackTagCompound.getInteger("SolarPowered") == 0)
		{
			var1.stackTagCompound.setInteger("SolarPowered", 1);
			var3.experienceLevel -= 28;
			var3.addChatMessage("Solar Powered Activated!");
		}

		if (itemID == Fallout.perkVigilantRecycle.itemID && var3.experienceLevel >= 6 && var1.stackTagCompound.getInteger("VigilantRecycle") == 0)
		{
			var1.stackTagCompound.setInteger("VigilantRecycle", 1);
			PerkHandler.vigilantRecycle = true;
			var3.experienceLevel -= 6;
			var3.addChatMessage("Vigilant Recycler Activated!");
		}

		if (itemID == Fallout.perkGrunt.itemID && var3.experienceLevel >= 8 && var1.stackTagCompound.getInteger("Grunt") == 0)
		{
			var1.stackTagCompound.setInteger("Grunt", 1);
			PerkHandler.grunt = true;
			var3.experienceLevel -= 8;
			var3.addChatMessage("Grunt Activated!");
		}

		if (itemID == Fallout.perkNerdRage.itemID && var3.experienceLevel >= 10 && var1.stackTagCompound.getInteger("NerdRage") == 0)
		{
			var1.stackTagCompound.setInteger("NerdRage", 1);
			var3.experienceLevel -= 10;
			var3.addChatMessage("Nerd Rage! Activated!");
		}

		if (itemID == Fallout.perkCowboy.itemID && var3.experienceLevel >= 8 && var1.stackTagCompound.getInteger("Cowboy") == 0)
		{
			var1.stackTagCompound.setInteger("Cowboy", 1);
			PerkHandler.cowboy = true;
			var3.experienceLevel -= 8;
			var3.addChatMessage("Cowboy Activated!");
		}

		if (itemID == Fallout.perkWalkerInstinct.itemID && var3.experienceLevel >= 18 && var1.stackTagCompound.getInteger("WalkerInstinct") == 0)
		{
			var1.stackTagCompound.setInteger("WalkerInstinct", 1);
			var3.experienceLevel -= 18;
			var3.addChatMessage("Walker Instinct Activated!");
		}

		if (Fallout.isScoped && var1.itemID == Fallout.perkRemover.itemID)
		{
			var1.stackTagCompound.setInteger("NightFriend", 0);
			var1.stackTagCompound.setInteger("SolarPowered", 0);
			var1.stackTagCompound.setInteger("LaserCommander", 0);
			var1.stackTagCompound.setInteger("Toughness", 0);
			var1.stackTagCompound.setInteger("VigilantRecycle", 0);
			var1.stackTagCompound.setInteger("Grunt", 0);
			var1.stackTagCompound.setInteger("Cowboy", 0);
			var1.stackTagCompound.setInteger("BloodyMess", 0);
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
		if (par1ItemStack.stackTagCompound.getInteger("NerdRage") == 1){((EntityLiving) par3).addPotionEffect(new PotionEffect(Potion.resistance.getId(), 20, 4));}

		if (par1ItemStack.stackTagCompound.getInteger("WalkerInstinct") == 1
				&& var2.canBlockSeeTheSky(MathHelper.floor_double(par3.posX), MathHelper.floor_double(par3.posY), MathHelper.floor_double(par3.posZ)))
		{
			((EntityLiving) par3).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 0));
		}

		if (par1ItemStack.stackTagCompound.getInteger("Grunt") == 1 && PerkHandler.grunt == false){PerkHandler.grunt = true;}
		if (par1ItemStack.stackTagCompound.getInteger("VigilantRecycle") == 1 && PerkHandler.vigilantRecycle == false){PerkHandler.vigilantRecycle = true;}
		if (par1ItemStack.stackTagCompound.getInteger("LaserCommander") == 1 && PerkHandler.laserCommander == false){PerkHandler.laserCommander = true;}
	}

	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		if (itemID == Fallout.perkSolarPowered.itemID)
		{
			var3.add("\u00A7eWhen in direct sunlight ");
			var3.add("\u00A7eyou slowly regenerate");
			var3.add("\u00A7elost health at a rate of");
			var3.add("\u00A7ehalf a heart every second");
		}

		if(itemID == Fallout.perkRemover.itemID)
		{
			var3.add("BE CAREFUL:");
			var3.add("IF YOU'RE HOLDING");
			var3.add("'F' AND YOU RIGHT CLICK");
			var3.add("ALL PERKS WILL GO AWAY");
		}
	}
}