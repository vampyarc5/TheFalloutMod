package blfngl.fallout.handler;

import java.util.EnumSet;

import net.minecraft.client.settings.KeyBinding;
import blfngl.fallout.Fallout;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class ReloadHandler extends KeyHandler
{
    private EnumSet tickTypes;

    public ReloadHandler(KeyBinding[] var1, boolean[] var2)
    {
        super(var1, var2);
        this.tickTypes = EnumSet.of(TickType.CLIENT);
    }

    public String getLabel()
    {
        return "Fallout - Reload";
    }

    public void keyDown(EnumSet var1, KeyBinding var2, boolean var3, boolean var4)
    {
        Fallout.isReloading = true;
    }

    public void keyUp(EnumSet var1, KeyBinding var2, boolean var3)
    {
    	Fallout.isReloading = false;
    }

    public EnumSet ticks()
    {
        return this.tickTypes;
    }
}
