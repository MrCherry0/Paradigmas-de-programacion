#El programa simula tareas con variacion de tiempos
import threading
import time
import random

# Variable global para rastrear el tiempo total compartido
tiempo_inicio = time.time()  # Guarda el momento en que comienzan los hilos

# Función que será ejecutada por los hilos
def imprimir_mensaje(nombre, veces):
    tiempo_individual = 0  # Contador para el tiempo individual del hilo
    for i in range(veces):
        tiempo_espera = random.uniform(0.5, 2.0)  # Genera un tiempo aleatorio entre 0.5 y 2.0 segundos
        time.sleep(tiempo_espera)  # Pausa por el tiempo aleatorio
        tiempo_individual += tiempo_espera  # Acumula el tiempo del hilo
        tiempo_total_compartido = time.time() - tiempo_inicio  # Calcula el tiempo total desde el inicio
        print(f"{nombre}: Iteración {i + 1}, Tiempo de espera: {tiempo_espera:.2f} s, "
              f"Tiempo individual: {tiempo_individual:.2f} s, Tiempo total compartido: {tiempo_total_compartido:.2f} s")

# Crear los hilos
hilo1 = threading.Thread(target=imprimir_mensaje, args=("Hilo 1", 3))
hilo2 = threading.Thread(target=imprimir_mensaje, args=("Hilo 2", 2))

# Iniciar los hilos
hilo1.start()
hilo2.start()

# Esperar a que los hilos terminen
hilo1.join()
hilo2.join()

# Imprimir mensaje final con el tiempo total compartido
tiempo_total = time.time() - tiempo_inicio
print(f"Todos los hilos han terminado. Tiempo total transcurrido: {tiempo_total:.2f} s.")