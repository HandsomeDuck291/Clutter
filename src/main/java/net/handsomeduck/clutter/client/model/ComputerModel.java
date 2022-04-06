package net.handsomeduck.clutter.client.model;

import net.handsomeduck.clutter.Clutter;
import net.handsomeduck.clutter.block.BlockEntity.ComputerEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ComputerModel extends AnimatedGeoModel<ComputerEntity> {
	@Override
	public Identifier getModelLocation(ComputerEntity object) {
		return new Identifier(Clutter.MOD_ID, "geo/computer.geo.json");
	}

	@Override
	public Identifier getTextureLocation(ComputerEntity object) {
		return new Identifier(Clutter.MOD_ID, "textures/blockentity/computer/computer.png");
	}

	@Override
	public Identifier getAnimationFileLocation(ComputerEntity object) {
		return new Identifier(Clutter.MOD_ID, "animations/computer.animation.json");
	}
}