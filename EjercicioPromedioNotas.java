import java.util.Scanner;
public class EjercicioPromedioNotas {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int vector[]=new int [3];
        int acumulador=0;


    

        for (int i = 0;i<3; i ++){ // menor a 3 pq cuenta desde el 0
        System.out.println("Ingrese nota"+(i+1)+ ": ");
     vector[i]=Integer.parseInt(System.console().readLine());
     }
     for(int i=0; i<3;i++){
        acumulador=vector[i]+acumulador;
     }
     System.out.println("El promedio de las 3 notas es: "+ (acumulador)/3);

}
}
