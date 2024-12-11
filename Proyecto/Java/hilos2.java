package Java;
// Este programa simula tareas en hilos con variación en tiempos de espera
import java.util.Random;

class TareaConTiempo implements Runnable {
    private String nombre;
    private int veces;
    private long tiempoInicio;

    public TareaConTiempo(String nombre, int veces, long tiempoInicio) {
        this.nombre = nombre;
        this.veces = veces;
        this.tiempoInicio = tiempoInicio;
    }

    @Override
    public void run() {
        Random random = new Random();
        double tiempoIndividual = 0; // Contador para el tiempo individual del hilo

        for (int i = 0; i < veces; i++) {
            double tiempoEspera = 0.5 + (1.5 * random.nextDouble()); // Genera un tiempo aleatorio entre 0.5 y 2.0 segundos

            try {
                Thread.sleep((long) (tiempoEspera * 1000)); // Pausa por el tiempo aleatorio
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido.");
            }

            tiempoIndividual += tiempoEspera; // Acumula el tiempo del hilo
            double tiempoTotalCompartido = (System.currentTimeMillis() - tiempoInicio) / 1000.0; // Calcula el tiempo total desde el inicio

            System.out.printf("%s: Iteración %d, Tiempo de espera: %.2f s, Tiempo individual: %.2f s, Tiempo total compartido: %.2f s%n",
                    nombre, i + 1, tiempoEspera, tiempoIndividual, tiempoTotalCompartido);
        }
    }
}

public class hilos2{
    public static void main(String[] args) {
        long tiempoInicio = System.currentTimeMillis(); // Guarda el momento en que comienzan los hilos

        // Crear los hilos
        Thread hilo1 = new Thread(new TareaConTiempo("Hilo 1", 3, tiempoInicio));
        Thread hilo2 = new Thread(new TareaConTiempo("Hilo 2", 2, tiempoInicio));

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();

        // Esperar a que los hilos terminen
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            System.out.println("La ejecución principal fue interrumpida.");
        }

        // Imprimir mensaje final con el tiempo total compartido
        double tiempoTotal = (System.currentTimeMillis() - tiempoInicio) / 1000.0;
        System.out.printf("Todos los hilos han terminado. Tiempo total transcurrido: %.2f s.%n", tiempoTotal);
    }
}
