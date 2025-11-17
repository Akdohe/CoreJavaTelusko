package encapsulation;




class A{

    public A(){
        System.out.println("In A constructor calling");
    }
    
    public void show(){
        System.out.println("In A show");
    }

}
public class AnonymusObj {
    public static void main(String[] args) {
        A obj = new A() ; // an declared object of A class is reference object
        // Anonymus object is an object without a name
        obj.show(); // the only problem with this is that we cannot reuse this object as it has no name

    }
}
