package com.grocery.weborder;

import com.grocery.weborder.model.OrderRequest;
import com.grocery.weborder.model.OrderResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/webOrder")
public class WebOrderController {

    @PostMapping
    public OrderResponse placeOrder(@RequestBody OrderRequest orderRequest) {
        // Generate a random order ID and return a static response
        String orderId = UUID.randomUUID().toString();
        return new OrderResponse(orderId, "RECEIVED", "Order Received");
    }
}