package JAVA_VIDEOS.java_video41_constructor;

import java.sql.SQLOutput;

class emp{
    private int id;
    private String name;
    private int salary;
    private int YOO;
    public emp(){                        //method overloading possible
        id=69;
        name="MADARA_UCHIHA";
    }
    public emp(String myname){                           //anynumber of argument can be PASSED
        id=69;
        name=myname;
    }
    public emp(int YOO){
        this.YOO=YOO;
    }

    public void setName(String i){name=i;}
    public String getName(){return name;}
    public int setSalary(int i){salary=i;return salary;}

}
public class Constructor {
    public static void main(String[] args) {
        emp madara =new emp();
        emp madara2= new emp("MADARASHOGAN");
        emp madara3=new emp(5);
        System.out.println(madara2.getName());
        //madara.setSalary(10000);
        System.out.println(madara.setSalary(10000));
    }
}
