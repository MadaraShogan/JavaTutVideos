package JAVA_VIDEOS.java_video81_try_catch_specfic;

import java.util.Scanner;

public class UsingSpecificTryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] a={5,10,20};
        System.out.println("Enter your Index:");
        int index=sc.nextInt();
        System.out.println("Enter Your Numb:");
        int numb=sc.nextInt();

        try{
            System.out.println("The vale at the Index is: "+a[index]);
            System.out.println("Division is: "+a[index]/numb);
        }catch (ArithmeticException e){
            System.out.print("Arthmetic Exception Occured: ");
            System.out.println(e);
        }catch(IndexOutOfBoundsException e){
            System.out.print("Index Choosed is out of array a range ");
            System.out.println(e);
        }catch (Exception e){
            System.out.print("Some exception occured ");
            System.out.println(e);
        }
        System.out.println("<PROGRAM ENDED>");


    }
}
