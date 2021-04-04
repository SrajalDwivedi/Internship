public class Marks{  
    public static void main(String args[])  
    { 
      System.out.println("TOTAL MARKS:"+totalMarks(78,45,62));
      System.out.println("PERCENTAGE:"+totalMarks(78,45,62)/3);
     } 
     static int totalMarks(int a,int b,int c){
         return (a+b+c);
     }
}  