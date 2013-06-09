package blfngl.fallout.melee;

import javax.swing.text.html.parser.Entity;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class WeapSatHeatFist extends ItemSword
{
	protected int damage;
	protected int enchantability;

	public WeapSatHeatFist(int par1, EnumToolMaterial par2)
	{
		super(par1, par2);
		setMaxDamage(400);
		damage = 9; 
		enchantability = 14;
	}
	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("blfngl" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	public int getDamageVsEntity(Entity par1Entity)
	{
		return damage;
	}

	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		par1ItemStack.addEnchantment(Enchantment.fireAspect, 5);
	}

	public int getItemEnchantability()
	{
		return enchantability;
	}

}


