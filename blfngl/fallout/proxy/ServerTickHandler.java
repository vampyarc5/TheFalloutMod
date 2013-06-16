package blfngl.fallout.proxy;

import java.util.EnumSet;

import blfngl.fallout.Fallout;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler
{

	private void onPlayerTick(EntityPlayer player)
	{
		if(player.getCurrentItemOrArmor(1) != null && player.getCurrentItemOrArmor(2) != null
				&& player.getCurrentItemOrArmor(3) != null && player.getCurrentItemOrArmor(4) != null)
		{
			ItemStack boots = player.getCurrentItemOrArmor(1);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack helm = player.getCurrentItemOrArmor(4);

			if(boots.getItem() == Fallout.HellBoots && legs.getItem() == Fallout.HellLegs && chest.getItem() == Fallout.HellChest && helm.getItem() == Fallout.HellHelm)
			{
				player.addPotionEffect((new PotionEffect(Potion.fireResistance.getId(), 20, 0)));
			}
		}
	}

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData)
	{
		if (type.equals(EnumSet.of(TickType.PLAYER)))
		{
			onPlayerTick((EntityPlayer)tickData[0]);
		}
	}

	@Override
	public EnumSet<TickType> ticks() 
	{
		return EnumSet.of(TickType.PLAYER, TickType.SERVER);
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{

	}

	@Override
	public String getLabel()
	{
		return "Fallout" + this.getClass().getSimpleName();
	}
}