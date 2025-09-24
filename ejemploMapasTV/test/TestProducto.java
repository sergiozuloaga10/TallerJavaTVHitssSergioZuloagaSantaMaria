package test;

import java.util.LinkedHashMap;
import java.util.Map;

import models.Producto;

public class TestProducto {
    public static void main(String[] args) {
        //LinkedHashMap, mantiene el orden de insercion
        Map<String, Producto> inventario = new LinkedHashMap<>();

        //Agregar productos
        inventario.put("P001", new Producto("P001", "Mouse", 5));
        inventario.put("P005", new Producto("P005", "Mouse", 10));
        inventario.put("P009", new Producto("P005", "Teclado", 10));

        TestProducto.imprimirMapa(inventario);

        //Actualizar un producto
        System.out.println("Actualizando roducto P001");
        inventario.get("P001").setCantidad(10);
        


    }

    public static void imprimirMapa(Map<String, Producto> productos){
        for (Map.Entry<String, Producto> producto : productos.entrySet()) {
            System.out.println(producto.getKey() + " -> " + producto.getValue());
        }
        
    }
}
