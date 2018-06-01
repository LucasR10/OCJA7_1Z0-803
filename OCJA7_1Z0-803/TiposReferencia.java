

public class TiposReferencia{
   

    public final static void main(String [] args ){
    
        /** Tipos primitivo */
        int i = 10;
        int x = i;// está compiando o valor de i para x ;
        i = i + 2;
        
        System.out.println(" i " + i );
        System.out.println(" i " + x );
        
        /** Objeto por referiencia */
        
        ObjetoMeu obj = new ObjetoMeu();
        obj.valor = 20;
        System.out.println(" obj " + obj.valor );
        
        ObjetoMeu o = obj;//Cria uma nova referencia para o mesmo objeto;
        
        obj.valor = 30;//Altera a referencia ObjetoMeu  tambem pasando obj.valor de 20 para 30;
        obj = obj.mudarValorReferencia( obj );//altera a referencia;
       
        System.out.println(" o " + o.valor );
        System.out.println(" obj " + obj.valor );
    }

    
}


class ObjetoMeu{
 int valor;
 
 public ObjetoMeu mudarValorReferencia ( ObjetoMeu obj ){
      obj.valor = 100;
     return obj;
 }
   
}
