package Errors;
import java.util.*;
class ScannerDemo {
    public static void main (String [] arg){
        Scanner scan=new Scanner (System.in);
                System.out.println("Please Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Please Enter second number");
        int num2=scan.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of " + num1 +" and "+num2 +"="+sum);
    }
}
