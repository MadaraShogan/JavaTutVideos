package JAVA_VIDEOS.java_video84_ThrowVsThrows;
class NegativeThrowException extends Exception{
    public String getMessage(){
        return "RADIUS IS NEGATIVE";
    }
}
public class LearningAboutThrows {
    public static int div(int a,int b) throws ArithmeticException{
        return a/b;
    }
    public static double area(int r) throws NegativeThrowException{
        if(r<0){
            throw new NegativeThrowException();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static void main(String[] args) {
        try{
        int c=div(10,0);
        System.out.println(c);
        }catch (Exception e){
            System.out.println("EXCEPTION");
        }

        try{
            double d=area(-10);
            System.out.println(d);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
