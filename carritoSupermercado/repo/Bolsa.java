package repo;

import java.util.ArrayList;
import java.util.List;

import entidades.Producto;

public class Bolsa<T extends Producto> {
    private List<T> productos;

    public Bolsa() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public List<T> getProductos() {
        return productos;
    }
}