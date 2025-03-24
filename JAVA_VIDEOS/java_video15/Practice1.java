package JAVA_VIDEOS.java_video15;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.print("Input your string:");
        String str=sc.next();
        String new_str=str.toLowerCase();
        System.out.println("New String:"+new_str);
    }
}
