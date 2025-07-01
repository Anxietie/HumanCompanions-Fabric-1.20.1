package com.github.justinwon777.humancompanions.core;

import com.github.justinwon777.humancompanions.HumanCompanions;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SpawnEggItem;

public final class ItemInit {
    public static final Item ARBALIST_SPAWN_EGG = register("arbalist_spawn_egg", new SpawnEggItem(
            EntityInit.ARBALIST,
            0xE8AF5A,
            0xFF0000,
            new Item.Properties().stacksTo(64))
    );
    public static final Item ARCHER_SPAWN_EGG = register("archer_spawn_egg", new SpawnEggItem(
            EntityInit.ARCHER,
            0xE8AF5A,
            0x0000FF,
            new Item.Properties().stacksTo(64))
    );
    public static final Item AXEGUARD_SPAWN_EGG = register("axeguard_spawn_egg", new SpawnEggItem(
            EntityInit.AXEGUARD,
            0xE8AF5A,
            0x00FF00,
            new Item.Properties().stacksTo(64))
    );
    public static final Item KNIGHT_SPAWN_EGG = register("knight_spawn_egg", new SpawnEggItem(
            EntityInit.KNIGHT,
            0xE8AF5A,
            0xFFFF00,
            new Item.Properties().stacksTo(64))
    );

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> {
            content.addAfter(Items.ZOMBIFIED_PIGLIN_SPAWN_EGG, ARBALIST_SPAWN_EGG, ARCHER_SPAWN_EGG, AXEGUARD_SPAWN_EGG, KNIGHT_SPAWN_EGG);
        });
    }

    private static <T extends Item> T register(String path, T item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HumanCompanions.MOD_ID, path), item);
    }
}
