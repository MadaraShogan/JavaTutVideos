package JAVA_VIDEOS.java_video29;

public class Practice7 {
    public static void main(String[] args) {
        int[] a={2,10,6,8};
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}

