package blfngl.fallout.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSilverfish;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import blfngl.fallout.Fallout;
import blfngl.fallout.entity.EntityBOSPaladin;
import blfngl.fallout.entity.EntityBrahmin;
import blfngl.fallout.entity.EntityFGhoul;
import blfngl.fallout.entity.EntityGecko;
import blfngl.fallout.entity.EntityGiantAnt;
import blfngl.fallout.entity.EntityGlowingOne;
import blfngl.fallout.entity.EntityMrHandy;
import blfngl.fallout.entity.EntityNightStalker;
import blfngl.fallout.entity.EntityRadroach;
import blfngl.fallout.entity.model.ModelBrahmin;
import blfngl.fallout.entity.model.ModelGecko;
import blfngl.fallout.entity.model.ModelGiantAnt;
import blfngl.fallout.entity.model.ModelMrHandy;
import blfngl.fallout.entity.model.ModelNightStalker;
import blfngl.fallout.entity.render.RenderBOSPaladin;
import blfngl.fallout.entity.render.RenderBrahmin;
import blfngl.fallout.entity.render.RenderFGhoul;
import blfngl.fallout.entity.render.RenderGecko;
import blfngl.fallout.entity.render.RenderGiantAnt;
import blfngl.fallout.entity.render.RenderGlowingOne;
import blfngl.fallout.entity.render.RenderMrHandy;
import blfngl.fallout.entity.render.RenderNightStalker;
import blfngl.fallout.entity.render.RenderRadroach;
import blfngl.fallout.gui.GuiLevelUp;
import blfngl.fallout.gun.render.Render45Auto;
import blfngl.fallout.gun.render.Render45AutoScoped;
import blfngl.fallout.gun.render.Render9mmPistol;
import blfngl.fallout.gun.render.RenderAntiMaterielRifle;
import blfngl.fallout.gun.render.RenderAssaultCarbine;
import blfngl.fallout.gun.render.RenderBozar;
import blfngl.fallout.gun.render.RenderBozarScoped;
import blfngl.fallout.gun.render.RenderChineseAssaultRifle;
import blfngl.fallout.gun.render.RenderChineseAssaultRifleScoped;
import blfngl.fallout.gun.render.RenderDoubleBarrelShotgun;
import blfngl.fallout.gun.render.RenderRatslayer;
import blfngl.fallout.gun.render.RenderRatslayerScoped;
import blfngl.fallout.handler.ReloadHandler;
import blfngl.fallout.handler.ScopeHandler;
import blfngl.fallout.handler.SoundHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{
	@Override
	@SideOnly(Side.CLIENT)
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityFGhoul.class, new RenderFGhoul(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGlowingOne.class, new RenderGlowingOne(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrahmin.class, new RenderBrahmin(new ModelBrahmin(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGiantAnt.class, new RenderGiantAnt(new ModelGiantAnt(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityNightStalker.class, new RenderNightStalker(new ModelNightStalker(), 1.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBOSPaladin.class, new RenderBOSPaladin(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityRadroach.class, new RenderRadroach(new ModelSilverfish(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGecko.class, new RenderGecko(new ModelGecko(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMrHandy.class, new RenderMrHandy(new ModelMrHandy(), 0.5F));

		MinecraftForgeClient.registerItemRenderer(Fallout.rifleBozar.itemID, (IItemRenderer)new RenderBozar());
		MinecraftForgeClient.registerItemRenderer(Fallout.rifleRatslayer.itemID, (IItemRenderer)new RenderRatslayer());
		MinecraftForgeClient.registerItemRenderer(Fallout.rifleAssaultCarbine.itemID, (IItemRenderer)new RenderAssaultCarbine());
		MinecraftForgeClient.registerItemRenderer(Fallout.pistol9mm.itemID, (IItemRenderer)new Render9mmPistol());
		MinecraftForgeClient.registerItemRenderer(Fallout.rifleChineseAssault.itemID, (IItemRenderer)new RenderChineseAssaultRifle());
		MinecraftForgeClient.registerItemRenderer(Fallout.rifleAntiMateriel.itemID, (IItemRenderer)new RenderAntiMaterielRifle());
		MinecraftForgeClient.registerItemRenderer(Fallout.shotgunDoubleBarrel.itemID, (IItemRenderer)new RenderDoubleBarrelShotgun());
		MinecraftForgeClient.registerItemRenderer(Fallout.pistol45Auto.itemID, (IItemRenderer)new Render45Auto());

		KeyBinding[] var1 = new KeyBinding[] {new KeyBinding("Fallout - Zoom", 33)};
		boolean[] var2 = new boolean[] {false};
		KeyBindingRegistry.registerKeyBinding(new ScopeHandler(var1, var2));

		KeyBinding[] var3 = new KeyBinding[] {new KeyBinding("Fallout - Reload", 34)};
		boolean[] var4 = new boolean[] {false};
		KeyBindingRegistry.registerKeyBinding(new ReloadHandler(var3, var4));
	}        

	public int addArmor(String Armor)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(Armor);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerSoundHandler()
	{
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if (tileEntity != null)
		{
			switch(ID)
			{
			case 0:
			case 1: return new GuiLevelUp(player);
			}
		}
		return tileEntity;
	}
}