package blfngl.fallout.throwing;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import blfngl.fallout.Fallout;
import blfngl.fallout.entity.EntityRocket;
import blfngl.fallout.render.RenderBozar;
import blfngl.fallout.render.RenderBozarScope;

public class ItemThrowingExplosive extends Item
{
	private int damage;
	private int reloadTime;
	private int reloadTotal;
	private int clipid;
	private int ammo;
	private int fireTime;
	private int fireTotal;
	private String firesound;
	private String reloadsound;
	public int count = 0;
	public int clipSize;

	public ItemThrowingExplosive(int par1, int var2, int var3, int var4, int var5, String var6, String var7, EnumToolMaterial var8)
	{
		super(par1);
		this.damage = var2;
		this.fireTotal = var5;
		this.fireTime = this.fireTotal;
		this.reloadTotal = 5;
		this.reloadTime = var4;
		this.ammo = var3;
		this.clipid = var4;
		this.firesound = var6;
		this.reloadsound = var7;
		this.setMaxStackSize(1);
		this.setMaxDamage(var3);
		clipSize = var3;
	}

	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		var2.playSoundAtEntity(var3, this.firesound, 2.0F, 1.0F);
		EntityRocket var4 = new EntityRocket(var2, var3);
		var2.spawnEntityInWorld(var4);
		var3.inventory.consumeInventoryItem(var1.itemID);
		return var1;
	}

	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("blfngl" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}

