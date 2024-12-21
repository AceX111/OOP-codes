package Errors;

public class Example0320 {
    public static void main(String[] args) {
        int x, num, fact;
        num = 5;
        fact = 1;
        for (x = num; x >= 1; x--) fact = fact * x;
        System.out.println("Factorial 5 = " + fact);
    }
}
