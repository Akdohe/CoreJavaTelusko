package basicprogram;
    class Calculator{
        public int add(int n1,int n2){
            int result= n1+n2;            
            return result;
        }
         public double add(double n1,int n2, int n3){
            double result= n1+n2+n3;            
            return result;
        }
    }
    
public class MethodOverloading{

    public static void main(String[] args) {
  
        Calculator cal = new Calculator();
        double result =cal.add(3.0,5,10);
        // int result = num1 + num2;
         System.out.println(result);
    }
}
