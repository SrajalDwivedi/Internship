public class AreaPerimeterRectangle{  
    public static void main(String args[])  
    {  
      System.out.println("AREA:"+area(5,7));
      System.out.println("PERIMETER:"+perimeter(5,7));

     } 
     static int area(int length,int bredth){
         return length*bredth;
     }
     static int perimeter(int length,int bredth){
         return 2*(length+bredth);
     }
}  