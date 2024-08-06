package com.grocery.weborder.model;

public class OrderResponse {
    private String orderId;
    private String orderStatus;
    private String message;


    public OrderResponse(String orderId, String orderStatus, String message) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.message = message;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
