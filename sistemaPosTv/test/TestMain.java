package test;

import clases.Producto;
import clases.Venta;

public class TestMain {
    public static void main(String[] args) {
        Producto p1 = new Producto("Leche Santa Clara 1L", 30.5);
        Producto p2 = new Producto("Galletas Maria Gamesa 30g", 12.35);
        Producto p3 = new Producto("Pan Tostado Bimbo", 31.45);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("-----------------Ventas------------------");
        Venta v1 = new Venta(p1, 2);
        Venta v2 = new Venta(p3, 3);
        Venta v3 = new Venta(new Producto("Refresco Coca cola 600 ml", 20), 4);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
    
}