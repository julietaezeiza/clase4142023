import java.util.Scanner;
public class ArraysEj2Vectores {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
       int vector[]=new int[10];
       int numeroIngresado;

    for (int i =  0; i < 10;i ++){
        System.out.print("Ingrese numero entre 20 y 50" + i +": ");
        numeroIngresado=s.nextInt();
        while(numeroIngresado < 20 || numeroIngresado >50){
            System.out.println("Numero fuera del rango, ingrese nuevamente");
            numeroIngresado=s.nextInt();
        }
        vector[i]=numeroIngresado;
     }
    System.out.println("Valores del vector");
     for (int i=0; i<10;i ++){
       System.out.println("indice"+ i + ": " +vector[i]);
     }  

    }
}


