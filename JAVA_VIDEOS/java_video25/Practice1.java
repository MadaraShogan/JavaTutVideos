package JAVA_VIDEOS.java_video25;
public class Practice1 {
    public static void main(String[] args) {
        int c=4;
        
        //FOR LOOP
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=c;j++){
        //         System.out.print("*");
        //     }
        //     c--;
        //     System.out.printf("\n");
        // }
        
        //WHILE LOOP
        int i=1;
        while (i<=4) {
            int j=1;                                //intialise j here
            while(j<=c){
                System.out.print("*");
                j++;
            }
            c--;
            i++;
            System.out.print("\n");
        }
    }
}
