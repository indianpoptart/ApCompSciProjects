package com.apcompsci.GroupProject;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Joption {
	public static void main(String[] args){
		int x = 1;
		while(x == 1){
			UIManager.put("OptionPane.background",new ColorUIResource(154,154,158));
			UIManager.put("Panel.background",new ColorUIResource(154,154,158));
			String name = JOptionPane.showInputDialog(null, "What is your name?", "Enter your Name", JOptionPane.INFORMATION_MESSAGE);
			String bday = JOptionPane.showInputDialog(null, "What is your date of birth", "Enter your DOB", JOptionPane.INFORMATION_MESSAGE);
			String occupation = JOptionPane.showInputDialog(null, "What is your occupation", "Enter your occupation", JOptionPane.INFORMATION_MESSAGE);
			int z = JOptionPane.showConfirmDialog(null, "Is this correct?" + "\n" + "Name: " + name + "\n" + "DOB: " + bday + "\n" +"Occupation: " + occupation, "Output", JOptionPane.INFORMATION_MESSAGE);
			if(z == 0){
				System.exit(0);
			}
			else if(z == 1){
				x = 1;
			}
			else if(z == 2){
				System.exit(0);
			}
		}
	}

}
