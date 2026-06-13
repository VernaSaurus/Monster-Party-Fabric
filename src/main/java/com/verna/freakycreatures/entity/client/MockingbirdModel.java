package com.verna.freakycreatures.entity.client;

import com.verna.freakycreatures.MonsterParty;
import com.verna.freakycreatures.entity.custom.MockingbirdEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class MockingbirdModel<T extends MockingbirdEntity> extends SinglePartEntityModel<T> {

    public static final EntityModelLayer MOCKINGBIRD = new EntityModelLayer(Identifier.of(MonsterParty.MOD_ID, "mockingbird"), "main");

    private final ModelPart mockingbird;
    private final ModelPart bill;
    private final ModelPart chin;
    private final ModelPart left_wing;
    private final ModelPart right_wing;
    private final ModelPart left_leg;
    private final ModelPart right_leg;
    private final ModelPart head;
    public MockingbirdModel(ModelPart root) {
        this.mockingbird = root.getChild("mockingbird");
        this.bill = this.mockingbird.getChild("bill");
        this.chin = this.mockingbird.getChild("chin");
        this.left_wing = this.mockingbird.getChild("left_wing");
        this.right_wing = this.mockingbird.getChild("right_wing");
        this.left_leg = this.mockingbird.getChild("left_leg");
        this.right_leg = this.mockingbird.getChild("right_leg");
        this.head = this.mockingbird.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData mockingbird = modelPartData.addChild("mockingbird", ModelPartBuilder.create(), ModelTransform.of(0,0,0,0,0,0));

        ModelPartData bill = mockingbird.addChild("bill", ModelPartBuilder.create().uv(42, 31).cuboid(-2.0F, -4.0F, -7.0F, 4.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 15.0F, -4.0F));

        ModelPartData chin = mockingbird.addChild("chin", ModelPartBuilder.create().uv(43, 41).cuboid(-1.5F, -2.0F, -5.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(42, 36).cuboid(-1.5F, -5.0F, -6.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 15.0F, -4.0F));

        ModelPartData body = mockingbird.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -6.0F, -3.0F, 10.0F, 11.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 16.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

        ModelPartData tail = body.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, 6.0F, 4.0F));

        ModelPartData tail_r1 = tail.addChild("tail_r1", ModelPartBuilder.create().uv(28, 43).mirrored().cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(3.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

        ModelPartData tail_r2 = tail.addChild("tail_r2", ModelPartBuilder.create().uv(39, 19).mirrored().cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 1.0F, 11.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.0F, 0.0F, 0.0F, -0.176F, -0.1289F, 0.0229F));

        ModelPartData tail_r3 = tail.addChild("tail_r3", ModelPartBuilder.create().uv(36, 0).mirrored().cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 8.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.4301F, -0.609F, 0.2567F));

        ModelPartData tail_r4 = tail.addChild("tail_r4", ModelPartBuilder.create().uv(36, 0).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 0.0F, -0.4301F, 0.609F, -0.2567F));

        ModelPartData tail_r5 = tail.addChild("tail_r5", ModelPartBuilder.create().uv(0, 36).mirrored().cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 1.0F, 9.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(5.0F, 0.0F, 0.0F, -0.2875F, 0.4205F, -0.1201F));

        ModelPartData tail_r6 = tail.addChild("tail_r6", ModelPartBuilder.create().uv(0, 36).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 0.0F, 0.0F, -0.2875F, -0.4205F, 0.1201F));

        ModelPartData tail_r7 = tail.addChild("tail_r7", ModelPartBuilder.create().uv(22, 20).mirrored().cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 1.0F, 10.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(4.0F, 0.0F, 0.0F, -0.2256F, 0.2555F, -0.0579F));

        ModelPartData tail_r8 = tail.addChild("tail_r8", ModelPartBuilder.create().uv(22, 20).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, 0.0F, 0.0F, -0.2256F, -0.2555F, 0.0579F));

        ModelPartData tail_r9 = tail.addChild("tail_r9", ModelPartBuilder.create().uv(39, 19).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 0.0F, 0.0F, -0.176F, 0.1289F, -0.0229F));

        ModelPartData left_wing = mockingbird.addChild("left_wing", ModelPartBuilder.create().uv(1, 21).mirrored().cuboid(1.0F, -1.0F, -5.0F, 1.0F, 6.0F, 9.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(4.0F, 13.0F, 0.0F));

        ModelPartData right_wing = mockingbird.addChild("right_wing", ModelPartBuilder.create().uv(1, 21).cuboid(-2.0F, -1.0F, -5.0F, 1.0F, 6.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 13.0F, 0.0F));

        ModelPartData left_leg = mockingbird.addChild("left_leg", ModelPartBuilder.create().uv(36, 14).mirrored().cuboid(-1.0F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
                .uv(36, 9).mirrored().cuboid(-1.0F, 3.0F, -2.5F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(2.0F, 19.0F, -0.5F));

        ModelPartData right_leg = mockingbird.addChild("right_leg", ModelPartBuilder.create().uv(36, 9).cuboid(-2.0F, 3.0F, -2.5F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F))
                .uv(36, 14).cuboid(-2.0F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 19.0F, -0.5F));

        ModelPartData head = mockingbird.addChild("head", ModelPartBuilder.create().uv(22, 31).cuboid(-3.0F, -8.0F, -4.0F, 6.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 15.0F, -4.0F));

        ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(22, 43).mirrored().cuboid(1.0F, -6.0F, -1.0F, 1.0F, 7.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(1.0F, -7.0F, -1.0F, -0.3873F, 0.0665F, 0.1615F));

        ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(22, 43).cuboid(-2.0F, -6.0F, -1.0F, 1.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -7.0F, -1.0F, -0.3873F, -0.0665F, -0.1615F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(MockingbirdEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.head.pitch = headPitch * (float) (Math.PI / 180.0);
        this.head.yaw = headYaw * (float) (Math.PI / 180.0);
        this.bill.pitch = this.head.pitch;
        this.bill.yaw = this.head.yaw;
        this.chin.pitch = this.head.pitch;
        this.chin.yaw = this.head.yaw;
        this.right_leg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.left_leg.pitch = MathHelper.cos(limbAngle * 0.6662F + (float) Math.PI) * 1.4F * limbDistance;
        this.right_wing.roll = animationProgress;
        this.left_wing.roll = -animationProgress;
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        mockingbird.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart(){
        return mockingbird;
    }
}