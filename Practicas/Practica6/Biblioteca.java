import java.util.ArrayList;
import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private String estado;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = "disponible";
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public String getEstado() { return estado; }

    public void prestar() {
        if (estado.equals("disponible")) {
            estado = "prestado";
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolver() {
        if (estado.equals("prestado")) {
            estado = "disponible";
        } else {
            System.out.println("El libro ya está disponible.");
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", isbn='" + isbn + '\'' + ", estado='" + estado + '\'' + '}';
    }
}

class main {
    private ArrayList<Libro> libros;

    public main() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibroPorISBN(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void prestarLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null) {
            libro.prestar();
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public void devolverLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null) {
            libro.devolver();
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        main biblioteca = new main();
        Scanner scanner = new Scanner(System.in);

        biblioteca.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", "12345"));
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", "67890"));
        biblioteca.agregarLibro(new Libro("El Principito", "Antoine de Saint-Exupéry", "54321"));

        int opcion;
        do {
            System.out.println("\n--- Menú de Biblioteca ---");
            System.out.println("1. Mostrar colección de libros");
            System.out.println("2. Prestar un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nColección de libros:");
                    biblioteca.mostrarLibros();
                    break;

                case 2:
                    System.out.print("Ingrese el ISBN del libro a prestar: ");
                    String isbnPrestar = scanner.nextLine();
                    biblioteca.prestarLibro(isbnPrestar);
                    break;

                case 3:
                    System.out.print("Ingrese el ISBN del libro a devolver: ");
                    String isbnDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(isbnDevolver);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}