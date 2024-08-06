package com.grocery.deliveryconfirmation;

import com.grocery.deliveryconfirmation.model.DeliveryRequest;
import com.grocery.deliveryconfirmation.model.DeliveryResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deliveryConfirmation")
public class DeliveryConfirmationController {

    @PostMapping
    public DeliveryResponse confirmDelivery(@RequestBody DeliveryRequest deliveryRequest) {
        return new DeliveryResponse(deliveryRequest.getOrderId(), "DELIVERED", "Delivery Complete");
    }
}

