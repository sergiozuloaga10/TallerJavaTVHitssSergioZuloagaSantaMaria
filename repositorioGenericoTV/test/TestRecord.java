package test;

import entidades.Persona;

public class TestRecord {
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("Kaory", 20);
            System.out.println(p1);
            Persona p2 = new Persona("Angel", 21);
            System.out.println(p2);
            System.out.println(p2.nombre());
            System.out.println(p2.edad());
            System.out.println("Son iguales: " + p1.equals(p2));

            System.out.println("Mensaje: " + p1.mensaje("CADENAAaaaAA"));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
