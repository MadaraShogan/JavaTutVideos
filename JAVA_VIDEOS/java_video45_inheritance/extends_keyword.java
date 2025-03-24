package JAVA_VIDEOS.java_video45_inheritance;

class base{
    int x=100;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
class derived extends base{
    int y=5;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class extends_keyword {
    public static void main(String[] args) {
        derived obj=new derived();
        int a=obj.getY();
        int b=obj.getX();                     //derived Class can use methods(getter/setter) of BASE class
        System.out.println(a);
        System.out.println(b);
    }
}
