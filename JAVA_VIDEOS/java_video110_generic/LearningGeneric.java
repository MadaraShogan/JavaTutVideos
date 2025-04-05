package JAVA_VIDEOS.java_video110_generic;

class MyGeneric<G1,G2>{
    int value ;
    private G1 g1;
    private G2 g2;

    public MyGeneric(int val,G1 g1,G2 g2){
        this.value=val;
        this.g1=g1;
        this.g2=g2;
    }

    public G1 getG1(){
       return g1;
    }
    public G2 getG2(){
        return g2;
    }

}
public class LearningGeneric {
    public static void main(String[] args) {
        MyGeneric<String,Integer> obj=new MyGeneric(20,"My String is my String",1000);
        String str=obj.getG1();
        int num=obj.getG2();

        System.out.println(str);
        System.out.println(num);
    }
}
