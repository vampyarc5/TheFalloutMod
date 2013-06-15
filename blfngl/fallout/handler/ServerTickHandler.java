package blfngl.fallout.handler;

import java.util.EnumSet;

import blfngl.fallout.Fallout;
import blfngl.fallout.item.ItemPerk;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler
{
	//Don't really need anymore, may use in the future
	private void onPlayerTick(EntityPlayer player)
	{

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