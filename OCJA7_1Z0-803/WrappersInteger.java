public class WrappersInteger {
  
  /**
   * Usando as classes Wrappers 
   *  Tipos primitivos: 
   *      boolean, char, byte, short, int,long, float, double;
   *  Tipos Wrapper
   *  Boolean, Caracter, Byte, Short, Integer, Long, Float, Double
   */
   
    public Integer gInteger = 4;
   
  public static void main (String [] arg){
  
      //Constants da classe Integer;
      int maxValue = Integer.MAX_VALUE;
      System.out.println(" maxValue :" + maxValue);
     
      int minValue = Integer.MIN_VALUE;
      System.out.println(" minValue :" + minValue);
     
      int type = Integer.SIZE;
      System.out.println(" size em bits:" + type);
      
      /** Construtores: Integer(int value); Integer(String s) */
      Integer i1 = new Integer(45);//valor primitivo int value
      
      /** Foemas validade e invalidas de pasar uma String para Intger **/
      Integer i2 = new Integer("1");//ok 
      System.out.println(" i2: " + i2);
    if(false){//pular os erros
      //Compila, mas não executa; java.lang.NumberFormatException: For input string: " 1" **/ 
      Integer i3 = new Integer(" 1 ");//invalido
      System.out.println(" i3: " + i3);
      // Compila, mas não executa; java.lang.NumberFormatException: For input string: "1_3
      Integer i4 = new Integer("1_3");//invalido 
      System.out.println(" i4: " + i4);
    
      Integer i5 = new Integer("1.3");//java.lang.NumberFormatException: For input string: "1.3"
      System.out.println(" i5: " + i5);
    }
      Integer i6 = new Integer("00040000016");//ok imprimi aparti do numero interiro; o 4
      System.out.println(" i6: " + i6);
      
      Integer i7 = new Integer("2147483647");//maximo suportado
      System.out.println(" i7: " + i7);  
      
      Integer i8 = new Integer("-45");//maximo suportado
      System.out.println(" i7: " + i8);   
      /** Metodo Integer auxiliares  */
      Integer val = 156;
      
      short shortvalue = val.shortValue();
      System.out.println("shortvalue: " + shortvalue );
      
      byte byteValue = val.byteValue();
      System.out.println("byteValue: " + byteValue );
      
      double intValue = val.intValue();
      System.out.println("intValue: " + intValue );
      
      double doubleValue = val.doubleValue();
      System.out.println("doubleValue: " + doubleValue );
      
      double floatValue = val.floatValue();
      System.out.println("floatValue: " + floatValue );
      
      double longValue = val.longValue();
      System.out.println("longValue: " + longValue );
      
      /**Usando parse */
     Integer parseInt = Integer.parseInt("3");
     System.out.println("parseInt: " + parseInt );
     
     /** Converção de bases:binari, hex, octal **/
     Integer parseInt2 =Integer.parseInt("0110111", /*base*/ 2);
     System.out.println(" parseInt 0110111 para : " +  parseInt2 );
    
     Integer valuOfInt =Integer.valueOf(24);
     System.out.println("valuOfInt: " + valuOfInt );
     
     Integer valuOfStr =Integer.valueOf("24");
     System.out.println("valuOfStr: " + valuOfStr );
     
     /** Converção de bases:binari, hex, octal **/
     Integer valuOfRadix =Integer.valueOf("0101110",/*base*/ 2);
     System.out.println("valuOf 0101110 para   : " + valuOfRadix );
    
     /** binari, hex, octal **/
     int numero = 10;
     
     String toBobinaryString = Integer.toBinaryString(numero);
      System.out.println("toBinaryString : "+ toBobinaryString);
      
     String toHexString = Integer.toHexString(numero);
      System.out.println( " toHexString :"+ toHexString);
      
     String toOctalString = Integer.toOctalString(numero);
     System.out.println(" toOctalString : "+ toOctalString);
     
     /** Modificar uma referencia Local  */
      WrappersInteger wInteger = new WrappersInteger();
      Integer i = 3;
      wInteger.modificarReferenciaLocal(i);
      System.out.println(" Referencia Local: " + i);
      
      /** Modificar uma referencia Global */
      wInteger.modificarReferenciaGlobal(3);
      System.out.println(" Referencia Global:" + wInteger.gInteger);
      
      /** static compare: compara dois inteiros primitivos compare -1, 0, 1 */ 
      
       int compara1 = Integer.compare(5 , 5);
       System.out.println("Compara 5 = 5 retorna   :" + compara1);
       
       int compara2 = Integer.compare(5 , 3);
       System.out.println("Compara 5 > 3  retorna   :" + compara2);
       
       int compara3 = Integer.compare(3 , 5);
       System.out.println("Compara 3 < 5  retorna   :" + compara3);
       
       /** compareTO: compara dos objetos Integer */
       Integer compareInteger = 23;
       
       int compareTo = compareInteger.compareTo( new Integer(23) );
       System.out.println("compareTo 23 == 23  :" + compareTo);
       
       int compareTo1 = compareInteger.compareTo(new Integer(40) );
       System.out.println("compareTo 23 < 40   :" + compareTo1);
       
       int compareTo2 = compareInteger.compareTo( new Integer(10) );
       System.out.println("compareTo 23 > 10   :" + compareTo2);
       
       
       /** metodo reverse  **/
       
       Integer reverse = 123456789;
       System.out.println(reverse + " reverse " + Integer.reverse( reverse ) );
       
       /** descodifica uma String da base 64 para um Integer. 
       String stringCodificada = "NTU=";
       int decode = Integer.decode( stringCodificada );
       System.out.println("Encode Base 64 - " + stringCodificada + "Decode :" + decode ); **/
  }
  
  public Integer modificarReferenciaLocal(Integer i){
      i = 3;
    return i;// referencia Local;
  }
  
  public Integer modificarReferenciaGlobal(Integer i){
      gInteger += 3; // referencia Global;
    return i + 2;
  }

}
