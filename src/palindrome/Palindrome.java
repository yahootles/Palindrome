/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author antho6229
 */
import javax.swing.JOptionPane;

public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String forward = "";
        String backwards = "";

        try {
            forward = JOptionPane.showInputDialog("Words that are arranged the same way forwards as they are backwards are called palindromes.\nThis program determines if a word is a palindrome.\n\nEnter a word:");

            //reverse the string
            for (int i = forward.length() - 1; i >= 0; i--) {
                backwards += forward.charAt(i);
            }
            //check if string is a palindrome, then output to user
            if (forward.equalsIgnoreCase(backwards)) {
                JOptionPane.showMessageDialog(null, (forward + " in reverse is " + backwards + ".\nIt IS a palindrome."));
            } else {
                JOptionPane.showMessageDialog(null, (forward + " in reverse is " + backwards + ".\nIt is NOT a palindrome."));
            }
        }catch(NullPointerException npe){//Exit properly is cancel option is chosen
            System.exit(0);
        }
    }

}
