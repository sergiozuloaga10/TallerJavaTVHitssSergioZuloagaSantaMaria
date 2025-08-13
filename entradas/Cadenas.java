package entradas;

public class Cadenas {
    public static void main(String[] args) {
        String nombre = "Sergio Zuloaga Santa Maria";
        String nombre1 = "   Sergio Zuloaga Santa Maria   ";
        System.out.println("length(): " + nombre.length());
        System.out.println("==: " + nombre == nombre1); //no es recomendable para comparar objetos
        System.out.println("Equals(String b): " + nombre.equals(nombre1));
        System.out.println("equalIgnoreCase(String b): " + (nombre.equalsIgnoreCase((nombre1))));
        System.out.println("charAt(int i): " + (nombre.charAt(6)));

        System.out.println(nombre1);
        System.out.println("trim(): " + nombre1.trim());

        System.out.println("substring(int a, int b): " + nombre.substring(5, 11));
        System.out.println("indexOf: " + nombre.indexOf("S"));
    
    }
}
