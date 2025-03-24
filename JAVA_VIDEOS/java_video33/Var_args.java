package JAVA_VIDEOS.java_video33;

import java.sql.SQLOutput;

public class Var_args {
    static int sum(int ...arr){
         int result=0;
         for(int elem:arr){
             result+=elem;
         }
         return result;
    }
    public static void main(String[] args) {
        System.out.println("SUM OF 2 AND 3:"+sum(2,3));
        System.out.println("SUM OF 2 AND 3 AND 4:"+sum(2,3,4));
        System.out.println("SUM OF 2 AND 3 AND 4 AND 5:"+sum(2,3,4,5));
    }
}
