package JAVA_VIDEOS.java_video54_55_Interface;

interface bicycle{
    public void Brake(int i);                   //using public in the meth of interface is redundent
    void speed(int j);
}
interface  bicycle2{
    void gear(int k);
}
class cycle1 implements bicycle,bicycle2{
    public int a=39;
    @Override
    public void Brake(int i) {                            //public is required
        System.out.println("break is getting applied by "+i);
    }
    @Override
    public void speed(int j) {                            //public is required
        System.out.println("Speeding up by  "+j);
    }
    @Override
    public void gear(int k) {
        System.out.println("Gear available");
    }
    public void horn(){                                  //can make method (can be accecesd when object and refrense is of cycle1)
        System.out.println("Beepppp.....");
    }
}
public class LearningInterface {
    public static void main(String[] args) {
        bicycle b=new cycle1();
        cycle1 b1=new cycle1();
        b.Brake(2);
        b1.horn();
        b1.a=50;
        System.out.println(b1.a);
    }
}
