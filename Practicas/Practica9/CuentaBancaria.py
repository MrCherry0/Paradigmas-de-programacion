# Excepciones Personalizadas
class DepositoInvalidoException(Exception):
    pass

class RetiroInvalidoException(Exception):
    pass

class FondosInsuficientesException(Exception):
    pass

# Clase CuentaBancaria
class CuentaBancaria:
    def __init__(self, numero_cuenta, saldo_inicial):
        self.numero_cuenta = numero_cuenta
        self.saldo = saldo_inicial

    def depositar(self, cantidad):
        if cantidad < 0:
            raise DepositoInvalidoException("No se puede depositar un monto negativo.")
        self.saldo += cantidad

    def retirar(self, cantidad):
        if cantidad < 0:
            raise RetiroInvalidoException("No se puede retirar un monto negativo.")
        if cantidad > self.saldo:
            raise FondosInsuficientesException("Fondos insuficientes para realizar el retiro.")
        self.saldo -= cantidad

    def get_saldo(self):
        return self.saldo

# Programa Principal
def main():
    cuenta = CuentaBancaria("123456789", 1000.0)

    while True:
        print(f"\nSaldo actual: {cuenta.get_saldo()}")
        print("Seleccione una operación: 1) Depositar 2) Retirar 3) Salir")
        opcion = input("Opción: ")

        if opcion == "3":
            print("Gracias por usar el sistema bancario.")
            break

        cantidad = float(input("Ingrese la cantidad: "))

        try:
            if opcion == "1":
                cuenta.depositar(cantidad)
                print("Depósito exitoso.")
            elif opcion == "2":
                cuenta.retirar(cantidad)
                print("Retiro exitoso.")
            else:
                print("Opción no válida.")
        except (DepositoInvalidoException, RetiroInvalidoException, FondosInsuficientesException) as e:
            print(f"Error: {e}")

if __name__ == "__main__":
    main()
