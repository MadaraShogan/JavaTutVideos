package JAVA_VIDEOS.java_video35;

public class Practice3 {
    static int mysum(int n){
        if(n==1){
            return 1;
        }
        else{
            n=n+mysum(n-1);
        }
        return n;
    }
    public static void main(String[] args) {
         int n=10;
         int SUM=mysum(n);
        System.out.println(SUM);
    }
}
