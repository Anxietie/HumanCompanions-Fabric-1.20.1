package com.github.justinwon777.humancompanions.entity;

import com.github.justinwon777.humancompanions.HumanCompanions;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.Random;

public class CompanionData {

    public static Random rand = new Random();

    public static Item[] ALL_FOODS = new Item[]{
//            Items.CAKE,
            Items.COOKIE,
            Items.BREAD,
//            Items.PUMPKIN_PIE, this has a bug apparently
//            Items.GOLDEN_APPLE,
//            Items.ENCHANTED_GOLDEN_APPLE,
//            Items.MELON,
            Items.MELON_SLICE,
            Items.APPLE,
//            Items.GLOW_BERRIES,
            Items.SWEET_BERRIES,
//            Items.CHORUS_FRUIT,
//            Items.GOLDEN_CARROT,
//            Items.BEETROOT,
            Items.CARROT,
            Items.POTATO,
            Items.BAKED_POTATO,
//            Items.DRIED_KELP,
//            Items.MUSHROOM_STEW,
//            Items.BEETROOT_SOUP,
            Items.COOKED_SALMON,
            Items.COOKED_COD,
            Items.SALMON,
            Items.COD,
//            Items.TROPICAL_FISH,
            Items.COOKED_MUTTON,
            Items.COOKED_PORKCHOP,
            Items.COOKED_BEEF,
            Items.COOKED_CHICKEN,
            Items.COOKED_RABBIT,
//            Items.MUTTON,
//            Items.PORKCHOP,
//            Items.BEEF,
//            Items.CHICKEN,
//            Items.RABBIT,
//            Items.RABBIT_STEW
    };

    public static MutableComponent[] tameFail = new MutableComponent[]{
            Component.literal("I need more food."),
            Component.literal("Is that all you got?"),
            Component.literal("I'm still hungry."),
            Component.literal("Can I have some more?"),
            Component.literal("I'm going to need a bit more."),
            Component.literal("That's not enough."),
    };

    public static MutableComponent[] notTamed = new MutableComponent[]{
            Component.literal("Do you have any food?"),
            Component.literal("I'm hungry."),
            Component.literal("Have you seen any food around here?"),
            Component.literal("I could use some food."),
            Component.literal("I wish I had some food."),
            Component.literal("I'm starving."),
    };

    public static MutableComponent[] WRONG_FOOD = new MutableComponent[]{
            Component.literal("That's not what I asked for."),
            Component.literal("I didn't ask for that."),
            Component.literal("Looks like you didn't understand my request."),
            Component.literal("Did you forget what I asked for?"),
            Component.literal("I don't remember asking for that")
    };

    public static MutableComponent[] ENOUGH_FOOD = new MutableComponent[]{
            Component.literal("I have enough of that."),
            Component.literal("I don't want that anymore."),
            Component.literal("I want something else now."),
    };

    public static Class<?>[] alertMobs = new Class<?>[]{
            Blaze.class,
            EnderMan.class,
            Endermite.class,
            Ghast.class,
            Giant.class,
            Guardian.class,
            Hoglin.class,
            MagmaCube.class,
            Phantom.class,
            Shulker.class,
            Silverfish.class,
            Slime.class,
            Spider.class,
            Vex.class,
            AbstractSkeleton.class,
            Zoglin.class,
            Zombie.class,
            Raider.class
    };

    public static Class<?>[] huntMobs = new Class<?>[]{
            Chicken.class,
            Cow.class,
            MushroomCow.class,
            Pig.class,
            Rabbit.class,
            Sheep.class
    };

    // skins[0] == male, skins[1] == female
    public static ResourceLocation[][] skins = new ResourceLocation[][]{
            new ResourceLocation[]{
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/1.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/10.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/100.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/101.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/102.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/103.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/105.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/106.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/107.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/11.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/12.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/13.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/14.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/15.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/16.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/18.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/19.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/2.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/20.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/21.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/22.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/24.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/26.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/27.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/28.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/29.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/3.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/30.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/31.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/32.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/33.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/34.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/36.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/37.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/39.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/4.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/40.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/41.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/42.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/43.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/44.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/45.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/46.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/47.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/48.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/49.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/5.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/50.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/51.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/52.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/53.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/54.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/55.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/56.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/57.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/58.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/59.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/6.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/60.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/61.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/62.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/63.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/64.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/66.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/67.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/68.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/7.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/70.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/74.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/75.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/76.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/77.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/78.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/79.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/8.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/80.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/81.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/82.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/83.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/84.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/85.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/86.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/87.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/88.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/89.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/9.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/90.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/91.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/92.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/93.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/94.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/95.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/96.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/97.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/male/99.png"),
            },
            new ResourceLocation[]{
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/1.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/10.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/100.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/101.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/102.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/103.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/104.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/105.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/106.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/107.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/108.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/109.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/11.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/110.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/111.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/12.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/13.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/14.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/15.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/16.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/17.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/18.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/19.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/2.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/20.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/21.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/22.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/23.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/24.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/25.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/26.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/27.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/28.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/29.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/3.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/30.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/31.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/32.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/33.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/34.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/35.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/36.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/37.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/38.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/39.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/4.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/40.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/41.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/42.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/43.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/44.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/45.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/46.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/47.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/48.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/49.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/5.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/50.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/51.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/52.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/53.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/54.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/55.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/56.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/57.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/58.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/59.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/6.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/60.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/61.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/62.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/63.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/64.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/65.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/66.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/67.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/68.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/69.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/7.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/70.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/71.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/72.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/73.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/74.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/75.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/76.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/77.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/78.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/79.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/8.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/80.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/81.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/82.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/83.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/84.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/85.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/86.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/87.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/88.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/89.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/9.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/90.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/91.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/92.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/93.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/94.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/95.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/96.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/97.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/98.png"),
                    new ResourceLocation(HumanCompanions.MOD_ID, "textures/entities/female/99.png"),
            }
    };

    public static int getHealthModifier() {
        float healthFloat = rand.nextFloat();
        if (healthFloat <= 0.03) {
            return -4;
        } else if (healthFloat <= 0.1) {
            return -3;
        } else if (healthFloat <= 0.2) {
            return -2;
        } else if (healthFloat <= 0.35) {
            return -1;
        } else if (healthFloat <= 0.65) {
            return 0;
        } else if (healthFloat <= 0.8) {
            return 1;
        } else if (healthFloat <= 0.9) {
            return 2;
        } else if (healthFloat <= 0.97) {
            return 3;
        } else {
            return 4;
        }
    }

    public static ItemStack getSpawnArmor(EquipmentSlot armorType) {
        float materialFloat = rand.nextFloat();
        if (materialFloat <= 0.4F) {
            return ItemStack.EMPTY;
        } else if (materialFloat <= 0.70F) {
            switch (armorType) {
                case HEAD:
                    return Items.LEATHER_HELMET.getDefaultInstance();
                case CHEST:
                    return Items.LEATHER_CHESTPLATE.getDefaultInstance();
                case LEGS:
                    return Items.LEATHER_LEGGINGS.getDefaultInstance();
                case FEET:
                    return Items.LEATHER_BOOTS.getDefaultInstance();
            }
        } else if (materialFloat <= 0.90F) {
            switch (armorType) {
                case HEAD:
                    return Items.CHAINMAIL_HELMET.getDefaultInstance();
                case CHEST:
                    return Items.CHAINMAIL_CHESTPLATE.getDefaultInstance();
                case LEGS:
                    return Items.CHAINMAIL_LEGGINGS.getDefaultInstance();
                case FEET:
                    return Items.CHAINMAIL_BOOTS.getDefaultInstance();
            }
        } else {
            switch (armorType) {
                case HEAD:
                    return Items.IRON_HELMET.getDefaultInstance();
                case CHEST:
                    return Items.IRON_CHESTPLATE.getDefaultInstance();
                case LEGS:
                    return Items.IRON_LEGGINGS.getDefaultInstance();
                case FEET:
                    return Items.IRON_BOOTS.getDefaultInstance();
            }
        }
        return ItemStack.EMPTY;
    }

    public static String getRandomName(int sex) {
        Random rand = new Random();
        String firstName = firstNames[sex][rand.nextInt(firstNames[sex].length)];
        String lastName = lastNames[rand.nextInt(lastNames.length)];
        return firstName + " " + lastName;
    }

    // Names source: https://github.com/ironarachne/namegen/blob/main/swedishnames.go
    // firstNames[0] == male, firstNames[1] == female
    public static String[][] firstNames = new String[][]{
            new String[]{
                    "Abraham", "Adam", "Acke", "Adolf", "Albert", "Albin", "Albrecht", "Alexander", "Alf", "Alfred", "Algot",
                    "Alvar", "Anders", "Andreas", "Arne", "Aron", "Arthur", "Arvid", "Axel",
                    "Bengt", "Bernhard", "Bernt", "Bertil", "Birger", "Bjarne", "Bo", "Bosse", "Bror", "Cai", "Caj", "Carl",
                    "Christer", "Christoffer", "Claes", "Dag", "Daniel", "Danne", "Ebbe", "Eilert", "Einar", "Elias", "Elis",
                    "Elmar", "Elof", "Elov", "Emil", "Emrik", "Enok", "Eric",
                    "Erik", "Erland", "Erling", "Eskil", "Evert", "Folke", "Frans", "Fredrik", "Frej", "Fritiof", "Fritjof",
                    "Gerhard", "Gottfrid", "Greger", "Gunnar", "Gunne", "Gustaf", "Gustav",
                    "Halsten", "Halvar", "Hampus", "Hans", "Harald", "Hasse", "Henrik", "Hilding", "Hjalmar", "Holger",
                    "Inge", "Ingemar", "Ingmar", "Ingvar", "Isac", "Isak", "Ivar",
                    "Jakob", "Jan", "Janne", "Jarl", "Jens", "Jerk", "Jerker", "Joakim", "Johan", "John", "Jon", "Jonas",
                    "Kalle", "Karl", "Kasper", "Kennet", "Kettil", "Kjell", "Klas", "Knut", "Krister", "Kristian", "Kristofer",
                    "Lage", "Lars", "Lasse", "Leif", "Lelle", "Lennart", "Lias", "Loke", "Lorens", "Loui", "Love", "Ludde", "Ludvig",
                    "Magnus", "Markus", "Martin", "Matheo", "Mats", "Matteus", "Mattias", "Mattis", "Matts", "Melker", "Micael", "Mikael", "Milian",
                    "Nicklas", "Niklas", "Nils", "Njord", "Noak",
                    "Ola", "Oliver", "Olle", "Olaf", "Olof", "Olov", "Orvar", "Osvald", "Otto", "Ove",
                    "Patrik", "Peder", "Pehr", "Pelle", "Per", "Peter", "Petter", "Pontus", "Ragnar", "Ragnvald", "Rickard",
                    "Rikard", "Robert", "Roffe", "Samuel", "Sigfrid", "Sigge", "Sigvard", "Sivert", "Sixten", "Staffan",
                    "Stefan", "Stellan", "Stig", "Sune", "Svante", "Sven", "Tage", "Thor", "Thore", "Thorsten", "Thorvald",
                    "Tomas", "Tor", "Tore", "Torgny", "Torkel", "Torsten", "Torvald", "Truls", "Tryggve", "Ture", "Ulf",
                    "Ulrik", "Uno", "Urban", "Valdemar", "Valter", "Verg", "Verner", "Victor", "Vidar", "Vide", "Viggo",
                    "Viktor", "Vilhelm", "Ville", "Vilmar", "Yngve",
            },
            new String[]{
                    "Agda", "Agneta", "Agnetha", "Aina", "Alfhild", "Alicia", "Alva", "Anette", "Anja", "Anneli", "Annika", "Asta", "Astrid",
                    "Barbro", "Bengta", "Berit", "Birgit", "Birgitta", "Bodil", "Brita", "Britt", "Britta",
                    "Cajsa", "Carin", "Carina", "Carita", "Catharina", "Cathrine", "Catrine", "Charlotta", "Christin", "Cilla",
                    "Dagny",
                    "Ebba", "Eira", "Eleonor", "Elin", "Elina", "Ellinor", "Elna", "Elsa", "Elsie", "Embla",
                    "Emelie", "Erica", "Erika", "Erna", "Evy",
                    "Fredrika", "Freja", "Frida",
                    "Gabriella", "Gerd", "Gerda", "Gertrud", "Gittan", "Greta", "Gry", "Gudrun", "Gull", "Gunborg",
                    "Gunda", "Gunhild", "Gunhilda", "Gunilla", "Gunn", "Gunnel", "Gunvor",
                    "Hanna", "Hanne", "Hedda", "Hedvig", "Helga", "Henrika", "Hillevi", "Hilma", "Hulda",
                    "Idun", "Ingeborg", "Ingegerd", "Inger", "Ingrid",
                    "Jannike", "Jennie", "Joline", "Jonna", "Josefin", "Josefina", "Josefine", "Juni",
                    "Kaja", "Kajsa", "Kamilla", "Karin", "Karita", "Karla", "Katja", "Katrin", "Kersti", "Kerstin",
                    "Kia", "Kjerstin", "Klara", "Kristin", "Kristine",
                    "Laila", "Linn", "Linnea", "Lis", "Lisbet", "Lisbeth", "Liselott", "Liselotte", "Liv",
                    "Lo", "Lotta", "Lottie", "Lova", "Lovis", "Lovisa",
                    "Maj", "Maja", "Majken", "Malena", "Malin", "Margaretha", "Margit", "Mari", "Mariann", "Marit",
                    "Marita", "Mathilda", "Meja", "Merit", "Meta", "Mikaela", "Milla", "Milly", "Mimmi", "Minna", "Moa", "Mona",
                    "Nanna", "Nea", "Nellie", "Nelly",
                    "Ottilia",
                    "Pernilla", "Petronella",
                    "Ragna", "Ragnhild", "Rakel", "Rebecka", "Rigmor", "Rika", "Ronja", "Runa", "Rut",
                    "Saga", "Sanna", "Sassa", "Signe", "Sigrid", "Siri", "Siv", "Sofie", "Solveig", "Solvig", "Stina"
                    , "Susann", "Susanne", "Svea", "Sylvi",
                    "Tanja", "Tekla", "Terese", "Teresia", "Tessan", "Thea", "Therese", "Thorborg", "Thyra", "Tilde"
                    , "Tindra", "Tora", "Torborg", "Tova", "Tove", "Tuva", "Tyra",
                    "Ulla", "Ulrica", "Ulrika",
                    "Vanja", "Vendela", "Vilhelmina", "Viveka", "Vivi",
                    "Ylva",
            }

    };

    public static String[] lastNames = new String[]{
            "Abrahamsson", "Abramsson", "Adamsson", "Adolfsson", "Adolvsson", "Ahlberg", "Ahlgren", "Albertsson",
            "Albinsson", "Albrechtsson", "Albrecktsson", "Albrektson", "Albrektsson", "Alexanderson", "Alexandersson"
            , "Alfredsson", "Alfson", "Alfsson", "Almstedt", "Alvarsson", "Andersson", "Andreasson", "Arthursson", "Arvidsson", "Axelsson",
            "Beck", "Bengtsdotter", "Bengtsson", "Berg", "Berge", "Bergfalk", "Berggren", "Berglund", "Bergman",
            "Bernhardsson", "Berntsson", "Blom", "Blomgren", "Blomqvist", "Borg", "Breiner", "Byquist", "Byqvist",
            "Carlson", "Carlsson", "Claesson", "Dahl", "Dahlman", "Danielsson",
            "Einarsson", "Ek", "Eklund", "Eld", "Eliasson", "Elmersson", "Engberg", "Engman", "Ericson", "Ericsson", "Eriksson",
            "Falk", "Feldt", "Forsberg", "Fransson", "Fredriksson", "Frisk",
            "Gerhardsson", "Grahn", "Gunnarsson", "Gustafsson", "Gustavsson", "Hall", "Hallman", "Hansson",
            "Haraldsson", "Haroldson", "Henriksson", "Herbertsson", "Hermansson", "Hjort", "Holgersson", "Holm", "Holmberg", "Hult",
            "Ingesson", "Isaksson", "Ivarsson", "Jakobsson", "Janson", "Jansson", "Johansson", "Johnsson", "Jonasson"
            , "Jonsson", "Karlsson", "Kjellsson", "Klasson", "Knutson", "Knutsson", "Kron",
            "Lager", "Larson", "Larsson", "Leifsson", "Lennartsson", "Leonardsson", "Lind", "Lindbeck", "Lindberg",
            "Lindgren", "Lindholm", "Lindquist", "Lindqvist", "Ljung", "Ljungborg", "Ljunggren", "Ljungman",
            "Ljungstrand", "Lund", "Lundberg", "Lundgren", "Lundin", "Lundquist", "Lundqvist", "Magnusson",
            "Markusson", "Martin", "Martinsson", "Matsson", "Mattsson", "Mikaelsson", "Niklasson", "Nilsson",
            "Norling", "Nyberg", "Nykvist", "Nylund", "Nyquist", "Nyqvist", "Olander", "Oliversson", "Olofsdotter",
            "Olofsson", "Olson", "Olsson", "Ottosson", "Patriksson", "Persson", "Petersson", "Pettersson", "Pilkvist"
            , "Ragnvaldsson", "Rapp", "Rask", "Robertsson", "Rosenberg", "Samuelsson", "Sandberg", "Sigurdsson",
            "Simonsson", "Solberg", "Sorenson", "Stefansson", "Stenberg", "Stendahl", "Stigsson", "Strand", "Sundberg"
            , "Svenson", "Svensson", "Tomasson", "Ulfsson", "Victorsson", "Vinter", "Waltersson", "Wang",
            "Westerberg", "Winter", "Winther", "Wuopio",
    };
}
