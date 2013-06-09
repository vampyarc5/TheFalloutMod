package blfngl.fallout.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGecko extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Leg;
    ModelRenderer Leg1;
    ModelRenderer Face;
    ModelRenderer Snout;
    ModelRenderer Arm;
    ModelRenderer Arm1;
    ModelRenderer Tail;
  
  public ModelGecko()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 6, 11, 3);
      Body.setRotationPoint(-3F, 10F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Leg = new ModelRenderer(this, 18, 0);
      Leg.addBox(0F, 0F, 0F, 2, 3, 2);
      Leg.setRotationPoint(-3F, 21F, 0.5F);
      Leg.setTextureSize(64, 32);
      Leg.mirror = true;
      setRotation(Leg, 0F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 18, 0);
      Leg1.addBox(0F, 0F, 0F, 2, 3, 2);
      Leg1.setRotationPoint(1F, 21F, 0.5F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Face = new ModelRenderer(this, 0, 14);
      Face.addBox(0F, 0F, 0F, 4, 3, 3);
      Face.setRotationPoint(-2F, 8F, -2F);
      Face.setTextureSize(64, 32);
      Face.mirror = true;
      setRotation(Face, 0.3717861F, 0F, 0F);
      Snout = new ModelRenderer(this, 18, 5);
      Snout.addBox(0F, 0F, 0F, 3, 2, 2);
      Snout.setRotationPoint(-1.5F, 9.5F, -3F);
      Snout.setTextureSize(64, 32);
      Snout.mirror = true;
      setRotation(Snout, 0.3665191F, 0F, 0F);
      Arm = new ModelRenderer(this, 0, 20);
      Arm.addBox(0F, 0F, 0F, 1, 1, 4);
      Arm.setRotationPoint(-4F, 13F, -2.466667F);
      Arm.setTextureSize(64, 32);
      Arm.mirror = true;
      setRotation(Arm, 0.3665191F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 0, 20);
      Arm1.addBox(0F, 0F, 0F, 1, 1, 4);
      Arm1.setRotationPoint(3F, 13F, -2F);
      Arm1.setTextureSize(64, 32);
      Arm1.mirror = true;
      setRotation(Arm1, 0.3665191F, 0F, 0F);
      Tail = new ModelRenderer(this, 0, 25);
      Tail.addBox(0F, 0F, 0F, 3, 1, 4);
      Tail.setRotationPoint(-1.5F, 18F, 3F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, -0.4363323F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Leg.render(f5);
    Leg1.render(f5);
    Face.render(f5);
    Snout.render(f5);
    Arm.render(f5);
    Arm1.render(f5);
    Tail.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
  }

}