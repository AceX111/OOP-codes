package Errors;
import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = cs.nextDouble();
        double area = radius*radius*3.14;
        System.out.println("The area of the circle is: "+area);


    }

}