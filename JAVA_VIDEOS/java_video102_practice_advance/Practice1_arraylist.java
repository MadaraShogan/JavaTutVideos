package JAVA_VIDEOS.java_video102_practice_advance;

import java.util.ArrayList;

public class Practice1_arraylist {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("STD1");
        ar.add("STD2");
        ar.add("STD3");
        ar.add("STD4");
        ar.add("STD5");
//        for(String elem:ar1){
//            System.out.println(elem);
//        }
        for(Object o:ar){
            System.out.println(o);
        }



    }
}
