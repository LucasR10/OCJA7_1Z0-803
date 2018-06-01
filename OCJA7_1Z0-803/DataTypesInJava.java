public class DataTypesInJava{

    
    /**

       Quando iniciadas implicitamente, os valores default para as variáveis são:

       primitivos numéricos inteiros - 0
       primitivos numéricos com ponto flutuante - 0.0
       boolean - false
       char - vazio, equivalente a 0
       referências - null 
       
       identificadores válidos devem seguir as seguintes regras:

       Não podem ser igual a uma palavra-chave;
       Podem usar letras (unicode), números, $ e _;
       O primeiro caractere não pode ser um número;
       Podem possuir qualquer número de caracteres
       
       */
     
      /**
      Os tipos inteiros têm os seguintes tamanhos:

      byte - 1 byte (8 bits, de -128 a 127);
      short - 2 bytes (16 bits, de –32.768 a 32.767);
      char - 2 bytes (só positivo), (16 bits, de 0 a 65.535);
      int - 4 bytes (32 bits, de –2.147.483.648 a 2.147.483.647);
      long - 8 bytes (64 bits, de –9.223.372.036.854.775.808 a 9.223.372.036.854.775.807).
      */
   public static void main(String [] args){
   
       byte b = 12; /** Só armazena de -128 a 127 */
       short s = 12;
       char c = 14; //'C'
       int  i = c;
       double d = 1.2;
       float f = 15;
       
       //cast byte 
       b = (byte) s; // compila só com cast de  short  para byte;
       b = (byte) c;
       
       //cast short
       s = b;// de byte para shor não precisa de cast;
       s = (short) c ; // precisa de cast de cahr para short
       
       //cast cahr
       c = (char) b;//precisa do cast do byte para char
       c = (char) s; //precisa do cast do short para char
       
       // cast int aceita todos menores do que ele;
       i = b;
       i = s;
       i = c;
       i = (int) f; //ou d
      //cast de float so vai recisar para o double;
      
      f = b;
      f = s;
      f = c;
      f = i;
      f = (float)d;// precisa do cast
       // cas double : todos caben dentro de doble;
       d = b;
       d = s;
       d = c;
       d = i;
       d = f;
       
       /** fromatação com _ ou __; Formato validos: tem que aver um numero entre os anderalines; 0_1 */
       Integer valor = 100_267_760; //ok
       int  valor2 = 100_267_760;  // ok
            
       Long formato1 = 10_20_3000L; // sempe validos porque anderline esta entre dois numeros;
       Long formato2 = 1_0_20_3_00_0L;
       Long formato3 = 1___0_20_3_00_0L;
       
       /** Formato invalido */
       
        //Long formato_invalido1 = _10203_00_0L;// não pde inicar
        // Long formato_invalido2 = 10203000_L;//não pode finalizar
        // double formato_invalido3  = 35_.56F //não compila 
        //  double formato_invalido3  = 35._56F //não compila 
        // int hexVal = 0x_10B;  ////não compila
        // int hexVal = 0_x10B; ////não compila 
          
          
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
            int binVal = 0b100001011; //prefixo 0b or 0B
            
         /** iniciando com zero só pode ir de 01 ate 07;
          * exemploe: 01,02,03,04,05,06,07 a parti do 08 da erro para 08 e 09 */
         int esta_na_base_octal = 010;
         int bin = 0b0101;
       
       /** nao pode ser usado porque da error em tempo e execuao. **/ 
       /** 
         int i = Integer.parseInt("45_98");
         java.lang.NumberFormatException: For input string: "45_98" */
       
         /** Um tipo char não pode ter uma valor negativo exemplo char valoe = -1 ; 
          *  da o seguint erro : error: incompatible types: possible lossy conversion from int to char */ 
         
          char cahar_nao_pode_ser_negativo = 1; 
          /** valor defult de char é 0 implicitamente; Boolean é unico que não e um int  */
       
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