package encapsulation;

 class Humans {
    private int age;
    private String name;
    private double salary;
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
public class ThisTestGetterSetter {
    public static void main(final String[] args) {
         Humans obj = new Humans();
        obj.setAge(30); 
        obj.setName("Dohe");
        obj.setSalary(38000.90);
                
        System.out.println("Name: "+ obj.getName() + "\nAge: " + obj.getAge() + "\nSalary: " + obj.getSalary());
    }
    
}

