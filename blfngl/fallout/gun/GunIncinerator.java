package blfngl.fallout.gun;

import javax.swing.text.html.parser.Entity;

import blfngl.fallout.Fallout;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class GunIncinerator extends ItemSword
{
	protected int damage;
	protected int enchantability;

	public GunIncinerator(int par1){
		super(par1, EnumToolMaterial.WOOD);
		setMaxDamage(750);
		damage = 1;
		enchantability = 14;
	}
	public int getDamageVsEntity(Entity par1Entity)
	{
		return damage;
	}
	public int getItemEnchantability()
	{
		return enchantability;
	}
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{         
		if (!world.isRemote && entityplayer.inventory.hasItem(Fallout.homemadeFuel.itemID))
		{
			entityplayer.inventory.consumeInventoryItem(Fallout.homemadeFuel.itemID);
			Vec3 look = entityplayer.getLookVec();
			EntitySmallFireball fireball2 = new EntitySmallFireball(world, entityplayer, 1, 1, 1);
			fireball2.setPosition(
					entityplayer.posX, // + look.xCoord * 5,
					entityplayer.posY, // + look.yCoord * 5,
					entityplayer.posZ); // + look.zCoord * 5);
			fireball2.accelerationX = look.xCoord * 0.1;
			fireball2.accelerationY = look.yCoord * 0.1;
			fireball2.accelerationZ = look.zCoord * 0.1;
			world.spawnEntityInWorld(fireball2);
		}
		return itemstack;
	}
	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("blfngl" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}