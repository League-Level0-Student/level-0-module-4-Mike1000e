package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * 
         */
        int ha = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        if(ha==0) {
        isWeekday=true;
        }else {
        isWeekday=false;
        }
        int okBoomer = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        if(okBoomer==0) {
        isVacation=true;
        }else {
        isVacation=false;
        }
        if(isVacation == true || isWeekday == false) {
        	JOptionPane.showInputDialog(null,"Sleep in???");
        
        }else {
        	JOptionPane.showInputDialog(null,"Get up lazybones");
        }
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
