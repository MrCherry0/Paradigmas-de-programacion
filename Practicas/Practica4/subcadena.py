def subcadena(s):
    # Pila para almacenar índices
    pila = [-1]  # Iniciamos con -1 para facilitar el cálculo de la longitud
    max_longitud = 0

    for i, char in enumerate(s):
        if char == '(':
            # Guardamos el índice de los paréntesis abiertos
            pila.append(i)
        else:
            # Si encontramos un paréntesis de cierre
            pila.pop()  # Removemos el último índice
            if len(pila) == 0:
                # Si la pila está vacía, guardamos el índice del paréntesis cerrado
                pila.append(i)
            else:
                # Calculamos la longitud de la subcadena válida actual
                longitud_actual = i - pila[-1]
                max_longitud = max(max_longitud, longitud_actual)

    return max_longitud
def cadena(n):
    s=""
    for i in range(int(n/2)):
        s=s+"()"
    return s

s = input("Dame la cadena: ")
n=subcadena(s)
print(f"La cadena es: {s} y su subcadena mas larga mide {n} y es {cadena(n)}")
