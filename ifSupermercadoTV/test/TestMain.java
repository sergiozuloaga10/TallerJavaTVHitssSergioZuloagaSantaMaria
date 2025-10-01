package test;

import java.util.List;

import clases.Cliente;
import clases.Empleado;
import clases.Producto;
import clases.Venta;
import service.SupermercadoService;

public class TestMain {
    public static void main(String[] args) {
        SupermercadoService service = new SupermercadoService();

        Cliente cliente = new Cliente(1, "Laura", "VIP");
        Empleado empleado = new Empleado(1, "Carlos", "Cajero");

        Producto p1 = new Producto(101, "Leche", 25.0, 10);
        Producto p2 = new Producto(102, "Pan", 15.0, 3);
        Producto p3 = new Producto(103, "Queso", 50.0, 2);

        List<Producto> productos = List.of(p1, p2, p3);
        Venta venta = new Venta(1, cliente, empleado, productos);

        // Calcular total
        double total = service.calcularTotal.apply(productos);
        venta.setTotal(total);

        // Imprimir venta
        service.imprimirVenta.accept(venta);

        // Aplicar descuento a un producto
        service.aplicarDescuento.accept(p1);

        // Comparar productos
        Producto caro = service.productoMasCaro.apply(p2, p3);
        System.out.println("Producto más caro: " + caro.getNombre());

        // Verificar descuento VIP
        boolean aplicaDescuento = service.puedeDescuento.test(cliente, total);
        System.out.println("¿Aplica descuento VIP?: " + aplicaDescuento);

        // Generar ticket
        service.generarTicket.accept(venta);

        // Notificar cliente
        service.notificarCliente.accept(cliente, empleado);
    }
}
