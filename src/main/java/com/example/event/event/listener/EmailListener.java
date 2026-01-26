package com.example.event.event.listener;

import com.example.event.event.OrderPlacedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailListener {

    @Async
    @EventListener
    public void handle(OrderPlacedEvent event) {

        System.out.println(
                "Email sent for order " + event.getOrderId()
        );
    }
}
