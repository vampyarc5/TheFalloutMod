package blfngl.fallout.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGiantAnt extends ModelBase
{
	//fields
	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer RearEnd;
	ModelRenderer Leg8;
	ModelRenderer Leg6;
	ModelRenderer Leg2;
	ModelRenderer Leg7;
	ModelRenderer Leg5;
	ModelRenderer Leg1;

	public ModelGiantAnt()
	{
		textureWidth = 64;
		textureHeight = 32;

		Head = new ModelRenderer(this, 32, 4);
		Head.addBox(-4F, -4F, -8F, 8, 8, 8);
		Head.setRotationPoint(0F, 20F, -3F);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Body = new ModelRenderer(this, 0, 0);
		Body.addBox(-3F, -3F, -3F, 6, 6, 6);
		Body.setRotationPoint(0F, 20F, 0F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		RearEnd = new ModelRenderer(this, 0, 12);
		RearEnd.addBox(-5F, -4F, -6F, 10, 8, 12);
		RearEnd.setRotationPoint(0F, 20F, 9F);
		RearEnd.setTextureSize(64, 32);
		RearEnd.mirror = true;
		setRotation(RearEnd, 0F, 0F, 0F);
		Leg8 = new ModelRenderer(this, 18, 0);
		Leg8.addBox(-1F, -1F, -1F, 16, 2, 2);
		Leg8.setRotationPoint(4F, 20F, -1F);
		Leg8.setTextureSize(64, 32);
		Leg8.mirror = true;
		setRotation(Leg8, 0F, 0.5759587F, 0.1919862F);
		Leg6 = new ModelRenderer(this, 18, 0);
		Leg6.addBox(-1F, -1F, -1F, 16, 2, 2);
		Leg6.setRotationPoint(4F, 20F, 0F);
		Leg6.setTextureSize(64, 32);
		Leg6.mirror = true;
		setRotation(Leg6, -0.1115358F, -0.0553548F, 0.1919862F);
		Leg2 = new ModelRenderer(this, 18, 0);
		Leg2.addBox(-1F, -1F, -1F, 16, 2, 2);
		Leg2.setRotationPoint(4F, 20F, 2F);
		Leg2.setTextureSize(64, 32);
		Leg2.mirror = true;
		setRotation(Leg2, 0F, -0.5759587F, 0.1919862F);
		Leg7 = new ModelRenderer(this, 18, 0);
		Leg7.addBox(-15F, -1F, -1F, 16, 2, 2);
		Leg7.setRotationPoint(-4F, 20F, -1F);
		Leg7.setTextureSize(64, 32);
		Leg7.mirror = true;
		setRotation(Leg7, 0F, -0.5759587F, -0.1919862F);
		Leg5 = new ModelRenderer(this, 18, 0);
		Leg5.addBox(-15F, -1F, -1F, 16, 2, 2);
		Leg5.setRotationPoint(-4F, 20F, 0F);
		Leg5.setTextureSize(64, 32);
		Leg5.mirror = true;
		setRotation(Leg5, 0F, 0.0181762F, -0.1919862F);
		Leg1 = new ModelRenderer(this, 18, 0);
		Leg1.addBox(-15F, -1F, -1F, 16, 2, 2);
		Leg1.setRotationPoint(-4F, 20F, 2F);
		Leg1.setTextureSize(64, 32);
		Leg1.mirror = true;
		setRotation(Leg1, 0F, 0.5759587F, -0.1919862F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Head.render(f5);
		Body.render(f5);
		RearEnd.render(f5);
		Leg8.render(f5);
		Leg6.render(f5);
		Leg2.render(f5);
		Leg7.render(f5);
		Leg5.render(f5);
		Leg1.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
	{
		this.Head.rotateAngleY = f4 / (180F / (float)Math.PI);
		this.Head.rotateAngleX = f5 / (180F / (float)Math.PI);
		float f6 = ((float)Math.PI / 4F);
		this.Leg1.rotateAngleZ = -f6;
		this.Leg2.rotateAngleZ = f6;
		this.Leg5.rotateAngleZ = -f6 * 0.74F;
		this.Leg6.rotateAngleZ = f6 * 0.74F;
		this.Leg7.rotateAngleZ = -f6;
		this.Leg8.rotateAngleZ = f6;
		float f7 = -0.0F;
		float f8 = 0.3926991F;
		this.Leg1.rotateAngleY = f8 * 2.0F + f7;
		this.Leg2.rotateAngleY = -f8 * 2.0F - f7;
		this.Leg5.rotateAngleY = -f8 * 1.0F + f7;
		this.Leg6.rotateAngleY = f8 * 1.0F - f7;
		this.Leg7.rotateAngleY = -f8 * 2.0F + f7;
		this.Leg8.rotateAngleY = f8 * 2.0F - f7;
		float f9 = -(MathHelper.cos(f1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * f2;
		float f10 = -(MathHelper.cos(f1 * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * f2;
		float f11 = -(MathHelper.cos(f1 * 0.6662F * 2.0F + ((float)Math.PI / 2F)) * 0.4F) * f2;
		float f12 = -(MathHelper.cos(f1 * 0.6662F * 2.0F + ((float)Math.PI * 3F / 2F)) * 0.4F) * f2;
		float f13 = Math.abs(MathHelper.sin(f1 * 0.6662F + 0.0F) * 0.4F) * f2;
		float f14 = Math.abs(MathHelper.sin(f1 * 0.6662F + (float)Math.PI) * 0.4F) * f2;
		float f15 = Math.abs(MathHelper.sin(f1 * 0.6662F + ((float)Math.PI / 2F)) * 0.4F) * f2;
		float f16 = Math.abs(MathHelper.sin(f1 * 0.6662F + ((float)Math.PI * 3F / 2F)) * 0.4F) * f2;
		this.Leg1.rotateAngleY += f9;
		this.Leg2.rotateAngleY += -f9;
		this.Leg5.rotateAngleY += f11;
		this.Leg6.rotateAngleY += -f11;
		this.Leg7.rotateAngleY += f12;
		this.Leg8.rotateAngleY += -f12;
		this.Leg1.rotateAngleZ += f13;
		this.Leg2.rotateAngleZ += -f13;
		this.Leg5.rotateAngleZ += f15;
		this.Leg6.rotateAngleZ += -f15;
		this.Leg7.rotateAngleZ += f16;
		this.Leg8.rotateAngleZ += -f16;
		//super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
	}

}
