package test;

import entidades.Fruta;
import entidades.Lacteo;
import entidades.Limpieza;
import entidades.NoPerecible;
import repo.Bolsa;

public class TestMain {
    public static void main(String[] args) {
        Bolsa<Fruta> bolsaFrutas = new Bolsa<>();
        bolsaFrutas.agregarProducto(new Fruta("Manzana", 12.5, 0.3, "Rojo"));
        bolsaFrutas.agregarProducto(new Fruta("Plátano", 10.0, 0.25, "Amarillo"));
        bolsaFrutas.agregarProducto(new Fruta("Uva", 15.0, 0.2, "Morado"));
        bolsaFrutas.agregarProducto(new Fruta("Pera", 11.0, 0.28, "Verde"));
        bolsaFrutas.agregarProducto(new Fruta("Mango", 13.5, 0.35, "Naranja"));

        Bolsa<Limpieza> bolsaLimpieza = new Bolsa<>();
        bolsaLimpieza.agregarProducto(new Limpieza("Cloro", 25.0, "Hipoclorito", 1.0));
        bolsaLimpieza.agregarProducto(new Limpieza("Detergente", 30.0, "Tensoactivos", 1.5));
        bolsaLimpieza.agregarProducto(new Limpieza("Jabón líquido", 22.0, "Glicerina", 0.8));
        bolsaLimpieza.agregarProducto(new Limpieza("Desinfectante", 28.0, "Amonio cuaternario", 1.2));
        bolsaLimpieza.agregarProducto(new Limpieza("Limpiavidrios", 18.0, "Alcohol", 0.9));

        Bolsa<Lacteo> bolsaLacteos = new Bolsa<>();
        bolsaLacteos.agregarProducto(new Lacteo("Leche", 20.0, 1000, 8));
        bolsaLacteos.agregarProducto(new Lacteo("Yogurt", 18.0, 500, 5));
        bolsaLacteos.agregarProducto(new Lacteo("Queso", 35.0, 250, 10));
        bolsaLacteos.agregarProducto(new Lacteo("Crema", 22.0, 200, 6));
        bolsaLacteos.agregarProducto(new Lacteo("Mantequilla", 30.0, 300, 4));

        Bolsa<NoPerecible> bolsaNoPerecibles = new Bolsa<>();
        bolsaNoPerecibles.agregarProducto(new NoPerecible("Arroz", 15.0, 1000, 350));
        bolsaNoPerecibles.agregarProducto(new NoPerecible("Frijoles", 18.0, 900, 330));
        bolsaNoPerecibles.agregarProducto(new NoPerecible("Lentejas", 16.0, 800, 310));
        bolsaNoPerecibles.agregarProducto(new NoPerecible("Atún", 25.0, 200, 180));
        bolsaNoPerecibles.agregarProducto(new NoPerecible("Sopa instantánea", 12.0, 85, 250));

        System.out.println("===== Bolsa de Frutas:");
        for (Fruta f : bolsaFrutas.getProductos()) {
            System.out.println(f);
        }

        System.out.println("\n===== Bolsa de Limpieza:");
        for (Limpieza l : bolsaLimpieza.getProductos()) {
            System.out.println(l);
        }

        System.out.println("\n==== Bolsa de Lácteos:");
        for (Lacteo la : bolsaLacteos.getProductos()) {
            System.out.println(la);
        }

        System.out.println("\n===== Bolsa de No Perecibles:");
        for (NoPerecible np : bolsaNoPerecibles.getProductos()) {
            System.out.println(np);
        }
    }
}
