package JAVA_VIDEOS.java_video57_defaultMethod;

interface camera{
    void takePhoto();
    void recordVidio();
    private void snapDepth(){
        //USE THIS WHEN DEFAULT CODE IS TOO BIG (USE THIS METH IN DEFAULT HERE)
    }
    default void snap(){                             //USING THIS IS NOT REQUIRED(CAUSE OF DEFAULT MODIFIER)
        System.out.println("Taking Snap..");         //YOU CAN KEEP IT EMPTY AND OVERRIDE THIS METH IN CHILD CLASSES
    }
}
interface wifi{
    String[] getNetwork();
}
class phone{
    void pickCall(){
        System.out.println("Pick us the call....");
    }
    void onCall(){
        System.out.println("Call is On...");
    }
}
class smartphone extends phone implements camera,wifi{
    @Override
    public void takePhoto(){
        System.out.println("Clicking Photo");
    }
    @Override
    public void recordVidio() {
        System.out.println("Recording has started");
    }
    public String [] getNetwork(){
        System.out.println("List of Network");
        String [] net ={"AIR12","WIFI84","NETWORK99"};
        return net;
    }
}

public class UsingDefaultMethod {
    public static void main(String[] args) {
        smartphone obj=new smartphone();
        obj.takePhoto();
        String [] arr=obj.getNetwork();          //make a String arr and then Store them in it(cause it is returning string)
        for(String elem:arr){                    //printing string
            System.out.println(elem);
        }
    }
}
