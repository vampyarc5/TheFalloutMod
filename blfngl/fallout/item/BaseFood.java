package blfngl.fallout.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class BaseFood extends ItemFood
{
	public BaseFood(int par1, int par2, float par3, boolean par4)
	{
		super(par1, par2, par3, par4);
		this.setCreativeTab(CreativeTabs.tabFood);
	}

	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("blfngl" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}