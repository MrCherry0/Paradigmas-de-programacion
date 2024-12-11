#Este programa muestra una simulacion senccilla de como funcionan los hilos
import threading  # Importa el módulo threading para usar hilos
import time       # Importa el módulo time para manejar pausas en la ejecución

# Definimos una función que será ejecutada por los hilos
def imprimir_mensaje(nombre, veces):  # La función recibe un nombre y cuántas veces ejecutar el bucle
    for i in range(veces):            # Repite el bucle `n` veces
        print(f"{nombre}: Ejecutando iteración {i + 1}")  # Imprime el nombre del hilo y la iteración actual
        time.sleep(1)  # Pausa la ejecución por 1 segundo para simular una tarea lenta

# Inicia el contador de tiempo
inicio = time.time()

# Crear los hilos
hilo1 = threading.Thread(target=imprimir_mensaje, args=("Hilo 1", 3))  # Asocia la función y sus argumentos al hilo
hilo2 = threading.Thread(target=imprimir_mensaje, args=("Hilo 2", 2))  # Segundo hilo con otros argumentos

# Iniciar los hilos
hilo1.start()  # Comienza la ejecución del hilo 1
hilo2.start()  # Comienza la ejecución del hilo 2

# Esperar a que los hilos terminen
hilo1.join()  # Bloquea la ejecución principal hasta que el hilo 1 termine
hilo2.join()  # Bloquea la ejecución principal hasta que el hilo 2 termine

# Detiene el contador de tiempo
fin = time.time()

# Calcula el tiempo total
tiempo_total = fin - inicio

print("Todos los hilos han terminado.")  # Imprime un mensaje final cuando ambos hilos terminan
print(f"Tiempo total: {tiempo_total:.2f} segundos.")  # Imprime el tiempo total
