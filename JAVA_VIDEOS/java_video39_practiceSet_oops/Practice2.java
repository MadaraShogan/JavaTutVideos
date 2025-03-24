package JAVA_VIDEOS.java_video39_practiceSet_oops;

class square{
    int side;
    int area(){
        return side*side;
    }
    int parameter(){
        return side*4;
    }
}
class rectangle{
    int length;
    int breath;
    int area(){
        return length*breath;
    }
    int parameter(){
        return 2*(length+breath);
    }
}
class circle{
    float r;
    float area(){
        return 3.14F*r*r;
    }
    float parameter(){
        return 2*3.14F*r;
    }
}
public class Practice2 {
    public static void main(String[] args) {
        //SQUARE
        square square_1ST=new square();
        square_1ST.side=3;

        System.out.println(square_1ST.area());
        System.out.println(square_1ST.parameter());
       //RECTANGLE
        rectangle rectangle_1st=new rectangle();
        rectangle_1st.length=3;
        rectangle_1st.breath=4;

        System.out.println(rectangle_1st.area());
        System.out.println(rectangle_1st.parameter());
        //CIRCLE
        circle circle_1st=new circle();
        circle_1st.r=4;

        System.out.println(circle_1st.area());
        System.out.println(circle_1st.parameter());

    }
}
