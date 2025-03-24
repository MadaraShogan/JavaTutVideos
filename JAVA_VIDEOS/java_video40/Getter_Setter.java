package JAVA_VIDEOS.java_video40;

import java.security.cert.CertPathValidatorException;

class circle{
    private int r;
    public void setR(int i){                                //setter
        r=i;
    }
    public void getR(){                                     //getter
        System.out.println(r);
    }
    public float area(){
        return 3.14f*r*r;
    }
}
public class Getter_Setter {
    public static void main(String[] args) {
        circle CIRCLE_1st =new circle();
        CIRCLE_1st.setR(5);                                  //giving value in setter
        CIRCLE_1st.getR();
        System.out.println(CIRCLE_1st.area());

        float a=CIRCLE_1st.area();                       //POOSIBLE (2ND WAY TO PRITN)
        System.out.println(a);
    }
}
