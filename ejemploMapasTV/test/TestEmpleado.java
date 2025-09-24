package test;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class TestEmpleado {
    public static void main(String[] args) {
        //Crear un HashMap donde la clave es el ID y el valor es un Empleado
        Map<Integer, Empleado> empleados = new HashMap<>();

        //Agregar empleados
        empleados.put(2, new Empleado(2, "Eloy Sanchez", "TI"));
        empleados.put(5, new Empleado(5, "Ana Velasco", "Recursos Humanos"));
        empleados.put(101, new Empleado(101, "Juan Lopez", "Ventas"));
        
        TestEmpleado.imprimirMapa(empleados);
        
        //Acceder a un elemento por su id
        System.out.println("Buscar empleado con ID 5");
        System.out.println(empleados.get(15));
        
        //Verificar si existe un empleado
        int buscarId = 5;
        if(empleados.containsKey(buscarId)){
            System.out.println("El empleado " + buscarId + " si existe.");
        } else{
            System.out.println("El empleado " + buscarId + " no esta registrado.");
        }
        
        //Eliminar un empleado
        System.out.println("Empleado eliminado: " + empleados.remove(buscarId));
        empleados.put(201, new Empleado(201, "Noemi Garcia", "Gerencia"));
        TestEmpleado.imprimirMapa(empleados);

    }
    
    public static void imprimirMapa(Map<Integer, Empleado> empleados){
        for (Map.Entry<Integer, Empleado> empleado : empleados.entrySet()) {
            System.out.println(empleado.getKey() + " -> " + empleado.getValue());
        }
        
    }
}
