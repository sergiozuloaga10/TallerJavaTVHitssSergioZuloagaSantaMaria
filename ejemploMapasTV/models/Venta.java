package models;

public class Venta {
    private int id;
    private String vendedor;
    private double total;

    public Venta(int id, String vendedor, double total) {
        this.id = id;
        this.vendedor = vendedor;
        this.total = total;
    }
    public int getId() {
        return id;
    }
    public String getVendedor() {
        return vendedor;
    }
    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Venta {id:" + id + ", vendedor:" + vendedor + ", total:" + total + "}";
    }

    
}
