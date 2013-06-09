package blfngl.fallout.entity.render;

import blfngl.fallout.entity.EntityBOSPaladin;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBOSPaladin extends RenderLiving
{
    public RenderBOSPaladin(ModelBiped par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    public void renderBOSPaladin(EntityBOSPaladin par1EntityBOSPaladin, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityBOSPaladin, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderBOSPaladin((EntityBOSPaladin)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderBOSPaladin((EntityBOSPaladin)par1Entity, par2, par4, par6, par8, par9);
    }
}
