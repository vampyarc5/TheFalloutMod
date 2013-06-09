package blfngl.fallout.render;

import net.minecraftforge.client.IItemRenderer.ItemRenderType;

class RenderHelper
{
    static final int[] newRender = new int[ItemRenderType.values().length];

    static
    {
        try
        {
            newRender[ItemRenderType.EQUIPPED.ordinal()] = 1;
        }
        catch (NoSuchFieldError var1)
        {
            ;
        }
    }
}
