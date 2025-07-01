package com.github.justinwon777.humancompanions.core;

import com.github.justinwon777.humancompanions.HumanCompanions;
import com.github.justinwon777.humancompanions.entity.Arbalist;
import com.github.justinwon777.humancompanions.entity.Archer;
import com.github.justinwon777.humancompanions.entity.Axeguard;
import com.github.justinwon777.humancompanions.entity.Knight;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

public final class EntityInit {
    public static final EntityType<Arbalist> ARBALIST = registerLivingEntity("arbalist", EntityType.Builder.of(
            Arbalist::new,
            MobCategory.AMBIENT)
            .sized(0.6f, 1.8f),
            Arbalist.createMobAttributes()
    );
    public static final EntityType<Archer> ARCHER = registerLivingEntity("archer", EntityType.Builder.of(
            Archer::new,
            MobCategory.AMBIENT)
            .sized(0.6f, 1.8f),
            Archer.createMobAttributes()
    );
    public static final EntityType<Axeguard> AXEGUARD = registerLivingEntity("axeguard", EntityType.Builder.of(
            Axeguard::new,
            MobCategory.AMBIENT)
            .sized(0.6f, 1.8f),
            Axeguard.createMobAttributes()
    );
    public static final EntityType<Knight> KNIGHT = registerLivingEntity("knight", EntityType.Builder.of(
                    Knight::new,
                    MobCategory.AMBIENT)
            .sized(0.6f, 1.8f),
            Knight.createMobAttributes()
    );

    public static void registerEntities() {}

    private static <T extends LivingEntity> EntityType<T> registerLivingEntity(String path, EntityType.Builder<T> builder, AttributeSupplier.Builder supplier) {
        EntityType<T> entityType = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(HumanCompanions.MOD_ID, path), builder.build(path));
        FabricDefaultAttributeRegistry.register(entityType, supplier);

        return entityType;
    }
}
