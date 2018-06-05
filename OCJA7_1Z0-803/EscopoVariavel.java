

public class EscopoVariavel{
  
    
    public EscopoVariavel(){}

    public static void main(String[]asgs){
    
        ClassAnlise a = new ClassAnlise();
        a.ola();
    }
    
}

class ClassAnlise{ //class

   static int i =10; // variavél estática
   int x; // val de intância;
   
   { System.out.println("Bloco de inicialização "); }//bloc de inicialização
   static{ System.out.println("chamou static"); }
   
   public ClassAnlise(){//Construtor
    System.out.println("Chamou o construtor"); 
   }
   
   void ola(){ //metodo
       String nome ="Lucas"; //variavel local
       System.out.println("Olá.." + nome) ;
   } 
   
}

