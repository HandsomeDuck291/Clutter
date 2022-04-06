package net.handsomeduck.clutter;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.handsomeduck.clutter.client.renderer.ComputerRenderer;
import net.handsomeduck.clutter.client.renderer.FairyRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ClutterClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_FAIRY_LAYER = new EntityModelLayer(new Identifier(Clutter.MOD_ID, "fairy"), "main");
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Clutter.FAIRY, FairyRenderer::new);
        BlockEntityRendererRegistry.register(Clutter.COMPUTER, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new ComputerRenderer());
    }

}
