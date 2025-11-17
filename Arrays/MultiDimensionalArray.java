package Arrays;
    
public class MultiDimensionalArray{

    public static void main(String[] args) {
        //Arrays values starts from the 0 place
      //  int num[] = {1,2,3,4,5,6};
      //to change the values static
    //   num[1] = 6;  
//dynamically change values   
    int num[][] = new int[3][4];
    // Assingning the random values
    for (int i=0; i<=2; i++){
            for(int j=0;j<=3;j++){
             num[i][j] = (int)(Math.random() * 100);
        //   printing random values in array
             System.out.print(num[i][j]+" ");
        }
            System.out.println();
    }
        //  To print by usng the enhanced for loop 
        for(int n[]:num){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
