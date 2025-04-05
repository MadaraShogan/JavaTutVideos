package JAVA_VIDEOS.java_video100_101_javaTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaTime {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        LocalTime t=LocalTime.now();

        System.out.println(t);
        System.out.println(d);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String Mydate=dt.format(df);
        System.out.println(Mydate);
    }
}
