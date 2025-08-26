package clases;

public class CuentaBancaria {
    
    private static int contadorCuentas = 1;
    private int id;
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double depositoInicial) {
        this.id = contadorCuentas++;
        this.titular = titular;
        this.saldo = depositoInicial;
    }

    public int getId() { return id; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cuenta ID: " + id + ", Titular: " + titular + ", Saldo: $" + saldo;
    }

}
