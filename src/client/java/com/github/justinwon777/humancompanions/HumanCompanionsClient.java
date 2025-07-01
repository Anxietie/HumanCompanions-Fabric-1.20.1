package com.github.justinwon777.humancompanions;

import com.github.justinwon777.humancompanions.core.EntityInit;
import com.github.justinwon777.humancompanions.renderer.CompanionRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class HumanCompanionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EntityInit.ARBALIST, CompanionRenderer::new);
        EntityRendererRegistry.register(EntityInit.ARCHER, CompanionRenderer::new);
        EntityRendererRegistry.register(EntityInit.AXEGUARD, CompanionRenderer::new);
        EntityRendererRegistry.register(EntityInit.KNIGHT, CompanionRenderer::new);
    }
}
