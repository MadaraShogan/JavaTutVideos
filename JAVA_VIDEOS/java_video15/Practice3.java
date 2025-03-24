package JAVA_VIDEOS.java_video15;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        //1st way (Wromg way)
        //System.out.print("Enter your name:");
        //String name=sc.nextLine();
        //System.out.printf("Letter= \"Dear <|%s|>, Thanks a lot\"",name);
       
        //2nd way
        String str="Letter= \"Dear <|name|>, Thanks a lot\"";
        System.out.println("Enter your name");
        String name=sc.next();
        str=str.replace("name",name);
        System.out.println(str);
    }
}
