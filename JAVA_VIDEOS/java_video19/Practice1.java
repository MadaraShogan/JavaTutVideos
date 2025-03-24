package JAVA_VIDEOS.java_video19;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        byte sub1,sub2,sub3;
        float avg_total;
        System.out.println("Enter SUB1,SUB2,SUB3:");
        sub1=sc.nextByte();
        sub2=sc.nextByte();
        sub3=sc.nextByte();
        System.out.println("Total MARKS:");
        int total=sc.nextInt();
        avg_total=((sub1+sub2+sub3)*100)/total;
        
        if(avg_total>=40 && sub1>=33 && sub2>=33 && sub3>=33){
                System.out.println("Student is passed");
            }
        else{
            System.out.println("Student is Fail");
        }

    }
}
