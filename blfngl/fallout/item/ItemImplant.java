package blfngl.fallout.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import blfngl.fallout.Fallout;

public class ItemImplant extends Item
{
	public int itemDamage;

	public ItemImplant(int par1, int par2)
	{
		super(par1);
		setMaxDamage(par2);
		setCreativeTab(Fallout.TabFalloutPerk);
		itemDamage = par2;
	}

	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (par1ItemStack.stackTagCompound == null){par1ItemStack.setTagCompound(new NBTTagCompound());}
		par1ItemStack.stackTagCompound.setString("Owner", par3EntityPlayer.username);
		par1ItemStack.stackTagCompound.setInteger("ImplantM5", 0);
	}

	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		if (var3.inventory.hasItem(Fallout.bottleCap.itemID))
		{
			var3.inventory.consumeInventoryItem(Fallout.bottleCap.itemID);
			var1.damageItem(1, var3);

			if (var1.getItemDamage() == itemDamage - 1)
			{
				if (itemID == Fallout.perkImplantM5.itemID)
				{
					var1.stackTagCompound.setInteger("ImplantM5", 1);
					var1.damageItem(1, var3);
					var3.addChatMessage("Implant M-5 Purchased!");
				}
			}
		}
		return var1;
	}

	public void onUpdate(ItemStack par1ItemStack, World var2, Entity par3, int par4, boolean par5) 
	{
		if (par1ItemStack.stackTagCompound == null){par1ItemStack.setTagCompound(new NBTTagCompound());}
		if (par1ItemStack.stackTagCompound.getInteger("ImplantM5") == 1)// && par3.isSneaking())
		{
			((EntityLiving) par3).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 0));
		}
	}
}
