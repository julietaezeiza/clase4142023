import java.util.Scanner;
public class BuclesWhile1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        boolean flag=true;

        while(flag){
         System.out.println("linea1");
         System.out.println("linea2");
         System.out.println("linea3");
         System.out.println("Desea salir? 1.si 2.no");
         switch(s.nextInt()){
            case 1:
            System.out.println("flag cambio a false");
            flag=false;
            break;

            case 2:
            System.out.println("Flag sin cambios");
            break;
            default:
            System.out.println("Opcion incorrecta, vuelve a repetir el while");

         }
     }
  }  
}
 
    

