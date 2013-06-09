package blfngl.fallout.food;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import blfngl.fallout.Fallout;

public class ItemSlasher extends Item
{
	public ItemSlasher(int i)
	{
		super(i);
	}
	
	public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer entityPlayer)
	{
		entityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 1 * 120, 0));
		entityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1 * 120, 0));
		return new ItemStack(Fallout.syringeEmpty, 1);
	}
	
	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("blfngl" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}