package Java;
// Este programa simula la ejecución secuencial de tareas para comparar el tiempo con hilos

public class SinHilos1 {

    // Método que simula una tarea secuencial
    public static void imprimirMensaje(String nombre, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(nombre + ": Ejecutando iteración " + (i + 1));
            try {
                Thread.sleep(1000); // Pausa la ejecución por 1 segundo
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido.");
            }
        }
    }

    public static void main(String[] args) {
        // Inicia el contador de tiempo
        long inicio = System.currentTimeMillis();

        // Ejecutar las funciones de forma secuencial
        imprimirMensaje("Tarea 1", 3); // Ejecuta "Tarea 1"
        imprimirMensaje("Tarea 2", 2); // Luego ejecuta "Tarea 2"

        // Detiene el contador de tiempo
        long fin = System.currentTimeMillis();

        // Calcula el tiempo total
        double tiempoTotal = (fin - inicio) / 1000.0;

        System.out.printf("Todas las tareas han terminado. Tiempo total: %.2f segundos.%n", tiempoTotal);
    }
}

