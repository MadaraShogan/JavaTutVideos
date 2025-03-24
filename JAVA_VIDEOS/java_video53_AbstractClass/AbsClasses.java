package JAVA_VIDEOS.java_video53_AbstractClass;
abstract class parent{
    abstract public void ringing();
    public void ringing1(){
        System.out.println("THIS IS RINGING1 IN PARENT");
    }
}
class child1 extends parent{
    public void ringing(){                          //HAVE TO OVERRIDE(USE) ABSTRACT METHOD
        System.out.println("THIS IS CHILD1");
    }
    public void ring68(){                           //YOU CAN MAKE ANOTHER METHOD TOO

    }
}
abstract class child2 extends parent{                     //IF YOU DONT USE RINGING IN THIS THEN YOU HAVE TO MAKE THIS AS ABSTRACT TOO
    public void ringing1(){
        System.out.println("THIS IS CHILD2");       //EVEN IF THE RINGING1 IS DECLARED IN PARENT YOU HAVE TO DECLARE THIS AS ABSTRACT
    }
    public void ringing(){
    }
    public void ring(){
    }
}
public class AbsClasses {
    public static void main(String[] args) {
        //parent obj1=new parent();                //Can not make object of abstract class(GIVE ERROR)
        parent obj=new child1();
        //child2 obj2=new child2();               //Can not make object of abstract class(GIVE ERROR)
        obj.ringing();

    }
}
