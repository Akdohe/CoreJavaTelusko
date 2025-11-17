package Arrays;
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
    
public class ArraysEx{

    public static void main(String[] args) {
        //Arrays values starts from the 0 place
      //  int num[] = {1,2,3,4,5,6};
      //to change the values static
    //   num[1] = 6;  
//dynamically change values   
    int num[] = new int[4];
    num[0] = 4;
    num[1] = 2;
    num[2] = 5;
    num[3]=8;

        // int result = num1 + num2;
         System.out.println(num[1]);

        //  To print all the values 
        for (int i=0; i<=3; i++){
        System.out.println(num[i]);
        }
    }
}
