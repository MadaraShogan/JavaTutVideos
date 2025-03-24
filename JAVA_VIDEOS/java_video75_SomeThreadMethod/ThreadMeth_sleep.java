package JAVA_VIDEOS.java_video75_SomeThreadMethod;

class thread3 extends Thread{
    public void run(){
        int i=0;
        while(i<31000){
            System.out.println("MADARA UCHIHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class thread4 extends Thread{
    public void run(){
        int i=0;
        while(i<3100000){
            System.out.println("MADARA");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
public class ThreadMeth_sleep {
    public static void main(String[] args) {
        thread3 t3=new thread3();
        thread4 t4=new thread4();

        t3.start();
        t4.start();
    }
}
