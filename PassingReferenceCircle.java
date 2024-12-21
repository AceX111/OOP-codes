package Errors;

class PassingReferenceCircle {
    private double radius;
    PassingReferenceCircle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
