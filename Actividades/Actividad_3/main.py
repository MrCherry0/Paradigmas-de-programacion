# Clase base Animal
class Animal:
    def __init__(self):
        self.__color = ""

    # Método para establecer el color
    def set_color(self, color):
        self.__color = color

    # Método para obtener el color
    def get_color(self):
        return self.__color

    # Método comer (puede ser sobrescrito por las clases derivadas)
    def comer(self):
        print("El animal está comiendo.")

# Clase derivada Perro
class Perro(Animal):
    def comer(self):
        print("El perro está comiendo croquetas.")

# Clase derivada Gato
class Gato(Animal):
    def comer(self):
        print("El gato está comiendo pescado.")

# Clase derivada Pajaro
class Pajaro(Animal):
    def comer(self):
        print("El pájaro está comiendo semillas.")

# Pruebas
perro = Perro()
perro.set_color("Marrón")
print("Color del perro:", perro.get_color())
perro.comer()

gato = Gato()
gato.set_color("Gris")
print("Color del gato:", gato.get_color())
gato.comer()

pajaro = Pajaro()
pajaro.set_color("Amarillo")
print("Color del pájaro:", pajaro.get_color())
pajaro.comer()
