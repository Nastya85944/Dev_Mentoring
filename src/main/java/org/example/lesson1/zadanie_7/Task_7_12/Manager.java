package org.example.lesson1.zadanie_7.Task_7_12;

import java.util.Map;

public class Manager {

    private Map<Order, Integer> orders;

    public Manager(Map<Order, Integer> orders) {
        this.orders = orders;
    }

    public Map<Order, Integer> getOrders() {
        return orders;
    }

    public void setOrders(Map<Order, Integer> orders) {
        this.orders = orders;
    }

    public void addNewOrder(Map<Order, Integer> orders, Order order){
        orders.put(order, orders.getOrDefault(order, 0) +1);
    }

    public  void removeOrder(Map<Order, Integer> orders, Order order){
        if(orders.containsKey(order) && orders.get(order) == 0){
            System.out.println("No order!!");
        } else {
            orders.put(order, orders.getOrDefault(order, 0) -1);
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "orders=" + orders +
                '}';
    }
}
