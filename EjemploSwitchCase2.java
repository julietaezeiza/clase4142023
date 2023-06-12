public class EjemploSwitchCase2 {
    public static void main(String[]args){
        String nombre;
        String seleccion;

        System.out.println("Ingrese un nombre de estas opciones:");
        System.out.println("Ricardo");
        System.out.println("Juan");
        System.out.println("Marta");
        seleccion=(System.console().readLine()); 


        switch(seleccion){
            case "Ricardo":
             System.out.println("Hola Ricardo");
            break;
           case "Juan":
           System.out.println("Hola Juan");
           break;
           case "Marta":
           System.out.println("Hola Marta");
           break;
           default:
           System.out.println("Nombre incorrecto");
           break;
        }
     }
}
