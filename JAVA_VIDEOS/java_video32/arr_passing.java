package JAVA_VIDEOS.java_video32;

public class arr_passing {
    static int change(int[] ar){
        return ar[0]=10;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        change(arr);
        System.out.println(arr[0]);
    }
}
