import java.util.Scanner;
public class GeneradorBanderas {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        String[] color ={"\033[31mrojo","\033[33mamarillo","\033[32mverde","\033[37mblanco","\033[34mazul","\033[30mnegro"};
        int franjas;

        System.out.println("Generador de banderas");
        System.out.println("¿Cuantas franjas tiene la bandera?");
        franjas=s.nextInt();
        System.out.println("\033[37m-------------");
       for(int i = 0 ;i<franjas;i++){
            System.out.println(color[(int)(Math.random()*6)]);
        }
        
       System.out.println("\033[37m-------------");
    }
}
//cambia las palabras de los colores y en su lugar utliza un cuadrado  que copio y pego del codigo ascii 
//de google q me permite generar una franja para que quede como una bandera