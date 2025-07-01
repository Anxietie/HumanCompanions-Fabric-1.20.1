package com.github.justinwon777.humancompanions.networking;

import com.github.justinwon777.humancompanions.networking.packet.OpenInventoryPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

public class ClientPacketHandler {
    public static void register() {
        ClientPlayNetworking.registerGlobalReceiver(PacketHandler.OPEN_INVENTORY_ID, OpenInventoryPacket::receive);
    }
}
