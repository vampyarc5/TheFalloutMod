package blfngl.fallout.food;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFixer extends Item
{

	public ItemFixer(int par1)
	{
		super(par1);
		setMaxDamage(1);
	}

	public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
	{
		par3.clearActivePotions();
		par1.damageItem(1, par3);
		return par1;
	}
	
	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("blfngl" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}
