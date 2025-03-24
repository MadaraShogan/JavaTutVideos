package JAVA_VIDEOS.java_video74_ThreadPriority;

class thread1 extends Thread{
    public thread1(String name){
        super(name);
    }
    public void run(){
        System.out.println("THREAD IS: "+ getName());
    }
}
public class LearningPriority {
    public static void main(String[] args) {
        thread1 t1=new thread1("Madara1");
        thread1 t2=new thread1("Madara2");
        thread1 t3=new thread1("Madara3");
        thread1 t4=new thread1("Madara4");
        t1.setPriority(Thread.MAX_PRIORITY);              //priotiy end on OS too(its not confirmed that this will always have hughest)
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}