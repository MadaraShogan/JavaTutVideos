package JAVA_VIDEOS.java_video38;

class Employee{
    int id;
    String name;
    void PrintDetail(){
        System.out.println("ID is: "+id);
        System.out.println("Name is: "+name);
    }
}
public class Custom_class {
    public static void main(String[] args) {
        Employee harry=new Employee();
        Employee eddie=new Employee();

        harry.id=10;
        harry.name="HarryTheGoat";
        eddie.id=20;
        eddie.name="EddieTheGoat";

        harry.PrintDetail();
        eddie.PrintDetail();
    }
}
