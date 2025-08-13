package flujo;

import java.util.Scanner;

public class InicioSesion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String username, password;
        System.out.print("Ingrese el username: ");
        username = entrada.next();
        System.out.print("Ingrese el password: ");
        password = entrada.next();
        if(username.equals("erxss") && password.equals("12345")){
            System.out.println("Ingresaste correctamente");
        }else{
            System.out.println("Ususario o contraseña incorrectos");
        }

    }
}
