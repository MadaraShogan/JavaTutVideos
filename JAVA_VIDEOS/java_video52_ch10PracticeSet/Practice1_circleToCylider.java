package JAVA_VIDEOS.java_video52_ch10PracticeSet;
class Circle{
    public float r;
    public void setR(float r) {
        this.r = r;
    }
    public float area(){
        return 3.14f*r*r;
    }
    public float para(){
        return 2.0f*3.14f*r;
    }
}
class cylinder extends Circle{
    public float h;
    public void setH(float h) {
        this.h = h;
    }
    public float sa(){
        return 2.0f*3.14f*r*(h+r);
    }
    public float vol(){
        return 3.14f*r*r*h;
    }
}

public class Practice1_circleToCylider {
    public static void main(String[] args) {
         Circle obj1=new Circle();
         cylinder obj2=new cylinder();
         obj1.setR(5);
         obj2.setR(5);           //have to do this to give r value to cylinder class
         obj2.setH(7);
         System.out.println(obj1.area());
         System.out.println(obj1.para());

         System.out.println(obj2.sa());
         System.out.println(obj2.vol());

    }
}
