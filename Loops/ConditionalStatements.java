package Loops;
public class ConditionalStatements{
    public static void main(String [] args){
   
        int x = 17 ;
        int y  =  15;
        int a = 5 ;
        int b = 19 ;

        if (x>y && x>b){
            System.out.println(x);
        }
        else if (y>x && y>b){
              System.out.println(y);}
              else
              System.out.println(b);


    // ternary operator 

    int n = 5 ;
    int result = 0;
    result = n % 2 ==0 ? 100 : 202;
    System.out.println(result);
    //    if (x>10 && x<=20){
    //     System.out.println("Hello");
    //    }
    //    else{
    //     System.out.println("Bye");
    //    }

        
    }
}