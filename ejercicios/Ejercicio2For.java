package ejercicios;

import java.util.Scanner;

public class Ejercicio2For {
    public static void main(String[] args) {
        int numeros, menor = 0;
        Scanner entrada = new Scanner((System.in));
        System.out.print("Ingresa un número entero mayor o igual a 10: ");
        numeros = entrada.nextInt();

        if(numeros < 10){
            System.out.println("Error, debes escribir un número entero mayor o igual a 10");
            System.exit(-1);
        }
        for(int i=0; i<numeros; i++){
            System.out.print("Ingresa un número entero: ");
            int x = entrada.nextInt();

            if(i == 0){
                menor = x;
            } else if(x < menor){
                menor = x;
            }
        }
        entrada.close();
    
        if(menor < 10){
            System.out.println("El número menor: " + menor + " es menor que 10");
        } else{
            System.out.println("El número menor: " + menor + " es igual o mayor que 10");
        }
        
    }
}
