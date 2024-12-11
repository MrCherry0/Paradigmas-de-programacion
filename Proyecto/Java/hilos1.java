package Java;
// Este programa muestra una simulación sencilla de cómo funcionan los hilos en Java

class Hilo implements Runnable {
    private String nombre;
    private int veces;

    // Constructor para inicializar el nombre del hilo y el número de iteraciones
    public Hilo(String nombre, int veces) {
        this.nombre = nombre;
        this.veces = veces;
    }

    @Override
    public void run() {
        for (int i = 0; i < veces; i++) {
            System.out.println(nombre + ": Ejecutando iteración " + (i + 1));
            try {
                Thread.sleep(1000); // Pausa la ejecución por 1 segundo
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido.");
            }
        }
    }
}

public class hilos1 {
    public static void main(String[] args) {
        // Inicia el contador de tiempo
        long inicio = System.currentTimeMillis();

        // Crear los hilos
        Thread hilo1 = new Thread(new Hilo("Hilo 1", 3));
        Thread hilo2 = new Thread(new Hilo("Hilo 2", 2));

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

        // Detiene el contador de tiempo
        long fin = System.currentTimeMillis();

        // Calcula el tiempo total
        double tiempoTotal = (fin - inicio) / 1000.0;

        System.out.println("Todos los hilos han terminado.");
        System.out.printf("Tiempo total: %.2f segundos.%n", tiempoTotal);
    }
}
