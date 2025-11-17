package encapsulation;

 class Humans2 {
    private int age;
    private String name;
    private double salary;
//constructor means a special method which is used to initialize the object of a class
// If we do not create a constructor Java provides a default constructor
// A constructor name must be same as class name
   
// Default cunstroctur
    // public Humans2() {
        
    // }
public Humans2() {
        System.out.println("Constructor called");
        age = 16;
        name = "Default Name";
        salary = 20000.0;
    }

    public Humans2(String name) {
        System.out.println("Constructor called");
        this.age = 16; //default age
        this.name = name;
        this.salary = 20000.0; //default salary
    }
    public Humans2(int age, String name, double salary) {
        System.out.println("Parameterized Constructor called");
        this.age = age;
        this.name = name;
        this.salary = salary;
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
public class ParaConstructor {
    public static void main(final String[] args) {
         Humans2 obj = new Humans2();// Every time when object is created constructor is called
         Humans2 obj2 = new Humans2(18,  "John",  45000.50);
         Humans2 obj3 = new Humans2("Shaun");

            // obj.setAge(30); 
        // obj.setName("Dohe");
        // obj.setSalary(38000.90);
       System.out.println("Name: "+ obj3.getName() + "\nAge: " + obj3.getAge() + "\nSalary: " + obj3.getSalary());
        //In the following we are using default values initialized in constructor       
       System.out.println("Name: "+ obj2.getName() + "\nAge: " + obj2.getAge() + "\nSalary: " + obj2.getSalary());
      //  System.out.println("Name: "+ obj.getName() + "\nAge: " + obj.getAge() + "\nSalary: " + obj.getSalary());
    }
    
}

