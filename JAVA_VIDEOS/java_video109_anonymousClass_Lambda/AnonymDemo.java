package JAVA_VIDEOS.java_video109_anonymousClass_Lambda;

interface Anodemo1{
    void meth1();
    void meth2();
}
@FunctionalInterface
interface Anodemo{
    void meth1();
}


public class AnonymDemo {
    public static void main(String[] args) {
        //ANONYMOUS CLASS
        Anodemo1 obj=new Anodemo1() {
            @Override
            public void meth1() {
                System.out.println("HELLO1");
            }
            @Override
            public void meth2() {
                System.out.println("HELLO2");
            }
        };
        obj.meth1();

        //LAMBDA
        Anodemo obj1=()->{                                                      //can also pass parameter here (a)(no need for int a)(then have to make int a in interface)
            System.out.println("METH1 OF LAMBA");
        };
    }
}
