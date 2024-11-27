// Archivo: CuentaBancaria.java
import java.io.IOException;
// Programa Principal
import java.util.Scanner;

// Excepciones Personalizadas
class DepositoInvalidoException extends Exception {
    public DepositoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class RetiroInvalidoException extends Exception {
    public RetiroInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}

// Clase CuentaBancaria
class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) throws DepositoInvalidoException {
        if (cantidad < 0) {
            throw new DepositoInvalidoException("No se puede depositar un monto negativo.");
        }
        saldo += cantidad;
    }

    public void retirar(double cantidad) throws RetiroInvalidoException, FondosInsuficientesException {
        if (cantidad < 0) {
            throw new RetiroInvalidoException("No se puede retirar un monto negativo.");
        }
        if (cantidad > saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes para realizar el retiro.");
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}


public class CuentaBancariaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.0);

        while (true) {
            System.out.println("\nSaldo actual: " + cuenta.getSaldo());
            System.out.println("Seleccione una operación: 1) Depositar 2) Retirar 3) Salir");
            int opcion = scanner.nextInt();

            if (opcion == 3) {
                System.out.println("Gracias por usar el sistema bancario.");
                break;
            }

            System.out.print("Ingrese la cantidad: ");
            double cantidad = scanner.nextDouble();

            try {
                if (opcion == 1) {
                    cuenta.depositar(cantidad);
                    System.out.println("Depósito exitoso.");
                } else if (opcion == 2) {
                    cuenta.retirar(cantidad);
                    System.out.println("Retiro exitoso.");
                } else {
                    System.out.println("Opción no válida.");
                }
            } catch (DepositoInvalidoException | RetiroInvalidoException | FondosInsuficientesException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
