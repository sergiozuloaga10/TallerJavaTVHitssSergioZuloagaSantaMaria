package services;

import java.util.List;
import java.util.stream.Collectors;

import models.Factura;

public class OperacionesService {
    public static void totalVentas(List<Factura> facturas){
        facturas.stream()
                .collect(Collectors.groupingBy(Factura::getCliente,
                                    Collectors.summingDouble(Factura::getTotal)))
                .forEach((cliente, total) 
                                    -> System.out.println(cliente + " -> $" + total));
    }
}
