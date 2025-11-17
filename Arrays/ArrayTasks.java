package Arrays;

public class ArrayTasks {
    public static void main(String[] args) {

// Working with Arrays in Java: From Basics to Enhanced For Loops
// You are given an array of integers. Your task is to write a Java program that finds and prints the smallest and largest numbers from the array using an enhanced for loop (also known as a for-each loop).

// This will help you practice iterating through arrays efficiently while tracking values.

// Instructions:

// Use the following array in your program:
// int[] numbers = {45, 22, 89, 16, 90, 33};

int[] numbers = {45, 22, 89, 16, 90, 33};

// Declare two variables:
int smallest= numbers[0];
int largest= numbers[0];

// One to keep track of the smallest number (initialize with the first element).

for (int n : numbers){
    if(n<smallest){
        smallest = n;
    }
    if ( n > largest){
        largest = n;
    }

}
System.out.println("smallest: "+ smallest);
System.out.println("largest: " + largest);

// One to keep track of the largest number (also initialize with the first element).

// Use a for-each loop to iterate over the array.

// Update the smallest and largest variables as you compare each element.

// Print both values using System.out.println() in this exact format:

// Smallest: 16
// Largest: 90



        // int[] numbers = {45, 22, 89, 16, 90, 33};

        // // Initialize smallest and largest with first element
        // int smallest = numbers[0];
        // int largest = numbers[0];

        // // Enhanced for-each loop to find smallest and largest
        // for (int n : numbers) {
        //     if (n < smallest) {
        //         smallest = n;
        //     }
        //     if (n > largest) {
        //         largest = n;
        //     }
        // }

        // // Print results in required format
        // System.out.println("Smallest: " + smallest);
        // System.out.println("Largest: " + largest);
    }
}


// It has fixed length once define can be alter them 
// Types of array 
//single dimenstion
// 2 dimension
// 3 D array int num[][][] = new int [3] [4] [5]
// Jagged array ex int num[] = new int [3][]  num [0] = int [3], num[1] = int[4]




// Expected Output:

//   Smallest:  16

//   Largest:  90





// class Student{
//     int rollno ;
//     String name;
//     int marks;
//     }
// // public class ArrayOfStrings{
// //     public static void main(String[] args) {
// //         Student s1 = new Student();
// //         s1.rollno =1;
// //         s1.name = "Navin" ;
// //         s1.marks = 66 ;

// //         Student s2 = new Student();
// //         s2.rollno =2;
// //         s2.name = "Navin" ;
// //         s2.marks = 68 ;

// //         Student s3 = new Student();
// //         s3.rollno =3;
// //         s3.name = "Navin" ;
// //         s3.marks = 69 ;

// //         Student s4 = new Student();
// //         s4.rollno = 4;
// //         s4.name = "Navin" ;
// //         s4.marks = 90 ;
// //     // System.out.println(s1); //will give garbage type of value
// //     System.out.println(s1.name+ ": " + s1.marks);
    
// //     int student[] = new int[4];
// //     student[0] = 5;  
// //     student[1] = 6;
// //     student[2] = 7;
// //     student[3] = 9; 
// //        for (int i=0; i<student.length;i++){ // to measure the length of an specified array
// //        System.out.println(s1.name+ ": " + s1.marks);
// //         }
         
// //     // int num[] = new int[4];
// //     // num[0] = 5;  
// //     // num[1] = 6;
// //     // num[2] = 7;
// //     // num[3] = 9; //by default if the value is not specified it will lead to zero
    
// //     // for (int i=0; i<num.length;i++){ // to measure the length of an specified array
// //     //    System.out.println(num[i]);
// //     //     }
// //     //   //  To print by usng the enhanced for loop 
  
//     }
// }
