package com.github.justinwon777.humancompanions.networking.packet;

import com.github.justinwon777.humancompanions.entity.AbstractHumanCompanionEntity;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;

public class SetPatrollingPacket {
    public static void receive(MinecraftServer server, ServerPlayer player, ServerGamePacketListenerImpl handler, FriendlyByteBuf buf, PacketSender responseSender) {
        int entityID = buf.readInt();

        if (player == null || !(player.level() instanceof ServerLevel)) {
            return;
        }

        if (player.level().getEntity(entityID) instanceof AbstractHumanCompanionEntity companion) {
            if (companion.isFollowing()) {
                companion.setPatrolling(true);
                companion.setFollowing(false);
                companion.setGuarding(false);
                companion.setPatrolPos(companion.blockPosition());
            } else if (companion.isPatrolling()) {
                companion.setPatrolling(false);
                companion.setFollowing(false);
                companion.setGuarding(true);
                companion.setPatrolPos(companion.blockPosition());
            } else {
                companion.setPatrolling(false);
                companion.setFollowing(true);
                companion.setGuarding(false);
            }
        }
    }
}
