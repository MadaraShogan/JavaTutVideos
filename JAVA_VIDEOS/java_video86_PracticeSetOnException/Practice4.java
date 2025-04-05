package JAVA_VIDEOS.java_video86_PracticeSetOnException;

import java.util.Scanner;
class myCLASS extends Exception{
    public int PrintErrorOn5Try(int tries) throws IndexOutOfBoundsException{
        if(tries<=5){
            throw new IndexOutOfBoundsException();
        }
        return -1;
    }
}
class CustomClass1 extends Exception {
    public String getMessage(){
        return "MESSEGE BY CUSTOM CLASS -MORE THAN 5 INPUT TAKEN";
    }
}
public class Practice4 {
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
                    try{
                        throw new CustomClass();
                    }
                    catch (Exception o){
                        System.out.println(o.getMessage());
                    }
                }
                tries++;
            }
        }
    }
}
