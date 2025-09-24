package test;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;
import models.Venta;

public class TestVentas {
    public static void main(String[] args) {
        //TreeMap, mantiene el orden natural de las claves (LocalDate)
        TreeMap<LocalDate, Venta> ventas = new TreeMap<>();
    
        //Registrar ventas en distintas fechas
        ventas.put(LocalDate.of(2025, 9, 12), new Venta(1, "Eloy", 5500));
        ventas.put(LocalDate.of(2025, 9, 10), new Venta(1, "Eloy", 5500));
        ventas.put(LocalDate.of(2025, 9, 13), new Venta(1, "Eloy", 5500));
        ventas.put(LocalDate.of(2025, 9, 11), new Venta(1, "Eloy", 5500));
        ventas.put(LocalDate.of(2025, 9, 15), new Venta(1, "Eloy", 5500));
        
        TestVentas.imprimir(ventas);

        //Obtener la primera y ultima venta en el mapa.
        System.out.println("Primer venta: " + ((TreeMap<LocalDate, Venta>) ventas).firstEntry());
        System.out.println("Ultima venta: " + ((TreeMap<LocalDate, Venta>) ventas).lastEntry());

        //Buscar ventas anteriores a una fecha
        System.out.println("Ventas antes del 2025-09-13");
        for(Map.Entry<LocalDate, Venta> ventasAnteriores :
            ventas.headMap(LocalDate.of(2025, 9, 13)).entrySet()){
                System.out.println(ventasAnteriores.getKey() + " -> " + ventasAnteriores.getValue());
            }
            
            //Buscar ventas posteriores a una fecha
            System.out.println("Ventas despues del 2025-09-13");
            for (Map.Entry<LocalDate, Venta> ventaPosterior : 
            ventas.tailMap(LocalDate.of(2025, 9, 13)).entrySet()) {
                System.out.println(ventaPosterior.getKey() + " -> " + ventaPosterior.getValue());
            
        }
    }

    public static void imprimir(Map<LocalDate, Venta> mapa){
        for (var elemento : mapa.entrySet()) {
            System.out.println(elemento.getKey() + " -> " + elemento.getValue());
        }
        
    }
}
