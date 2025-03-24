package JAVA_VIDEOS.java_video35;

public class Practice6 {
    public static int avg(int [] arr){
        int average=0;
        for(int elem:arr){
            average=average+elem;
        }
        average=(average*100)/(arr.length*100);
        return average;
    }
    public static void main(String[] args) {
        int []arr={70,50,60,80,90};
        System.out.println(avg(arr));
    }
}
