import java.util.ArrayList;
import java.util.List;

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
        
        /** Referencia com arrays */
        List<String> lista = new ArrayList<>();
        
        List<String> listaCopy = lista;
        listaCopy.add("add1");
        listaCopy.add("add1");// mesmo alterando a referenica altera os dois;
        
       lista.add("add1 4");
        
        System.out.println("lista copy : " +lista.size() );
        System.out.println("lista1Copy size : " + listaCopy.size() );
        
        /** tipos de efernecia super tipos */
        
        // super para a sublcas;
        Foo b1 =  new Bar();
        b1.compila();
        
        //Bar b2 = new Foo();// Não pe valido ! Foo não e subclass de Bar.
        Bar b2 = (Bar) new Foo();  
        b2.compila();
    }

    
}

class Foo{
 void compila(){ System.out.println("Compila !"); }
}
class Bar extends Foo {
    
}

class ObjetoMeu{
 int valor;
 
 public ObjetoMeu mudarValorReferencia ( ObjetoMeu obj ){
      obj.valor = 100;
      if(true){}else{}
     return obj;
 }
   
}
