package JAVA_VIDEOS.java_video19;
import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        String webname=sc.nextLine();
        if(webname.endsWith(".com")){
            System.out.println("COMMERCIAL WEBSITE");
        }
        else if(webname.endsWith(".org")){
            System.out.println("ORGANIZATION WEBSITE");
        }
        else if(webname.endsWith(".in")){
            System.out.println("INDIAN WEBSITE");
        }
        else{
            System.out.println("IDK");
        }
    }
}
