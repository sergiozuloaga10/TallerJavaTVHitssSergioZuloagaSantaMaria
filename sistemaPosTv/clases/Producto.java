package clases;

public class Producto {
    private final int id;
    private String nombre;
    private double precio;

    private static int contador = 1;

    public Producto(){
        this.id = contador++;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
    }

    
}
