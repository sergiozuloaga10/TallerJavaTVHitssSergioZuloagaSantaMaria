package entradas;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad = 0;
        System.out.println("Ingresa tu edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();

        entrada.close();
    }
}