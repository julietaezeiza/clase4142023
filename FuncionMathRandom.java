public class FuncionMathRandom {
    public static void main(String[] args){
        int[] vectorRandom=new int [50];
        for(int i=0; i< vectorRandom.length;i++){
      vectorRandom[i]=(int)(Math.random()*10)+1;//dependiendo de x cuanto lo multiplique , los num me van a aparecer en ese rango
      }
      for (int i=0;i< vectorRandom.length;i++){
      System.out.print( vectorRandom[i]+" ");
      }
    } 
}
