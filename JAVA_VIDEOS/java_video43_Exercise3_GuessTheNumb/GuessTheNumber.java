package JAVA_VIDEOS.java_video43_Exercise3_GuessTheNumb;
import java.util.Scanner;
import java.util.Random;

class Game{
    private int user_numb;
    private int npc_numb;
    private int noOfGuess;
    public Game(int i){
          npc_numb=i;
          noOfGuess=0;
    }
    public void calculation(){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Choose Number b/w 0 to 100: ");
            int user_Numb=sc.nextInt();
            user_numb=user_Numb;
            noOfGuess=noOfGuess+1;
                    if(user_Numb==npc_numb){
                        System.out.println("YOU GUESSED "+npc_numb+" IS THE RIGHT NUMBER");
                        break;
                    }
                    else{
                        if(npc_numb>user_Numb){
                            if ((npc_numb - user_numb)<= 20 && (npc_numb - user_numb>=6)) {
                                System.out.println("YOU ARE CLOSE TO THE NUMBER    ");
                            }
                            else if((npc_numb - user_numb) <= 5 && (npc_numb - user_numb)>=1){
                                System.out.println("YOU ARE VERY CLOSE      ");
                            }
                            else if((npc_numb - user_numb) <=40 && (npc_numb - user_numb)>=21 ){
                                System.out.println("YOU ARE FAR FROM THE NUMBER    ");
                            }
                            else if((npc_numb - user_numb) <=99 && (npc_numb - user_numb)>=41 ){
                                System.out.println("YOU ARE VERY FAR FROM THE NUMBER    ");
                            }
                        }
                        else{
                            if ((user_numb - npc_numb)<= 20 && (user_numb - npc_numb)>=6) {
                                System.out.println("YOU ARE CLOSE TO THE NUMBER");
                            }
                            else if((user_numb - npc_numb) <= 5 && (user_numb - npc_numb)>=1){
                                System.out.println("YOU ARE VERY CLOSE");
                            }
                            else if((user_numb - npc_numb) <=40 && (user_numb - npc_numb)>=21 ){
                                System.out.println("YOU ARE FAR FROM THE NUMBER");
                            }
                            else if((user_numb - npc_numb) <=99 && (user_numb - npc_numb)>=41 ){
                                System.out.println("YOU ARE VERY FAR FROM THE NUMBER");
                            }
                        }
                    }
        }while(user_numb!=npc_numb);
    }
    public void getNoOfGuess(){
        if(noOfGuess==1){
            System.out.println("10 SCORE");
        }
        else if(noOfGuess>=2 && noOfGuess<=4){
            System.out.println("9 SCORE");
        }
        else if(noOfGuess>=5 && noOfGuess<=7){
            System.out.println("7 SCORE");
        }
        else if(noOfGuess>=8 && noOfGuess<=10){
            System.out.println("6 SCORE");
        }
        else if(noOfGuess>=11 && noOfGuess<=15){
            System.out.println("4 SCORE");
        }
        else if(noOfGuess>=16 && noOfGuess<=20){
            System.out.println("2 SCORE");
        }
        else if(noOfGuess>=21){
            System.out.println("1 SCORE");
        }
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        Random rd=new Random();
        int npc_Number=rd.nextInt(101);
        Game NUMBERS=new Game(npc_Number);
        NUMBERS.calculation();
        NUMBERS.getNoOfGuess();


    }
}
