package JAVA_VIDEOS.java_video60_PracticeSet;

abstract class pen{
    abstract public void write();
    abstract public void refill();
}
class fountainPen extends pen{
    public void write(){
        System.out.println("WRITING ON PAPER....");
    }
    public void refill() {
        System.out.println("REFILLING THE INK...");
    }

    public void changeNib(){
        System.out.println("CHANGING NIB....");
    }
}
public class Practice1_AbsClass {
    public static void main(String[] args) {
        fountainPen obj=new fountainPen();
        obj.write();
        obj.refill();
        obj.changeNib();
    }
}
