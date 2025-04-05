package JAVA_VIDEOS.java_video83_ExceptionClass;

import java.util.Scanner;

class Myexep extends Exception{
    public String toString(){                      //function of Exception Class
        return "I AM EXCEPTION OF toString";
    }
    public String getMessage(){                    //funtion of Exception Class
        return "I AM EXCEPTION OF getMessage";
    }
}
public class ExcepClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A= ");
        int a=sc.nextInt();
        if(a<10){
            try{
                throw new Myexep();

            }catch (Exception e){
                System.out.println(e);                    //print the messege we return from tostring() int Myexep Class
                System.out.println(e.toString());         //same
                System.out.println(e.getMessage());       //print the messeage we return from getmessege() in Myexep Class
                e.printStackTrace();                      //look like an error but is not(help in identifying the error in our lines)
            }
        }
//        int b=4;
//        if(b==0){
//            throw new ArithmeticException("DIV BY 0");
//        }else{
//            System.out.println(a/b);
//        }

    }
}
