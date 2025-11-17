package Arrays;

// It has fixed length once define can be alter them 
// Types of array 
//single dimenstion
// 2 dimension
// 3 D array int num[][][] = new int [3] [4] [5]
// Jagged array ex int num[] = new int [3][]  num [0] = int [3], num[1] = int[4]



class Student{
    int rollno ;
    String name;
    int marks;
    }
public class ArrayOfStrings{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno =1;
        s1.name = "Navin" ;
        s1.marks = 66 ;

        Student s2 = new Student();
        s2.rollno =2;
        s2.name = "Navin" ;
        s2.marks = 68 ;

        Student s3 = new Student();
        s3.rollno =3;
        s3.name = "Navin" ;
        s3.marks = 69 ;

        Student s4 = new Student();
        s4.rollno = 4;
        s4.name = "Navin" ;
        s4.marks = 90 ;
    // System.out.println(s1); //will give garbage type of value
    System.out.println(s1.name+ ": " + s1.marks);
    
    int student[] = new int[4];
    student[0] = 5;  
    student[1] = 6;
    student[2] = 7;
    student[3] = 9; 
       for (int i=0; i<student.length;i++){ // to measure the length of an specified array
       System.out.println(s1.name+ ": " + s1.marks);
        }
         
    // int num[] = new int[4];
    // num[0] = 5;  
    // num[1] = 6;
    // num[2] = 7;
    // num[3] = 9; //by default if the value is not specified it will lead to zero
    
    // for (int i=0; i<num.length;i++){ // to measure the length of an specified array
    //    System.out.println(num[i]);
    //     }
    //   //  To print by usng the enhanced for loop 
  
    }
}
