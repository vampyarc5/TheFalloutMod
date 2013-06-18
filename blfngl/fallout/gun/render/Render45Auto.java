package blfngl.fallout.gun.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import blfngl.fallout.gun.model.Model45Auto;

public class Render45Auto implements IItemRenderer
{
	protected Model45Auto model = new Model45Auto();

	public boolean handleRenderType(ItemStack var1, ItemRenderType var2)
	{
		switch (RenderHelper.newRender[var2.ordinal()])
		{
		case 1:
			return true;

		default:
			return false;
		}
	}

	public boolean shouldUseRenderHelper(ItemRenderType var1, ItemStack var2, ItemRendererHelper var3)
	{
		return false;
	}

	public void renderItem(ItemRenderType var1, ItemStack var2, Object ... var3)
	{
		switch (RenderHelper.newRender[var1.ordinal()])
		{
		case 1:
			GL11.glPushMatrix();
			Minecraft.getMinecraft().renderEngine.bindTexture("/blfngl/fallout/textures/ChineseAssaultRifle.png");
			boolean var4 = false;

			if (var3[1] != null && var3[1] instanceof EntityPlayer)
			{
				float var5;

				if ((EntityPlayer)var3[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && (!(Minecraft.getMinecraft().currentScreen instanceof GuiInventory) && !(Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) || RenderManager.instance.playerViewY != 180.0F))
				{
					var4 = true;
					var5 = 0.8F;
					GL11.glTranslatef(0.6F, 0.6F, 0.1F);
					GL11.glScalef(var5, var5, var5);
					GL11.glRotatef(30.0F, 0.0F, 0.0F, 1.0F);
					GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
					GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
				}

				else
				{
					var5 = 0.6F;
					GL11.glTranslatef(0.4F, 0.8F, -0.05F);
					GL11.glScalef(var5, var5, var5);
					GL11.glRotatef(30.0F, 0.0F, 0.0F, 1.0F);
					GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
					GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
				}
			}

			this.model.render((Entity)var3[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();

		default:
		}
	}
}
