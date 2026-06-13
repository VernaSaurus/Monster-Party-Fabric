package com.verna.freakycreatures.entity;

import com.verna.freakycreatures.MonsterParty;
import com.verna.freakycreatures.entity.custom.MockingbirdEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MockingbirdEntity> MOCKINGBIRD = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(MonsterParty.MOD_ID, "mockingbird"),
            EntityType.Builder.create(MockingbirdEntity::new, SpawnGroup.CREATURE).dimensions(0.75F,0.75F).build());

    public static void registerModEntities(){
        MonsterParty.LOGGER.info("Registering mod entities for " + MonsterParty.MOD_ID);
    }
}
