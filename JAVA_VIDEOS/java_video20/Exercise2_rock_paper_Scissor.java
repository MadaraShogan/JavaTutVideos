package JAVA_VIDEOS.java_video20;
import java.util.Scanner;
import java.util.Random;

public class Exercise2_rock_paper_Scissor {
    public static void main(String[] args) {
        System.out.println("GAME OF ROCK PAPER SCISSOR");
        System.out.println("0=ROCK");
        System.out.println("1=SCISSSOR");
        System.out.println("2=PAPER");

        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int num=random.nextInt(3);
        System.out.println("Choose your number:");
        int mynum=sc.nextInt();
        if(num==0){
            if(mynum==1){
                System.out.println("NPC won");
            }
            else if(mynum==2){
                System.out.println("PLAYER won");
            }
            else if(mynum==0){
                System.out.println("TIE");
            }
        }
        if(num==1){
            if(mynum==0){
                System.out.println("PLAYER won");
            }
            else if(mynum==2){
                System.out.println("NPC won");
            }
            else if(mynum==1){
                System.out.println("TIE");
            }
        }
        if(num==2){
            if(mynum==0){
                System.out.println("NPC won");
            }
            else if(mynum==1){
                System.out.println("PLAYER won");
            }
            else if(mynum==2){
                System.out.println("TIE");
            }
        }
    }
}
