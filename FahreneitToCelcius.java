class FahreneitToCelcius {
    
    public static void main(String[] args)
    {
       System.out.println(convert(370));
    }
    static double convert(int f){
        double celsius = (f - 32) / 1.8;
        return celsius;
    }
}