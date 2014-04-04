package com.apcompsci.Club;

/**
 * Testing the values of red
 * @author Nikhil Paranjape 
 * @version March 2013
 */
import java.applet.Applet;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.*;
public class ColorInputProgram extends Object
{
    private static Icon icon, error;
    public static void main(String args[]){
        try{
            String ColorInput;
            UIManager UI=new UIManager();
            final ImageIcon icon = new ImageIcon("painticon.png");
            final ImageIcon error = new ImageIcon("error.png");
            
            //sets default window color
            UIManager.put("OptionPane.background",new ColorUIResource(250,235,215));
            UIManager.put("Panel.background",new ColorUIResource(250,235,215));
            JOptionPane.showMessageDialog(null, "Welcome to Nikhil's color converter", "Program", JOptionPane.INFORMATION_MESSAGE, icon);
            ColorInput = JOptionPane.showInputDialog("Tell me a hex number color and I will make a color");
            if(ColorInput.equals("")){
            	JOptionPane.showMessageDialog(null, "Nothing was entered, try again", "ERROR!", JOptionPane.ERROR_MESSAGE);
            	ColorInput = JOptionPane.showInputDialog("Tell me a hex number color and I will make a color");
            }
            else if(!ColorInput.contains("#")){
            	ColorInput = '#' + ColorInput;
            	
            }
            
            //Converts hex into rgb so the computer can use it
            Color color = Color.decode(ColorInput);
            JOptionPane.showMessageDialog(null,"Your color awaits, press OK!");
            //NExt method sets the color of the window
            UIManager.put("OptionPane.background",new ColorUIResource(color));
            UIManager.put("Panel.background",new ColorUIResource(color));
            JOptionPane.showMessageDialog(null,"Here's your color","Color Window", JOptionPane.INFORMATION_MESSAGE, icon);
            UIManager.put("OptionPane.background",new ColorUIResource(250,235,215));
            
            UIManager.put("OptionPane.background",new ColorUIResource(250,235,215));
            UIManager.put("Panel.background",new ColorUIResource(250,235,215));
            int x = JOptionPane.showConfirmDialog(null,"Would you like the RGB menu?", "Information", JOptionPane.INFORMATION_MESSAGE);
            if(x == 0){
            	JOptionPane.showMessageDialog(null,color);
            }
            else if(x == 1){
            	
            }
            else{
            	JOptionPane.showMessageDialog(null,color);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "An error has occured!", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }
}