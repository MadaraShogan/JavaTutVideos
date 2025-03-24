package JAVA_VIDEOS.java_video25;

public class Practice5 {
    public static void main(String[] args) {
         int fact=1;
         int fact_num=6;    //SCAN IT
        
        //FOR LOOP
        // for(int i=1;i<=fact_num;i++){
        //     fact=fact*i;
        // }
        // System.out.println(fact);

        //WHILE LOOP
        int i=1;
        while(i<=fact_num){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
