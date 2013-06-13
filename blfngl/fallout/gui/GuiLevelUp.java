package blfngl.fallout.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;

import org.lwjgl.opengl.GL11;

public class GuiLevelUp extends GuiScreen
{
	public GuiLevelUp(EntityPlayer player)
	{

	}

	public final int xSizeOfTexture = 176;
	public final int ySizeOfTexture = 88;

	@Override
	public void drawScreen(int x, int y, float f)
	{
		drawDefaultBackground();

		//int var4 = this.mc.renderEngine.getTexture("/Block/changeColorGUI.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().renderEngine.bindTexture("/blfngl/fallout/textures/background.png");

		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;

		drawTexturedModalRect(posX, posY, 0, 0, xSizeOfTexture, ySizeOfTexture);

		super.drawScreen(x, y, f);
	}

	public void initGui()
	{
		this.buttonList.clear();

		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;

		this.buttonList.add(new GuiButton(0, posX+ 40, posY + 40, 100, 20, "Allocate Points"));
	}
}
