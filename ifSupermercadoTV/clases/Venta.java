package clases;

import java.util.List;

public class Venta {
    private int id;
    private Cliente cliente;
    private Empleado empleado;
    private List<Producto> productos;
    double total;

    public Venta(int id, Cliente cliente, Empleado empleado, List<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.empleado = empleado;
        this.productos = productos;
        this.total = 0.0;
    }

    public int getId() { 
        return id; 
    }

    public Cliente getCliente() { 
        return cliente; 
    }

    public Empleado getEmpleado() { 
        return empleado; 
    }

    public List<Producto> getProductos() {
        return productos; 
    }

    public double getTotal() { 
        return total; 
    }

    public void setTotal(double total) { 
        this.total = total; 
    }
}