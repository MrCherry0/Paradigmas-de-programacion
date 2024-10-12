def subcadena(s):
    max_longitud = 0
    
    # Recorrido de izquierda a derecha
    abiertos = 0  # Contador de '('
    cerrados = 0  # Contador de ')'
    
    for char in s:
        if char == '(':
            abiertos += 1
        else:
            cerrados += 1
        
        if abiertos == cerrados:
            max_longitud = max(max_longitud, 2 * cerrados)  # Se cuenta la longitud total de la subcadena válida
        elif cerrados > abiertos:
            abiertos = cerrados = 0  # Reiniciar contadores si los paréntesis cerrados son más
        
    # Recorrido de derecha a izquierda
    abiertos = 0
    cerrados = 0
    
    for char in reversed(s):
        if char == '(':
            abiertos += 1
        else:
            cerrados += 1
        
        if abiertos == cerrados:
            max_longitud = max(max_longitud, 2 * abiertos)
        elif abiertos > cerrados:
            abiertos = cerrados = 0  # Reiniciar contadores si los paréntesis abiertos son más
    
    return max_longitud

def cadena(n):
    s = ""
    for i in range(int(n/2)):
        s += "()"
    return s

# Entrada y salida
s = input("Dame la cadena: ")
n = subcadena(s)
print(f"La cadena es: {s} y su subcadena más larga mide {n} y es {cadena(n)}")
