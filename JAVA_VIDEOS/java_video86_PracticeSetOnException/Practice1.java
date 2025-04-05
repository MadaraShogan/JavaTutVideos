package JAVA_VIDEOS.java_video86_PracticeSetOnException;

public class Practice1 {
    public static int function1(int x) throws IllegalArgumentException{
        if(x<10){
            throw new IllegalArgumentException("HEHE");
        }
        return x;
    }
    public static int function2(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("HAHA");
        }
        return a/b;
    }
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
           int y=function1(5);
           System.out.println(y);
        }catch(IllegalArgumentException e){
            System.out.println("hehe");}

        try{
            int z=function2(30,0);
        }catch(ArithmeticException e){
            System.out.println("haha");
        }

    }
}
