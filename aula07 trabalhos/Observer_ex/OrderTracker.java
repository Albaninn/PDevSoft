package Observer_ex;

import java.util.HashMap;

public class OrderTracker {
    private HashMap<String, Order> orders;

    public OrderTracker() {
        this.orders = new HashMap<>();
    }

    public void addOrder(Order order) {
        if (orders.containsKey(order.getOrderId())) {
            System.out.println("Pedido " + order.getOrderId() + " já existe.");
            return;
        }
        orders.put(order.getOrderId(), order);
        System.out.println("Pedido " + order.getOrderId() + " adicionado com sucesso.");
    }

    public void updateOrderStatus(String orderId, String newStatus) {
        Order order = orders.get(orderId);
        if (order == null) {
            System.out.println("Pedido " + orderId + " não encontrado.");
            return;
        }
        order.updateStatus(newStatus);
    }

    public void updateOrderLocation(String orderId, String newLocation) {
        Order order = orders.get(orderId);
        if (order == null) {
            System.out.println("Pedido " + orderId + " não encontrado.");
            return;
        }
        order.updateLocation(newLocation);
    }

    public void listOrders() {
        for (Order order : orders.values()) {
            System.out.println(order);
        }
    }

    public void findOrder(String orderId) {
        Order order = orders.get(orderId);
        if (order != null) {
            System.out.println(order);
        } else {
            System.out.println("Pedido " + orderId + " não encontrado.");
        }
    }
}
