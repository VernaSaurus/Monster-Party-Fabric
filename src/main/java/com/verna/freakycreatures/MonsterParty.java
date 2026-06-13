package com.verna.freakycreatures;

import com.verna.freakycreatures.entity.ModEntities;
import com.verna.freakycreatures.entity.custom.MockingbirdEntity;
import com.verna.freakycreatures.item.ModItems;
import com.verna.freakycreatures.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MonsterParty implements ModInitializer {
	public static final String MOD_ID = "monsterparty";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModEntities.registerModEntities();

        ModSounds.registerSounds();

        FabricDefaultAttributeRegistry.register(ModEntities.MOCKINGBIRD, MockingbirdEntity.createAttributes());
	}
}