
public class WrapperString {
   
    static void print(String p){
       System.out.println(p);
    }  
    
      static void print(Object p){
       System.out.println(p);
    }  
    
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
        String pasandoStringComoParametro = " Este coment�rio foi p�ssimo!";
        print( pasandoStringComoParametro.replace("p�ssimo","ruim") );
         
        String pasandoCharComoParametro = "recebendo um char como par�metro ! ";
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
        
        /* usando substring  */
        
        
        
        String sbustring = UNIVERSIDADE;//0 a 11
             
        print("sbustring ->  1 " + sbustring.substring(7) );//iniciando na posi��o 3. print 4
        print("sbustring ->  2 " + sbustring.substring(7,10) ); // inciando na posi��o 2 3 3: print 34
        
       //charAt : Retorna o caractere que estiver na posi��o do �ndice passado como par�metro (iniciado em zero).
        char c = charAt(3);//retorna v
        print(c);
        
       //concat : retorna a jun��o da String na qual o m�todo est� sendo chamado adicionando ao seu final a String passada por par�metro (�str�).  
        String c1 = concat("de brasilia ");
        print(c1);
        
        //public int indexOf(int ch) : Tem fun��o inversa ao charAt(): retorna a posi��o (�ndice) em que se encontra na String o caractere pesquisado.
        print( indexOfChar('U') );
        print( indexOfInt(2) );
        
        // startsWith e endWith
        
        print( UNIVERSIDADE.startsWith("u") );// true
        print( UNIVERSIDADE.endsWith("E") );// true
        
        
        print("" + 3 + 6 );
        print(3+6+""+ 1 + 11 );
        print(3+6 +"" +3+6);
         print("" +3+6);
         
         System.out.println("" +5 + 6);   //1 
         System.out.println(5 + "" +6);   // 2 
         System.out.println(5 + 6 +"");   // 3 
         System.out.println(5 + 6);       // 4
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
     System.out.println(str);
  }
}