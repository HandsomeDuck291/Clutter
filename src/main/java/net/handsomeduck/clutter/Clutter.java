package net.handsomeduck.clutter;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.handsomeduck.clutter.block.BlockEntity.ComputerEntity;
import net.handsomeduck.clutter.client.renderer.ComputerRenderer;
import net.handsomeduck.clutter.registry.BlockRegistry;
import net.handsomeduck.clutter.registry.EntityRegistry;
import net.handsomeduck.clutter.registry.ItemRegistry;
import net.handsomeduck.clutter.registry.TileRegistry;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.example.EntityUtils;
import software.bernie.geckolib3.GeckoLib;

public class Clutter implements ModInitializer {

	public static final String MOD_ID = "clutter";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("clutter");

	public static BlockEntityType<ComputerEntity> COMPUTER;

	@Override
	public void onInitialize() {
		GeckoLib.initialize();

		BlockRegistry.registerModBlocks();
		ItemRegistry.registerModItems();
		EntityRegistry.registerModEntities();
		new ItemRegistry();
		new BlockRegistry();
		new EntityRegistry();
		new TileRegistry();

		FabricDefaultAttributeRegistry.register(EntityRegistry.FAIRY,
				EntityUtils.createGenericEntityAttributes());

		LOGGER.info("Ready to clutter up your closet");
	}
}
