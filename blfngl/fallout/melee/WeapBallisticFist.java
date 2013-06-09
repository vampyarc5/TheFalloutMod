package blfngl.fallout.melee;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;

public class WeapBallisticFist extends BaseMelee
{
	public WeapBallisticFist(int id, int damage, int speed, int durability, double Critmul, int Critcha)
	{
		super(id, damage, speed, durability, Critmul, Critcha);
	}
	
	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
		par2EntityLiving.playSound("random.explode", 2.0F, 1.0F);
		par1ItemStack.damageItem(1, par3EntityLiving);
		par2EntityLiving.spawnExplosionParticle();
		par2EntityLiving.spawnExplosionParticle();
		par2EntityLiving.spawnExplosionParticle();
		par2EntityLiving.spawnExplosionParticle();
		par2EntityLiving.spawnExplosionParticle();
		par2EntityLiving.spawnExplosionParticle();
		return true;
	}
}
