package com.github.justinwon777.humancompanions.core;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

import static com.github.justinwon777.humancompanions.HumanCompanions.LOGGER;

// rudimentary config
public class Config {
    // public int AVERAGE_HOUSE_SEPARATION = 20; // int (11,20)
    public boolean FRIENDLY_FIRE_COMPANIONS = true; // boolean
    public boolean FRIENDLY_FIRE_PLAYER = true; // boolean
    public boolean FALL_DAMAGE = true; // boolean
    public boolean SPAWN_ARMOR = true; // boolean
    public boolean SPAWN_WEAPON = true; // boolean
    public int BASE_HEALTH = 20; // int (5,20)
    public boolean LOW_HEALTH_FOOD = true; // boolean
    public boolean CREEPER_WARNING = true; // boolean

    private final Path configFilePath;

    public Config(Path dir, String filename) {
        this.configFilePath = dir.resolve(filename);
        File configFile = configFilePath.toFile();

        // create parent directories if they don't exist
        dir.toFile().mkdirs();
        try {
            // check if config already exists
            if (!configFile.createNewFile()) {
                LOGGER.info("Found config.json in {}", configFile.getPath());
                readFromConfig(configFile);
                return;
            }
        } catch (IOException ioe) {
            LOGGER.error("Could not create config file or directories at {}", configFile.getPath());
            ioe.printStackTrace();
            return;
        }

        LOGGER.info("No config found; creating default config");
        createDefaultConfig(configFile);
    }

    public void reloadConfig() {
        readFromConfig(configFilePath.toFile());
    }

    private void createDefaultConfig(File configFile) {
        JsonWriter writer = null;

        try {
            writer = new JsonWriter(new FileWriter(configFile, StandardCharsets.UTF_8));
            writer.setLenient(true);
            writer.setIndent("  ");
            writer.beginObject();
            // writer.name("average_house_separation").value(AVERAGE_HOUSE_SEPARATION);
            writer.name("friendly_fire_companions").value(FRIENDLY_FIRE_COMPANIONS);
            writer.name("friendly_fire_player").value(FRIENDLY_FIRE_PLAYER);
            writer.name("fall_damage").value(FALL_DAMAGE);
            writer.name("spawn_armor").value(SPAWN_ARMOR);
            writer.name("spawn_weapon").value(SPAWN_WEAPON);
            writer.name("base_health").value(BASE_HEALTH);
            writer.name("low_health_food").value(LOW_HEALTH_FOOD);
            writer.name("creeper_warning").value(CREEPER_WARNING);
            writer.endObject();
        } catch (IOException ioe) {
            LOGGER.error("Could not begin write to config");
            ioe.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ioe) {
                    LOGGER.error("Unable to close config file after writing");
                    ioe.printStackTrace();
                }
            }
        }
    }

    private void readFromConfig(File configFile) {
        Gson gson = new Gson();
        JsonReader reader = null;

        try {
            reader = new JsonReader(new FileReader(configFile, StandardCharsets.UTF_8));
            reader.setLenient(true);
            JsonObject object = gson.fromJson(reader, JsonObject.class);
            // AVERAGE_HOUSE_SEPARATION = object.get("average_house_separation").getAsInt();
            FRIENDLY_FIRE_COMPANIONS = object.get("friendly_fire_companions").getAsBoolean();
            FRIENDLY_FIRE_PLAYER = object.get("friendly_fire_player").getAsBoolean();
            FALL_DAMAGE = object.get("fall_damage").getAsBoolean();
            SPAWN_ARMOR = object.get("spawn_armor").getAsBoolean();
            SPAWN_WEAPON = object.get("spawn_weapon").getAsBoolean();
            BASE_HEALTH = object.get("base_health").getAsInt();
            LOW_HEALTH_FOOD = object.get("low_health_food").getAsBoolean();
            CREEPER_WARNING = object.get("creeper_warning").getAsBoolean();
        } catch (IOException ioe) {
            LOGGER.error("Unable to read from config");
            ioe.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ioe) {
                    LOGGER.error("Unable to close config file");
                    ioe.printStackTrace();
                }
            }
        }
    }
}
