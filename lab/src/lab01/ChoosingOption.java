package lab01;

import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] args) {
        Object[] options = {"Yes", "No"};
        int option = JOptionPane.showOptionDialog(null,
                "Pham Duc Dung 20215265 Do you want to change to the first class tickets?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: Yes");
        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: No");
        } else {
            JOptionPane.showMessageDialog(null, "Dialog closed without selection");
        }

        System.exit(0);
    }
}
