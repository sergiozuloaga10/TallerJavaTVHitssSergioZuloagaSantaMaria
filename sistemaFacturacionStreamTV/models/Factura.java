package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private int id;
    private Cliente cliente;
    private LocalDate fecha;
    private LocalDate fechaVencimiento;
    private List<Venta> ventas;

    public Factura(int id, Cliente cliente, LocalDate fecha, LocalDate fechaVencimiento) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.fechaVencimiento = fechaVencimiento;
        this.ventas = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public List<Venta> getVentas() {
        return ventas;
    }

    public void agregarVenta(Venta venta){
        ventas.add(venta);
    }

    public double getTotal(){
        // double total = 0;
        // for(Venta venta : ventas){
        //     total += venta.getTotal();
        // }
        // return total;

        return ventas.stream().mapToDouble(Venta::getTotal).sum();
    }

    public boolean estaVencida(){
        return fechaVencimiento.isBefore(LocalDate.now());
    }
    @Override
    public String toString() {
        return "Factura #" + id + " - Cliente: " + cliente + "\nfecha: " + fecha + " - Total: $ " + getTotal();
    }

}
