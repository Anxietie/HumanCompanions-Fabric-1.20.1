package com.github.justinwon777.humancompanions.networking;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import com.github.justinwon777.humancompanions.networking.packet.OpenInventoryPacket;

public class ClientPacketHandler {
    public static void register() {
        ClientPlayNetworking.registerGlobalReceiver(PacketHandler.OPEN_INVENTORY_ID, OpenInventoryPacket::receive);
    }
}
