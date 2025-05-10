package JAVA_VIDEOS.java_video76_PracticeSet_Thread;

class Priority extends Thread{
}
public class Practice2_getprio_setprio {
    public static void main(String[] args) {
         Priority t1=new Priority();
         Priority t2=new Priority();
         Priority t3=new Priority();
         t1.setPriority(7);
//       t2.setPriority(4);         /if not set then priority will be NORM means 5
         t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

    }
}
