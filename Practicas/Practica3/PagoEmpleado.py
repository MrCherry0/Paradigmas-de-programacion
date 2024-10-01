"""
Autor: Salas Chavez Jose de Jesus
"""
def sueldoNormal(sueldo,hr):
    return sueldo*hr

def sueldoExtra(sueldo,hrx):
    return 1.5*sueldo*hrx

def totalSueldo():
    hrx = 0
    hr=int(input("Ingrese el numero de horas trabajadas: "))
    sueldo = int(input("Ingrese el sueldo por hora: "))

    if hr>40:
        hrx=hr-40

    print(f"Paga regular: {sueldoNormal(sueldo,hr-hrx)}")
    print(f"Numero de hrs extra: {hrx}")
    print(f"Paga rextra: {sueldoExtra(sueldo,hrx)}")
    print(f"Paga Total: {sueldoNormal(sueldo,hr-hrx)+sueldoExtra(sueldo,hrx)}")
    return 0

def main():
    print("-------------")
    totalSueldo()


if __name__ == "__main__":
    main()