package staticex;

class Mobile{
    String brand; //instance variable
    int price;
    //Following is static variable common to all the objects
    static String name; // i want to have name should be same for all the objects currently non-static
    public void show(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }
}
public class DemoStatic {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 90000;
        Mobile.name = "Iphone 14 Pro Max";
        obj1.show();

        //creating second object
        Mobile obj2 = new Mobile(); 
        obj2.brand = "Samsung";
        obj2.price = 80000;
        Mobile.name = "Galaxy S23 Ultra"; // Static to static use by Class Name.varible name 
        obj2.show();
        //non-static to static use by object name
        // obj2.name = "Galaxy S23 Ultra";  
        //non-static to non-static use by this.varible name
    }
    }
