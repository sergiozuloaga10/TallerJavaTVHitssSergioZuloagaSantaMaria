package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import modelos.Persona;

public class Listas{
    public static void main(String[] args) {
        List<String> empleados = new ArrayList<>();
        List<String> nuevosEmpleados = Arrays.asList("Renata", "Delfino");
        empleados.add("Eloy");
        empleados.add("Sergio");
        empleados.add("Bingo");
        empleados.add("Susana");
        empleados.add("Edgar");

        System.out.println("Lista de empleados: " + empleados);
        //insercion en medio (O(n))
        empleados.add(4, "Pedro");
        System.out.println("Lista de empleados: " + empleados);
        empleados.addFirst("Juan");
        System.out.println("Lista de empleados: " + empleados);
        empleados.addLast("Ines");
        System.out.println("Lista de empleados: " + empleados);
        empleados.addAll(nuevosEmpleados);
        System.out.println("Lista de empleados: " + empleados);
        
        System.out.println("Total: " + empleados.size());
        //Modificar un elemento de la Lista
        System.out.println("Valor modificado: " + empleados.set(5, "Amelia"));
        System.out.println("Lista de empleados: " + empleados);
        
        // Eliminar un elemento de la lista
        System.out.println("Elemento eliminado: " + empleados.remove(5));
        System.out.println("Lista de empleados: " + empleados);
        System.out.println("Elemento eliminado: " + empleados.remove("Eloy"));
        System.out.println("Lista de empleados: " + empleados);
        
        //Obtener un elemento
        System.out.println("Elemento: " + empleados.get(4));
        empleados.add(3, "Eloy");
        System.out.println("Lista de empleados: " + empleados);
        
        //Iteradores
        System.out.println("=====================Utilizando iteradores==================");
        Iterator<String> iterador = empleados.iterator(); //List, Set, Map
        while(iterador.hasNext()){
            if(iterador.next().equals("Eloy")){
                iterador.remove();
            }
        }
        System.out.println("Lista de empleados: " + empleados);
        
        System.out.println("Despues del primer recorrido del iterador...");
        while(iterador.hasNext()){
            System.out.println("Elemento: " + iterador.next());
        }
        
        System.out.println("===========ListIterator============");
        ListIterator<String> listIterator = empleados.listIterator(); // List
        while (listIterator.hasNext()) {
            System.out.println("Indice: " + listIterator.nextIndex());
            System.out.println("Elemento: " + listIterator.next());
        }
        
        System.out.println("Recorrer de fin a inicio");
        while (listIterator.hasPrevious()) {
            System.out.println("Indice: " + listIterator.previousIndex());
            System.out.println("Elemento: " + listIterator.previous());
        }
        listIterator.add("Eloy");
        System.out.println("Lista de empleados: " + empleados);

        //Ordenamiento
        Collections.sort(empleados);
        System.out.println(empleados);
        List<Integer> enteros = new ArrayList<>();
        enteros.add(45);
        enteros.add(15);
        enteros.add(55);
        enteros.add(25);
        enteros.add(5);
        System.out.println(enteros);
        Collections.sort(enteros);
        System.out.println(enteros);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Eloy", 40));
        personas.add(new Persona(2, "Sergio", 22));
        personas.add(new Persona(3, "Bingo", 23));
        personas.add(new Persona(4, "Susana", 35));
        personas.add(new Persona(5, "Kaory", 20));
        personas.add(new Persona(6, "Otis", 21));
        personas.add(new Persona(7, "Irma", 60));
        System.out.println("-------Lista de personas antes de ordenas----------");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        Collections.sort(personas);
        System.out.println("-------------Lista de personas despues de ordenar------------------");
        for (Persona persona : personas) {
            
            System.out.println(persona);
        }
        

    }
}