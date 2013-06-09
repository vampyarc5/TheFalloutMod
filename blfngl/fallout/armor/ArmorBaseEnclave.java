package blfngl.fallout.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import blfngl.fallout.Fallout;

public class ArmorBaseEnclave extends ItemArmor implements IArmorTextureProvider
{

	public ArmorBaseEnclave(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	}

	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("blfngl" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

	public String getArmorTextureFile(ItemStack par1)
	{
		if ( par1.itemID==Fallout.EnclaveHelm.itemID|| par1.itemID==Fallout.EnclaveChest.itemID|| par1.itemID==Fallout.EnclaveBoots.itemID)
		{
			return "/blfngl/fallout/textures/ADV1_1.png";
		}
		if(par1.itemID==Fallout.EnclaveLegs.itemID)
		{
			return "/blfngl/fallout/textures/ADV1_2.png";
		}
		return "/blfngl/fallout/textures/ADV1_1.png";
	}      
}