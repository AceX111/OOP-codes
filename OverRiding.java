package Errors;

public class OverRiding{
    public static void main(String[] args) {
        Superclass superClass = new Superclass();
        superClass.display();
        Superclass subClass = new Subclass();
        subClass.display();
    }
}