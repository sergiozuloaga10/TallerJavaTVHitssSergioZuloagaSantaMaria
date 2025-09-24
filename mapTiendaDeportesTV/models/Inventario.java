package models;

import java.util.*;

public class Inventario {
    private Map<String, Producto> productosPorSku = new HashMap<>();
    private LinkedHashMap<String, Producto> productosPorInsercion = new LinkedHashMap<>();
    private TreeSet<Producto> productosPorNombre = new TreeSet<>();

    public void registrarProducto(Producto producto) {
        if (!productosPorSku.containsKey(producto.getSku())) {
            productosPorSku.put(producto.getSku(), producto);
            productosPorInsercion.put(producto.getSku(), producto);
            productosPorNombre.add(producto);
        }
    }

    public Producto consultarPorSku(String sku) {
        return productosPorSku.get(sku);
    }

    public void actualizarStock(String sku, int cantidad) {
        Producto producto = productosPorSku.get(sku);
        if (producto != null) {
            producto.actualizarStock(cantidad);
        }
    }

    public void reportePorInsercion() {
        System.out.println("Reporte por orden de inserción:");
        for (Producto p : productosPorInsercion.values()) {
            mostrarProducto(p);
        }
    }

    public void reportePorNombre() {
        System.out.println("Reporte ordenado por nombre:");
        for (Producto p : productosPorNombre) {
            mostrarProducto(p);
        }
    }

    private void mostrarProducto(Producto p) {
        System.out.println("SKU: " + p.getSku() + ", Nombre: " + p.getNombre() +
                ", Categoría: " + p.getCategoria() + ", Stock: " + p.getStock());
    }
}
