package blfngl.fallout.item;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import blfngl.fallout.Fallout;
import blfngl.fallout.handler.PerkHandler;

public class ItemPerk extends Item
{
	public int timeOfDay;

	public ItemPerk(int par1)
	{
		super(par1);
		setCreativeTab(Fallout.TabFalloutPerk);
		setMaxStackSize(1);
	}

	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		if (itemID == Fallout.perkLaserCommander.itemID && var3.experienceLevel >= 22 && PerkHandler.laserCommander == false)
		{
			PerkHandler.laserCommander = true;
			var3.experienceLevel -= 22;
			var3.addChatMessage("Laser Commander Activated!");
		}

		if (itemID == Fallout.perkNightFriend.itemID && var3.experienceLevel >= 2 && PerkHandler.friendOfNight == false)
		{
			PerkHandler.friendOfNight = true;
			var3.experienceLevel -= 2;
			var3.addChatMessage("Friend of the Night Activated!");
		}

		if (itemID == Fallout.perkBloodyMess.itemID && var3.experienceLevel >= 6 && PerkHandler.bloodyMess == false)
		{
			PerkHandler.bloodyMess = true;
			var3.experienceLevel -= 6;
			var3.addChatMessage("Bloody Mess Activated!");
		}

		if (itemID == Fallout.perkToughness.itemID && var3.experienceLevel >= 3 && PerkHandler.toughness == false)
		{
			PerkHandler.toughness = true;
			var3.experienceLevel -= 3;
			var3.addChatMessage("Toughness Activated!");
		}

		if (itemID == Fallout.perkSolarPowered.itemID && var3.experienceLevel >= 28 && PerkHandler.solarPowered == false)
		{
			PerkHandler.solarPowered = true;
			var3.experienceLevel -= 28;
			var3.addChatMessage("Solar Powered Activated!");
		}

		if (itemID == Fallout.perkVigilantRecycle.itemID && var3.experienceLevel >= 6 && PerkHandler.vigilantRecycle == false)
		{
			PerkHandler.vigilantRecycle = true;
			var3.experienceLevel -= 28;
			var3.addChatMessage("Vigilant Recycler Activated!");
		}

		return var1;
	}

	public void onUpdate(ItemStack par1ItemStack, World var2, Entity par3, int par4, boolean par5) 
	{
		if (!var2.provider.isDaytime())
		{
			((EntityLiving) par3).addPotionEffect((new PotionEffect(Potion.nightVision.getId(), 20 * 15, 0)));
		}

		if (var2.provider.isDaytime() && var2.canBlockSeeTheSky(MathHelper.floor_double(par3.posX), MathHelper.floor_double(par3.posY), MathHelper.floor_double(par3.posZ)))
		{
			((EntityLiving) par3).addPotionEffect((new PotionEffect(Potion.regeneration.getId(), 20, 0)));
		}
	}

	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		if (itemID == Fallout.perkSolarPowered.itemID)
		{
			var3.add("\u00A7eWhen in direct sunlight you slowly regenerate");
			var3.add("\u007Ae lost health at a rate of half a heart every second");
		}
	}
}