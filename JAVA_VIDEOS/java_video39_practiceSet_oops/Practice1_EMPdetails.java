package JAVA_VIDEOS.java_video39_practiceSet_oops;

class Employee{
    int salary;
    String name;
    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    void setName(String n){
       name=n;
    }
}
public class Practice1_EMPdetails {
    public static void main(String[] args) {
        Employee harry=new Employee();

        harry.salary=1000;
        harry.setName("HARRY");
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());

    }
}
