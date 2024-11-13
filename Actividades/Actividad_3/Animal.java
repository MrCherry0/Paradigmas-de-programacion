// Clase base Animal
public class Animal {
    private String color;

    public Animal() {}

    // Método para establecer el color
    public void setColor(String color) {
        this.color = color;
    }

    // Método para obtener el color
    public String getColor() {
        return color;
    }

    // Método comer (puede ser sobrescrito por las clases derivadas)
    public void comer() {
        System.out.println("El animal está comiendo.");
    }
}

// Clase derivada Perro
class Perro extends Animal {
    @Override
    public void comer() {
        System.out.println("El perro está comiendo croquetas.");
    }
}

// Clase derivada Gato
class Gato extends Animal {
    @Override
    public void comer() {
        System.out.println("El gato está comiendo pescado.");
    }
}

// Clase derivada Pajaro
class Pajaro extends Animal {
    @Override
    public void comer() {
        System.out.println("El pájaro está comiendo semillas.");
    }
}
