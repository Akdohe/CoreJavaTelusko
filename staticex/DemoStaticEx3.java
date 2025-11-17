package staticex;

class Mobile3{ //make sure same package class were not used her will give error
    String brand; //instance variable
    int price;
    static String name;
   static {
    name ="phone";  //static block to initialize static variable
    System.out.println("in static block"); // here static block will execute first always
   }
    // Constuctor to initialize static variable
    public Mobile3(){
        brand = "";
        price = 90000;
        System.out.println("in constructor");
          
    }
    public void show3(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }
}
public class DemoStaticEx3 {
    public static void main(String[] args) throws ClassNotFoundException {
       
        Class.forName("staticex.Mobile3");//need the fully-qualified class name (package + class).
       
        // Mobile2 obj1 = new Mobile2();
        // obj1.brand = "Apple";
        // obj1.price = 90000;
        // Mobile.name = "Iphone 14 Pro Max";
        // obj1.show3();

    }
}
