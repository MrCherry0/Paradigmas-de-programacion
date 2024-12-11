#Mismo programa de Hilos1 solo que no se usan hilos para comparar tiempo de ejecucion
import time  # Importa el módulo time para manejar pausas en la ejecución y medición del tiempo

# Definimos una función que será ejecutada secuencialmente
def imprimir_mensaje(nombre, veces):  # La función recibe un nombre y cuántas veces ejecutar el bucle
    for i in range(veces):            # Repite el bucle `veces` veces
        print(f"{nombre}: Ejecutando iteración {i + 1}")  # Imprime el nombre y la iteración actual
        time.sleep(1)  # Pausa la ejecución por 1 segundo para simular una tarea lenta

# Inicia el contador de tiempo
inicio = time.time()

# Ejecutar las funciones de forma secuencial
imprimir_mensaje("Tarea 1", 3)  # Ejecuta la función para "Tarea 1"
imprimir_mensaje("Tarea 2", 2)  # Luego ejecuta la función para "Tarea 2"

# Detiene el contador de tiempo
fin = time.time()

# Calcula el tiempo total
tiempo_total = fin - inicio

print(f"Todas las tareas han terminado. Tiempo total: {tiempo_total:.2f} segundos.")  # Imprime el tiempo total
