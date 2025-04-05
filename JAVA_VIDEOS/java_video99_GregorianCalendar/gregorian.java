package JAVA_VIDEOS.java_video99_GregorianCalendar;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gregorian {
    public static void main(String[] args) {
        GregorianCalendar c=new GregorianCalendar();
        System.out.println(c.isLeapYear(2018));
            //TimeZone

        for(int i=0;i<=630;i++){
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
        System.out.println(TimeZone.getDefault());
    }
}
