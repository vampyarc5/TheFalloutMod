package blfngl.fallout.melee;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WeapBotE extends BaseMelee
{
	public WeapBotE(int id, int damage, int speed, int durability, double Critmul, int Critcha)
	{
		super(id, damage, speed, durability, Critmul, Critcha);
	}

	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		par1ItemStack.addEnchantment(Enchantment.knockback, 7);
	}
}