package net.handsomeduck.clutter.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.handsomeduck.clutter.Clutter;
import net.handsomeduck.clutter.block.BlockEntity.ComputerEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;

public class TileRegistry {
    public static final BlockEntityType<ComputerEntity> COMPUTER_TILE = Registry.register(
            Registry.BLOCK_ENTITY_TYPE, Clutter.MOD_ID + ":computertile",
            FabricBlockEntityTypeBuilder.create(ComputerEntity::new, BlockRegistry.COMP).build(null));
}
