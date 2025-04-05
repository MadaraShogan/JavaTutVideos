package JAVA_VIDEOS.java_video111_Files;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LearningFiles {
    public static void main(String[] args) {

        //1) creating a File
        try{
            File myFile=new File("TxtFileForVideo111.txt");     // .txt not so important to write (it will do automatically)
            myFile.createNewFile();
        }catch(IOException e){
            System.out.println("Unable to create file");
            e.printStackTrace();
        }

        //2) writing in file
        try{
            FileWriter writingfile=new FileWriter("TxtFileForVideo111.txt");
            writingfile.write("FIRST TEXT OF FILE");
            writingfile.close();            //it is a good practice to close it
        }catch(IOException e){
            System.out.println("Problem while Writing inside a file");
            e.printStackTrace();
        }

        //3) Reading From File
        try{
            File myFile=new File("TxtFileForVideo111.txt");          //THIS EXIST ONLY IN THIS
            Scanner sc=new Scanner(myFile);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        //4) Deleting a file
//        File myFile=new File("TxtFileForVideo111.txt");               //THIS EXIST IN ALL CODE
//        if(myFile.delete()){
//            System.out.println("DELETED FILE:"+myFile.getName());
//        }else{
//            System.out.println("PROBLEM OCCURED");
//        }
    }
}
