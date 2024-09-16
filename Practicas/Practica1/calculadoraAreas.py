import math

def area_circulo(radio):
    return math.pi * radio**2

def perimetro_circulo(radio):
    return 2*math.pi*radio

def area_cuadrado(lado):
    return lado**2

def perimetro_cuadrado(lado):
    return lado*4

def area_triangulo(base,altura):
    return (base*altura)/2

def perimetro_triangulo(lado1,lado2,lado3):
    return lado1+lado2+lado3

def area_rectangulo(base,altura):
    return base*altura

def perimetro_rectangulo(base,altura):
    return 2*(base+altura)

def perimetro_poligono(base,n):
    return base*n

def area_poligono(base,n,a):
    return (base*n*a)/2

def convertir(cm):
    return cm/100

def calculadora_geometrica():
    opcion= 1
    while opcion!=0:
        print("-------------")
        print("Seleccione una forma geométrica:")
        print("0. Salir")
        print("1. Círculo")
        print("2. Cuadrado")
        print("3. Rectángulo")
        print("4. Triángulo")
        print("5. Poligono")

        opcion = int(input("Ingrese el numero de la opcion que quiera: "))

        if opcion == 0:
            break

        if opcion == 1:
            radio = float(input("Introduce el radio en cm del círculo: "))
            print(f"Área: {area_circulo(radio)}")
            print(f"Perímetro: {perimetro_circulo(radio)}")
        
        elif opcion == 2:
            lado = float(input("Introduce el lado en cm del cuadrado: "))
            print(f"Área: {area_cuadrado(lado)}")
            print(f"Perímetro: {perimetro_cuadrado(lado)}")

        elif opcion == 3:
            base = float(input("Introduce la base en cm del rectángulo: "))
            altura = float(input("Introduce la altura en cm del rectángulo: "))
            print(f"Área: {area_rectangulo(base, altura)}")
            print(f"Perímetro: {perimetro_rectangulo(base, altura)}")

        elif opcion == 4:
            base = float(input("Introduce la base en cm del triángulo: "))
            altura = float(input("Introduce la altura en cm del triángulo: "))
            lado1 = float(input("Introduce el primer lado en cm del triángulo: "))
            lado2 = float(input("Introduce el segundo lado en cm del triángulo: "))
            lado3 = float(input("Introduce el tercer lado en cm del triángulo: "))
            print(f"Área: {area_triangulo(base, altura)}")
            print(f"Perímetro: {perimetro_triangulo(lado1, lado2, lado3)}")

        elif opcion == 5:
            n = int(input("Introduce el numero de lados del poligono: "))
            base = float(input("Introduce la base en cm del poligono: "))
            a = float(input("Introduce el apotema en cm del poligono: "))
            print(f"Área: {area_poligono(base,n,a)}")
            print(f"Perímetro: {perimetro_poligono(base,n)}")



if __name__ == "__main__":
    calculadora_geometrica()