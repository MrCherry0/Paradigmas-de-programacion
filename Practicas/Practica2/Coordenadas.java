package Practicas.Practica2;
import java.util.Scanner;

public class Coordenadas {
   
    public static void cuadrante(double x, double y){
        if(x==0 && y==0){
            System.out.print("El vector se encuentra en el Origen\n");}  
        else if(x>0 && y>0){
            System.out.print("El vector ( "+x+","+y+") se encuentra en el Cuadrante 1\n");}
        else if(x<0 && y>0){
            System.out.print("El vector ( "+x+","+y+") se encuentra en el Cuadrante 2 \n");}
        else if(x<0 && y<0){
            System.out.print("El vector ( "+x+","+y+") se encuentra en el Cuadrante 3 \n");}
        else if(x>0 && y<0){
            System.out.print("El vector ( "+x+","+y+") se encuentra en el Cuadrante 4 \n");}
    }
   
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,y;
        System.out.print("Ingrese la coordenada en x: ");
        x = scanner.nextDouble();
        System.out.print("Ingrese la coordenada en y: ");
        y = scanner.nextDouble();
        cuadrante(x,y);
        System.out.println("-------------");
        scanner.close();
     }
   
}
