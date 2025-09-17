package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ListasEnlazadas {
    public static void main(String[] args) {
        List<String> personas = new LinkedList<>();
        personas.add("Eloy");
        personas.add("Sergio");
        personas.add("Bingo");
        personas.add("Susana");
        personas.add("Edgar");
        System.out.println("Lista de Personas: " + personas);
        
        personas.add(3, "Bingo");
        System.out.println("Lista de Personas: " + personas);
        System.out.println("Elemento eliminado: " + personas.remove(3));
        System.out.println("Lista de Personas: " + personas);
        personas.set(3, "Pedro");
        System.out.println("Lista de Personas: " + personas);
        System.out.println("Contiene: " + personas.contains("Pedro"));


    }
}
