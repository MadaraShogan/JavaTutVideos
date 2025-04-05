package JAVA_VIDEOS.java_video98_CalenderClass;

import java.util.Calendar;
import java.util.TimeZone;

public class LearningCalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();                     //according to your time zone
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Canada/Central"));      //if wanna specify someone else timezone

        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
    }
}
