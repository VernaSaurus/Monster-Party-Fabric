package com.verna.freakycreatures;

import com.verna.freakycreatures.entity.ModEntities;
import com.verna.freakycreatures.entity.client.MockingbirdModel;
import com.verna.freakycreatures.entity.client.MockingbirdRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class MonsterPartyClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(MockingbirdModel.MOCKINGBIRD, MockingbirdModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.MOCKINGBIRD, MockingbirdRenderer::new);
    }
}
