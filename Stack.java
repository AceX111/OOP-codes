package Errors;
import java.util.*;

class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    // Push an item onto the stack
    public void push(int item) {
        if(tos==9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }
    // Pop an item from the stack
    public int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class TestStack {
    public static void main(String[] args) {
        int element;
        Stack mystack1 = new Stack();

        // push some numbers onto the stack
        mystack1.push(1);
        mystack1.push(17);
        //mystack1.stck[3]=4  compile error call is encapsulated stck is private
        mystack1.push(20);
        // pop some numbers off the stack
        element=mystack1.pop();
        System.out.println("Element is "+element);
        element=mystack1.pop();
        System.out.println("Element is "+element);
 }
}