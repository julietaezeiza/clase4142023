public class Ordenamientoburbuja {
    public static void main(String[] args){
        int[] array =new int[40];
        int n= array.length; //guardo length en una variable n
        int tmp; //variable para intercambiar

     System.out.println("Array Desordenado"); 
        for (int i =0;i<n;i++){
            array[i]= (int)(Math.random()*100);
        System.out.println(array[i]+" ");
     }
     System.out.println("");
     for (int i=0;i<n-1;i++){//Bucle para cceder a los elementos del array}
     for (int j=0;j<n-i-1;j++){//Bucle para comparar con los elementos adyacentes}
     if(array[j]>array[j+1]){//Cambiar el > a < para ordenar de menor a mayor
      tmp=array[j];
      array[j]=array[j+1];
      array[j+1]=tmp;
      }

    }
  }
  System.out.println("Array ordenado"); 
  for (int i =0;i<n;i++){
  System.out.print(array[i]+" "); 
    }
System.out.println("");
 }
}