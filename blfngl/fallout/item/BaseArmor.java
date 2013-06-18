package blfngl.fallout.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.IArmorTextureProvider;
import blfngl.fallout.Fallout;

public class BaseArmor extends ItemArmor implements IArmorTextureProvider
{
	public String type;

	public BaseArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String par5)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
		type = par5;
	}

	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("blfngl" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

	public String getArmorTextureFile(ItemStack par1)
	{
		if ( par1.itemID==Fallout.G1Helm.itemID|| par1.itemID==Fallout.G1Chest.itemID|| par1.itemID==Fallout.G1Boots.itemID|| par1.itemID==Fallout.G1Legs.itemID)
		{
			return "/blfngl/fallout/textures/Gecko1_1.png";
		}

		if ( par1.itemID==Fallout.WinterHelm.itemID|| par1.itemID==Fallout.WinterChest.itemID|| par1.itemID==Fallout.WinterBoots.itemID|| par1.itemID==Fallout.WinterLegs.itemID)
		{
			return "/blfngl/fallout/textures/Winter.png";
		}

		if ( par1.itemID==Fallout.T51Helm.itemID|| par1.itemID==Fallout.T51Chest.itemID||par1.itemID==Fallout.T51Boots.itemID|| par1.itemID==Fallout.T51Legs.itemID)
		{
			return "/blfngl/fallout/textures/T51.png";
		}

		if ( par1.itemID==Fallout.T45Helm.itemID||par1.itemID==Fallout.T45Chest.itemID||par1.itemID==Fallout.T45Boots.itemID|| par1.itemID==Fallout.T45Legs.itemID)
		{
			return "/blfngl/fallout/textures/T45.png";
		}

		if ( par1.itemID==Fallout.SierraHelm.itemID|| par1.itemID==Fallout.SierraChest.itemID|| par1.itemID==Fallout.SierraBoots.itemID|| par1.itemID==Fallout.SierraLegs.itemID)
		{
			return "/blfngl/fallout/textures/SierraSecurity.png";
		}

		if ( par1.itemID==Fallout.HellHelm.itemID|| par1.itemID==Fallout.HellChest.itemID|| par1.itemID==Fallout.HellBoots.itemID|| par1.itemID==Fallout.HellLegs.itemID)
		{
			return "/blfngl/fallout/textures/Hellfire.png";
		}

		if ( par1.itemID==Fallout.EnclaveHelm.itemID|| par1.itemID==Fallout.EnclaveChest.itemID|| par1.itemID==Fallout.EnclaveBoots.itemID|| par1.itemID==Fallout.EnclaveLegs.itemID)
		{
			return "/blfngl/fallout/textures/Enclave.png";
		}

		return "/blfngl/fallout/textures/Gecko1.png";
	}

	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		if (type == "Light")
		{
			var3.add("Light Armor");
		}

		if (type == "Medium")
		{
			var3.add("Medium Armor");
		}

		if (type == "Heavy")
		{
			var3.add("Heavy Armor");
		}
	}
}