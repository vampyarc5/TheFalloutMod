package blfngl.fallout.gun.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChineseAssaultRifle extends ModelBase
{
    public static ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape61;
    ModelRenderer Shape62;
    ModelRenderer Shape63;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape111;
    ModelRenderer Shape112;
    ModelRenderer Shape12;
    ModelRenderer Shape121;
    ModelRenderer Shape122;

    public ModelChineseAssaultRifle()
    {
        this.textureWidth = 128;
        this.textureHeight = 128;
        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 29);
        Shape1.setRotationPoint(0.0F, 0.0F, -31.0F);
        Shape1.setTextureSize(128, 128);
        Shape1.mirror = true;
        this.setRotation(Shape1, 0.0F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 0, 102);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 5, 7, 19);
        this.Shape2.setRotationPoint(-1.0F, -3.0F, -2.0F);
        this.Shape2.setTextureSize(128, 128);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, -0.0743572F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 0, 81);
        this.Shape3.addBox(0.0F, 0.0F, -1.0F, 5, 5, 16);
        this.Shape3.setRotationPoint(-1.0F, -5.0F, -1.0F);
        this.Shape3.setTextureSize(128, 128);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 0.0371786F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 0, 0);
        this.Shape4.addBox(0.0F, 0.0F, -1.0F, 5, 6, 31);
        this.Shape4.setRotationPoint(-1.0F, -1.0F, 17.0F);
        this.Shape4.setTextureSize(128, 128);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 109, 107);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 3, 15, 6);
        this.Shape5.setRotationPoint(0.0F, 5.0F, 41.0F);
        this.Shape5.setTextureSize(128, 128);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, 0.2602503F, 0.0F, 0.0F);
        this.Shape6 = new ModelRenderer(this, 105, 28);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 3, 6, 8);
        this.Shape6.setRotationPoint(0.0F, 5.0F, 26.0F);
        this.Shape6.setTextureSize(128, 128);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
        this.Shape61 = new ModelRenderer(this, 105, 28);
        this.Shape61.addBox(0.0F, 0.0F, 0.0F, 3, 6, 8);
        this.Shape61.setRotationPoint(0.0F, 10.0F, 26.0F);
        this.Shape61.setTextureSize(128, 128);
        this.Shape61.mirror = true;
        this.setRotation(this.Shape61, -0.1115358F, 0.0F, 0.0F);
        this.Shape62 = new ModelRenderer(this, 105, 28);
        this.Shape62.addBox(0.0F, 0.0F, 0.0F, 3, 6, 8);
        this.Shape62.setRotationPoint(0.0F, 19.0F, 25.0F);
        this.Shape62.setTextureSize(128, 128);
        this.Shape62.mirror = true;
        this.setRotation(this.Shape62, -0.6792935F, 0.0F, 0.0F);
        this.Shape63 = new ModelRenderer(this, 105, 23);
        this.Shape63.addBox(0.0F, 0.0F, 0.0F, 3, 8, 8);
        this.Shape63.setRotationPoint(0.0F, 14.0F, 26.0F);
        this.Shape63.setTextureSize(128, 128);
        this.Shape63.mirror = true;
        this.setRotation(this.Shape63, -0.3346075F, 0.0F, 0.0F);
        this.Shape7 = new ModelRenderer(this, 32, 70);
        this.Shape7.addBox(0.0F, 0.0F, -4.0F, 3, 5, 24);
        this.Shape7.setRotationPoint(0.0F, -2.0F, 51.0F);
        this.Shape7.setTextureSize(128, 128);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, -0.2271031F, 0.0F, 0.0F);
        this.Shape8 = new ModelRenderer(this, 46, 102);
        this.Shape8.addBox(0.0F, 0.0F, 0.0F, 3, 6, 16);
        this.Shape8.setRotationPoint(0.0F, -4.0F, 55.0F);
        this.Shape8.setTextureSize(128, 128);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, -0.075701F, 0.0F, 0.0F);
        this.Shape9 = new ModelRenderer(this, 0, 0);
        this.Shape9.addBox(0.0F, 0.0F, 0.0F, 1, 3, 12);
        this.Shape9.setRotationPoint(1.0F, -4.0F, -14.0F);
        this.Shape9.setTextureSize(128, 128);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
        this.Shape10 = new ModelRenderer(this, 0, 0);
        this.Shape10.addBox(0.0F, 0.0F, 0.0F, 1, 3, 7);
        this.Shape10.setRotationPoint(1.0F, -1.533333F, -12.0F);
        this.Shape10.setTextureSize(128, 128);
        this.Shape10.mirror = true;
        this.setRotation(this.Shape10, -2.498134F, 0.0F, 0.0F);
        this.Shape111 = new ModelRenderer(this, 0, 0);
        this.Shape111.addBox(0.0F, 0.0F, 0.0F, 1, 8, 2);
        this.Shape111.setRotationPoint(1.0F, -7.0F, -29.0F);
        this.Shape111.setTextureSize(128, 128);
        this.Shape111.mirror = true;
        this.setRotation(this.Shape111, 0.0F, 0.0F, 0.0F);
        this.Shape112 = new ModelRenderer(this, 0, 0);
        this.Shape112.addBox(0.0F, 0.0F, 0.0F, 1, 8, 2);
        this.Shape112.setRotationPoint(1.0F, -6.0F, -29.0F);
        this.Shape112.setTextureSize(128, 128);
        this.Shape112.mirror = true;
        this.setRotation(this.Shape112, 0.3785051F, 0.0F, 0.0F);
        this.Shape12 = new ModelRenderer(this, 0, 0);
        this.Shape12.addBox(0.0F, 0.0F, 0.0F, 2, 5, 34);
        this.Shape12.setRotationPoint(0.0F, -5.0F, 13.0F);
        this.Shape12.setTextureSize(128, 128);
        this.Shape12.mirror = true;
        this.setRotation(this.Shape12, 0.0F, 0.0F, 0.1892526F);
        this.Shape121 = new ModelRenderer(this, 0, 0);
        this.Shape121.addBox(0.0F, 0.0F, 0.0F, 2, 5, 34);
        this.Shape121.setRotationPoint(1.0F, -4.666667F, 13.0F);
        this.Shape121.setTextureSize(128, 128);
        this.Shape121.mirror = true;
        this.setRotation(this.Shape121, 0.0F, 0.0F, -0.1892461F);
        this.Shape122 = new ModelRenderer(this, 0, 0);
        this.Shape122.addBox(0.0F, 0.0F, 0.0F, 3, 1, 34);
        this.Shape122.setRotationPoint(0.0F, -5.0F, 13.0F);
        this.Shape122.setTextureSize(128, 128);
        this.Shape122.mirror = true;
        this.setRotation(this.Shape122, 0.0F, 0.0F, 0.0F);
    }

    public void renderModel(float var1)
    {
        Shape1.render(var1);
        this.Shape2.render(var1);
        this.Shape3.render(var1);
        this.Shape4.render(var1);
        this.Shape5.render(var1);
        this.Shape6.render(var1);
        this.Shape61.render(var1);
        this.Shape62.render(var1);
        this.Shape63.render(var1);
        this.Shape7.render(var1);
        this.Shape8.render(var1);
        this.Shape9.render(var1);
        this.Shape10.render(var1);
        this.Shape111.render(var1);
        this.Shape112.render(var1);
        this.Shape12.render(var1);
        this.Shape121.render(var1);
        this.Shape122.render(var1);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
        Shape1.render(var7);
        this.Shape2.render(var7);
        this.Shape3.render(var7);
        this.Shape4.render(var7);
        this.Shape5.render(var7);
        this.Shape6.render(var7);
        this.Shape61.render(var7);
        this.Shape62.render(var7);
        this.Shape63.render(var7);
        this.Shape7.render(var7);
        this.Shape8.render(var7);
        this.Shape9.render(var7);
        this.Shape10.render(var7);
        this.Shape111.render(var7);
        this.Shape112.render(var7);
        this.Shape12.render(var7);
        this.Shape121.render(var7);
        this.Shape122.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6, Entity var7)
    {
        super.setRotationAngles(var1, var2, var3, var4, var5, var6, var7);
    }
}
