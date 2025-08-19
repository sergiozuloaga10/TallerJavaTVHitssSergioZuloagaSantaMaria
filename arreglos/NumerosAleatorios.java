package arreglos;

public class NumerosAleatorios {
    public static void main(String[] args) {
        //Clase Math
        //Numero aleatorio
        //double numero = Math.random() * 100;
        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 100);
            System.out.println(numero);
        }
        //Clase Random
    }
}
