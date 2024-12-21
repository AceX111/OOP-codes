package Errors;
import java.util.*;
class A {
    public static void m1(){
        System.out.println("Hello 2");
    }
    public static void main (String[] arg){
        System.out.println("Hello 1");
        m1();
        System.out.println("Hello 3");
    }
}