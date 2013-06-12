package blfngl.fallout.handler;

import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import blfngl.fallout.Fallout;

public class VanillaDropHandler extends Fallout
{
	@ForgeSubscribe
	public void playerKillEnderdragon(LivingDeathEvent event)
	{
		if(event.entityLiving instanceof EntityWolf)
		{
			event.entityLiving.dropItem(dogBrain.itemID, 1);
		}
	}
}
