package test;

public class TestMain {
    //parametro variable -> tipoDatos ... nombreParametro
    private static int sumar(int ... numeros){
        int suma = 0;
        for(int n : numeros){
            suma += n;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Suma: " + sumar()); //cero valores al parametro variable
        System.out.println("Suma: " + sumar(3,5,10)); //3 valores
        System.out.println("Suma: " + sumar(54,12,43,5,65)); //5 valores
    }
}
