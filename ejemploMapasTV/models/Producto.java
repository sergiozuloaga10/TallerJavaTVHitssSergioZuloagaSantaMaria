package models;

public class Producto {
    private String codigo;
    private String descripcion;
    private int cantidad;
    
    public Producto(String codigo, String descripcion, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto {codigo:" + codigo + ", descripcion:" + descripcion + ", cantidad:" + cantidad + "}";
    }

    
}
