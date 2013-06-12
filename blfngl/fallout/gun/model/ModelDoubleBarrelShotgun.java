package blfngl.fallout.gun.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDoubleBarrelShotgun extends ModelBase
{
	ModelRenderer Shape4;
	ModelRenderer Shape2;
	ModelRenderer Shape1;
	ModelRenderer Shape3;

	public ModelDoubleBarrelShotgun()
	{
		textureWidth = 64;
		textureHeight = 32;

		Shape4 = new ModelRenderer(this, 0, 0);
		Shape4.addBox(0F, 0F, 0F, 2, 10, 2);
		Shape4.setRotationPoint(-1F, 7.466667F, -10F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 3.141593F, 0.0174533F, 1.990502F);
		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.addBox(0F, 0F, 0F, 2, 10, 2);
		Shape2.setRotationPoint(-1F, 7.5F, -7.5F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 3.141593F, 0.0174533F, 1.990502F);
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 1, 2, 3);
		Shape1.setRotationPoint(-1F, 8F, -8F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 3.141593F, 0.0174533F, 3.561298F);
		Shape3 = new ModelRenderer(this, 0, 0);
		Shape3.addBox(0F, 0F, 0F, 6, 2, 1);
		Shape3.setRotationPoint(-2F, 7.5F, -9F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 3.141593F, 0.0174533F, 3.926991F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape4.render(f5);
		Shape2.render(f5);
		Shape1.render(f5);
		Shape3.render(f5);
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
