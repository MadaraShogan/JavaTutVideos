package JAVA_VIDEOS.java_video48_override;

class A{
    public void meth1(){
        System.out.println("METH1 of A");
    }
}
class B extends A{
    public void meth1(){
        System.out.println("METH1 of B");          //this is override
    }
}
public class OVERRDING {
    public static void main(String[] args) {
        B b=new B();
        b.meth1();
    }
}
