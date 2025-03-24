// package JAVA_VIDEOS.java_video29;

// public class Practice5 {
//     public static void main(String[] args) {
//         int [] arr={1,2,3,4,5};
//         int t=0;
//         for(int i=0;i<arr.length/2;i++){
//             for(int j=arr.length-1-i;j>arr.length/2-1;j--){
//                 t=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=t;
                
//             }
//         }
//         for(int elem:arr){
//             System.out.println(elem);
//         }
//     }
// }
package JAVA_VIDEOS.java_video29;

public class Practice5 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int t = 0;
        for(int i = 0; i < arr.length/2; i++){
            for(int j = arr.length-1-i; j > arr.length/2-1;){
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                break;
            }
        }
        for(int elem : arr){
            System.out.println(elem);
        }
    }
}
