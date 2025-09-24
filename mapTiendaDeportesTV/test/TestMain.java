package test;

import models.Inventario;
import models.Producto;

public class TestMain {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.registrarProducto(new Producto("SKU001", "Balón Fútbol", "Fútbol", 50));
        inventario.registrarProducto(new Producto("SKU002", "Camiseta Running", "Running", 30));
        inventario.registrarProducto(new Producto("SKU003", "Tenis Baloncesto", "Baloncesto", 20));
        inventario.registrarProducto(new Producto("SKU004", "Guantes Portero", "Fútbol", 15));

        inventario.actualizarStock("SKU001", -5); // venta
        inventario.actualizarStock("SKU002", 10); // nueva llegada

        inventario.reportePorInsercion();
        System.out.println();
        inventario.reportePorNombre();
    }
}

