package Practicas.Practica2;
import java.util.Scanner;
/**
 *
 * @author Salas Chavez Jose de Jesus
 */
public class PagoEmpleado {

    public static double sueldoNormal(double sueldo, int hr) {
        return sueldo*hr;
    }
   
    public static double sueldoExtra(double sueldo, int hrx) {
        return 1.5*(sueldo*(hrx));
    }
   
   
   
    public static void totalSueldo(){
        Scanner scanner = new Scanner(System.in);
        double sueldo;
        int hr,hrx=0;
       
        System.out.print("Ingrese el número de horas trabajadas: ");
        hr = scanner.nextInt();
        System.out.print("Ingrese el sueldo por hora: ");
        sueldo = scanner.nextDouble();
       
        if(hr>40)
            hrx=hr-40;
       
        System.out.print("Paga regular: "+ sueldoNormal(sueldo,hr-hrx)+"\n");
        System.out.print("Numero de hrs extra: "+hrx+"\n");
        System.out.print("Paga extra: "+ sueldoExtra(sueldo,hrx)+"\n");
        System.out.print("Paga Total: "+(sueldoNormal(sueldo,hr-hrx)+sueldoExtra(sueldo,hrx))+"\n");
       
    }
   
    public static void main(String[] args) {
        System.out.println("-------------");
        System.out.println("Calculadora de sueldo");
        totalSueldo();
    }
   
}
