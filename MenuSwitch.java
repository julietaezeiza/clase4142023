import java.util.Scanner;
public class MenuSwitch {
    public static void main(String[] args){
        int seleccion;
        int num1;
        int num2;
        Scanner s = new Scanner(System.in);

        System.out.println("***Menu de opciones****");
        System.out.println("1:sumar");
        System.out.println("2:restar");
        System.out.println("3:multiplicar");
        System.out.println("4:dividir");
        seleccion=Integer.parseInt(System.console().readLine());
        
        System.out.println("Ingrese un numero");
        num1=s.nextInt();
        System.out.println("Ingrese otro numero");
        num2=s.nextInt();

        switch(seleccion){
        case 1:
        System.out.println(num1 + num2);
        break;
        case 2:
        System.out.println(num1 - num2);
             break;
        case 3:
        System.out.println(num1 * num2);
             break;
        case 4:
       System.out.println((double)num1/(double)num2);
             break;
      default:
        System.out.println("Opcion Incorrecta");
    }

}
}
