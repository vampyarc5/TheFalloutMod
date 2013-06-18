package blfngl.fallout.proxy;

import java.util.EnumSet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import blfngl.fallout.Fallout;
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
				player.addPotionEffect((new PotionEffect(Potion.moveSlowdown.getId(), 20, 1)));
			}
		}

		if(player.getCurrentItemOrArmor(1) != null && player.getCurrentItemOrArmor(2) != null
				&& player.getCurrentItemOrArmor(3) != null && player.getCurrentItemOrArmor(4) != null)
		{
			ItemStack boots = player.getCurrentItemOrArmor(1);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack helm = player.getCurrentItemOrArmor(4);

			if(boots.getItem() == Fallout.ReconBoots && legs.getItem() == Fallout.ReconLegs && chest.getItem() == Fallout.ReconChest
					&& helm.getItem() == Fallout.ReconHelm)
			{
				player.addPotionEffect((new PotionEffect(Potion.moveSlowdown.getId(), 20, 0)));
			}
		}

		if(player.getCurrentItemOrArmor(1) != null && player.getCurrentItemOrArmor(2) != null
				&& player.getCurrentItemOrArmor(3) != null && player.getCurrentItemOrArmor(4) != null && Fallout.armorSlowness == true)
		{
			ItemStack boots = player.getCurrentItemOrArmor(1);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack helm = player.getCurrentItemOrArmor(4);

			if(boots.getItem() == Fallout.EnclaveBoots && legs.getItem() == Fallout.EnclaveLegs && chest.getItem() == Fallout.EnclaveChest
					&& helm.getItem() == Fallout.EnclaveHelm
					|| boots.getItem() == Fallout.T45Boots && legs.getItem() == Fallout.T45Legs && chest.getItem() == Fallout.T45Chest
					&& helm.getItem() == Fallout.T45Helm
					|| boots.getItem() == Fallout.T51Boots && legs.getItem() == Fallout.T51Legs && chest.getItem() == Fallout.T51Chest
					&& helm.getItem() == Fallout.T51Helm
					|| boots.getItem() == Fallout.WinterBoots && legs.getItem() == Fallout.WinterLegs && chest.getItem() == Fallout.WinterChest
					&& helm.getItem() == Fallout.WinterHelm)
			{
				player.addPotionEffect((new PotionEffect(Potion.moveSlowdown.getId(), 20, 1)));
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