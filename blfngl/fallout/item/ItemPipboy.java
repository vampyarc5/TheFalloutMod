package blfngl.fallout.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import blfngl.fallout.Fallout;

public class ItemPipboy extends Item
{
	public ItemPipboy(int par1)
	{
		super(par1);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
		if (!world.isRemote)
		{
			player.openGui(Fallout.instance, 0, world, (int) player.posX, (int) player.posY, (int) player.posZ);
		}

		return itemStack;
	}

	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("blfngl:Pipboy");
	}
}