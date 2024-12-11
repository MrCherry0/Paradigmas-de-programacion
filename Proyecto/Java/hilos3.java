package Java;
// Simulación de descarga de varios archivos en Java
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DescargaArchivo implements Runnable {
    private String nombreArchivo;

    public DescargaArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void run() {
        System.out.println("Iniciando descarga de " + nombreArchivo + "...");
        Random random = new Random();
        int tiempoDescarga = 2 + random.nextInt(5); // Simula el tiempo de descarga entre 2 y 6 segundos
        try {
            Thread.sleep(tiempoDescarga * 1000); // Simula la espera del tiempo de descarga
        } catch (InterruptedException e) {
            System.out.println("La descarga de " + nombreArchivo + " fue interrumpida.");
        }
        System.out.println("Descarga completada: " + nombreArchivo + " (tiempo: " + tiempoDescarga + " segundos)");
    }
}

public class hilos3 {
    public static void main(String[] args) {
        // Lista de archivos a descargar
        String[] archivos = {
            "archivo1.pdf",
            "video2.mp4",
            "imagen3.png",
            "presentacion4.pptx",
            "documento5.docx"
        };

        // Lista para guardar los hilos
        List<Thread> hilos = new ArrayList<>();

        // Medir el tiempo total de descarga
        long inicio = System.currentTimeMillis();

        // Crear e iniciar un hilo para cada archivo
        for (String archivo : archivos) {
            Thread hilo = new Thread(new DescargaArchivo(archivo));
            hilos.add(hilo);
            hilo.start();
        }

        // Esperar a que todos los hilos terminen
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                System.out.println("La ejecución principal fue interrumpida.");
            }
        }

        // Fin del tiempo total
        long fin = System.currentTimeMillis();

        // Mostrar el tiempo total
        double tiempoTotal = (fin - inicio) / 1000.0;
        System.out.printf("Todas las descargas han terminado en %.2f segundos.%n", tiempoTotal);
    }
}
