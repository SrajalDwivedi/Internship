public class Modulus{  
    public static void main(String args[])  
    { 
      System.out.println("RESULT:"+mod(2345,8,3,5,5));

     } 
     static int mod(int a,int b,int c,int d,int e){
         return (((a+b)/c)%d)*e;
     }
}  