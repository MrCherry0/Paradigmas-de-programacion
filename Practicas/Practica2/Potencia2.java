package Practicas.Practica2;
import java.util.Scanner;
/**
 *
 * @author Salas Chavez Jose de Jesus
 */
public class Potencia2 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,aux,count=0;
        System.out.print("Ingrese un numero: ");
        num = scanner.nextInt();
        aux=num;
        while(aux!=1){
            aux=aux/2;
            count++;
        }
        System.out.print("Tu numero es: "+num+"\n");
        System.out.print("La potencia mas cercana es: 2^"+count+" = "+Math.pow(2,count)+"\n");
    }
   
}