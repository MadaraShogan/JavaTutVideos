package JAVA_VIDEOS.java_video112_Advance2_PracticeSet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice1_multiplicationTable_file {
    public static void main(String[] args) {
        File myfile=new File("FILE FOR MULTIPLICATION TABLE.txt");
        try{
            myfile.createNewFile();
            System.out.println("FILE HAS BEEN GENERATED");
        }catch(IOException e){
            e.printStackTrace();
        }
        int n=5;
        String table="";
        for(int i=0;i<=9;i++){
            table=table +n+"*"+(i+1)+"="+(i+1)*n;
            table=table+"\n";
        }
        try{
            FileWriter WritingF=new FileWriter("FILE FOR MULTIPLICATION TABLE.txt");
            WritingF.write(table);
            WritingF.close();
        } catch (IOException e) {
            System.out.println("PROBLEM OCCURED");
            System.out.println(e);
        }
    }
}
