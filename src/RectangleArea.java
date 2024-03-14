
import java.util.Scanner;



public class RectangleArea {
    float side1;
    float side2;
    float field;

        //static void getData(){
            System.out.println("Enter the side 1: ");
            Scanner s = new Scanner(System.in);
            Float side1 = s.nextFloat();

            System.out.println("Enter the side 2: ");
            Scanner sc = new Scanner(System.in);
            Float side2 = sc.nextFloat();



        }
        static void computeField(Float side1, Float side2, Float field){
            field =(side1+side2);
        }
        static void fieldDisplay(String field){
            System.out.println(field);
        }
}
