package blfngl.fallout.gun.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Model45Auto extends ModelBase
{
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape62;
	ModelRenderer Shape22;
	ModelRenderer Shape63;
	ModelRenderer Shape64;
	ModelRenderer Shape4543;
	ModelRenderer Shape445645;
	ModelRenderer Shape44645;
	ModelRenderer Shape345645;
	ModelRenderer Shape3456;
	ModelRenderer Shape3456648;
	ModelRenderer Shape3867;
	ModelRenderer Shape7568;
	ModelRenderer Shape74864;
	ModelRenderer Shape84866;
	ModelRenderer Shape84864;
	ModelRenderer leftarm;
	ModelRenderer rightarm;

	public Model45Auto()
	{
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Shape1 = new ModelRenderer(this, 40, 0);
		this.Shape1.addBox(0.0F, 2.0F, 0.0F, 3, 1, 9);
		this.Shape1.setRotationPoint(0.01F, 0.0F, 0.0F);
		this.Shape1.setTextureSize(64, 64);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
		this.Shape2 = new ModelRenderer(this, 0, 20);
		this.Shape2.addBox(0.0F, 0.0F, 1.0F, 2, 8, 4);
		this.Shape2.setRotationPoint(0.5F, 1.0F, 0.0F);
		this.Shape2.setTextureSize(64, 64);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, -0.2617994F, 0.0F, 0.0F);
		this.Shape4 = new ModelRenderer(this, 0, 7);
		this.Shape4.addBox(0.0F, 0.0F, 0.0F, 3, 3, 11);
		this.Shape4.setRotationPoint(0.0F, -0.5F, -0.2F);
		this.Shape4.setTextureSize(64, 64);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
		this.Shape5 = new ModelRenderer(this, 50, 19);
		this.Shape5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
		this.Shape5.setRotationPoint(0.5F, 0.9F, 8.266666F);
		this.Shape5.setTextureSize(64, 64);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
		this.Shape6 = new ModelRenderer(this, 15, 0);
		this.Shape6.addBox(0.0F, -1.0F, 0.0F, 2, 2, 2);
		this.Shape6.setRotationPoint(0.51F, 4.0F, -0.2666667F);
		this.Shape6.setTextureSize(64, 64);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, ((float)Math.PI / 4F), 0.0F, 0.0F);
		this.Shape62 = new ModelRenderer(this, 0, 0);
		this.Shape62.addBox(0.0F, -1.6F, 0.0F, 2, 3, 1);
		this.Shape62.setRotationPoint(0.49F, 3.5F, -0.3F);
		this.Shape62.setTextureSize(64, 64);
		this.Shape62.mirror = true;
		this.setRotation(this.Shape62, 1.396263F, 0.0F, 0.0F);
		this.Shape22 = new ModelRenderer(this, 34, -3);
		this.Shape22.addBox(0.0F, 0.0F, 0.0F, 1, 5, 2);
		this.Shape22.setRotationPoint(1.0F, 3.733333F, 0.5333334F);
		this.Shape22.setTextureSize(64, 64);
		this.Shape22.mirror = true;
		this.setRotation(this.Shape22, -0.4105138F, 0.0F, 0.0F);
		this.Shape63 = new ModelRenderer(this, 9, 0);
		this.Shape63.addBox(0.0F, -0.5F, 0.0F, 1, 2, 1);
		this.Shape63.setRotationPoint(1.0F, 1.0F, -1.5F);
		this.Shape63.setTextureSize(64, 64);
		this.Shape63.mirror = true;
		this.setRotation(this.Shape63, 1.396263F, 0.0F, 0.0F);
		this.Shape64 = new ModelRenderer(this, 0, 0);
		this.Shape64.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
		this.Shape64.setRotationPoint(1.01F, 1.1F, -1.25F);
		this.Shape64.setTextureSize(64, 64);
		this.Shape64.mirror = true;
		this.setRotation(this.Shape64, 1.136013F, 0.0F, 0.0F);
		this.Shape4543 = new ModelRenderer(this, 0, 0);
		this.Shape4543.addBox(0.0F, 1.0F, 0.0F, 3, 1, 2);
		this.Shape4543.setRotationPoint(0.01F, 0.6F, 10.0F);
		this.Shape4543.setTextureSize(64, 64);
		this.Shape4543.mirror = true;
		this.setRotation(this.Shape4543, 0.4363323F, 0.0F, 0.0F);
		this.Shape445645 = new ModelRenderer(this, 0, 0);
		this.Shape445645.addBox(0.0F, 0.0F, 0.0F, 3, 2, 2);
		this.Shape445645.setRotationPoint(0.0F, -0.5F, 11.8F);
		this.Shape445645.setTextureSize(64, 64);
		this.Shape445645.mirror = true;
		this.setRotation(this.Shape445645, 0.0F, 0.0F, 0.0F);
		this.Shape44645 = new ModelRenderer(this, 0, 0);
		this.Shape44645.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1);
		this.Shape44645.setRotationPoint(0.0F, -0.5F, 10.8F);
		this.Shape44645.setTextureSize(64, 64);
		this.Shape44645.mirror = true;
		this.setRotation(this.Shape44645, 0.0F, 0.0F, 0.0F);
		this.Shape345645 = new ModelRenderer(this, 0, 0);
		this.Shape345645.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1);
		this.Shape345645.setRotationPoint(1.4F, -1.0F, 12.0F);
		this.Shape345645.setTextureSize(64, 64);
		this.Shape345645.mirror = true;
		this.setRotation(this.Shape345645, 0.0F, 0.2617994F, 0.0F);
		this.Shape3456 = new ModelRenderer(this, 0, 0);
		this.Shape3456.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1);
		this.Shape3456.setRotationPoint(1.6F, -1.0F, 12.0F);
		this.Shape3456.setTextureSize(64, 64);
		this.Shape3456.mirror = true;
		this.setRotation(this.Shape3456, 0.0F, -0.2617994F, 0.0F);
		this.Shape3456648 = new ModelRenderer(this, 0, 0);
		this.Shape3456648.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1);
		this.Shape3456648.setRotationPoint(1.0F, -1.0F, 0.0F);
		this.Shape3456648.setTextureSize(64, 64);
		this.Shape3456648.mirror = true;
		this.setRotation(this.Shape3456648, 0.0F, -0.4363323F, 0.0F);
		this.Shape3867 = new ModelRenderer(this, 0, 0);
		this.Shape3867.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1);
		this.Shape3867.setRotationPoint(2.0F, -1.0F, 0.0F);
		this.Shape3867.setTextureSize(64, 64);
		this.Shape3867.mirror = true;
		this.setRotation(this.Shape3867, 0.0F, 0.4363323F, 0.0F);
		this.Shape7568 = new ModelRenderer(this, 0, 0);
		this.Shape7568.addBox(1.0F, 0.0F, 0.0F, 1, 1, 4);
		this.Shape7568.setRotationPoint(0.0F, 4.6F, 3.0F);
		this.Shape7568.setTextureSize(64, 64);
		this.Shape7568.mirror = true;
		this.setRotation(this.Shape7568, 0.0F, 0.0F, 0.0F);
		this.Shape74864 = new ModelRenderer(this, 0, 0);
		this.Shape74864.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
		this.Shape74864.setRotationPoint(1.0F, 5.2F, 6.0F);
		this.Shape74864.setTextureSize(64, 64);
		this.Shape74864.mirror = true;
		this.setRotation(this.Shape74864, 1.226894F, 0.0F, 0.0F);
		this.Shape84866 = new ModelRenderer(this, 28, 0);
		this.Shape84866.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
		this.Shape84866.setRotationPoint(1.0F, 0.0F, 12.2F);
		this.Shape84866.setTextureSize(64, 64);
		this.Shape84866.mirror = true;
		this.setRotation(this.Shape84866, 0.0F, 0.0F, 0.0F);
		this.Shape84864 = new ModelRenderer(this, 0, 0);
		this.Shape84864.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
		this.Shape84864.setRotationPoint(1.0F, 1.7F, 11.5F);
		this.Shape84864.setTextureSize(64, 64);
		this.Shape84864.mirror = true;
		this.setRotation(this.Shape84864, 0.0F, 0.0F, 0.0F);
		this.rightarm = new ModelRenderer(this, 40, 16);
		this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
		this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.rightarm.setTextureSize(64, 32);
		this.rightarm.mirror = true;
		this.setRotation(this.rightarm, -((float)Math.PI / 2F), 0.0F, 0.0F);
		this.leftarm = new ModelRenderer(this, 40, 16);
		this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
		this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.leftarm.setTextureSize(64, 32);
		this.leftarm.mirror = true;
		this.setRotation(this.leftarm, -((float)Math.PI / 2F), 0.0F, 0.0F);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	 public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
	{
		super.render(var1, var2, var3, var4, var5, var6, var7);
		this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
		this.Shape1.render(var7);
		this.Shape2.render(var7);
		this.Shape4.render(var7);
		this.Shape5.render(var7);
		this.Shape6.render(var7);
		this.Shape62.render(var7);
		this.Shape22.render(var7);
		this.Shape63.render(var7);
		this.Shape64.render(var7);
		this.Shape4543.render(var7);
		this.Shape445645.render(var7);
		this.Shape44645.render(var7);
		this.Shape345645.render(var7);
		this.Shape3456.render(var7);
		this.Shape3456648.render(var7);
		this.Shape3867.render(var7);
		this.Shape7568.render(var7);
		this.Shape74864.render(var7);
		this.Shape84866.render(var7);
		this.Shape84864.render(var7);
	}

	 public void renderRightArm(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
	 {
		 super.render(var1, var2, var3, var4, var5, var6, var7);
		 this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
		 this.rightarm.render(var7);
	 }

	 public void renderLeftArm(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
	 {
		 super.render(var1, var2, var3, var4, var5, var6, var7);
		 this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
		 this.leftarm.render(var7);
	 }

	 private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
	 {
		 var1.rotateAngleX = var2;
		 var1.rotateAngleY = var3;
		 var1.rotateAngleZ = var4;
	 }

	 public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6, Entity var7)
	 {
		 super.setRotationAngles(var1, var2, var3, var4, var5, var6, var7);
	 }
}
