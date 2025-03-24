package JAVA_VIDEOS.java_video49_dynamicMethodDispatch;

class phone{
    public void ring(){                                                //refrense of this
        System.out.println("Phone is ringing....");
    }
}
class smartphone extends phone{ //obj of this
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void ring(){
        System.out.println("SmartPhone is ringing....");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        phone obj=new smartphone();
        smartphone obj1=new smartphone();
        phone obj2=new phone();
        obj.ring();
        obj1.ring();
        obj2.ring();
    }
}
