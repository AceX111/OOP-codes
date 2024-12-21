package Errors;

class CTest {
    public static void main (String [] arg) {
        Circle c1 = new Circle();
        c1.radius = 5;
        c1.setArea();
        System.out.println(c1.area);
        Circle c2 = new Circle(8);
        c2.setArea();
        System.out.println(c2.area);
    }
}