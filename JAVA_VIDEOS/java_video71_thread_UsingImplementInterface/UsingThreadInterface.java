package JAVA_VIDEOS.java_video71_thread_UsingImplementInterface;

class thread1 implements Runnable{
    int i=0;
        public void run(){
            while(i<10000) {
                System.out.println("SHOOTING at Target");
                i++;
            }
        }
}
class thread2 implements Runnable{
    int i=0;
    public void run(){
        while(i<10000){
            System.out.println("RELOADING");
            i++;
        }
    }
}
public class UsingThreadInterface {
    public static void main(String[] args) {
        thread1 bullet1=new thread1();
        Thread gun1=new Thread(bullet1);

        thread2 reloading=new thread2();
        Thread gun2=new Thread(reloading);

        gun1.start();
        gun2.start();

    }
}
