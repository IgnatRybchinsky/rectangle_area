import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RectanglArea {
    double a,b, area;

    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the side1");
        a = Double.parseDouble(br.readLine());
        System.out.println("Enter the side2");
        b = Double.parseDouble(br.readLine());

    }

    void computeField() {area=a*b;}
    void fieldDisplay(){
        System.out.println("The area of rectangle is "+ area);
    }
}

public class Main{
    public static void main(String[] args) throws IOException {
        RectanglArea ra =  new RectanglArea();
        ra.getData();
        ra.computeField();
        ra.fieldDisplay();

    }
}