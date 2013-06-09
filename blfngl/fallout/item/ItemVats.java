package blfngl.fallout.item;

import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;

public class ItemVats
{
    private boolean toggle = false;
    private final int key = 34;
    public static ItemVats aimbot = new ItemVats();
    private float currDist;
    private Entity selected;

    public void tick(List var1, EntityPlayer var2)
    {
        if (this.selected != null && this.selected.isEntityAlive() && this.selected.getDistanceSqToEntity(var2) <= 36.0D)
        {
            var2.faceEntity(this.selected, 360.0F, 360.0F);
        }
        else
        {
            this.selected = null;
            this.swapTargets(var1, var2);
        }
    }

    public void swapTargets(List var1, EntityPlayer var2)
    {
        Iterator var3 = var1.iterator();

        while (var3.hasNext())
        {
            Object var4 = var3.next();

            if (var4 instanceof EntityLiving && var4 != var2)
            {
                float var5 = (float)((Entity)var4).getDistanceSqToEntity(var2);
                float var6 = (float)(this.selected == null ? 37.0D : this.selected.getDistanceSqToEntity(var2));

                if (var5 <= 36.0F && var5 < var6 && ((EntityLiving)var4).canEntityBeSeen(var2) && ((EntityLiving)var4).isEntityAlive())
                {
                    this.selected = (Entity)var4;
                }
            }
        }
    }

    public void toggle()
    {
        this.toggle = !this.toggle;
    }

    public boolean isEnabled()
    {
        return this.toggle;
    }

    public int getKey()
    {
        this.getClass();
        return 34;
    }
}
