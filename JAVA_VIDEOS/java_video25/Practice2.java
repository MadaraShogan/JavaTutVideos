package JAVA_VIDEOS.java_video25;

public class Practice2 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        int n_number=3;   //SCAN IT
        
        //WHILE LOOP
        // while(i<=n_number){
        //     sum=sum+i;
        //     i++;
        // }
        // System.out.println(sum);

        //FOR LOOP
        for(i=1;i<=n_number;i++){
            sum=sum+(2*i);
        }
        System.out.println(sum);
    }
}
