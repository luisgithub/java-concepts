package com.lugarsoft.java_concepts.solid.interfaceseg;

import com.lugarsoft.java_concepts.domain.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderService implements PersistenceService<Order> {
    private final Map<Long, Order> data = new HashMap<>();

    @Override
    public Order save(Order order) {
        data.put(order.getId(), order);
        return order;
    }

    @Override
    public Order get(Long id) {
        return data.get(id);
    }

    @Override
    public void delete(Long id) {
        data.remove(id);
    }
}
