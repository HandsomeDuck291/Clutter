package net.handsomeduck.clutter.client.renderer;

import net.handsomeduck.clutter.block.BlockEntity.ComputerEntity;
import net.handsomeduck.clutter.client.model.ComputerModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class ComputerRenderer extends GeoBlockRenderer<ComputerEntity> {
    public ComputerRenderer(AnimatedGeoModel modelProvider) {
        super(modelProvider);
    }

    public ComputerRenderer() {
        super(new ComputerModel());
    }
}
