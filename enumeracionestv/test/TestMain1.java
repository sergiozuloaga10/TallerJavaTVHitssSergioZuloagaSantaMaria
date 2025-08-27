package test;

import enums.Calificacion;

public class TestMain1 {
    public static void main(String[] args) {
        for (Calificacion cal : Calificacion.values()) {
            
            System.out.println("Valor ordinal: " + cal.ordinal());
            System.out.println("Nombre: " + cal.name());
            System.out.println("Descripcion: " + cal.getDescripcion());
        }
    }
}
