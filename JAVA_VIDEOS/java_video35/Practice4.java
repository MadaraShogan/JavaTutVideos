package JAVA_VIDEOS.java_video35;

public class Practice4 {
    static void pattern(){
        int c=4;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            c--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
         pattern();
    }
}
