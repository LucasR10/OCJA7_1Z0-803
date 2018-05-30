
/**
 * Escbreva a descrição da classe ClassesWrappers aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class WrappersBoolean {
  
  /**
   * Usando as classes Wrappers 
   *  Tipos primitivos: 
   *      boolean, char, byte, short, int,long, float, double;
   *  Tipos Wrapper
   *  Boolean, Caracter, Byte, Short, Integer, Long, Float, Double
   */
  
  public static void main (String [] arg){
   
      //https://docs.oracle.com/javase/7/docs/api/java/lang/Boolean.html
      //Wrappers Boolean:
      
      //construtores Boolean(boolean value) , Boolean(String value), Boolean()
      /** valores boolean */
        
      /** = new Boolean(); não compila porque não exite esse construtor sem argumanetos.*/
      Boolean bFalse = Boolean.FALSE; //static metodos
      Boolean bTrue =  Boolean.TRUE;  //static metodos
      Boolean  b1  = true;
      
      /** construtores */
      Boolean construtor = new Boolean(true);
      construtor = new Boolean("t");//construtor com args String; True, true,
      
      Boolean b5 = new Boolean("True"); //produz um objeto Boolean  que simboliza true.
      Boolean b6 = new Boolean("yes");//produz um objeto Boolean ue simboliza false.
      
      System.out.println(" construtor  é :"+ construtor  );
      
      System.out.println(" bFalse é :"+ bFalse );
      System.out.println(" bFalse é :"+ bTrue);
      System.out.println(" b1 é :"+ b1);
      
      /** Motodos */
      Boolean b2 = true;
      boolean retornaBooleanPrimitivo = b2.booleanValue();//retorna o valor do Boolean Objeto como um boolean primitivo.;
      System.out.println(" Retorna Boolean Primitivo :"+ retornaBooleanPrimitivo  );
      /** Retorna  0 se o valores forem equais; retorna 1 se primeiro for true e segundo for false ;retorna -1 se primeiro for false e segundo true  */
      int comparaDoisValoreBoolean = Boolean.compare(false, true ); 
      System.out.println(" Compara Dois Valore Boolean :"+ comparaDoisValoreBoolean );
      
      Boolean parse = Boolean.parseBoolean("True"); //retorna true
      Boolean parse2 = Boolean.parseBoolean("yes"); //retorna false
      System.out.println("Parse :" + parse2);
      
      Boolean valueOfString = Boolean.valueOf("false"); // com string
      System.out.println("valueOf String :" + valueOfString);
      
      Boolean valueOfBoolean = Boolean.valueOf(true); // com string
      System.out.println("valueOf Boolean :" + valueOfBoolean);
      
      int compareTo = Boolean.valueOf("true").compareTo(Boolean.TRUE);// valores true e true retorna 0;
      System.out.println("compareTo para true e true retorna :" + compareTo );
      
      int compareTo1 = Boolean.valueOf("true").compareTo(Boolean.FALSE);//se valores true e false retorna 1;
      System.out.println("compareTo para true e false retorna :" + compareTo1 );
      
      int compareTo2 = Boolean.valueOf("false").compareTo(Boolean.TRUE);//se valores false e true retorna =1;
      System.out.println("compareTo para false e true retorna :" + compareTo2 );
      
  }

}
