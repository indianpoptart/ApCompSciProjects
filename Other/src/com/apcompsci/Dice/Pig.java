package com.apcompsci.Dice;

import java.util.Scanner;

public class Pig
{
   public static void main (String [] args)
   {
      Scanner scan = new Scanner(System.in);
      int totalScore = 0;
      String again = "y";
    	
      displayRules();
		
      while (again.equals("y"))
      {
         for (int turn = 1; turn <=5; turn++)
         {
            String response = "";
            System.out.println();
            System.out.println("Turn " + turn);
            int turnScore = 0;
    		
            do
            {   int roll = rollDie();
            	System.out.println("The roll is " + roll);
            	if (roll == 1)
            	    turnScore = 0;
            	else
            	{   turnScore = turnScore + roll;
                    System.out.print("Do you want to roll again? ");
                    response = scan.nextLine();
                }
            }
            while (response.equals("y") && turnScore>0);
        	
            System.out.println("Your score for this turn is " + turnScore);
            totalScore = totalScore + turnScore;
        }
        System.out.println();
        System.out.println("That's the game.");
        System.out.print("Your score was " + totalScore);
    	
        if (totalScore <= 30)
            System.out.println(", a poor score.");
        else if (totalScore <= 50)
            System.out.println(", an average score.");
        else 
            System.out.println(", an excellent score.");

        System.out.print("\nDo you want to play again? ");
        again = scan.nextLine();
     }
     System.out.println("Goodbye");

   }
	
    public static int rollDie()
    {
        return 1 + (int)(10*Math.random());
    }
	
    public static void displayRules()
    {
        System.out.println();
        System.out.println("Welcome to the Game of Pig");
        System.out.println();
        System.out.println("The object is to be the first to score 100 points.");
        System.out.println("For each turn, roll one 10-sided die.");
        System.out.println("If the roll is a 1 or a 2, the turn ends and no points are earned.");
        System.out.println("If the roll is anything else, you decide");
        System.out.println("if you want to roll again and again to earn more points to add to your score.");
        System.out.println();
        System.out.println("At the end of the game, Siri :) will evaluate your score.");
        System.out.println("Good luck.");
    }
}
