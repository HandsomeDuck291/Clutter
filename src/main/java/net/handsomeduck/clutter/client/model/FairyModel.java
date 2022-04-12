package net.handsomeduck.clutter.client.model;

import net.handsomeduck.clutter.Clutter;
import net.handsomeduck.clutter.entity.FairyEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FairyModel extends AnimatedGeoModel<FairyEntity> {

	@Override
	public Identifier getAnimationFileLocation(FairyEntity entity) {
		return new Identifier(Clutter.MOD_ID, "animations/fairy.animation.json");
	}

	@Override
	public Identifier getModelLocation(FairyEntity entity) {
		return new Identifier(Clutter.MOD_ID, "geo/fairy.geo.json");
	}

	@Override
	public Identifier getTextureLocation(FairyEntity entity) {
		return new Identifier(Clutter.MOD_ID, "textures/entity/fairy/fairy.png");
	}
}