#Simulacion de descarga de varios archivos
import threading
import time
import random

# Función para simular la descarga de un archivo
def descargar_archivo(nombre_archivo):
    print(f"Iniciando descarga de {nombre_archivo}...")
    tiempo_descarga = random.randint(2, 6)  # Simula el tiempo de descarga en segundos
    time.sleep(tiempo_descarga)  # Espera el tiempo de descarga
    print(f"Descarga completada: {nombre_archivo} (tiempo: {tiempo_descarga} segundos)")

# Lista de archivos a descargar
archivos = [
    "archivo1.pdf",
    "video2.mp4",
    "imagen3.png",
    "presentacion4.pptx",
    "documento5.docx"
]

# Lista para guardar los hilos
hilos = []

# Medir el tiempo total de descarga
inicio = time.time()

# Crear un hilo para cada archivo
for archivo in archivos:
    hilo = threading.Thread(target=descargar_archivo, args=(archivo,))
    hilos.append(hilo)
    hilo.start()  # Iniciar el hilo

# Esperar a que todos los hilos terminen
for hilo in hilos:
    hilo.join()

# Fin del tiempo total
fin = time.time()

# Mostrar el tiempo total
tiempo_total = fin - inicio
print(f"Todas las descargas han terminado en {tiempo_total:.2f} segundos.")