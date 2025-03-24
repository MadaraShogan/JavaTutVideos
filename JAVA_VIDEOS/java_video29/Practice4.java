package JAVA_VIDEOS.java_video29;
import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];
        int[][] c=new int[3][3];

        // you can also do this
        // int [][] arr={{2,2,2},
        //               {2,2,2}};
        
        //scaning
        System.out.println("A:");
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
               a[i][j]=sc.nextInt();
            }
        }
        System.out.println("B:");
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
               b[i][j]=sc.nextInt();
            }
        }
        //calculation
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
               c[i][j]=a[i][j] + b[i][j];
            }
        }
        //printing
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
               System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
