package blfngl.fallout.gun.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAssaultCarbine extends ModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape4;
	ModelRenderer Shape2;
	ModelRenderer Shape21;
	ModelRenderer Shape22;
	ModelRenderer Shape23;
	ModelRenderer Shape41;
	ModelRenderer Shape42;
	ModelRenderer Shape3;
	ModelRenderer Shape24;
	ModelRenderer Shape31;
	ModelRenderer Shape32;
	ModelRenderer Shape33;
	ModelRenderer Shape25;
	ModelRenderer Shape34;
	ModelRenderer Shape26;
	ModelRenderer Shape35;
	ModelRenderer Shape36;

	public ModelAssaultCarbine()
	{
		textureWidth = 64;
		textureHeight = 32;

		Shape1 = new ModelRenderer(this, 44, 21);
		Shape1.addBox(-2F, -4F, -1.5F, 5, 8, 3);
		Shape1.setRotationPoint(0F, 0F, 0F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, -0.1745329F);
		Shape4 = new ModelRenderer(this, 52, 0);
		Shape4.addBox(-10.05333F, 7.32F, -1F, 4, 4, 2);
		Shape4.setRotationPoint(0F, 0F, 0F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0.3665191F);
		Shape2 = new ModelRenderer(this, 0, 15);
		Shape2.addBox(-28F, -9.06F, -2F, 16, 4, 4);
		Shape2.setRotationPoint(0F, 0F, 0F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape21 = new ModelRenderer(this, 40, 26);
		Shape21.addBox(-29F, -9F, -0.5F, 1, 1, 1);
		Shape21.setRotationPoint(0F, 0F, 0F);
		Shape21.setTextureSize(64, 32);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);
		Shape22 = new ModelRenderer(this, 40, 26);
		Shape22.addBox(-33F, -12.50667F, -0.5F, 1, 5, 1);
		Shape22.setRotationPoint(0F, 0F, 0F);
		Shape22.setTextureSize(64, 32);
		Shape22.mirror = true;
		setRotation(Shape22, 0F, 0F, 0F);
		Shape23 = new ModelRenderer(this, 40, 26);
		Shape23.addBox(-32F, -12F, -0.5F, 1, 1, 1);
		Shape23.setRotationPoint(0F, 0F, 0F);
		Shape23.setTextureSize(64, 32);
		Shape23.mirror = true;
		setRotation(Shape23, 0F, 0F, 0F);
		Shape41 = new ModelRenderer(this, 36, 0);
		Shape41.addBox(-11.5F, -2F, -1.5F, 5, 4, 3);
		Shape41.setRotationPoint(0F, 0F, 0F);
		Shape41.setTextureSize(64, 32);
		Shape41.mirror = true;
		setRotation(Shape41, 0F, 0F, 0.1908227F);
		Shape42 = new ModelRenderer(this, 52, 0);
		Shape42.addBox(-10.5F, 2F, -1F, 4, 5, 2);
		Shape42.setRotationPoint(0F, 0F, 0F);
		Shape42.setTextureSize(64, 32);
		Shape42.mirror = true;
		setRotation(Shape42, 0F, 0F, 0.296706F);
		Shape3 = new ModelRenderer(this, 0, 23);
		Shape3.addBox(10F, -9F, -1F, 6, 7, 2);
		Shape3.setRotationPoint(0F, 0F, 0F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape24 = new ModelRenderer(this, 40, 26);
		Shape24.addBox(-30F, -10F, -0.5F, 1, 1, 1);
		Shape24.setRotationPoint(0F, 0F, 0F);
		Shape24.setTextureSize(64, 32);
		Shape24.mirror = true;
		setRotation(Shape24, 0F, 0F, 0F);
		Shape31 = new ModelRenderer(this, 44, 15);
		Shape31.addBox(0.6933333F, -12.14667F, -1F, 2, 4, 2);
		Shape31.setRotationPoint(0F, 0F, 0F);
		Shape31.setTextureSize(64, 32);
		Shape31.mirror = true;
		setRotation(Shape31, 0F, 0F, -0.122173F);
		Shape32 = new ModelRenderer(this, 2, 25);
		Shape32.addBox(2F, -9F, -1F, 4, 5, 2);
		Shape32.setRotationPoint(0F, 0F, 0F);
		Shape32.setTextureSize(64, 32);
		Shape32.mirror = true;
		setRotation(Shape32, 0F, 0F, 0F);
		Shape33 = new ModelRenderer(this, 2, 24);
		Shape33.addBox(6F, -9F, -1F, 4, 6, 2);
		Shape33.setRotationPoint(0F, 0F, 0F);
		Shape33.setTextureSize(64, 32);
		Shape33.mirror = true;
		setRotation(Shape33, 0F, 0F, 0F);
		Shape25 = new ModelRenderer(this, 26, 11);
		Shape25.addBox(-41F, -8F, -1F, 13, 2, 2);
		Shape25.setRotationPoint(0F, 0F, 0F);
		Shape25.setTextureSize(64, 32);
		Shape25.mirror = true;
		setRotation(Shape25, 0F, 0F, 0F);
		Shape34 = new ModelRenderer(this, 0, 11);
		Shape34.addBox(-10F, -15F, -1F, 11, 2, 2);
		Shape34.setRotationPoint(0F, 2F, 0F);
		Shape34.setTextureSize(64, 32);
		Shape34.mirror = true;
		setRotation(Shape34, 0F, 0F, 0F);
		Shape26 = new ModelRenderer(this, 40, 26);
		Shape26.addBox(-31F, -11F, -0.5F, 1, 1, 1);
		Shape26.setRotationPoint(0F, 0F, 0F);
		Shape26.setTextureSize(64, 32);
		Shape26.mirror = true;
		setRotation(Shape26, 0F, 0F, 0F);
		Shape35 = new ModelRenderer(this, 52, 15);
		Shape35.addBox(-13F, -9.52F, -1F, 1, 4, 2);
		Shape35.setRotationPoint(0F, 0F, 0F);
		Shape35.setTextureSize(64, 32);
		Shape35.mirror = true;
		setRotation(Shape35, 0F, 0F, 0.2617994F);
		Shape36 = new ModelRenderer(this, 0, 0);
		Shape36.addBox(-12F, -9F, -2F, 14, 6, 4);
		Shape36.setRotationPoint(0F, 0F, 0F);
		Shape36.setTextureSize(64, 32);
		Shape36.mirror = true;
		setRotation(Shape36, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape1.render(f5);
		Shape4.render(f5);
		Shape2.render(f5);
		Shape21.render(f5);
		Shape22.render(f5);
		Shape23.render(f5);
		Shape41.render(f5);
		Shape42.render(f5);
		Shape3.render(f5);
		Shape24.render(f5);
		Shape31.render(f5);
		Shape32.render(f5);
		Shape33.render(f5);
		Shape25.render(f5);
		Shape34.render(f5);
		Shape26.render(f5);
		Shape35.render(f5);
		Shape36.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
