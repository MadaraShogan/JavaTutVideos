package JAVA_VIDEOS.java_video27;

public class foreachloop_dis_arr {
    public static void main(String[] args) {
        int [] arr={20,10,30,40,50};
        
        //USING FOR LOOP
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        //for-each loop
        for(int element:arr){
            System.out.println(element*100);
        }
        
    }
}
