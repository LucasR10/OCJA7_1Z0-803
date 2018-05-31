
public class WrapperString {
   
    static void print(String p){
       System.out.println(p);
    }  
    
      static void print(Object p){
       System.out.println(p);
    }  
    
     public  WrapperString(String s){  }
    public static void main(String[] args) {
    
         /**usando string */
        String str = "Usando A Atring !";
        String comparador = new String ("Usando A Atring !");
        
        System.out.println("str.equals(comparador)" + str.equals(comparador));// true
        
        System.out.println("str == comparador" + str == comparador );// false
         
        char[] meusChars = new char[] {'J','a','v','a'};
        String minhaString5 = new String(meusChars);
        print(minhaString5);
        
        /** usando raplace **/
        String pasandoStringComoParametro = " Este comentario foi pessimo!";
        print( pasandoStringComoParametro.replace("pessimo","ruim") );
         
        String pasandoCharComoParametro = "recebendo um char como parametro ! ";
        print( pasandoCharComoParametro.replace('!', '?') );
          
        /** Usando o trim! **/
        String usandoTrim = " Java Magazine ";
        print( usandoTrim.trim() );
          
        String contains = "001MARCOS PAULO     M19803112";
        print("True - > "+ contains.contains("MARCOS") );// true
        
        print(" false contains e case sensitive :"+ contains.contains("Marcos") );// false contains e case sensitive.
          
        /** length() **/ 
        System.out.println(" Java ".length());
        
        /** toUpperCase() e toLowerCase() **/ 
        print( "valor".toUpperCase() );
        print( "ValOr ".toLowerCase() );
        
        /** usando substring: substrin busca da posição inicaal ate a posicção final - 1  */
        String sbustring = UNIVERSIDADE;//0 a 11
        print("sbustring ->  1 " + sbustring.substring(7) );//iniciando na posicão 3. print 4
        print("sbustring ->  2 " + sbustring.substring(7,10) ); // inciando na posicão 2 3 3: print 34
        print("sbustring -> 3 " + sbustring.substring(1,4) ); // inciando na posicão 2 3 3: print 34
      
        /** charAt : Retorna o caractere que estiver na 
        *            posição do índice passado como parametro (iniciado em zero). **/
        char c = charAt(3);//retorna v
        print(c);
        
       /** concat : retorna a junção da String na qual o método está sendo chamado 
        *            adicionando ao seu final a String passada por parametro (str). **/  
        String c1 = concat("de brasilia ");
        print(c1);
        
        /** public int indexOf(int ch) : Tem função inversa ao charAt():
                     retorna a posiçãoo (indice) em que se encontra na String o caractere pesquisado. **/
                     
        print( indexOfChar('U') );
        print( indexOfInt(2) );
        
        /** startsWith e endWith **/
        
        print( UNIVERSIDADE.startsWith("u") );// true
        print( UNIVERSIDADE.endsWith("E") );// true
        
        /** contentEquals e codePointAt **/
        print(" contentEquals "+ UNIVERSIDADE.contentEquals("E") ) ;//contador;
        print(" codePointAt " + UNIVERSIDADE.codePointAt(2) );
        print(" codePointBefore " +  UNIVERSIDADE.codePointBefore(1) );
          
        /** 
         * Concatennação de Strings 
         * se caso iniciar com String ele concatena e nã soma;
         */
        print("" + 3 + 6 );
        print(3+6+""+ 1 + 11 );
        print(3+6 +"" +3+6);
        print("" +3+6);

     
         System.out.println("------------------------------"); 
         System.out.println("" + 1 + 2);   //1 inicaia com string vai concatena.
         System.out.println(3 + "" +4);   // 2  
         System.out.println(5 + 6 +"");   // 3 inicia com dois numero elé soma.
         System.out.println(7 + 8);       // 4
         System.out.println(""+ 7 + 8 +"");  //5
    }
    
    public static int indexOfInt(int ch){
      return UNIVERSIDADE.indexOf(ch);
    }
    
     public static int indexOfChar(char ch){
      return UNIVERSIDADE.indexOf(ch);
    }
     
    
    
    public static char charAt(int index){
     return UNIVERSIDADE.charAt(index);
    }
    private static final String UNIVERSIDADE = "Universidade";
    
    public static String concat(String str){
       return UNIVERSIDADE.concat(str);
    }
    
}


class TestClass{
  static String str;
  public static void main(String[] args){
     System.out.println(str);///imprime null
  }
}