package blfngl.fallout.entity.render;

import blfngl.fallout.entity.EntityRadio;
import blfngl.fallout.model.ModelRadio;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderRadio extends RenderLiving
{
	public RenderRadio(ModelRadio par1ModelBase, float par2)
	{
		super(par1ModelBase, par2);
	}

	public void renderRadio(EntityRadio par1EntityRadio, double par2, double par4, double par6, float par8, float par9)
	{
		super.doRenderLiving(par1EntityRadio, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
	{
		this.renderRadio((EntityRadio)par1EntityLiving, par2, par4, par6, par8, par9);
	}

	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	{
		this.renderRadio((EntityRadio)par1Entity, par2, par4, par6, par8, par9);
	}
}
