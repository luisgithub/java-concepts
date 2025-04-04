package com.lugarsoft.java_concepts.domain;

import java.time.LocalDateTime;

public class Order extends Entity {
        private LocalDateTime dateTime;
    private String store;


    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
