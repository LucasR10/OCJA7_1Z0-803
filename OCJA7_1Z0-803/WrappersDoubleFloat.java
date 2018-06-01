public class WrappersDoubleFloat {
   
  public static void main (String [] arg){
  
      /** Construção de double */
       Double doubleString = new Double("34.4D");
       Double doublePrimitico = new Double( 34.4D );
       
       byte b = doubleString.byteValue();
       short s = doubleString.shortValue();
       int i =doubleString.intValue();
       float f = doubleString.floatValue();
       long l = doubleString.longValue();
       double d = doubleString.longValue();
       
       doubleString.valueOf(10);
       doubleString.valueOf("14.5F");
       
       doubleString.parseDouble("14.5F");// não tem comverção de bases;
       
       /** double só tem toHexString; **/
       
       /** isNaN(double v)  isNaN() retorna true se este double value não é um number **/

       
       /** Construção de um Float  */
       
       Float floatString  = new Float("34.4D");// de uma string
       Float floatPrimitivo  = new Float(34.4F);//de um double
       Float floatViaDouble = new Float(50.45D);//de um double
       
       float fl = floatString.parseFloat("14.5F");// não tem comverção de bases;
       float fl2 = floatString.parseFloat("14.5D");// não tem comverção de bases;
       
       System.out.println(" fl "+ fl);
       System.out.println(" fl "+ fl2);
       
       /** float só tem toHexString; **/
       /** isNaN(double v)  isNaN() retorna true se este double value não é um number **/
      
       
      b =  floatString.byteValue();
      s =  floatString.shortValue();
      i =  floatString.intValue();
      f =  floatString.floatValue();
      l =  floatString.longValue();
      d =  floatString.doubleValue();
      
       floatString.valueOf(10);
       floatString.valueOf("14.5F");
       f = floatString.valueOf("14.5D");
       System.out.println(" floatString.valueOf : "+ f);
       
       doubleString.parseDouble("14.5F");// não tem comverção de bases;
       
       
  
  }
  
  

}
