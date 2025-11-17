package encapsulation;
class Human{
   private int age =33;
   private String name = "Aki";
   private String sex ;

public int getAge(){
    return age;
}

public String getName(){
    return name;
}

public void setAge(final int a){
    age = a;
}

public void setName(final String n){
    name = n;
}

public String getSex() {
    return sex;
}

public void setSex(String sex) {
    this.sex = sex;
}

}

public class Enc {
    public static void main(final String[] args) {
         Human obj = new Human();
        obj.setAge(30); 
        obj.setName("DOhe"); 
        
        System.out.println("Name: "+ obj.getName() + "\nAge: " + obj.getAge());
    }
    
}
