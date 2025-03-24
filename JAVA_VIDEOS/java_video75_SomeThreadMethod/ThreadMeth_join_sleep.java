package JAVA_VIDEOS.java_video75_SomeThreadMethod;

class thread1 extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("MADARA UCHIHA");
            i++;
        }
    }
}
class thread2 extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("MADARA");
            i++;
        }
    }
}
public class ThreadMeth_join_sleep {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();

        t1.start();
                                     //USING join() t1 will execute first then t2
        try{
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }

        t2.start();
    }
}
