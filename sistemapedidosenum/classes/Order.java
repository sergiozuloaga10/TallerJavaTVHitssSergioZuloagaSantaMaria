package classes;

import enums.OrderPriority;
import enums.OrderStatus;
import enums.PaymentMethod;

public class Order {
    private int id;
    private String customer;
    private OrderStatus status;
    private OrderPriority priority;
    private PaymentMethod paymentMethod;

    public Order(int id, String customer, OrderStatus status, OrderPriority priority, PaymentMethod paymentMethod) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.priority = priority;
        this.paymentMethod = paymentMethod;
    }

    public void showDetails() {
        System.out.println("Pedido #" + id);
        System.out.println("Cliente: " + customer);
        System.out.println("Estado: " + status + " → " + status.getMessage());
        System.out.println("Prioridad: " + priority + " (Nivel " + priority.getLevel() + ")");
        System.out.println("Método de pago: " + paymentMethod + " → " + paymentMethod.getDescription());
        System.out.println();
    }
}

