package models;

public class Venta {
    private Producto producto;
    private int cantidad;
    public Venta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal(){
        return producto.getPrecio() * cantidad;
    }
    @Override
    public String toString() {
        return producto.getNombre() + " ==> " + cantidad + " = $ " + getTotal();
    }    

    


}
