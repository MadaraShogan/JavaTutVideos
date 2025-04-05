package JAVA_VIDEOS.java_video102_practice_advance;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Practice4_JavaTimeApi {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();


        DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s");
        String mydate=dt.format(df);
        System.out.println(mydate);
    }
}
