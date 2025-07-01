package com.github.justinwon777.humancompanions;

import com.github.justinwon777.humancompanions.container.CompanionContainer;
import com.github.justinwon777.humancompanions.core.EntityInit;
import com.github.justinwon777.humancompanions.networking.ClientPacketHandler;
import com.github.justinwon777.humancompanions.renderer.CompanionRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.inventory.MenuType;

public class HumanCompanionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EntityInit.ARBALIST, CompanionRenderer::new);
        EntityRendererRegistry.register(EntityInit.ARCHER, CompanionRenderer::new);
        EntityRendererRegistry.register(EntityInit.AXEGUARD, CompanionRenderer::new);
        EntityRendererRegistry.register(EntityInit.KNIGHT, CompanionRenderer::new);

        ClientPacketHandler.register();
        MenuScreens.register((MenuType<CompanionContainer>) HumanCompanions.COMPANION_CONTAINER_MENU_TYPE, (MenuScreens.ScreenConstructor<CompanionContainer, CompanionScreen>) CompanionScreen::new);
    }
}
