package com.example.event.event.listener;

import com.example.event.event.OrderPlacedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryListener {

    @EventListener
    public void handle(OrderPlacedEvent event) {

        System.out.println(
                "Inventory updated for order " + event.getOrderId()
        );
    }
}
