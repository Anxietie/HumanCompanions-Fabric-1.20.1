package com.github.justinwon777.humancompanions.networking.packet;

import com.github.justinwon777.humancompanions.entity.AbstractHumanCompanionEntity;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;

public class ClearTargetPacket {
    public static void receive(MinecraftServer server, ServerPlayer player, ServerGamePacketListenerImpl handler, FriendlyByteBuf buf, PacketSender responseSender) {
        int entityID = buf.readInt();

        if (player == null || !(player.level() instanceof ServerLevel)) {
            return;
        }

        if (player.level().getEntity(entityID) instanceof AbstractHumanCompanionEntity companion) {
            companion.clearTarget();
        }
    }
}
