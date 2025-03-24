package JAVA_VIDEOS.java_video44_practice_constru;

import java.sql.SQLOutput;

class cylinder{
    private float radius;
    private float height;

    public void setDimension(float i,float j){
           radius=i;
           height=j;
    }
    public float getRadius(){
        return radius;
    }
    public float getHeight(){
        return height;
    }

    public float surfaceArea(){
        return 2*3.14f*(radius*height+radius*radius);
    }
    public float volumeArea(){
        return 3.14f*radius*radius*height;
    }
    public cylinder(float i,float j){
        radius=i;
        height=j;
    }

}
public class Practice1_get_set {
    public static void main(String[] args) {
//         cylinder DIM1 =new cylinder();
//         DIM1.setDimension(3.0f,4.0f);
//         float SA=DIM1.surfaceArea();
//         float VA=DIM1.volumeArea();
//         System.out.println(SA);
//         System.out.println(VA);
           cylinder DIM2=new cylinder(3.0f,4.0f);
           float SA1=DIM2.surfaceArea();
           float VA1=DIM2.volumeArea();
           System.out.println(SA1);
           System.out.println(VA1);
    }
}
