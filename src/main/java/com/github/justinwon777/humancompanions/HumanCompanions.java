package com.github.justinwon777.humancompanions;

import com.github.justinwon777.humancompanions.core.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.item.CreativeModeTabs;
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
    }

    public static Config getConfig() {
        return config;
    }

    /*
    public HumanCompanions() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        EntityInit.ENTITIES.register(eventBus);
        ItemInit.ITEMS.register(eventBus);
        eventBus.addListener(this::buildContents);
        StructureInit.DEFERRED_REGISTRY_STRUCTURE.register(eventBus);
        PacketHandler.register();
        Config.register();
    }

     */
}
