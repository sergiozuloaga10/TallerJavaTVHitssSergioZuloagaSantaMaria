package ejercicios;

import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalVentas = 0.0;
        int opcion = 0;
        
        while (opcion != 3){
            System.out.println("\n------------ Menú del Cajero ------------\n");
            System.out.println("    1. Registrar un pedido");
            System.out.println("    2. Mostrar total de ventas");
            System.out.println("    3. Salir\n");
            System.out.print("    Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el precio del pedido: ");
                    double precio = scanner.nextDouble();
                    if (precio > 0) {
                        totalVentas += precio;
                        System.out.println("Pedido registrado correctamente.");
                    } else {
                        System.out.println("Error: el precio debe ser positivo.");
                    }
                    break;

                case 2:
                    System.out.printf("El total de ventas es: $%.2f%n", totalVentas);
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }
}
