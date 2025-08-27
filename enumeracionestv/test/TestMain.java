package test;

import enums.Dia;

public class TestMain {
    //Dia dado es laboral o fin de semana
    private static String verificarDia(Dia dia){
        switch (dia) {
            case SABADO, DOMINGO-> {
                return "Fin de semana";
            }
            default -> {
                return "Dia laboral";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Dia Lunes: " + verificarDia(Dia.LUNES));    
        System.out.println("Dia Viernes: " + verificarDia(Dia.VIERNES));    
        System.out.println("Dia Sabado: " + verificarDia(Dia.SABADO));    
    }
}