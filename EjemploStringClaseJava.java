public class EjemploStringClaseJava {
    public static void main(String[] args){
        String palabra1="hola";
    String palabra2= "hola";  
    String palabra3 =new String("hola");
    String clave="clave";
    String claveIngresada="";


    //System.out.println(palabra1==palabra2);
   // System.out.println(palabra1 != palabra2);
   System.out.println(palabra2==palabra3);
   System.out.println(palabra2 != palabra3);

   System.out.println("Ingrese clave");
   claveIngresada=System.console().readLine();

   if (clave.equals(claveIngresada)){
    System.out.println("Bienvenido");
   }else{
    System.out.println("Clave incorrecta");
    System.out.println("ingresaste" + claveIngresada);
   }

   /*if (claveIngresada==clave){//Eto genera error ya que clave ingresada y clave no comparten el mismo hashcode
    System.out.println("Bienvenido");
   }else{
System.out.println("Clave incorrecta");
System.out.println("Ingresaste" + claveIngresada);


   //System.out.println(System.identityHashCode(palabra1));
//System.out.println(System.identityHashCode(palabra2));

    }*/
   }
}
