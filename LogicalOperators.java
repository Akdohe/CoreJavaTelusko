public class LogicalOperators{
    public static void main(String [] args){
   
        int x = 7 ;
        int y  =  5;
        int a = 5 ;
        int b = 9 ;
        boolean result = x>y && a>b;
        boolean result2 = x>y || a<b;
        boolean result3 = !(x>y && a<b);
        System.out.println(result3);
        System.out.println(result2);

        System.out.println(result);

        
    }
}