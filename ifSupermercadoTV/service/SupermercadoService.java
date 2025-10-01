package service;

import java.util.List;
import java.util.function.*;

import clases.Cliente;
import clases.Empleado;
import clases.Producto;
import clases.Venta;

public class SupermercadoService {

    // 1. Filtrar productos con stock bajo
    public Predicate<Producto> stockBajo = p -> p.getStock() < 5;

    // 2. Calcular total de venta
    public Function<List<Producto>, Double> calcularTotal = productos ->
        productos.stream().mapToDouble(Producto::getPrecio).sum();

    // 3. Imprimir detalles de venta
    public Consumer<Venta> imprimirVenta = venta -> {
        System.out.println("Venta #" + venta.getId());
        System.out.println("Cliente: " + venta.getCliente().getNombre());
        System.out.println("Empleado: " + venta.getEmpleado().getNombre());
        System.out.println("Productos:");
        venta.getProductos().forEach(p ->
            System.out.println("- " + p.getNombre() + " ($" + p.getPrecio() + ")"));
        System.out.println("Total: $" + venta.getTotal());
    };

    // 4. Generar producto de muestra
    public Supplier<Producto> productoDeMuestra = () ->
        new Producto(999, "Producto Demo", 99.99, 10);

    // 5. Aplicar descuento del 10%
    public Consumer<Producto> aplicarDescuento = p -> p.aplicarDescuento(0.10);

    // 6. Comparar dos productos y devolver el más caro
    public BiFunction<Producto, Producto, Producto> productoMasCaro = (p1, p2) ->
        p1.getPrecio() > p2.getPrecio() ? p1 : p2;

    // 7. Verificar si cliente VIP puede acceder a descuento
    public BiPredicate<Cliente, Double> puedeDescuento = (c, total) ->
        c.getTipo().equalsIgnoreCase("VIP") && total > 1000;

    // 8. Generar ticket de venta
    public Consumer<Venta> generarTicket = venta -> {
        System.out.println("=== TICKET DE VENTA ===");
        System.out.println("Cliente: " + venta.getCliente().getNombre());
        System.out.println("Total: $" + venta.getTotal());
        System.out.println("=======================");
    };

    // 9. Notificar cliente
    public BiConsumer<Cliente, Empleado> notificarCliente = (c, e) ->
        System.out.println("Estimado " + c.getNombre() + ", su compra fue procesada por " + e.getNombre());
}

