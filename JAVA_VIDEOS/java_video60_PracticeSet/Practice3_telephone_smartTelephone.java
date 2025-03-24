package JAVA_VIDEOS.java_video60_PracticeSet;
abstract class Telephone{
   abstract public void ring();
   abstract public void lift();
   abstract public void disconnect();
}
class SmartPhone extends Telephone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Lifting Phone....");
    }
    public void disconnect(){
        System.out.println("Disconnecting...");
    }
    public void snap(){
        System.out.println("Snap...");
    }
}
public class Practice3_telephone_smartTelephone{
    public static void main(String[] args) {
        Telephone obj=new SmartPhone();            //can only use method of Telephone
        SmartPhone obj1=new SmartPhone();          //can you Smartphone method too
        //obj.snap();                               //can not access Smaryphone meth(Refrense is of Telephone)
    }
}
