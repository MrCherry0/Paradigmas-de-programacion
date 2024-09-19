def division_restas(dividendo, divisor):
    cociente = 0
    residuo = dividendo

    while residuo >= divisor:
        residuo -= divisor
        cociente += 1

    return cociente, residuo

if __name__ == "__main__":
    dividendo = int(input("Introduzca el valor del dividendo: "))
    divisor = int(input("Introduzca el valor del divisor: "))
    cociente, residuo = division_restas(dividendo, divisor)
    print(f"El cociente es {cociente} y el residuo es {residuo}")

