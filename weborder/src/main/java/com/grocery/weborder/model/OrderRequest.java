package com.grocery.weborder.model;

import java.util.List;

public class OrderRequest {
    private String customerId;
    private String orderType;
    private List<Item> items;


    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    public String getOrderType() {
        return orderType;
    }
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }



    public static class Item {
        private String itemName;
        private int itemQuantity;
        private String itemUOM;
        private String itemDescription;

        public String getItemName() {
            return itemName;
        }
        public void setItemName(String itemName) {
            this.itemName = itemName;
        }
        
        public int getItemQuantity() {
            return itemQuantity;
        }
        public void setItemQuantity(int itemQuantity) {
            this.itemQuantity = itemQuantity;
        }
        
        public String getItemUOM() {
            return itemUOM;
        }
        public void setItemUOM(String itemUOM) {
            this.itemUOM = itemUOM;
        }
        
        public String getItemDescription() {
            return itemDescription;
        }
        public void setItemDescription(String itemDescription) {
            this.itemDescription = itemDescription;
        }


    }
}

