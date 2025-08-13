package ciclos;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        //hacer la suma de numeros enteros mientras el numero ingresado no
        //sea cero, e imprimir la suma
        Scanner sc = new Scanner(System.in);
        int numero, suma = 0, total = 0; //acumulador, contador, banderas
        
        System.out.print("Ingresa un numero: ");
        numero = sc.nextInt();
        while (numero != 0) {
            suma += numero;
            total++;
            System.out.print("Numero: ");
            numero = sc.nextInt();
        }

        System.out.println("Suma: " + suma);
        if(total > 0){
            System.out.println("Promedio: " + suma / (double) total);
        }

    }
    
}