package Errors;

import javax.swing.JOptionPane;
public class WelcomeInMessageDialogBox {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog (null,"Plz enter your name");
        JOptionPane.showMessageDialog(null, "Welcome "+ name +" to Java");
    }
}