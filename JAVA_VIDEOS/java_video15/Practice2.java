package JAVA_VIDEOS.java_video15;
import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your String:");
        String str=sc.nextLine();
        String new_str=str.replace(' ','_');
        System.out.println("New String:"+new_str);

    }
}
