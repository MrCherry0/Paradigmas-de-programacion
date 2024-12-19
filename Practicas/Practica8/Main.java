// Clase abstracta Vehiculo
abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Métodos abstractos
    public abstract String encender();
    public abstract String apagar();
    public abstract String describir();
}

// Clase Auto que extiende de Vehiculo
class Auto extends Vehiculo {

    public Auto(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public String encender() {
        return "El auto ha encendido: rum rum ...";
    }

    @Override
    public String apagar() {
        return "El auto ha apagado: ...";
    }

    @Override
    public String describir() {
        return "Este es un auto marca " + marca + ", modelo " + modelo + ", del año " + año;
    }
}

// Clase Motocicleta que extiende de Vehiculo
class Motocicleta extends Vehiculo {

    public Motocicleta(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public String encender() {
        return "La motocicleta encendió";
    }

    @Override
    public String apagar() {
        return "La motocicleta se apagó";
    }

    @Override
    public String describir() {
        return "Esta es una motocicleta marca " + marca + ", modelo " + modelo + ", del año " + año;
    }
}

// Clase Camion que extiende de Vehiculo
class Camion extends Vehiculo {

    public Camion(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public String encender() {
        return "El camión encendió";
    }

    @Override
    public String apagar() {
        return "El camión se apagó";
    }

    @Override
    public String describir() {
        return "Este es un camión marca " + marca + ", modelo " + modelo + ", del año " + año;
    }
}

// Clase principal con método main
public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Auto("Toyota", "Corolla", 2022),
            new Motocicleta("Honda", "CBR500R", 2023),
            new Camion("Freightliner", "Cascadia", 2021)
        };

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.encender());
            System.out.println(vehiculo.apagar());
            System.out.println(vehiculo.describir());
        }
    }
}
