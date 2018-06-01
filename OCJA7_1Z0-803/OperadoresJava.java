

public class OperadoresJava {
    
   public static final void main (String ... args ){
     int i = 1;
     double y = 1d;
     float z = 1f;
     
      System.out.println( i == y );// copara conteudo e nã tipos
      System.out.println( z == y );// copara conteudo e nã tipos
     
      /* Comparados ons tipos e conteudo */
      
      Integer v1 = 2;
      Double  v2 = 2.0D ;
      Float   v3 =2.0F;
      Integer v4 = 1;
      Float   v5 = 2.0F;
      
      /**  Compara o tipo e o conteudo: para ser verdadeiro o conteudo e o tipo tem que ser iquais  */
      System.out.println( v1.equals(v2) );
      System.out.println( v2.equals(v3) );
      System.out.println("dois floates com valores iquais "+ v3.equals(v5) );// dois floates com valores iquais
      System.out.println( v1.equals(v4) );// dois integer com valores iquais
      
      /** compila, 'a' tem um valor numerioco tambem. */
      char c = 'a';
      System.out.println( c > 1 );
      
      /** não imprime true, imrime 5*/
      int a = 5;
       System.out.println( a = 5  ); /** não imprime true, imrime 5*/
   }
}
