package blfngl.fallout.gun.render;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import blfngl.fallout.gun.model.ModelDoubleBarrelShotgun;

public class RenderDoubleBarrelShotgun implements IItemRenderer
{
	protected ModelDoubleBarrelShotgun model = new ModelDoubleBarrelShotgun();

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
			this.model.render((Entity)var3[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();

		default:
		}
	}
}
