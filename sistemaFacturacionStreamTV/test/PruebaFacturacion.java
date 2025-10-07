package test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import models.Cliente;
import models.Factura;
import models.Producto;
import models.Venta;
import services.OperacionesService;

public class PruebaFacturacion {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1, "Ana", "ana@hitss.com");
        Cliente c2 = new Cliente(2, "Sergio", "sergio@hitss.com");
        Cliente c3 = new Cliente(3, "Eloy", "eloy@gmail.com");
        Cliente c4 = new Cliente(4, "Alberto", "albertoa@hitss.com");
        Cliente c5 = new Cliente(5, "Kaory", "kaory@gmail.com");

        // Productos
        Producto p1 = new Producto(1, "Laptop", 12000);
        Producto p2 = new Producto(2, "Mouse", 250);
        Producto p3 = new Producto(3, "Teclado", 500);
        Producto p4 = new Producto(4, "Monitor", 3500);
        Producto p5 = new Producto(5, "Camara", 1500);

        // Facturas y ventas
        Factura f1 = new Factura(1, c1, LocalDate.of(2025, 10, 1), 
            LocalDate.of(2025, 10, 10));
        f1.agregarVenta(new Venta(p1, 2));
        f1.agregarVenta(new Venta(p3, 5));

        Factura f2 = new Factura(2, c2, LocalDate.of(2025, 10, 2), 
            LocalDate.of(2025, 10, 5));
        f2.agregarVenta(new Venta(p2, 4));
        f2.agregarVenta(new Venta(p5, 5));
        f2.agregarVenta(new Venta(p3, 10));

        Factura f3 = new Factura(3, c3, LocalDate.of(2025, 10, 3), 
            LocalDate.of(2025, 10, 7));
        f3.agregarVenta(new Venta(p4, 2));
        f3.agregarVenta(new Venta(p1, 1));
        f3.agregarVenta(new Venta(p3, 5));

        Factura f4 = new Factura(4, c4, LocalDate.of(2025, 10, 4), 
            LocalDate.of(2025, 10, 11));
        f4.agregarVenta(new Venta(p5, 2));
        f4.agregarVenta(new Venta(p2, 1));

        Factura f5 = new Factura(5, c1, LocalDate.of(2025, 10, 5), 
            LocalDate.of(2025, 10, 11));
        f5.agregarVenta(new Venta(p5, 2));
        f5.agregarVenta(new Venta(p2, 1));
        f5.agregarVenta(new Venta(p4, 2));

        //List o Stream
       // Stream<Factura> facturas = Stream.of(f1, f2, f3, f4, f5);
        List<Factura> facturas = List.of(f1, f2, f3, f4, f5);
        // System.out.println(facturas.stream().count());
        // facturas.stream().forEach(System.out::println);

        //1. Total de ventas por cliente
        System.out.println("====Total de ventas por cliente====");
        //Map<Cliente, Double> totalPorCliente = 
        OperacionesService.totalVentas(facturas);

        //2. Ventas en un rango de fechas
        System.out.println("\n====Ventas en un rango de fechas====");
        LocalDate inicio = LocalDate.of(2025, 10, 1);
        LocalDate fin = LocalDate.of(2025, 10, 5);
        double totalEntreFechas = facturas.stream()
                .filter(f -> !f.getFecha().isBefore(inicio) && !f.getFecha().isAfter(fin))
                .peek(System.out::println)
                .mapToDouble(Factura::getTotal)
                .sum();
        System.out.println("Total entre fechas: $" + totalEntreFechas);
        
        //3. Top 3 productos mas vendidos
        System.out.println("\n=====Top 3 productos más vendidos=====");
        facturas.stream()
                .flatMap(f -> f.getVentas().stream())
                .collect(Collectors.groupingBy(Venta::getProducto, 
                                    Collectors.summingInt(Venta::getCantidad)))
                .entrySet().stream()
                .sorted(Map.Entry.<Producto, Integer>comparingByValue().reversed())
                .limit(3)
                .forEach(e ->
                    System.out.println(e.getKey().getNombre() + " -> " + e.getValue()));


        //4. Clientes con facturas vencidad
        System.out.println("\n=====Clientes con facturas vencidas=====");
        facturas.stream().filter(Factura::estaVencida).forEach(System.out::println);

        //5. Validar politicas (¿Todos los clientes tienen email corporativo?)
        System.out.println("\n=====Validar Politicas del cliente======");
        boolean todosCorporativos = facturas.stream()
                .map(Factura::getCliente)
                .allMatch(c -> c.getEmail().endsWith("@hitss.com"));

        System.out.println("¿Todos los clientes tienen email corporativo?: " + todosCorporativos);

    }
}
