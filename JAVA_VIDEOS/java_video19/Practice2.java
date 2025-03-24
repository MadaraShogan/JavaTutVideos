package JAVA_VIDEOS.java_video19;
import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        @SuppressWarnings({ "resource", "unused" })
        Scanner sc=new Scanner(System.in);
        float Amount;
        System.out.println("Enter your Amount:");
        Amount=sc.nextFloat();
        if(Amount>=250000 && Amount<=500000){
            float Tax=Amount*0.05f;
            System.out.println("Tax to be paid:"+Tax);
        }
        else if(Amount>=500000 && Amount<1000000){
            float Tax=Amount*0.2f;
            System.out.println("Tax to be paid:"+Tax);
        }
        else if(Amount>=1000000){
            float Tax=Amount*0.3f;
            System.out.println("Tax to be paid:"+Tax);
        }
        else{
            System.out.println("No Tax below 2.5L");
        }

    }
}
