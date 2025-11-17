package Loops;
import java.util.Scanner;

public class SwithStatment{
    public static void main(String [] args){
   
         // lets print the weekdays based on input 
        //  int n = 1 ;
System.out.print("PLease enter the value from 1-7: \n");
Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
         switch (n) {
             case 1:
                 System.out.println("Monday");
                 break;
             case 2:
                 System.out.println("Tuesday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             case 7:
                 System.out.println("Sunday");
                 break;

             default:
             System.out.println("Enter a valid Number ");
                 break;
         }

 

 
        
    }
}