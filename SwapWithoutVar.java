public class SwapWithoutVar{  
    public static void main(String args[])  
    { 
      int[] ans= swap(6,8);
      System.out.println("SWAP:"+ans[0]+" "+ans[1]);

     } 
     static int[] swap(int a,int b){
        int[] arr=new int[2];
        a=a+b;
        b=a-b;
        a=a-b;
        arr[0]=a;
        arr[1]=b;
        return arr;
 }
}