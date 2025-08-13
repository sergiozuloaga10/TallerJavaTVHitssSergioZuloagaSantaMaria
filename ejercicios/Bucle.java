package ejercicios;

import java.util.Scanner;

public class Bucle {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, resultado = 0;
        System.out.print("Ingresa un numero entero: ");
        x = entrada.nextInt();
        System.out.print("Ingresa otro numero entero: ");
        y = entrada.nextInt();
        entrada.close();

        for(int i=0; i<Math.abs(y); i++){
           resultado += x; 
        }

        if(y < 0){
            resultado = -resultado;
        }

        System.out.println("El resultado de " + x + " * " + y + " es: " + resultado);
        
    }
}
