package basicprogram;
    class Computer{
       public void playMusic(){
        System.out.println("Playing music ");
       }

       public String getmePen(int cost){
        if(cost>=10)
        return "pen" ;
        else 
        return "nothing" ;
       }
    }
    
public class MethodEx{

    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getmePen(9);
        System.out.println(str);
    }
}
