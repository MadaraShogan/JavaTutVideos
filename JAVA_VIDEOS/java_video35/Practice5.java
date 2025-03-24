package JAVA_VIDEOS.java_video35;

public class Practice5 {
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            int fib=fib(n-1)+fib(n-2);
            return fib;
        }
    }
    public static void main(String[] args) {
       int FIB=fib(7);         //0,1,1,2,3,5,8,13,21,34
        System.out.println(FIB);

    }
}
