package JAVA_VIDEOS.java_video76_PracticeSet_Thread;
class ST extends Thread{
    public void run() {
    }
}
public class Practice3_KnowingStateOfThread {
    public static void main(String[] args) {
        ST t1=new ST();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread());
    }
}
