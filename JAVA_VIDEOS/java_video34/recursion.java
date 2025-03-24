package JAVA_VIDEOS.java_video34;

public class recursion {
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            System.out.println("PREVIOUS N="+n);
            n= n*fact(n-1);
            System.out.println("AFTER N="+n);
        }
        return n;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
}
