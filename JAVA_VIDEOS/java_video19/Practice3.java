package JAVA_VIDEOS.java_video19;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER NUMBER FROM 1 TO 7 :");
        byte a=sc.nextByte();
        switch (a){
            case 1:
              System.out.println("Monday");
              break;
            case 2:
              System.out.println("Tuesday");
              break;
            case 3:
              System.out.println("Wednesday");
              break;
            case 4:
              System.out.println("Thursday");
              break;
            case 5:
              System.out.println("Friday");
              break;
            case 6:
              System.out.println("Saturday");
              break;
            case 7:
              System.out.println("Sunday");
              break;
            default:
              System.out.println("Invalid Number Enterd");
        }
    }
}
