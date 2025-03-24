// package JAVA_VIDEOS.java_video29;

// public class Practice8 {
//     public static void main(String[] args) {
//         int[] a={1,2,5,4,5};
//         //int point=a[0];
//         //boolean cond=false;
//         //int t=0;
//         for(int i=0;i<a.length-1;i++){
//             for(int j=1;j<a.length;j++){
//                 if(a[i]<a[j]){
//                     System.out.println("ASCENDING ORDER");
//                 }
//                 else{
//                     if(a[i]>a[j]){
//                         System.out.println("DESCENDING ORDER");
//                     }
//                     else{
//                         System.out.println("NOT SORTED");
//                     }
//                 }
//             }
//         }
//     }
// }
package JAVA_VIDEOS.java_video29;

public class Practice8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 5};
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                descending = false;
            }
            if (a[i] > a[i + 1]) {
                ascending = false;
            }
        }

        if (ascending) {
            System.out.println("ASCENDING ORDER");
        } else if (descending) {
            System.out.println("DESCENDING ORDER");
        } else {
            System.out.println("NOT SORTED");
        }
    }
}

