package JAVA_VIDEOS.java_video76_PracticeSet_Thread;
class GM extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Good Morning");
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class wel extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Welcome");
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
public class Practice1_Printing_welcome_Goodmorning {
    public static void main(String[] args) {
        GM t1=new GM();
        wel t2=new wel();

        t1.start();
        t2.start();
    }
}
