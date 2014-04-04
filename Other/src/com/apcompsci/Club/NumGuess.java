package com.apcompsci.Club;

import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.util.*;
import java.io.*;
/**
 * Write a description of class Orange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumGuess 
{
     private static int newsal;
     private static int newsal1;
     private static int newsal2;
     private static int newsal3;
public static void main(String args[]){
    Random r = new Random();
    String enter;
    int s, again;
    int number = r.nextInt(100) + 1;
        
    do{   
        JOptionPane.showMessageDialog(null,"Welcome to a number guessing game - BETA 0.2");
        
        enter = JOptionPane.showInputDialog("Enter a number between 1 - 100 then press enter. (Do not use letters or other character's)" + number);
        s = Integer.parseInt(enter);
      
        if(s > 100){
            JOptionPane.showMessageDialog(null,"WHAT ARE YOU DOING, A NUMBER BETWEEN 1 - 100 ONLY!!!");
            System.exit(0);
        }
        else if(s < 1){
            JOptionPane.showMessageDialog(null,"WHAT ARE YOU DOING, A NUMBER BETWEEN 1 - 100 ONLY!!!");
            System.exit(0);
        }

        
        else if(number == s){
          JOptionPane.showMessageDialog(null,"Nice, you got the correct answer");
          JOptionPane.showMessageDialog(null,"LEADERBOARDS!!!!");
          JOptionPane.showMessageDialog(null,"1: Nikhil");
        }
        
        
       
        else if(number != s){
            JOptionPane.showMessageDialog(null,"You didn't get the right answer, bad");
        }
        
        JOptionPane.showMessageDialog(null,"Tell owner to put you in the leaderboards if you won");
        again = JOptionPane.showConfirmDialog(null,"Would you like to go again?");
      }
        while(again == JOptionPane.YES_OPTION);  
    }
}
