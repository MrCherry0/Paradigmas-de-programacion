#Salas Chavez Jose de Jesus 20/09/2024

def factorial(n):
    resultado = 1
    for i in range(1, n + 1):
        resultado *= i
    return resultado


if __name__ == "__main__":
    numero = int(input("introduzca un numero: "))
    print(f"El factorial de {numero} es {factorial(numero)} \n")

    