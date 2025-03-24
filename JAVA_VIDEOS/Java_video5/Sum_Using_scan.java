package JAVA_VIDEOS.Java_video5;
import java.util.Scanner;
public class Sum_Using_scan {
    public static void main(String[] args){
    @SuppressWarnings("resource")      //NOT TO REMEMBER(EXTENSION HELP)
    Scanner sc= new Scanner(System.in);
       
       System.out.print("Enter a:");
       int a= sc.nextInt();
       
       System.out.print("Enter b:");
       int b= sc.nextInt();
       
       int sum=a+b;
       System.out.print("Sum is:");
       System.out.println(sum);
       
       //2ND QUEST
       System.out.println("Enter your literal:");
       boolean True_or_not=sc.hasNextInt();
       System.out.println(True_or_not);
    }
}
