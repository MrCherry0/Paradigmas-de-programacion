"""
Autor: Salas Chavez Jose de Jesus
"""
def cuadrante(x, y):
    if x == 0 and y == 0:
        print("El vector se encuentra en el Origen")
    elif x > 0 and y > 0:
        print(f"El vector ({x}, {y}) se encuentra en el Cuadrante 1")
    elif x < 0 and y > 0:
        print(f"El vector ({x}, {y}) se encuentra en el Cuadrante 3")
    elif x < 0 and y < 0:
        print(f"El vector ({x}, {y}) se encuentra en el Cuadrante 2")
    elif x > 0 and y < 0:
        print(f"El vector ({x}, {y}) se encuentra en el Cuadrante 4")
    elif x != 0 and y == 0:
        print(f"El vector ({x}, {y}) se encuentra sobre el eje x")
    elif x == 0 and y != 0:
        print(f"El vector ({x}, {y}) se encuentra sobre el eje y")

def main():
    x = float(input("Ingrese la coordenada en x: "))
    y = float(input("Ingrese la coordenada en y: "))
    cuadrante(x, y)
    print("-------------")

if __name__ == "__main__":
    main()
