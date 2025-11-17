package basicprogram;
public class TypeConversion{
    public static void main(String [] args){
        byte b = 127 ;
        int a = 268 ;
        b = (byte)a; //narrowing or casting type explicit conversion 
        System.out.println(b);
        // a = b;
        // System.out.println(a);
        System.out.println("Hello World!");

        int x =10 ;

    float f = 5.9f;
     x =(int)f ;
     System.out.println(x);
        
    }
}