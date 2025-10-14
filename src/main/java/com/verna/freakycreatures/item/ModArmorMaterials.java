package com.verna.freakycreatures.item;

import com.verna.freakycreatures.MonsterParty;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> HARD_HAT_ARMOR_MATERIAL = registerArmorMaterial("hard_hat",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.BODY, 3);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, () -> Ingredient.ofItems(Items.SHULKER_SHELL),
                    List.of(new ArmorMaterial.Layer(Identifier.of(MonsterParty.MOD_ID, "hard_hat"))), 0, 0));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(MonsterParty.MOD_ID, name), material.get());
    }
}
