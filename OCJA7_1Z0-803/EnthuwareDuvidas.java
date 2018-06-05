
public class EnthuwareDuvidas{

    
    int expr1 = 3 + 5 * 9 - 7;        
    int expr2 = 3 + (5 * 9) - 7;     
    int expr3 = 3 + 5 * (9 - 7);     
    int expr4 = (3 + 5) * 9 - 7;     
   

What will the following program print?
class Test{
   public static void main(String[] args){
      int i = 4;
      int ia[][][] = new int[i][i = 3][i];
      System.out.println( ia.length + ", " + ia[0].length+", "+ ia[0][0].length);
   }
}
}

boolean b1 = false; int i1 = 2;
 int i2 = 3; if (b1 = i1 == i2){   
     System.out.println("true"); }
     else{    System.out.println("false"); 
        }



        
        class A {
    public int getCode(){ return 2;}
}

class AA extends A { 
  public long getCode(){ return 3;}
}

public class TestClass {
    
    public static void main(String[] args) throws Exception {
         A a = new A();
        A aa = new AA();
        System.out.println(a.getCode()+" "+aa.getCode());
    }

    public int getCode() {
        return 1;
    }
}
        



class Super{
  public int getNumber( int a){
     return 2;
  }
}
public class SubClass extends Super{
  public int getNumber( int a, char ch){
     return 4;
  }
  public static void main(String[] args){
    System.out.println( new SubClass().getNumber(4) );
  }
}