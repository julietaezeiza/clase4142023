public class BucleFor{
    public static void main(String[] args){
        int numeroIngresado;
        int contadorPares=0;
        //int i=0; en este caso la declare dentro del bucle for
        System.out.println("**Contador de pares**");
        System.out.println("Ingrese 5 numeros");
        for(int i=0;i<5; i++){
            System.out.println("n"+(i+i) + ": ");
            System.out.println("Vuelta: " + i);
            numeroIngresado=Integer.parseInt(System.console().readLine());
            if((numeroIngresado % 2)==0){
            contadorPares ++;
            }
        
        }
        System.out.println("\nCantidad de pares: " + contadorPares);
    }
}

