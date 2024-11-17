from abc import ABC, abstractmethod

class Vehiculo(ABC):
    
    def __init__(self,marca,modelo,año):
        self.marca = marca
        self.modelo = modelo
        self.año = año
    
    @abstractmethod
    def encender(self):
        return f"El Vehiculo {self.modelo} encendio"
        
    
    @abstractmethod
    def apagar(self):
        return f"El Vehiculo {self.modelo} encendio"
    
        
    @abstractmethod
    def describir(self):
        return f"El vehiculo modelo {self.modelo}, marca {self.marca} y año {self.año} "
    
class Auto(Vehiculo):
    
    def __init__(self,marca,modelo,año):
        super().__init__(marca,modelo,año)
    
    def encender(self):
        return "El auto ha encendido: rum rum ..."

    def apagar(self):
        return "El auto ha apagado: ..."
    
    def describir(self):
        return f"Este es un auto marca {self.marca}, modelo {self.modelo}, del año {self.año}"
    
class Motocicleta(Vehiculo):
    
    def __init__(self,modelo,marca,año):
        super().__init__(modelo,marca,año)
        
    def encender(self):
        return "La motocicleta encendio"
    
    def apagar(self):
        return "La motocicleta se apago"
    
    def describir(self):
        return f"Esta es una motocicleta marca {self.marca}, modelo {self.modelo}, del año {self.año}"

class Camion(Vehiculo):
    
    def __init__(self,modelo,marca,año):
        super().__init__(modelo,marca,año)
        
    def encender(self):
        return "El camion encendio"
    
    def apagar(self):
        return "El camion se apago"
    
    def describir(self):
        return f"Este es un camion marca {self.marca}, modelo {self.modelo}, del año {self.año}"
    
def main():
    vehiculos = [
        Auto('Toyota','Corolla',2022),
        Motocicleta('Honda','CBR500R',2023),
        Camion('Freightliner','Cascadia',2021)
    ]
    
    for vehiculo in vehiculos:
        print(vehiculo.encender())
        print(vehiculo.apagar())
        print(vehiculo.describir())
        
    
    
if __name__ == "__main__":
    main()