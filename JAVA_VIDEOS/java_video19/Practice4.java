package JAVA_VIDEOS.java_video19;
import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year:");
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Year is Leap year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
