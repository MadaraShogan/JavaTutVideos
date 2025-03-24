package JAVA_VIDEOS.java_video31;

public class Obj_method {
   
    int SUM(int x,int y){                  //Method
        int z;
        z=x+y;
        return z;
        }
    public static void main(String[] args) {      //main method
        int a=5;
        int b=10;
        int c=0;
        Obj_method obj=new Obj_method();          //obj created
        c=obj.SUM(a,b);
        System.out.println(c);                             
        
    }
}
