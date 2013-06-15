package blfngl.fallout.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import blfngl.fallout.Fallout;
import blfngl.fallout.handler.PerkHandler;

public class ItemImplant extends Item
{
	public int itemDamage;

	public ItemImplant(int par1, int par2)
	{
		super(par1);
		setMaxDamage(par2);
		setCreativeTab(Fallout.TabFalloutPerk);
		itemDamage = par2;
	}

	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		if (var3.inventory.hasItem(Fallout.bottleCap.itemID))
		{
			var3.inventory.consumeInventoryItem(Fallout.bottleCap.itemID);
			var1.damageItem(1, var3);

			if (var1.getItemDamage() == itemDamage - 1)
			{
				if (itemID == Fallout.perkImplantM5.itemID)
				{
					PerkHandler.implantM5 = true;
				}
			}
		}
		return var1;
	}
}
