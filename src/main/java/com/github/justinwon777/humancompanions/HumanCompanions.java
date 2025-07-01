package com.github.justinwon777.humancompanions;

import com.github.justinwon777.humancompanions.container.CompanionContainer;
import com.github.justinwon777.humancompanions.core.Config;
import com.github.justinwon777.humancompanions.core.EntityInit;
import com.github.justinwon777.humancompanions.core.ItemInit;
import com.github.justinwon777.humancompanions.entity.CompanionEvents;
import com.github.justinwon777.humancompanions.networking.PacketHandler;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.MenuType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HumanCompanions implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "humancompanions";
    private static Config config;

    public static final MenuType<CompanionContainer> COMPANION_CONTAINER_MENU_TYPE = new ExtendedScreenHandlerType<>(CompanionContainer::new);

    @Override
    public void onInitialize() {
        config = new Config(FabricLoader.getInstance().getConfigDir(), String.format("%s_config.json", MOD_ID));
        LOGGER.info("Config initialized");

        EntityInit.registerEntities();
        ItemInit.registerItems();
        CompanionEvents.registerEvents();
        PacketHandler.register();

        Registry.register(BuiltInRegistries.MENU, new ResourceLocation(MOD_ID, "companion_container_menu_type"), COMPANION_CONTAINER_MENU_TYPE);

        ReloadConfigCommand.register();
    }

    public static Config getConfig() {
        return config;
    }

    private static class ReloadConfigCommand {
        private static void registerCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
            dispatcher.register(Commands.literal("humancompanions")
                    .then(Commands.literal("reloadconfig")
                            .executes(ReloadConfigCommand::reloadConfig)
                    )
            );
        }

        public static void register() {
            CommandRegistrationCallback.EVENT.register((dispatcher, context, selection) -> registerCommand(dispatcher));
        }

        private static int reloadConfig(CommandContext<CommandSourceStack> context) {
            config.reloadConfig();
            context.getSource().sendSuccess(() -> Component.literal("Reloaded config. Check console for potential errors"), true);
            return 1;
        }
    }
}
