package com.verna.freakycreatures.entity.client;

import com.verna.freakycreatures.MonsterParty;
import com.verna.freakycreatures.entity.custom.MockingbirdEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class MockingbirdRenderer extends MobEntityRenderer<MockingbirdEntity, MockingbirdModel<MockingbirdEntity>> {
    public MockingbirdRenderer(EntityRendererFactory.Context context){
        super(context, new MockingbirdModel<>(context.getPart(MockingbirdModel.MOCKINGBIRD)), 0.5f);
    }

    @Override
    public Identifier getTexture(MockingbirdEntity entity) {
        return Identifier.of(MonsterParty.MOD_ID, "textures/entity/mockingbird/mockingbird.png");
    }

    @Override
    public void render(MockingbirdEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        }
        else {
            matrixStack.scale(1f,1f,1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
    
    protected float getAnimationProgress(MockingbirdEntity mockingbirdEntity, float f) {
        float g = MathHelper.lerp(f, mockingbirdEntity.prevFlapProgress, mockingbirdEntity.flapProgress);
        float h = MathHelper.lerp(f, mockingbirdEntity.prevMaxWingDeviation, mockingbirdEntity.maxWingDeviation);
        return (MathHelper.sin(g) + 1.0F) * h;
    }
}
