public class Ejemploif {
    public static void main (String []args){
        int num1;
        int num2;
        boolean flag=false;
        System.out.println("Ingrese numero 1");
        num1=Integer.parseInt(System.console(). readLine ());
        System.out.println("Ingrese numero 2");
        num2=Integer.parseInt(System.console(). readLine ());


        if (num1> num2){
            System.out.println("Num1 mayor a num2");
         flag=true;
        }else if (num1 < num2){
            System.out.println("Num1 es menor a num2"); }
            else{
                System.out.println("Num1 es igual a num2");
            }

    }
}