public class Exponent{  
    public static void main(String args[])  
    { 
      System.out.println(exp(7,5));

     } 
     static int exp(int a,int b){
        int res=1;
        for(int i=0;i<b;i++){
            res=res*a;
            
        }
        return res;
     }
}  