"""
Autor: Salas Chavez Jose de Jesus
"""
def main():
    num = int(input("Ingrese un número: "))
    aux = num
    count = 0
    
    while aux != 1:
        aux = aux // 2  # División entera
        count += 1
    
    print(f"Tu número es: {num}")
    print(f"La potencia más cercana es: 2^{count} = {2 ** count}")

if __name__ == "__main__":
    main()