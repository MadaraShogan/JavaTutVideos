package JAVA_VIDEOS.java_video15;
import java.util.Scanner;
public class Practice4 {

    @SuppressWarnings("resource")
    public static void main(String[] args){
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        String str="this string  has double and   triple spaces ";
        //If index ouput is -1 then we will know string dont have that particular space
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));               
    }
}
