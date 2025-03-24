package JAVA_VIDEOS.java_video58_Inheritance_In_Interface;

interface inter1{
    void meth1();
}
interface inter2 extends inter1{
    void meth2();
}
interface inter3 extends inter2{

}
interface inter4{

}
interface inter5 extends inter3,inter4{

}
class sample implements inter2{
    public void meth1(){
        System.out.println("This is Meth1");
    }
    public void meth2(){
        System.out.println("This is meth2");
    }
    public void METHOD3(){
        System.out.println("This is METHOD3");
    }
}
public class InheriInInter {
    public static void main(String[] args) {
        sample obj=new sample();
        obj.meth2();
    }
}
