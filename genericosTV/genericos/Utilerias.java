package genericos;

public class Utilerias {
    //Devuelve el mayor de 2 valores
    public static <T extends Comparable<T>> T maximo(T a, T b){
        return (a.compareTo(b <= 0)) ? a : b;
    }
}
