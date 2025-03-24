package JAVA_VIDEOS.java_video46_Constructor_In_Inheritance;
class base{
    public base(){
        System.out.println("I am base Class");
    }
    public base(int a ){                                                    //will not run cause no argument (if want to use then use super keyword)(but abive no args cons not run)
        System.out.println("(Base Class(overloaded))Value of a is :"+a);
    }
}
class derived extends base{
    public derived(){
        super(1);                                       //then constructor with argument will run and not constructor without any argument)
        //super keyword shoud be written above
        System.out.println("I am derived Class");
    }
    public derived(int a,int b){
        super(2);                                       //then constructor with argument will run and not constructor without any argument)
        System.out.println("I am derived Class");
    }
}
public class consInInheritance {
    public static void main(String[] args) {
          derived d=new derived();            //first base class constructor then derived class constructor
          //if added args in object line then cons of args one will work(line 15)
          derived d1=new derived(2,3);
    }
}
