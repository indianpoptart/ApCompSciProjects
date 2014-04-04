package com.apcompsci.Dice;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class clueJrDice {
	public static void main(String[] args) throws InterruptedException{
		Random randomNumbers = new Random();
		int totalScores = 0;
		int totalScores2 = 0;
		UIManager UI=new UIManager();
		final ImageIcon one = new ImageIcon("/APCompSci/src/com/apcompsci/Dice/1.gif");
		final ImageIcon two = new ImageIcon("/APCompSci/src/com/apcompsci/Dice/2.gif");
		final ImageIcon three = new ImageIcon("/APCompSci/src/com/apcompsci/Dice/3.gif");
		final ImageIcon four = new ImageIcon("/APCompSci/src/com/apcompsci/Dice/4.gif");
		final ImageIcon five = new ImageIcon("/APCompSci/src/com/apcompsci/Dice/5.gif");
		final ImageIcon six = new ImageIcon("/APCompSci/src/com/apcompsci/Dice/6.gif");
		final ImageIcon move = new ImageIcon("/APCompSci/src/com/apcompsci/Dice/move.gif");
		final ImageIcon moveT = new ImageIcon("/APCompSci/src/com/apcompsci/Dice/move.gif");
		while(totalScores < 100 || totalScores2 < 100){
			JOptionPane.showMessageDialog(null, 
					null, 
					"Press Enter", 
					JOptionPane.INFORMATION_MESSAGE,
					new ImageIcon(clueJrDice.class.getResource("move.gif")));
			int dice = randomNumbers.nextInt(6) + 1;
			System.out.println("\f");
			if(dice == 1){
				
				JOptionPane.showMessageDialog(null, 
						null, 
						"You rolled a 1", 
						JOptionPane.INFORMATION_MESSAGE,
						new ImageIcon(clueJrDice.class.getResource("1.gif")));
				
			}
			else if(dice == 2){
				JOptionPane.showMessageDialog(null, 
						null, 
						"You rolled a 2", 
						JOptionPane.INFORMATION_MESSAGE,
						new ImageIcon(clueJrDice.class.getResource("2.gif")));
			}
			else if(dice == 3){
				JOptionPane.showMessageDialog(null,null, "You rolled a 3", 
						JOptionPane.INFORMATION_MESSAGE,
						new ImageIcon(clueJrDice.class.getResource("3.gif")));
			}
			else if(dice == 4){
				JOptionPane.showMessageDialog(null, 
						null, 
						"You rolled a 4", 
						JOptionPane.INFORMATION_MESSAGE,
						new ImageIcon(clueJrDice.class.getResource("4.gif")));
			}
			else if(dice == 5){
				JOptionPane.showMessageDialog(null, 
						null, 
						"You rolled a 5", 
						JOptionPane.INFORMATION_MESSAGE,
						new ImageIcon(clueJrDice.class.getResource(dice +".gif")));
			}
			else if(dice == 6){
				JOptionPane.showMessageDialog(null, 
						null, 
						"You rolled a 6", 
						JOptionPane.INFORMATION_MESSAGE,
						new ImageIcon(clueJrDice.class.getResource(dice +".gif")));
				}
		}

	}
}

