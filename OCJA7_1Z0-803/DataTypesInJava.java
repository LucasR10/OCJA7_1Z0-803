public class DataTypesInJava{

   public static void main(String [] args){
       
       Integer valor = 100_267_760; //ok
       int  valor2 = 100_267_760;  // ok
       
       int semValorIncial = 10; //error: variable semValorIncial might not have been initialized   
       System.out.println(" int :"+ semValorIncial );
       
       System.out.println(" int :"+ valor );
       /*
            binario, octal e hexadecimal.
            ocatal usa prefixo 0; ninario usa o�prefixo 0B or 0b; hexadecima usa prefixo 0x ou 0X
  
            int intLiteral = _100;  n�o pode iniciar
            int intLiteral2 = 100_999_; // n�o pode terminar
            long longLiteral = 100_L; // n�o pode  */
            int baseDecimal = 267;
            int octVal = 0413; // prefixo 0
            int hexVal = 0x10B; // prefixo 0x ou 0X
            int binVal = 0b100001011; //prefixo 0B or 0b
       
       /** nao pode ser usado porque da error em tempo e execuao. **/ 
       /** 
         int i = Integer.parseInt("45_98");
         java.lang.NumberFormatException: For input string: "45_98" */
        
         /** Um tipo char não pode ter uma valor negativo exemplo char valoe = -1 ; 
          *  da o seguint erro : error: incompatible types: possible lossy conversion from int to char */ 
         
          char cahar_nao_pode_ser_negativo = 1; 
       
       /**
            byte  1 byte (8 bits, de -128 a 127);
            short 2 bytes (16 bits, de 32.768 a 32.767);
            char  2 bytes (se positivo), (16 bits, de 0 a 65.535);
            int   4 bytes (32 bits, de 2.147.483.648 a 2.147.483.647);
            long  8 bytes (64 bits, de 9.223.372.036.854.775.808 a */
       
          
         char c_valor = 1;
         short s_valor = -2;
         //c_valor = s_valor;
         System.out.println(" shor vs cahr :"+ c_valor + s_valor);
   }
   
   
   
	
}