package com.apcompsci.Club;

/** 
 * MaxDialog.java
 */

import javax.swing.*;

public class MaxDialog {    
    public static void main(String[] args) {
        String numStr;
        int max=0;
        int num, more;
        do
        { 
            numStr = JOptionPane.showInputDialog("Enter an integer");
            num = Integer.parseInt(numStr);  // must extract integer from string

            if (num > max)
                max = num;

            // parentComponent is null, uses default frame
            JOptionPane.showMessageDialog(null, "Max so far: " + max);

            more = JOptionPane.showConfirmDialog (null, "Check Another?");
        } while (more == JOptionPane.YES_OPTION);
    }
}
