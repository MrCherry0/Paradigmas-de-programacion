class Libro:
    def __init__(self, titulo, autor, isbn):
        self.__titulo = titulo
        self.__autor = autor
        self.__isbn = isbn
        self.__estado = "disponible"

    def get_titulo(self):
        return self.__titulo

    def get_autor(self):
        return self.__autor

    def get_isbn(self):
        return self.__isbn

    def get_estado(self):
        return self.__estado

    def prestar(self):
        if self.__estado == "disponible":
            self.__estado = "prestado"
        else:
            print("El libro ya está prestado.")

    def devolver(self):
        if self.__estado == "prestado":
            self.__estado = "disponible"
        else:
            print("El libro ya está disponible.")

    def __str__(self):
        return f"Libro(titulo='{self.__titulo}', autor='{self.__autor}', isbn='{self.__isbn}', estado='{self.__estado}')"


class Biblioteca:
    def __init__(self):
        self.__libros = []

    def agregar_libro(self, libro):
        self.__libros.append(libro)

    def buscar_libro_por_isbn(self, isbn):
        for libro in self.__libros:
            if libro.get_isbn() == isbn:
                return libro
        return None

    def prestar_libro(self, isbn):
        libro = self.buscar_libro_por_isbn(isbn)
        if libro:
            libro.prestar()
        else:
            print("Libro no encontrado.")

    def devolver_libro(self, isbn):
        libro = self.buscar_libro_por_isbn(isbn)
        if libro:
            libro.devolver()
        else:
            print("Libro no encontrado.")

    def mostrar_libros(self):
        for libro in self.__libros:
            print(libro)


def main():
    biblioteca = Biblioteca()
    biblioteca.agregar_libro(Libro("El Quijote", "Miguel de Cervantes", "12345"))
    biblioteca.agregar_libro(Libro("Cien años de soledad", "Gabriel García Márquez", "67890"))
    biblioteca.agregar_libro(Libro("El Principito", "Antoine de Saint-Exupéry", "54321"))

    while True:
        print("\n--- Menú de Biblioteca ---")
        print("1. Mostrar colección de libros")
        print("2. Prestar un libro")
        print("3. Devolver un libro")
        print("4. Salir")
        opcion = input("Seleccione una opción: ")

        if opcion == '1':
            print("\nColección de libros:")
            biblioteca.mostrar_libros()

        elif opcion == '2':
            isbn_prestar = input("Ingrese el ISBN del libro a prestar: ")
            biblioteca.prestar_libro(isbn_prestar)

        elif opcion == '3':
            isbn_devolver = input("Ingrese el ISBN del libro a devolver: ")
            biblioteca.devolver_libro(isbn_devolver)

        elif opcion == '4':
            print("Saliendo del programa...")
            break

        else:
            print("Opción inválida, intente de nuevo.")


if __name__ == "__main__":
    main()
