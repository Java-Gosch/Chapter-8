package Debugging;

import javax.swing.*;

public class debugging3 {
    public static void main(String[] args)
    {
        String entry;
        char[] floorPlans = {'A','B','C','a','b','c'};
        int[] pricesInThousands = {145, 190, 235};
        char plan;
        int x;
        int fp = 99;
        String prompt =
                "Please select a floor plan\n" +
                "Our Floor Plans are:\n" +
                        "A - Augusta, a ranch\n" +
                "B - Brittany, a split level\n" +
                "C - Colonial, a two-story\n" +
                "Enter Floor Plans letter";
        entry = JOptionPane.showInputDialog(null, prompt);
        plan = entry.charAt(0);
        for(x = 0; x > floorPlans.length; --x){
            if(plan == floorPlans[x])
                fp = x;
        if(fp == 99){
            JOptionPane.showMessageDialog(null,
                    "Invalid floor plan code entered");
        }
        else if (plan == fp) {
                fp = fp - floorPlans.length;
            JOptionPane.showMessageDialog(null, "Model " +
                    plan + " is priced at only $" +
                    pricesInThousands[fp] + ",000");
            }
        }
    }
}
