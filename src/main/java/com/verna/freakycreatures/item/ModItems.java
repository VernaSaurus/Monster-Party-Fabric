package com.verna.freakycreatures.item;

import com.verna.freakycreatures.MonsterParty;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MOCKING_FEATHER = registerItem("mocking_feather", new Item(new Item.Settings()));
    public static final Item HARD_HAT = registerItem("hard_hat", new ArmorItem(ModArmorMaterials.HARD_HAT_ARMOR_MATERIAL,
            ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MonsterParty.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MonsterParty.LOGGER.info("Registering mod items for " + MonsterParty.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MOCKING_FEATHER);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(HARD_HAT);
        });
    }
}
