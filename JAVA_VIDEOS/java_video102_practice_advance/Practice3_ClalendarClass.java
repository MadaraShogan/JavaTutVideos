package JAVA_VIDEOS.java_video102_practice_advance;

import java.util.Calendar;

public class Practice3_ClalendarClass {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
