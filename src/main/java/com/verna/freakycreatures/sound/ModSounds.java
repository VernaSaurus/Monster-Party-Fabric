package com.verna.freakycreatures.sound;

import com.verna.freakycreatures.MonsterParty;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent MOCKINGBIRD_AMBIENT = registerSoundEvent("mockingbird_ambient");
    public static final SoundEvent MOCKINGBIRD_HURT = registerSoundEvent("mockingbird_hurt");
    public static final SoundEvent MOCKINGBIRD_DIE = registerSoundEvent("mockingbird_die");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(MonsterParty.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        MonsterParty.LOGGER.info("Registering sounds for " + MonsterParty.MOD_ID);
    }
}
