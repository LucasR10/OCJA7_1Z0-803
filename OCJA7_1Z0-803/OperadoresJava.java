

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
      /** Não podemos  comparar tiposincomparáveis, como um boolean com um valor numérico*/
      //System.out.println( true == 1); não compila
      
      /** não imprime true, imrime 5*/
      int a = 5;
      System.out.println( a = 5  ); /** não imprime true, imrime 5*/
       
       /** Divisão por zero; compila, mas gera um erro de execução */
       int xyz = 2000;
       int v = 0;
       //int result =  xyz / v; // java.lang.ArithmeticException: / by zero
       //System.out.println( result  ); 
       
       /** Ponto flutuante */
       double divizaoPorZero = v / 0.0; /** retorna um NaN - not a Number */
       System.out.println( divizaoPorZero  );
       
       /** Operdores & |, ^ : quando usamos esses operadores, sempre os oid lados da expresão são avaliados. */
       /** Executa as duas comparações */
       System.out.println("  & "+  (1 > 2 & executar() )   );
      
       /** só executa a segunda caso ela seja necessaria. */
       System.out.println(1 > 2 && executar()   );// não impime chamou 
       
       /** incremento e pre-incremento */
        int pos_incremento  = 5;//primeiro imprime depois incrementa.
        int pre_incremento  = 5;//incrementa depois imprime;
        
        System.out.println( pos_incremento + " pos_incremento mesma linha  : " +( pos_incremento ++) );
        System.out.println( pos_incremento + " pos_incremento proxima linha  : " + pos_incremento );
       
        System.out.println( pre_incremento + " pre_incremento  : "+ (++pre_incremento) );
        
        /** Existe operadores para realizar operações e atribuições de só vez|*/
         // int subitrair -= 2// não pode fazaer tudojunto;
         
         int somar = 8 ; somar += 2; // soma e atribui;
         System.out.println(" somar - " +  somar);
         
         int subitrair = 6 ; subitrair -= 2; // subitrui e atribui;
         System.out.println("  subitrair - " +  subitrair);
         
         int multiplica = 5 ; multiplica *= 2; // multiplica e atribui;
         System.out.println("  multiplica - " +  multiplica); 
         
         int divide=4 ; subitrair /= 2; // divide e atribui;
         System.out.println("  subitrair - " +  subitrair); 
         
         int divideAtribuiResto = 11 ; divideAtribuiResto %=2;// divide e atribui o resto
         System.out.println(" divideAtribuiResto - " + divideAtribuiResto); 
         
         /** Operações com Byte */
         byte b1 = 3; //compila
         //byte b1 = b1 + 4 ; /** Não compila, conta com int devolve int */
          
         byte b2 = 3; //compila
         /** todas as operações : +=, -= ; *= ; /=* %= usuaram cast implicito ;/
         b2 += 2; // compila para valores bem altos; Ele faz casting e roda normalmente;
         /** 
          Precedência de  operadores do Java, saber o básico, que primeiro são executados 
          pré-incrementos/decrementos, depois multiplicação/divisão/mod, passando para soma/subtração, depois os
          shifts ( <<, >>, >>>) e, por último, os pós-incrementos/decrementos.
          As questões da certificação não entram em mais detalhes que isto **/
          
          /** 
             byte -> short -> int -> long -> float -> double ;
             char ->int ;
             
             byte para short usa casting ; de short para int casting;
             se estmaos da esquerda para direira precisamos de casting
             
             Se estivermos convertendo de um tipo que vai da esquerda para a direita
             nessa tabelinha, não precisamos de casting, a autopromoção fará o serviço
             por nós;
             
           */
   }
   
   public static boolean executar(){
       System.out.println("Chamou !!"); 
      return true ;
    }
}
