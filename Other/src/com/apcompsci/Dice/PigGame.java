package com.apcompsci.Dice;

import java.util.*;
import java.io.*;
public class PigGame 
{
	public static void main(String[] args)
	{
		int turnScores = 0;
		int totalScores = 0;
		int turnScores2 = 0;
		int totalScores2 = 0;
		int dice;
		int dice2;
		String input = "r";
		char repeat;

		Scanner keyboard = new Scanner(System.in);

		Random randomNumbers = new Random();

		System.out.println("Welcome to the game of Pig!\n");

		while(totalScores < 100 || totalScores2 < 100)
		{
			//human's turn
			do
			{
				dice = randomNumbers.nextInt(6) + 1;

				System.out.println("You rolled: " + dice);

				if(dice == 1)
				{
					turnScores = 0;
					System.out.print("Your lose your turn!");
					System.out.println("Your Total is " + totalScores);
					break;
				}
				else
				{         
					turnScores += dice;
					System.out.print("Your turn score is " + turnScores);
					System.out.println(" and your total scores is " + totalScores);
					System.out.println("If you hold, you will have " + turnScores 
							+ " points.");
					System.out.println("Enter 'r' to roll again, 'h' to hold.");
					input = keyboard.nextLine();
					repeat = input.charAt(0);

					if(repeat == 'h')
					{
						break;
					}
				}
			}
			while(input.equalsIgnoreCase("r") || dice != 1);               

			totalScores += turnScores;
			System.out.println("Your score is " + totalScores);
			if(totalScores >= 100)
			{
				System.out.println("Your total score is " + totalScores);
				System.out.println("YOU WIN!");
				break;            
			}

			//computer's turn
			System.out.println();
			System.out.println("It is the compuer's turn.");
			do
			{
				dice2 = randomNumbers.nextInt(6) + 1; 
				System.out.println("The computer rolled: " + dice2);

				if(dice2 == 1)
				{
					turnScores2 = 0;
					System.out.print("The computer lost its turs!");
					System.out.println(" Computer total is " + totalScores2);
					break;             
				}
				else
				{
					turnScores2 += dice2;
					if(turnScores2 >= 20 || (totalScores2 + turnScores2) >= 100 )
					{
						System.out.println("The computer holds");
						break;      
					}
				}
			}
			while(dice2 != 1 || turnScores2 < 20);
			totalScores2 += turnScores2;
			System.out.println("The computer's scores is " + totalScores2 + "\n");

			if(totalScores2 >= 100);
			{
				System.out.println("THE COMPUTER WINS!");
				break;
			}
		}

	}
}