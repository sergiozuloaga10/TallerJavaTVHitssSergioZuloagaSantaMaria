package test;

import java.time.LocalDate;

import clases.Comics;
import clases.IPhone;
import clases.Libro;
import clases.TvLcd;
import interfaces.IProducto;

public class TestMain {
    public static void main(String[] args) {
        IProducto[] productos = new IProducto[6];

        productos[0] = new IPhone(25000, "Apple", "iPhone 14", "Negro");
        productos[1] = new TvLcd(340000, "Sony", 40);
        productos[2] = new Libro(18000, "Eric Gamma", "Elementos Reusables POO", "Alguna Editorial", LocalDate.now());
        productos[3] = new Libro(14000, "Martin Fowler", "UML Gota a Gota", "Alguna Editorial", LocalDate.now());
        productos[4] = new Comics(16000, "Stan Lee", "Spider-Man", "Marvel", LocalDate.now(), "Spider-Man");
        productos[5] = new Comics(15000, "Frank Miller", "Batman: Año Uno", "DC Comics", LocalDate.now(), "Batman");

        for (IProducto producto : productos) {
            System.out.println("Precio base: $" + producto.getPrecio());
            System.out.println("Precio de venta: $" + producto.getPrecioVenta());
            System.out.println("--------------------------------------------");
        }
    }
}

