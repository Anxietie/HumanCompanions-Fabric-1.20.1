package com.github.justinwon777.humancompanions.core;

import com.github.justinwon777.humancompanions.HumanCompanions;
import com.github.justinwon777.humancompanions.entity.Arbalist;
import com.github.justinwon777.humancompanions.entity.Archer;
import com.github.justinwon777.humancompanions.entity.Axeguard;
import com.github.justinwon777.humancompanions.entity.Knight;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

public final class EntityInit {
    public static final EntityType<Arbalist> ARBALIST = register("arbalist", EntityType.Builder.of(
            Arbalist::new,
            MobCategory.AMBIENT)
            .sized(0.6f, 1.8f)
    );
    public static final EntityType<Archer> ARCHER = register("archer", EntityType.Builder.of(
            Archer::new,
            MobCategory.AMBIENT)
            .sized(0.6f, 1.8f)
    );
    public static final EntityType<Axeguard> AXEGUARD = register("axeguard", EntityType.Builder.of(
            Axeguard::new,
            MobCategory.AMBIENT)
            .sized(0.6f, 1.8f)
    );
    public static final EntityType<Knight> KNIGHT = register("knight", EntityType.Builder.of(
                    Knight::new,
                    MobCategory.AMBIENT)
            .sized(0.6f, 1.8f)
    );

    public static void registerEntities() {}

    private static <T extends Entity> EntityType<T> register(String path, EntityType.Builder<T> builder) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(HumanCompanions.MOD_ID, path), builder.build(path));
    }
}
