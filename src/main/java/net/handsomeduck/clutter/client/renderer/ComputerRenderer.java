package net.handsomeduck.clutter.client.renderer;

import net.handsomeduck.clutter.block.BlockEntity.ComputerEntity;
import net.handsomeduck.clutter.client.model.ComputerModel;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class ComputerRenderer extends GeoBlockRenderer<ComputerEntity> {
    public ComputerRenderer(AnimatedGeoModel modelProvider) {
        super(modelProvider);
    }

    public ComputerRenderer() {
        super(new ComputerModel());
    }

    @Override
    public RenderLayer getRenderType(ComputerEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureLocation(animatable));
    }
}
