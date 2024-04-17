package org.example.lesson1.zadanie_7.Task_7_12;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Order, Integer> orders = new HashMap<>();
        orders.put(new Order(1, "Short", 15), 10);
        orders.put(new Order(2, "T-Short", 25), 1);
        orders.put(new Order(3, "Jacket", 73), 9);

        Manager manager = new Manager(orders);
        Order order = new Order(4, "Coat", 125);
        manager.addNewOrder(orders, order);
        System.out.println(manager.getOrders());

        manager.removeOrder(orders, order);
        System.out.println(manager.getOrders());
        manager.removeOrder(orders, order);

    }
}
