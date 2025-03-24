package JAVA_VIDEOS.Java_video6_7;
import java.util.Scanner;
public class Exercise1_Percentage_Calculator {
    public static void main(String[] args){
    @SuppressWarnings("resource")                        //NOT TO REMEMBER(EXTENSION HELP)   
    Scanner Sc=new Scanner(System.in);
    int sub1,sub2,sub3,sub4,sub5,totalmarks;
    double percentage;
    System.out.print("Enter Marks of Subject1:");
    sub1=Sc.nextInt();
    System.out.print("Enter Marks of Subject2:");
    sub2=Sc.nextInt();
    System.out.print("Enter Marks of Subject3:");
    sub3=Sc.nextInt();
    System.out.print("Enter Marks of Subject4:");
    sub4=Sc.nextInt();
    System.out.print("Enter Marks of Subject5:");
    sub5=Sc.nextInt();
    System.out.print("Enter Marks of TotalMarks:");
    totalmarks=Sc.nextInt();

    percentage=((sub1+sub2+sub3+sub4+sub5)*100)/totalmarks;
    System.out.print("Percentage of Student is:"+percentage);
    }
}