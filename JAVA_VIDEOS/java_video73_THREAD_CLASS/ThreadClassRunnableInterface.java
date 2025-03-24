package JAVA_VIDEOS.java_video73_THREAD_CLASS;

class Mythread implements Runnable{
    public void run() {
        //Nothing
    }
}

public class ThreadClassRunnableInterface {
    public static void main(String[] args) {
        Mythread obj=new Mythread();
        Thread obj2=new Thread(obj,"MADARA");

        System.out.println(obj2.getName());
        System.out.println(obj2.threadId());
    }


}
