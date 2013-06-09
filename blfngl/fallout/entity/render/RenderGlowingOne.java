package blfngl.fallout.entity.render;

import blfngl.fallout.entity.EntityGlowingOne;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGlowingOne extends RenderLiving
{
    public RenderGlowingOne(ModelBiped par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    public void renderGlowingOne(EntityGlowingOne par1EntityGlowingOne, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityGlowingOne, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderGlowingOne((EntityGlowingOne)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderGlowingOne((EntityGlowingOne)par1Entity, par2, par4, par6, par8, par9);
    }
}
