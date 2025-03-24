package JAVA_VIDEOS.java_video60_PracticeSet;
interface TvRemote{
    void volUp();
    void volDown();
}
interface SmartTvRemote extends TvRemote{
    void voiceControl();
}
class Tv implements TvRemote,SmartTvRemote{
    public void volUp(){
        System.out.println("VOL GETTING UP....");
    }
    public void volDown(){
        System.out.println("VOL GETTING DOWN....");
    }
    public void voiceControl(){
        System.out.println("ACTIVATING VOICE.....");
    }
    public void special(){
        System.out.println("SPECIAL OPTION....");
    }
}
public class Practice4_TvRemote_SmartTvRemote {
    public static void main(String[] args) {

    }
}
