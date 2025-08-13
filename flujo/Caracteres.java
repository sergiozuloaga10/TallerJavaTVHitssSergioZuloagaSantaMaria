package flujo;

import java.util.Scanner;

public class Caracteres {
    //saber si el caracter dado por el usuario es una vocal o una consonante o 
    //un numero o caracter especial
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char caracter;

        System.out.print("Ingresa un caracter: ");
        caracter = entrada.next().charAt(0);
        if(Character.isLetter(caracter)){
            //si es vocal o consonante

        }else{
            
        }


    }
    
}
