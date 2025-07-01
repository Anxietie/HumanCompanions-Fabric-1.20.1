package com.github.justinwon777.humancompanions.networking.packet;

import com.github.justinwon777.humancompanions.CompanionScreen;
import com.github.justinwon777.humancompanions.container.CompanionContainer;
import com.github.justinwon777.humancompanions.entity.AbstractHumanCompanionEntity;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.FriendlyByteBuf;

public class OpenInventoryPacket {
    public static void receive(Minecraft client, ClientPacketListener handler, FriendlyByteBuf buf, PacketSender responseSender) {
        /*
        int containerID = buf.readInt();
        int containerSize = buf.readInt();
        int companionID = buf.readInt();

        if (client.player == null || client.level == null) {
            return;
        }

        LocalPlayer player = (LocalPlayer) client.player;

        if (client.level.getEntity(companionID) instanceof AbstractHumanCompanionEntity companion) {
            CompanionContainer container = new CompanionContainer(containerID, player.getInventory(), companion.inventory);
            player.containerMenu = container;
            client.setScreen(new CompanionScreen(container, player.getInventory(), companion));
        }
         */
    }
}
