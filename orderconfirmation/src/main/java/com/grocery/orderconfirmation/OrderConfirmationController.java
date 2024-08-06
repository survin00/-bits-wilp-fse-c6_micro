package com.grocery.orderconfirmation;

import com.grocery.orderconfirmation.model.ConfirmationRequest;
import com.grocery.orderconfirmation.model.ConfirmationResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/orderConfirmation")
public class OrderConfirmationController {

    @PostMapping
    public ConfirmationResponse confirmOrder(@RequestBody ConfirmationRequest confirmationRequest) {
        String orderId = UUID.randomUUID().toString();
        return new ConfirmationResponse(orderId, confirmationRequest.getOrderStatus(), "Order Confirmed");
    }
}

