package models;

public class Producto implements Comparable<Producto> {
    private String sku;
    private String nombre;
    private String categoria;
    private int stock;
    public Producto(String sku, String nombre, String categoria, int stock) {
        this.sku = sku;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }
    public String getSku() {
        return sku;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getStock() {
        return stock;
    }
    
    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
    }

    @Override
    public String toString() {
        return "Producto {sku:" + sku + ", nombre:" + nombre + ", categoria:" + categoria + ", stock:" + stock + "}";
    }

    
@Override
    public int compareTo(Producto otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

}
