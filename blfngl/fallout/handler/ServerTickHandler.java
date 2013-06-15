package blfngl.fallout.handler;

import java.util.EnumSet;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler
{
	private void onPlayerTick(EntityPlayer player)
	{
		if (PerkHandler.toughness){player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 20, 0));}
		if (PerkHandler.implantM5 && player.isSneaking()){player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 0));}
		if (PerkHandler.nerdRage && player.getHealth() < 4){player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 20, 4));}
		if (PerkHandler.walkerInstinct){player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 0));}
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