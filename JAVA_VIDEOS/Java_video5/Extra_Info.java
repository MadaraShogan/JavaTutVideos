package JAVA_VIDEOS.Java_video5;
import java.util.Scanner;
public class Extra_Info {
    public static void main(String[] args){
    @SuppressWarnings("resource")  //NOT TO REMEMBER(EXTENSION HELP)
    Scanner sc= new Scanner(System.in);
       
       //Check if it is of that type or not
       boolean True_or_not=sc.hasNextInt();
       System.out.println(True_or_not);
       String str1=sc.nextLine();     //use this to show whole line
       String str2=sc.next();       //use this to show 1 word of the line
       System.out.println(str1);
       System.out.println(str2);
    }
}
