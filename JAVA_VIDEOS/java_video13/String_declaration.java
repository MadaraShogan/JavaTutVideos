package JAVA_VIDEOS.java_video13;
import java.util.Scanner;
public class String_declaration{
    public static void main(String[] args){
        @SuppressWarnings({ "unused", "resource" })   //
        Scanner Sc =new Scanner(System.in);
       
        String name="HELLO";
        String name2=new String("HELLO2");
        System.out.print("TYPE YOUR STRING:");
        String name3=Sc.next();
        
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        
    }
}
