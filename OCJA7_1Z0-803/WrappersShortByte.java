
public class WrappersShortByte {

    public static void main(String...p){
    
       /** Construção de WrapperLong  byte - 1 byte (8 bits, de -128 a 127); */
      /**  Não tem comverrção de bases para nemhuma dessas opções : toBinaryString, toHexString, toOctalString  */
      
       byte b1 = 1;
       
       Byte byt1 = new Byte(b1);
       System.out.println(" Byte " + byt1);
       
       Byte byt2 = new Byte("4");
       System.out.println(" Byte " + byt2);
       
       byte b = byt1.byteValue();
       short s = byt1.shortValue();
       int i = byt1.intValue();
       float f = byt1.floatValue();
       long l = byt1.longValue();
       double d = byt1.longValue();
       
       byt1.valueOf(b1);
       byt1.valueOf("4");
       byt1.valueOf("11011",2);
       
       long binary = byt1.parseByte("11110", 2);// valor em binario
       System.out.println(" binary 2 " + binary);
       
       long str = byt1.parseByte("14");// uma string
       System.out.println(" String  " + str);
       
       /** Construção de valores Short */
       
        /** Construção de WrapperLong  byte - 1 byte (8 bits, de -128 a 127); */
      /**  Não tem comverrção de bases para nemhuma dessas opções : toBinaryString, toHexString, toOctalString  */
      
       short st = 1;
       
       Short short1 = new Short(st);
       System.out.println(" Short " + short1);
       
       Short short2 = new Short("1");
       System.out.println(" Short " + short2 );
       
        b = short1.byteValue();
        s = short1.shortValue();
        i = short1.intValue();
        f = short1.floatValue();
        l = short1.longValue();
        d = short1.longValue();
       
       short1.valueOf(b1);
       short1.valueOf("4");
       short1.valueOf("11011",2);

       short binary1 = short1.parseShort("11110", 2);// valor em binario
       System.out.println(" binary 2 " + binary1);
       
       //short primitivo = short1.parseShort(short1.shortValue() );// uma primitivo
      // System.out.println(" primitivo  " + primitivo);
       
      long str1 = short1.parseShort("1");// uma string
       System.out.println(" String  " + str1);
   }
}
