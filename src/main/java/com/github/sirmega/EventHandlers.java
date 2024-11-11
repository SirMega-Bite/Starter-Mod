package com.github.sirmega;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlers {
    @SubscribeEvent
    public void onChatReceivedEvent(ClientChatReceivedEvent e) {
        System.out.println("Chat received: " + e.message);
    }
}
