package com.example.event.service;

import com.example.event.event.OrderPlacedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ApplicationEventPublisher publisher;

    public OrderService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void placeOrder() {

        Long orderId = System.currentTimeMillis();

        System.out.println("Order created: " + orderId);

        publisher.publishEvent(new OrderPlacedEvent(orderId));
    }
}
