package simulados;

public class EnthuwareSimulado {

    public static void main(String[] args) {

    }

}

class Widget{
   static int MAX;     //1
   
   public static void main(String[] args) {
     Widget d = new Widget();
    }
   Widget(){
       MAX +=2;//3
       System.out.println("Widget.<init>()" + MAX);
   }
   Widget(int k){
    double d = 10_000_000.0D;
   }
}

 class StringFromChar {      
    
     public static void main(String[] args) { 
        String newStr = null;
        String myStr = "good";
        
        char[] myCharArr = {'g', 'o', 'o', 'd' };
        for(char ch : myCharArr){ 
            newStr = newStr + ch;  
            System.out.println("valor"+newStr);
        }
        
         System.out.println(newStr + " valores " + myStr );
        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
    }
}        