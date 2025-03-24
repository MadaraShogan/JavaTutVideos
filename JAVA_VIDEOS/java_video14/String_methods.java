package JAVA_VIDEOS.java_video14;
//import java.util.Scanner;
public class String_methods {
    public static void main(String[]args ){
        //Scanner sc=new Scanner(System.in);
        String name1="Harry";
        System.out.println(name1.length());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());
        String name2="     harry    ";
        System.out.println(name2.trim());
        System.out.println(name1.substring(2));
        System.out.println(name1.substring(2,5));
        
        System.out.println(name1.replace('r','p'));
           System.out.println(name1.replace("rry","eir"));
        
        System.out.println(name1.startsWith("H"));
           System.out.println(name1.endsWith("y"));
        
        System.out.println(name1.indexOf("r"));
           System.out.println(name1.indexOf("r",3));
        
        System.out.println(name1.lastIndexOf("r"));
           String name3="Harryrryrry";
           System.out.println(name3.lastIndexOf("r",6));
        
        System.out.println(name1.equals("Harry"));
           System.out.println(name1.equalsIgnoreCase("Harry"));
        

    }
}
