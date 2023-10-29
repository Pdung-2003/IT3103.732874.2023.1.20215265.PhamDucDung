package lab01;

import javax.swing.*;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result; // tao 1 chuoi
        result = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null,"HI" + result + "!");
        System.exit(0); // thoat khoi ctrinh
    }
}
