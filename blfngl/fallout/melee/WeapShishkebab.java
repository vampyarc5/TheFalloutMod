package blfngl.fallout.melee;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import blfngl.fallout.Fallout;

public class WeapShishkebab extends ItemSword
{
	public WeapShishkebab(int itemID, EnumToolMaterial toolMaterial)
	{
		super(itemID, toolMaterial);
	}

	public ItemStack onItemRightClick(ItemStack par1)
	{
		return new ItemStack(Fallout.shiskebabFlaming, 1);
	}
	
	public void func_94581_a(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("blfngl" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}