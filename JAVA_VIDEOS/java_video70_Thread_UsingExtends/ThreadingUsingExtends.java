package JAVA_VIDEOS.java_video70_Thread_UsingExtends;

class thread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i < 4000){
            System.out.println("THREAD1 IS Cooking");
            i++;
        }
    }
}
class thread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("Thread2 is Chatting");
            i++;
        }
    }
}

public class ThreadingUsingExtends {
    public static void main(String[] args) {
        thread1 obj1=new thread1();
        thread2 obj2=new thread2();
//        obj1.run();             //first this will complete
//        obj2.run();             //then this

        //threading
        //Simultaneously Both excute
        obj1.start();
        obj2.start();

        System.out.println(obj1.getId());
    }
}
