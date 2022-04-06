package net.handsomeduck.clutter;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.handsomeduck.clutter.block.BlockEntity.ComputerEntity;
import net.handsomeduck.clutter.block.ModBlocks;
import net.handsomeduck.clutter.entity.FairyEntity;
import net.handsomeduck.clutter.item.ModItems;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

import static net.handsomeduck.clutter.block.Computer.COMP;

public class Clutter implements ModInitializer {

	public static final String MOD_ID = "clutter";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("clutter");

	public static final EntityType<FairyEntity> FAIRY = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(Clutter.MOD_ID, "fairy"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FairyEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
	);

	public static BlockEntityType<ComputerEntity> COMPUTER;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		GeckoLib.initialize();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FabricDefaultAttributeRegistry.register(FAIRY, FairyEntity.createMobAttributes());
		COMPUTER = Registry.register(Registry.BLOCK_ENTITY_TYPE, "clutter:computer", FabricBlockEntityTypeBuilder.create(ComputerEntity::new, COMP).build(null));

		LOGGER.info("Ready to clutter up your closet");
	}
}
