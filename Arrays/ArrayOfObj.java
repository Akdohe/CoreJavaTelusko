package Arrays;

// It has fixed length once define can be alter them 
// Types of array 
//single dimenstion
// 2 dimension
// 3 D array int num[][][] = new int [3] [4] [5]
// Jagged array ex int num[] = new int [3][]  num [0] = int [3], num[1] = int[4]

public class ArrayOfObj{
    public static void main(String[] args) {
         
    int num[] = new int[4];
    num[0] = 5;  
    num[1] = 6;
    num[2] = 7;
    num[3] = 9; //by default if the value is not specified it will lead to zero
    
    for (int i=0; i<num.length;i++){ // to measure the length of an specified array
       System.out.println(num[i]);
        }
         //  To print by usng the enhanced for loop 
  
    }
}
