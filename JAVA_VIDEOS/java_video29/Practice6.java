package JAVA_VIDEOS.java_video29;

public class Practice6 {
    public static void main(String[] args) {
        int[] a={2,10,6,8};
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
