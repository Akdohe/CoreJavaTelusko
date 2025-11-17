package String;

public class StringEx {
    public static void main(String[] args) {
        //SringBuffer and StringBuilder in java are used to create mutable strings
        //StringBuffer is thread safe and synchronized but StringBuilder is not thread safe and not synchronized
        //StringBuffer is slower than StringBuilder because of the synchronization
        StringBuffer sb = new StringBuffer("Hello "); //initial capacity is 16 + length of string
       System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(" Akshy") ; // to add more string to the existing string
        System.out.println(sb);

        // to String to convert StringBuffer to String
        // String str = sb.toString();
        // System.out.println(str);

       sb.deleteCharAt(7);// to delete character at specified index
         System.out.println(sb);

         sb.insert(6, 'A'); // to insert character at specified index
       System.out.println();
       
       
        String name = "Navina";
       
       
        String name2 = new String("vijay");
        System.out.println("Hello " + name2);
        System.out.println(name2.charAt(4));
        System.out.println(name2.concat(" Dohe"));
        // char ch = 'A';
        // System.out.println(ch);



// String is a class in java and it is used to store the sequence of characters
// There are two ways to create string in java
// 1. By string literal
// 2. By new keyword    
// String is immutable in java means once we create a string we cannot change it
// but we can create a new string with the same name
// Example
// String name = "Navin";
// name = "Vijay"; // this will create a new string with the name Vijay
// System.out.println(name); // this will print Vijay   
// In the above example we have created a string with the name Navin and then we have changed it to Vijay
// but in reality we have created a new string with the name Vijay and the old string Nav
// in is still in the memory
// String pool in java is a special memory area where the strings are stored
// when we create a string using string literal it is stored in the string pool
// when we create a string using new keyword it is stored in the heap memory
// Example
// String name1 = "Navin"; // stored in string pool
// String name2 = new String("Navin"); // stored in heap memory
// System.out.println(name1 == name2); // this will print false because name1 and name2 are stored in different memory areas
// To compare the values of two strings we can use the equals() method
// Example
// System.out.println(name1.equals(name2)); // this will print true because the values of
// name1 and name2 are same
// Some commonly used methods in string class
// 1. charAt(int index) - returns the character at the specified index
// 2. concat(String str) - concatenates the specified string to the end of this string
// 3. length() - returns the length of the string   
//  4. toLowerCase() - converts the string to lower case
// 5. toUpperCase() - converts the string to upper case
// 6. trim() - removes the leading and trailing spaces
// 7. substring(int beginIndex, int endIndex) - returns the substring from the specified beginIndex to endIndex
// 8. replace(char oldChar, char newChar) - replaces all occurrences of oldChar with newChar
// 9. split(String regex) - splits the string into an array of strings based on the specified regex
// 10. indexOf(String str) - returns the index of the first occurrence of the
// specified string
// 11. lastIndexOf(String str) - returns the index of the last occurrence of the specified string


    
    }
    
}
