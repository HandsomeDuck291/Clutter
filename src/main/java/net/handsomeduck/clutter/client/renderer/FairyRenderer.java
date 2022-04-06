package net.handsomeduck.clutter.client.renderer;

import net.handsomeduck.clutter.client.model.FairyModel;
import net.handsomeduck.clutter.entity.FairyEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;


public class FairyRenderer extends GeoEntityRenderer<FairyEntity> {
    public FairyRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new FairyModel());
    }

    @Override
    public RenderLayer getRenderType(FairyEntity animatable, float partialTicks, MatrixStack stack, @Nullable VertexConsumerProvider renderTypeBuffer, @Nullable VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(this.getTextureLocation(animatable));
    }
}