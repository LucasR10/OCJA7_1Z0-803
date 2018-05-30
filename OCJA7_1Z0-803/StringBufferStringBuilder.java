
public class StringBufferStringBuilder {

    static StringBuilder sb = new StringBuilder();
     static int MAX;     //1


     
    public static void main(String[] args) {
      
        sb.append("Ola");
        add();
        sb.append("10");
         System.out.println(" sb - " + sb );
        sb.delete(1, 3);
        sb.reverse();
        System.out.println(" sb - " + sb );
        
        sb = new StringBuilder("ola");
        
        System.err.println(" sb == sb " + "ola".equals( sb.toString() ) );
        
         System.err.println( ("ola" == sb.toString()) ) ;
         
         sb.setLength(12);
         int b = sb.length();
       System.err.println(" size :"+ b);
       
            String s = "blooper";    
            StringBuilder sb = new StringBuilder(s);     
            //s.append("whopper");     
            sb.append("shopper");          
            System.out.println(s);   
            System.out.println(sb);
            
        boolean name = "String".replace('g','G') == "String".replace('g','G');
        
    }
    
    
    static void add(){
      sb.append(" Begining valor ");
    }
       
}
