package JAVA_VIDEOS.java_video28;

public class M_d_array {
    public static void main(String[] args) {
        int [][] arr=new int [2][2];
        arr[0][0]=10;
        arr[0][1]=20;
        arr[1][0]=30;
        arr[1][1]=40;
        //System.out.println(arr.length);     //will show 2   of "arr[2]"[] <-not of this
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +"  ");
            }
            System.out.println();
        }
    }
}
