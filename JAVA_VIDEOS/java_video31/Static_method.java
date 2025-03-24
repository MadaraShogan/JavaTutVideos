package JAVA_VIDEOS.java_video31;

    public class Static_method {
        
    static int SUM(int x,int y){                  //static method
        int z;
        z=x+y;
        return z;
        }
    public static void main(String[] args) {      //main method
        int a=5;
        int b=10;
        int c;
        c=SUM(a,b);                                //calling  (WITHOUT MAKING OBJECT)(ONLY STATIC METHOD CAN BE CALLED)
        System.out.println(c);                             
        System.out.println(SUM(a,b));
    }
}
