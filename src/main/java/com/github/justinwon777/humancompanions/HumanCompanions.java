package com.github.justinwon777.humancompanions;

import com.github.justinwon777.humancompanions.core.*;
import com.github.justinwon777.humancompanions.entity.CompanionEvents;
import com.github.justinwon777.humancompanions.networking.PacketHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HumanCompanions implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "humancompanions";
    private static Config config;

    @Override
    public void onInitialize() {
        config = new Config(FabricLoader.getInstance().getConfigDir(), String.format("%s_config.json", MOD_ID));
        LOGGER.info("Config initialized");

        EntityInit.registerEntities();
        ItemInit.registerItems();
        CompanionEvents.registerEvents();
        PacketHandler.register();
    }

    public static Config getConfig() {
        return config;
    }
}
