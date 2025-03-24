package JAVA_VIDEOS.java_video29;

public class Practice3 {
    public static void main(String[] args) {
        float [] phs_marks={60.0f,70.0f,80.0f};
        float avg=0;
        for(float elem:phs_marks){
        avg=(avg+elem);
        }
        avg=avg*100.0f/(phs_marks.length*100);
        System.out.println(avg);
    }
}
