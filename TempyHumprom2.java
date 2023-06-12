import java.util.Scanner;
public class TempyHumprom {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double array[]=new double [12];
        int n=array.length;
        String mesIngresado ="  ";
        double tempMayor=0;
        double temperatura;
        double humedad;
        double humMayor=72;
        double acumuladortemp=0;
        double acumuladorHum=0;
        double promtemp;
        double promhum;
   
       for (double i=0;i<12;i++){
            System.out.println("Ingrese mes ");
            mesIngresado=System.console().readLine();
            System.out.println("Ingrese temperatura ");
            temperatura=s.nextInt();
            acumuladortemp= acumuladortemp + temperatura;
            System.out.println("Ingrese humedad ");
            humedad=Integer.parseInt(System.console(). readLine ());
            acumuladorHum=acumuladorHum + humedad;
          }

            promtemp=(acumuladortemp/12);
            promhum=(acumuladorHum/12);
            if (promtemp < 8.1){
                System.out.println("Es mayor a la temperatura de los registros historicos");
            if (promtemp > 8.1){
                System.out.println("Es menor a la temperatura de los registros historicos");
            }
           if (promhum < 72){
            System.out.println("Es menor a la humedad de los registros historicos");
           }
           if (promhum> 72){
            System.out.println("Es mayor a la humedad de los registros historicos");
           }
            }

            for (int i=0;i<n-1;i++)
            for (int j=0;j<n-i-1;j++)
            if(array[j]>array[j+1])
                temperatura=array[j];
                array[j]=array[j+1];
                array[j+1]=temperatura;
            System.out.println("Temperatura ordenada"); 
              for (int i=0;i<n;i++){
              System.out.print(array[i]+" "); 
            }
             System.out.println(" ");

       




    }
}