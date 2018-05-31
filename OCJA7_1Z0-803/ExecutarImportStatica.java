import static com.statico.ImportStatico.x; // so para x variavel staticas e metodos;
import static com.statico.ImportStatico.soma;//metodo...
import  com.statico.ImportStatico; //para instancia da classe e importes da propria classe;

public class ExecutarImportStatica {
    
    public final static void main (String ... agrs){
        /** pegadinha, caso oconstrutor não seja iniciado a variavel statica não muda o valor; **/
       System.out.println("Teste " + x ); 
       /** adicona 10 ao varialvel via cosntrutor;
        * tem que importar com.statico para a class sem o importe statico;**/
        ImportStatico i = new ImportStatico();
        System.out.println("Teste " + x ); 
        
        System.out.println("soma via instancia :  " + i.soma(29) ); //chamr soma
        
        System.out.println("importação  instatica: :  " + soma(2) ); //chamr soma
        
    }
}
