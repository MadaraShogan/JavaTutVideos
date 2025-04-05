package JAVA_VIDEOS.java_video82_nested_try_catch;

import java.util.Scanner;

public class Nested_tryCatch {
    public static void main(String[] args) {
        int[] a={10,20,30,40};
        Scanner sc=new Scanner(System.in);
//        System.out.print("INDEX:");
//        int b=sc.nextInt();
        boolean flag=true;
        while(flag) {
            System.out.println("WELCOME LEVEL1");
            System.out.print("INDEX:");
            int b = sc.nextInt();
            try {
                System.out.println("WELCOME LVEVEL2");
                try {
                    System.out.println(a[b]);
                    System.out.println("LEVEL 3");
                    flag = false;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println(e);
                    System.out.println("LEVEL 3");
                }
            } catch (Exception e) {
                System.out.println("LEVEL 1");
                System.out.println(e);
            }
        }
    }
}
