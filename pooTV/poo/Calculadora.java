package pooTV.poo;

public class Calculadora{
    //atributos
    //acceso tipoRetorno(tipoParam parametro 1, ...)
    public int suma(int a, int b){
        return a + b;
    }

    public double suma(double a, double b){
        return a + b;
    }

    public void saludar(String nombre){
        System.out.println("Hola " + nombre + " un gusto saludarte.");
    }
}