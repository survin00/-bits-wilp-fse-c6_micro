package com.grocery.ordertracking;

import com.grocery.ordertracking.model.TrackingRequest;
import com.grocery.ordertracking.model.TrackingResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orderTracking")
public class OrderTrackingController {

    @PostMapping
    public TrackingResponse trackOrder(@RequestBody TrackingRequest trackingRequest) {
        // Return a static response...
        return new TrackingResponse(trackingRequest.getOrderId(), "IN_PROGRESS", "Order is being processed");
    }
}