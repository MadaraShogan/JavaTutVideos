package JAVA_VIDEOS.java_video73_THREAD_CLASS;

class thread1 extends Thread{
    public thread1(String name){       //Constructor(we are overriding constructor present in "Thread Class" here
        super(name);
//        System.out.println("THREAD IS: "+ getName());            //CAN DO THIS HERE TOO
//        System.out.println("THREAD ID IS: "+threadId());
    }
    //better option is to use run() cause we are performing/learning that
}
public class ThreadClassExtends {
    public static void main(String[] args) {
        thread1 obj=new thread1("MADARA");
        System.out.println("ID IS: "+obj.threadId());
        System.out.println("NAME IS: "+obj.getName());
    }
}
