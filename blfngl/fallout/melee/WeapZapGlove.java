package blfngl.fallout.melee;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class WeapZapGlove extends BaseMelee
{
	public WeapZapGlove(int id, int damage, int speed, int durability, double Critmul, int Critcha, String effect1, int effect1Duration)
	{
		super(id, damage, speed, durability, Critmul, Critcha, effect1, effect1Duration);
	}

	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
		par1ItemStack.damageItem(1, par3EntityLiving);
		par2EntityLiving.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 1 * 1200, 1));
		return true;
	}
}