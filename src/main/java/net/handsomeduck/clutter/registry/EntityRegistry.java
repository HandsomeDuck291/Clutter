package net.handsomeduck.clutter.registry;

import net.fabricmc.loader.api.FabricLoader;
import net.handsomeduck.clutter.Clutter;
import net.handsomeduck.clutter.entity.FairyEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import software.bernie.example.registry.EntityRegistryBuilder;

public class EntityRegistry {
    public static <T extends Entity> EntityType<T> buildEntity(EntityType.EntityFactory<T> entity, Class<T> entityClass,
                                                               float width, float height, SpawnGroup group) {
        String name = entityClass.getSimpleName().toLowerCase();
        return EntityRegistryBuilder.<T>createBuilder(new Identifier(Clutter.MOD_ID, name)).entity(entity)
                .category(group).dimensions(EntityDimensions.changing(width, height)).build();
    }

    public static final EntityType<FairyEntity> FAIRY = buildEntity(FairyEntity::new,
            FairyEntity.class, .5F, .5F, SpawnGroup.CREATURE);

    public static void registerModEntities(){
        Clutter.LOGGER.info("Registering Mod Entities for " + Clutter.MOD_ID);
    }
}
