public class Reverse{  
    public static void main(String args[])  
    { 
      System.out.println("REVERSE:"+rev(132));

     } 
     static int rev(int n){
         int temp=0;
         while(n>0){
             int last_digit=n%10;
             temp=temp*10+last_digit;
             n/=10;
         }
         return temp;
     }
}  