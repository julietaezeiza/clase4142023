import java.util.Scanner;
public class TempyHumprom {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double vector[]=new double [12];
        String mesIngresado ="  ";
        double temperatura;
        double humedad;
        double tempMayor;
        double humMayor;
        double acumuladortemp=0;
        double acumuladorHum=0;
   
       for (double i=0;i<12;i++){
            System.out.println("Ingrese mes ");
            mesIngresado=System.console().readLine();
            System.out.println("Ingrese temperatura ");
            temperatura=s.nextInt();
            if (temperatura<tempMayor){
                acumuladortemp= acumuladortemp + temperatura;
                tempMayor=temperatura;}
            System.out.println("Ingrese humedad ");
            humedad=Integer.parseInt(System.console(). readLine ());
            if (humedad<humMayor);
            acumuladorHum=acumuladorHum+humedad;
            humMayor=humedad;

        }
    }
}