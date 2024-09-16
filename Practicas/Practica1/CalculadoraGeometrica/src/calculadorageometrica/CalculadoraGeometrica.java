package calculadorageometrica;
import java.util.Scanner;

public class CalculadoraGeometrica {

    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double perimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double areaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    public static double perimetroCuadrado(double lado) {
        return lado * 4;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double perimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double perimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double perimetroPoligono(double base, int n) {
        return base * n;
    }

    public static double areaPoligono(double base, int n, double apotema) {
        return (base * n * apotema) / 2;
    }

    public static double convertirCmAMetros(double cm) {
        return cm / 100;
    }

    public static void calculadoraGeometrica() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 1;

        while (opcion != 0) {
            System.out.println("-------------");
            System.out.println("Seleccione una forma geométrica:");
            System.out.println("0. Salir");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Triángulo");
            System.out.println("5. Polígono");

            System.out.print("Ingrese el número de la opción que quiera: ");
            opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el radio en cm del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("Área: " + convertirCmAMetros(areaCirculo(radio)) + " m^2");
                    System.out.println("Perímetro: " + convertirCmAMetros(perimetroCirculo(radio)) + " m");
                    break;

                case 2:
                    System.out.print("Introduce el lado en cm del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("Área: " + convertirCmAMetros(areaCuadrado(lado)) + " m^2");
                    System.out.println("Perímetro: " + convertirCmAMetros(perimetroCuadrado(lado)) + " m");
                    break;

                case 3:
                    System.out.print("Introduce la base en cm del rectángulo: ");
                    double baseRect = scanner.nextDouble();
                    System.out.print("Introduce la altura en cm del rectángulo: ");
                    double alturaRect = scanner.nextDouble();
                    System.out.println("Área: " + convertirCmAMetros(areaRectangulo(baseRect, alturaRect)) + " m^2");
                    System.out.println("Perímetro: " + convertirCmAMetros(perimetroRectangulo(baseRect, alturaRect)) + " m");
                    break;

                case 4:
                    System.out.print("Introduce la base en cm del triángulo: ");
                    double baseTri = scanner.nextDouble();
                    System.out.print("Introduce la altura en cm del triángulo: ");
                    double alturaTri = scanner.nextDouble();
                    System.out.print("Introduce el primer lado en cm del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo lado en cm del triángulo: ");
                    double lado2 = scanner.nextDouble();
                    System.out.print("Introduce el tercer lado en cm del triángulo: ");
                    double lado3 = scanner.nextDouble();
                    System.out.println("Área: " + convertirCmAMetros(areaTriangulo(baseTri, alturaTri)) + " m^2");
                    System.out.println("Perímetro: " + convertirCmAMetros(perimetroTriangulo(lado1, lado2, lado3)) + " m");
                    break;

                case 5:
                    System.out.print("Introduce el número de lados del polígono: ");
                    int n = scanner.nextInt();
                    System.out.print("Introduce la base en cm del polígono: ");
                    double basePol = scanner.nextDouble();
                    System.out.print("Introduce el apotema en cm del polígono: ");
                    double apotema = scanner.nextDouble();
                    System.out.println("Área: " + convertirCmAMetros(areaPoligono(basePol, n, apotema)) + " m^2");
                    System.out.println("Perímetro: " + convertirCmAMetros(perimetroPoligono(basePol, n)) + " m");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        calculadoraGeometrica();
    }
}
