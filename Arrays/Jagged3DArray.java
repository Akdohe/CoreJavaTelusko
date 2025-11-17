package Arrays;

// It has fixed length once define can be alter them 
// Types of array 
//single dimenstion
// 2 dimension
// 3 D array int num[][][] = new int [3] [4] [5]
// Jagged array ex int num[] = new int [3][]  num [0] = int [3], num[1] = int[4]

public class Jagged3DArray{
    public static void main(String[] args) {
         
    int num[][] = new int[3][];
    num[0] = new int [3];
    num[1] = new int [4];
    num[2] = new int [2];
    
    for (int i=0; i<num.length;i++){
        for(int j=0;j<num[i].length;j++){
            num [i][j] = (int)(Math.random()*100);
        }
    }
     //  To print by usng the enhanced for loop 
        for(int n[]:num){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }



        // Normal 3d array
        int num1[][][] = new int[3][4][ 5];
    
    
    for (int i=0; i<num1.length;i++){
        for(int j=0;j<num1[i].length;j++){
            num [i][j] = (int)(Math.random()*100);
        }
    }
     //  To print by usng the enhanced for loop 
        for(int n[][]:num1){
            for(int[] m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
