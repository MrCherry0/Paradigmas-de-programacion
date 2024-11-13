
// Clase principal para pruebas
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.setColor("Marrón");
        System.out.println("Color del perro: " + perro.getColor());
        perro.comer();

        Gato gato = new Gato();
        gato.setColor("Gris");
        System.out.println("Color del gato: " + gato.getColor());
        gato.comer();

        Pajaro pajaro = new Pajaro();
        pajaro.setColor("Amarillo");
        System.out.println("Color del pájaro: " + pajaro.getColor());
        pajaro.comer();
    }
}
