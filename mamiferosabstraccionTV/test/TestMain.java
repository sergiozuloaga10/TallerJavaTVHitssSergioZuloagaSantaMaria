package test;

import abstractas.Mamifero;
import subclases.Guepardo;
import subclases.Leon;
import subclases.Lobo;
import subclases.Perro;
import subclases.Tigre;

public class TestMain {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[6];

        mamiferos[0] = new Leon("Sur África", 1.2f, 2.5f, 190f, "Panthera leo", 5.0f, 58, 10, 120f);
        mamiferos[1] = new Tigre("India", 1.1f, 2.3f, 220f, "Panthera tigris", 6.0f, 60, "Bengala");
        mamiferos[2] = new Guepardo("África", 0.9f, 1.5f, 72f, "Acinonyx jubatus", 4.5f, 130);
        mamiferos[3] = new Lobo("Bosques de Canadá", 0.8f, 1.4f, 50f, "Canis lupus", "gris", 3.5f, 6, "Ártico");
        mamiferos[4] = new Perro("Sabana africana", 0.7f, 1.2f, 40f, "Lycaon pictus", "moteado", 2.8f, 320);
        mamiferos[5] = new Leon("Kenia", 1.3f, 2.6f, 200f, "Panthera leo", 5.5f, 55, 8, 110f);

        for (Mamifero animal : mamiferos) {
            System.out.println("Nombre científico: " + animal.getNombreCientifico());
            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
            System.out.println("--------------------------------------------------");
        }
    }
}

