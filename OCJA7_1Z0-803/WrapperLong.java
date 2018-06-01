

public class WrapperLong {
   
    
   public static void main(String...p){
    
       /** Construção de WrapperLong */
    
       Long long1 = new Long("4454");
       System.out.println(" Long 1 " + long1);
       
       Long long2 = new Long(45545L);
       System.out.println(" Long 2 " + long2);
       
       byte b = long1.byteValue();
       short s = long1.shortValue();
       int i =long1.intValue();
       float f = long1.floatValue();
       long l = long1.longValue();
       double d = long1.longValue();
       
       long1.valueOf(10);
       long1.valueOf("1444");
      
     /* Exite todas as comverções de base : toBinaryString, toHexString, toOctalString */
       
       long binary = long1.parseLong("011110", 2);// valor em binario
       System.out.println(" binary 2 " + binary);
       
       long str = long1.parseLong("144");// uma string
       System.out.println(" String  " + str);
   }

   
   
}
