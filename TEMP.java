package Errors;
import java.util.*;
public class TEMP {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit degree: ");
        int Ferdeg = cs.nextInt();
        int Celdeg = (Ferdeg-32)*5/9;
        System.out.println("The Celsius degree is: "+Celdeg);
    }
}
