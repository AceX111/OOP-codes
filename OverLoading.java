package Errors;

class Overloading{
    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }
    // Method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Overloading example = new Overloading();
        System.out.println("Sum of 5 and 10: " + example.add(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + example.add(5, 10, 15));
        System.out.println("Sum of 2.5 and 3.5: " + example.add(2.5, 3.5));
    }
}
