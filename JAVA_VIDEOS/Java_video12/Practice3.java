package JAVA_VIDEOS.Java_video12;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.print("v:");
        float v=sc.nextFloat();
        System.out.print("u:");
        float u=sc.nextFloat();
        System.out.print("a:");
        float a=sc.nextFloat();
        System.out.print("s:");
        float s=sc.nextFloat();
        
        float Result=((v*v) - (u*u))/(2*a*s);
        System.out.println(Result);
    }
}
