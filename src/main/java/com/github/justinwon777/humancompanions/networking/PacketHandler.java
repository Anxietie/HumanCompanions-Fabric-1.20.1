package com.github.justinwon777.humancompanions.networking;

import com.github.justinwon777.humancompanions.HumanCompanions;
import com.github.justinwon777.humancompanions.networking.packet.*;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.resources.ResourceLocation;

public class PacketHandler {
    // C2S
    public static final ResourceLocation CLEAR_TARGET_ID = new ResourceLocation(HumanCompanions.MOD_ID, "clear_target");
    public static final ResourceLocation RELEASE_ID = new ResourceLocation(HumanCompanions.MOD_ID, "release");
    public static final ResourceLocation SET_ALERT_ID = new ResourceLocation(HumanCompanions.MOD_ID, "set_alert");
    public static final ResourceLocation SET_HUNTING_ID = new ResourceLocation(HumanCompanions.MOD_ID, "set_hunting");
    public static final ResourceLocation SET_PATROLLING_ID = new ResourceLocation(HumanCompanions.MOD_ID, "set_patrolling");
    public static final ResourceLocation SET_STATIONARY_ID = new ResourceLocation(HumanCompanions.MOD_ID, "set_stationary");

    public static void register() {
        ServerPlayNetworking.registerGlobalReceiver(CLEAR_TARGET_ID, ClearTargetPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(RELEASE_ID, ReleasePacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(SET_ALERT_ID, SetAlertPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(SET_HUNTING_ID, SetHuntingPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(SET_PATROLLING_ID, SetPatrollingPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(SET_STATIONARY_ID, SetStationaryPacket::receive);
    }
}
