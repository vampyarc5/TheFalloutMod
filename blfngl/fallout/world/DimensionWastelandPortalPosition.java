package blfngl.fallout.world;

import net.minecraft.util.ChunkCoordinates;

public class DimensionWastelandPortalPosition extends ChunkCoordinates
{
	public long field_85087_d;
	
	final DimensionWastelandTeleporter field_85088_e;
	
	public DimensionWastelandPortalPosition(DimensionWastelandTeleporter portal, int par2, int par3, int par4, long par5)
	{
		super(par2, par3, par4);
		this.field_85088_e = portal;
		this.field_85087_d = par5;
	}
}