package JAVA_VIDEOS.java_video86_PracticeSetOnException;

import java.util.Scanner;

public class Practuce2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        int index;
        int tries=1;
        boolean flag=true;
        while(flag && tries<=5){
            System.out.println("Enter index");
            index=sc.nextInt();
            try{
                System.out.println("Index is "+arr[index]);
                flag=false;
            } catch (IndexOutOfBoundsException e) {
                if(tries==5){
                    System.out.println("ERROR");
                }
                tries++;
            }
        }
    }
}
