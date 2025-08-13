package ejercicios;

import java.util.Scanner;

public class Pedir20Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int mayor6 = 0, menor6 = 0, igual6 = 0;
        double promedioTotal = 0;
        for(int i=0; i<20; i++){
            System.out.print("Ingresa una nota final de los alumnos y da enter: ");
            double calificacion = sc.nextDouble();
            if(calificacion < 1.0 || calificacion > 10.0){
                System.out.println("Error, numero fuera de rangos");
                System.exit(-1);
            }else if(calificacion < 6){
                menor6++;
            }else if(calificacion > 6){
                mayor6++;
            }else{
                igual6++;
            }
            promedioTotal += calificacion;
        }

        System.out.println("Promedio de notas menores a 6: " + (double) mayor6/20);
        System.out.println("Cantidad de notas mayores a 6: " + mayor6);
        System.out.println("Promedio de notas mayores a 6: " + (double) menor6/20);
        System.out.println("Cantidad de notas menores a 6: " + menor6);
        System.out.println("Promedio de notas iguales a 6: " + (double) igual6/20);
        System.out.println("Cantidad de notas iguales a 6: " + igual6);
        System.out.println("Promedio total: " + promedioTotal/20);


    }
}
