package clases;

import java.util.*;

public class Banco {
    private List<CuentaBancaria> cuentas = new ArrayList<>();
    private List<Transaccion> transacciones = new ArrayList<>();

    public CuentaBancaria crearCuenta(String titular, double depositoInicial) {
        CuentaBancaria cuenta = new CuentaBancaria(titular, depositoInicial);
        cuentas.add(cuenta);
        return cuenta;
    }

    public void realizarDeposito(CuentaBancaria cuenta, double monto) {
        cuenta.depositar(monto);
        transacciones.add(new Transaccion("Depósito", monto, cuenta.getId()));
    }

    public void realizarRetiro(CuentaBancaria cuenta, double monto) {
        if (cuenta.retirar(monto)) {
            transacciones.add(new Transaccion("Retiro", monto, cuenta.getId()));
        } else {
            System.out.println("Fondos insuficientes para retiro en cuenta ID: " + cuenta.getId());
        }
    }

    public void mostrarCuentas() {
        System.out.println("=== Cuentas Bancarias ===");
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }

    public void mostrarTransacciones() {
        System.out.println("=== Historial de Transacciones ===");
        for (Transaccion t : transacciones) {
            System.out.println(t);
        }
    }
}
