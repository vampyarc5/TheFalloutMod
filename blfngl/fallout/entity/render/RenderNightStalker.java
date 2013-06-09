package blfngl.fallout.entity.render;

import blfngl.fallout.entity.EntityNightStalker;
import blfngl.fallout.model.ModelNightStalker;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderNightStalker extends RenderLiving
{
    public RenderNightStalker(ModelNightStalker par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    public void renderNightStalker(EntityNightStalker par1EntityNightStalker, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityNightStalker, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderNightStalker((EntityNightStalker)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderNightStalker((EntityNightStalker)par1Entity, par2, par4, par6, par8, par9);
    }
}
