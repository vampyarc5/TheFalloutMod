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

public class ItemSkill extends Item
{
	public ItemSkill(int par1)
	{
		super(par1);
		setCreativeTab(Fallout.TabFalloutPerk);
		setMaxStackSize(1);
		setMaxDamage(1);
	}

	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (par1ItemStack.stackTagCompound == null){par1ItemStack.setTagCompound(new NBTTagCompound());}
		par1ItemStack.stackTagCompound.setString("Owner", par3EntityPlayer.username);
		par1ItemStack.stackTagCompound.setInteger("Guns", 0);
	}

	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		if (itemID == Fallout.skillGuns.itemID && var1.stackTagCompound.getInteger("Guns") < 101)
		{
			int temp;
			temp = var1.stackTagCompound.getInteger("Guns");
			var1.stackTagCompound.setInteger("Guns", (temp + 3));
			var3.addChatMessage("Guns skill raised!");
			if ((temp + 3) > 100){temp = 97;}
			var3.addChatMessage("Guns is now " + (temp + 3));
			var1.damageItem(1, var3);
		}

		return var1;
	}

	public void onUpdate(ItemStack par1ItemStack, World var2, Entity par3, int par4, boolean par5) 
	{
		if (par1ItemStack.stackTagCompound == null){par1ItemStack.setTagCompound(new NBTTagCompound());}
	}

	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{

	}
}