package enums;

public enum PaymentMethod {
    CASH("Efectivo"),
    CARD("Tarjeta de crédito/débito"),
    TRANSFER("Transferencia bancaria");

    private final String description;

    PaymentMethod(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}