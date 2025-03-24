package JAVA_VIDEOS.java_video24;

public class b_c {
    public static void main(String[] args) {
        
        for (int i=1;i<10;i++){
        //    System.out.println(("ITERATION=>"+i));       //THIS ONE IS WRONG(CAUSE 3 WILL BE PRINTED CAUSE THIS LINE IS BEFORE CONDITION OF COMTINUE)
            if(i==3){
            continue;
           }
        //    System.out.println(("ITERATION=>"+i));       //THIS ONE IS RIGHT
        }
    }
}
