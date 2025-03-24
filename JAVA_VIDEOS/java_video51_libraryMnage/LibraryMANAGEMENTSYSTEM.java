package JAVA_VIDEOS.java_video51_libraryMnage;
import java.util.Scanner;
class library{
    public String [] availableBook=new String[100];
    public String [] issueBooks=new String[100];
    String tempPlace="Book Taken";
    Scanner sc=new Scanner(System.in);
    public void addBooks(){
         for(int i=0;i<100;i++){
             if(availableBook[i]==null){
                 System.out.println("Enter Book name to Add:");
                 String newbook=sc.nextLine();
                 availableBook[i]=newbook;
                 System.out.println(newbook+"is added to the available book slot");
                 return;
             }
             System.out.println("Library Storage is full");
         }
    }
    public void issueBooks(){
        System.out.print("Enter book name");
        String b=sc.nextLine();
        for(int i=0;i<availableBook.length;i++){
              if(availableBook[i].equalsIgnoreCase(b) && availableBook[i]!=null){
                System.out.println("Here is your Issued book " +availableBook[i]);
                availableBook[i]=tempPlace;
                return;
              }
        }
        System.out.println("Book not avaiable");
    }
    public void returnBook(){
        System.out.print("What book you want to return:");
        String bookWantToReturn=sc.nextLine();
        for(int i=0;i<availableBook.length;i++){
              if(availableBook[i]==tempPlace){
                //System.out.println("Book has been Returned");
                availableBook[i]=bookWantToReturn;
                  System.out.println("Book has been returned "+bookWantToReturn);
                  return;
              }
        }
        System.out.println("Book could not be return");
    }
    public void showAvailableBook(){
        boolean anyBookAvailable = false;
        for(String element:availableBook){
             if(element!=null && !element.equalsIgnoreCase(tempPlace)){
                 System.out.println(element);
                 anyBookAvailable=true;
             }
        }
        if(!anyBookAvailable){
            System.out.println("No Book Avaiable");
        }
    }
}
public class LibraryMANAGEMENTSYSTEM {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan=new Scanner(System.in);
        library obj=new library();
        while(true){
            System.out.println("press 1 to ADDBOOK IN LIBRARY");
            System.out.println("Press 2 to ISSUEBOOK FROM LIBRARY");
            System.out.println("Press 3 to RETURN a book");
            System.out.println("Press 4 to SHOW AVAIABLE BOOK");
            System.out.println("Press 5 to STOP");
            System.out.print("Choose your Optiom(1-5):");
            int choose=scan.nextInt();
            if(choose==1){
                obj.addBooks();
            }
            else if(choose==2){
                obj.issueBooks();
            }
            else if(choose==3){
                obj.returnBook();
            }
            else if(choose==4){
                obj.showAvailableBook();
            }
            else if(choose==5){
                System.out.println("ended");
                break;
            }
        }
    }
}



