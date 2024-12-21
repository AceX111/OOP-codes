package Errors;

import javax.swing.JOptionPane;
public class Adder {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog(null, "Please enter first number");
        String num2 = JOptionPane.showInputDialog(null, "Please enter second number");
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        int z = x + y;
        JOptionPane.showMessageDialog(null, "the sum is " + z);
    }
}