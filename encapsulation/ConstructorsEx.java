package encapsulation;

 class Humans1 {
    private int age;
    private String name;
    private double salary;
//constructor means a special method which is used to initialize the object of a class
// If we do not create a constructor Java provides a default constructor
// A constructor name must be same as class name
    public Humans1() {
        System.out.println("Constructor called");
        age = 16;
        name = "Default Name";
        salary = 20000.0;
    }



    // Getter and Setter methods cereted directly from ide 
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        this.age = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public double  getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    // Now right-click on any field above and select "Generate Getters and Setters"


}
public class ConstructorsEx {
    public static void main(final String[] args) {
         Humans1 obj = new Humans1();// Every time when object is created constructor is called
        // obj.setAge(30); 
        // obj.setName("Dohe");
        // obj.setSalary(38000.90);

        //In the following we are using default values initialized in constructor       
        System.out.println("Name: "+ obj.getName() + "\nAge: " + obj.getAge() + "\nSalary: " + obj.getSalary());
    }
    
}

