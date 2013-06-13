package blfngl.fallout.gun;

import java.util.List;
import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.input.Keyboard;

import blfngl.fallout.Fallout;
import blfngl.fallout.entity.EntityBullet;
import blfngl.fallout.gun.render.Render45Auto;
import blfngl.fallout.gun.render.Render45AutoScoped;
import blfngl.fallout.gun.render.RenderBozar;
import blfngl.fallout.gun.render.RenderBozarScoped;
import blfngl.fallout.gun.render.RenderChineseAssaultRifle;
import blfngl.fallout.gun.render.RenderChineseAssaultRifleScoped;
import blfngl.fallout.gun.render.RenderRatslayer;
import blfngl.fallout.gun.render.RenderRatslayerScoped;

public class ItemGun extends Item
{
	private int damage;
	private double reloadtick;
	private double reloadmax;
	private double clipid;
	private double firetick;
	private double firemax;
	private String firesound;
	private String reloadsound;
	public int count = 0;
	public int clipSize;
	public Item ammoType;
	private int critChance;
	private int critDamage;
	public int rounds;
	public int gunHealth;
	public int cnd;
	public String name;

	Random rand = new Random();

	public boolean isFull3D()
	{
		return true;
	}

	public ItemGun(int var1, int var2, int var3, double var4, double var5, String var6, String var7, Item var8, int var9)
	{
		super(var1);
		damage = var2;
		firemax = var5*10;
		firetick = firemax;
		reloadmax = 50;
		reloadtick = var4;
		firesound = var6;
		reloadsound = var7;
		setMaxStackSize(1);
		setMaxDamage(var9);
		clipSize = var3;
		ammoType = var8;
		critChance = 5;
		critDamage = 4;
		cnd = var9;
	}

	public ItemGun(int var1, int var2, int var3, int var4, int var5, String var6, String var7, Item var9, int var10, int var11, int var12)
	{
		super(var1);
		damage = var2;
		firemax = var5*10;
		firetick = firemax;
		reloadmax = 50;
		reloadtick = var4;
		firesound = var6;
		reloadsound = var7;
		setMaxStackSize(1);
		setMaxDamage(var12);
		clipSize = var3;
		ammoType = var9;
		critChance = var10;
		critDamage = var11;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		if (!var2.isRemote && rounds > 0)
		{
			if (firetick == firemax && firemax != 0)
			{
				if (rand.nextInt(100)+1 <= critChance)
				{
					var2.spawnEntityInWorld(new EntityBullet(var2, var3, damage + rand.nextInt(critDamage)+1, 1));
				}

				else {var2.spawnEntityInWorld(new EntityBullet(var2, var3, damage, 1));}

				var2.playSoundAtEntity(var3, firesound, 1.0F, 1.0F);
				var1.damageItem(1, var3);

				if (!var3.capabilities.isCreativeMode)
				{
					rounds-=1;
					if (ammoType.itemID == Fallout.a10mm.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.case10mm));}
					if (ammoType.itemID == Fallout.a22LR.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.case22LR));}
					if (ammoType.itemID == Fallout.a9mm.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.case9mm));}
					if (ammoType.itemID == Fallout.a357.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.case357));}
					if (ammoType.itemID == Fallout.a44.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.case44));}
					if (ammoType.itemID == Fallout.a45Auto.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.case45Auto));}
					if (ammoType.itemID == Fallout.a50MG.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.case50MG));}
					if (ammoType.itemID == Fallout.aGovt.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.caseGovt));}
					if (ammoType.itemID == Fallout.a556.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.case556));}
					if (ammoType.itemID == Fallout.a5mm.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.case5mm));}
					if (ammoType.itemID == Fallout.a127.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.case127));}
					if (ammoType.itemID == Fallout.aGauge20.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.hull20));}
					if (ammoType.itemID == Fallout.aGauge12.itemID){var3.inventory.addItemStackToInventory(new ItemStack(Fallout.hull12));}

					if (ammoType.itemID == Fallout.cellMF.itemID && rand.nextInt(10) + 1 > 9)
					{
						var3.inventory.addItemStackToInventory(new ItemStack(Fallout.cellMFD));
					}

					if (ammoType.itemID == Fallout.cellElectron.itemID && rand.nextInt(10) + 1 > 9)
					{
						var3.inventory.addItemStackToInventory(new ItemStack(Fallout.cellECPD));
					}

					if (ammoType.itemID == Fallout.cellEnergy.itemID && rand.nextInt(10) + 1 > 9)
					{
						var3.inventory.addItemStackToInventory(new ItemStack(Fallout.cellED));
					}
				}

				firetick = 0;
			}

			else
			{
				//++firetick;
			}
		}

		if (firetick == firemax && firemax != 0 && rounds > 0)
		{

		}

		return var1;
	}

	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("blfngl" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		name = par3EntityPlayer.username;
	}

	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		gunHealth = var1.getItemDamage();
		var3.add("\u00A74DAM: " + (double)damage/2/*((double)damage/2)*((double)0.54 + gunHealth * (1-(double)0.54D))*/); //TODO After fixed condition appearance
		var3.add("\u00A79Clip size: " + rounds + "/" + clipSize + " Ammo Loaded");
		var3.add("\u00A72Ammo type: " + ammoType.getItemDisplayName(new ItemStack(ammoType)));
		var3.add("\u00A76CND: " + (cnd - gunHealth));

		if(name !=null){var3.add("\u00A7eCrafted by: " + name);}
		else{var3.add("\u00A7eNo Owner.");}
	}

	boolean reloading = false;

	public void onUpdate(ItemStack par1ItemStack, World var2, Entity par3Entity, int par4, boolean par5) 
	{
		EntityPlayer var3 = (EntityPlayer)par3Entity;

		if (!var2.isRemote && var3.inventory.hasItem(ammoType.itemID) && rounds<clipSize && Fallout.isReloading && !reloading)
		{
			reloading=true;

			if (reloadtick >= reloadmax)
			{
				reloadtick = 0;
				count = 0;
				var2.playSoundAtEntity(var3, reloadsound, 1.0F, 1.0F);

				while (rounds<clipSize && var3.inventory.hasItem(ammoType.itemID))
				{
					var3.inventory.consumeInventoryItem(ammoType.itemID);
					rounds += 1;
				}
			}

			else
			{
				++reloadtick;
			}

			reloading=false;
		}

		if(reloadtick<reloadmax){reloadtick+=1;}
		if(firetick<firemax){firetick+=1;}

		//TODO get scopes to work on servers
		/**if (Fallout.isScoped)
		{
			ModLoader.getMinecraftInstance().gameSettings.fovSetting = -1.0F;
			MinecraftForgeClient.registerItemRenderer(Fallout.rifleBozar.itemID, new RenderBozarScoped());
			MinecraftForgeClient.registerItemRenderer(Fallout.rifleRatslayer.itemID, new RenderRatslayerScoped());
			MinecraftForgeClient.registerItemRenderer(Fallout.rifleChineseAssault.itemID, new RenderChineseAssaultRifleScoped());
			MinecraftForgeClient.registerItemRenderer(Fallout.pistol45Auto.itemID, new Render45AutoScoped());

		}

		else
		{
			ModLoader.getMinecraftInstance().gameSettings.fovSetting = 0.0F;
			MinecraftForgeClient.registerItemRenderer(Fallout.rifleBozar.itemID, new RenderBozar());
			MinecraftForgeClient.registerItemRenderer(Fallout.rifleRatslayer.itemID, new RenderRatslayer());
			MinecraftForgeClient.registerItemRenderer(Fallout.rifleChineseAssault.itemID, new RenderChineseAssaultRifle());
			MinecraftForgeClient.registerItemRenderer(Fallout.pistol45Auto.itemID, new Render45Auto());
		}**/
	}
}
