package Errors;

public class TestPassObject {
    public static void main(String[] args) {
        PassingReferenceCircle myCircle = new PassingReferenceCircle(5.0);
        printCircle(myCircle);
    }
    public static void printCircle(PassingReferenceCircle c) {
        System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
    }
}
