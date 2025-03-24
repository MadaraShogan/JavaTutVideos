package JAVA_VIDEOS.java_video33;

public class var_args_required_int {
    static int sum(int a,int ...arr){
        int result=a;
        for(int elem:arr){
            result+=elem;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("SUM OF 2 AND 3:"+sum(10,2,3));
        System.out.println("SUM OF 2 AND 3 AND 4:"+sum(10,2,3,4));
        System.out.println("SUM OF 2 AND 3 AND 4 AND 5:"+sum(10,2,3,4,5));
    }
}
