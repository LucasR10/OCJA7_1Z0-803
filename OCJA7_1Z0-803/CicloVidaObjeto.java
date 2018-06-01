
public class CicloVidaObjeto{
    
    //* Cilco de vida de um objeto */
 public  static void main(String[]args){
  
     CriarObj c ;// nem um objeto foi criado;
     CriarObj c1 = new CriarObj();//criando objeto
     c1.nome =" Criando aqui ";
     
     if(true){
     
          CriarObj objetoLocal = new CriarObj();// sp existe dentro do if;
     }
     
     /** apaga a referencia do objeto c1 criando anteriomente e cria uma novo objeto;  */
     c1 = new CriarObj(); 
     //dois objeto criado; apenas um exitente na memoria
     c = null; // não exite mais referencia a c1 na memoria aparti daqui.
 }
  
 
}

class CriarObj{
  String nome;
}
