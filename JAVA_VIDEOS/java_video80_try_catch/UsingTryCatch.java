package JAVA_VIDEOS.java_video80_try_catch;

public class UsingTryCatch {
    public static void main(String[] args) {
        int a=100;
        int b=0;
//        int c=a/b;                             //shows exception error
//        System.out.println(c);

        //BETTER WAY
        try{
            int c=a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println("Program could not run,Reason:");
            System.out.println(e);
        }
        System.out.println("End Of Program");
    }
}
