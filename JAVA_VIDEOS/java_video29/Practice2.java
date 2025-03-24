package JAVA_VIDEOS.java_video29;

public class Practice2 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int given_int=7;      //scan it
        // for(int i=0; i<=4;i++){
        //     if(arr[i]==given_int){
        //         System.out.println("IT IS PRESENT="+given_int);
        //     }
               
        // }
        boolean isinarray =false;
        for(int elem:arr){
            if(given_int==elem){
                isinarray=true;
                break;
            }
        }
        if(isinarray){
            System.out.println("THE VALUE IS IN ARRAY");
        }
        else{System.out.println("VALUE IS NOT IN ARRAY");}
    }
}
