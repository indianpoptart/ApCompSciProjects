import java.util.Random;
import javax.swing.*;
import java.util.Scanner;

public class guess{

    public static void main(String[] args){
        try{
            Scanner scan = new Scanner(System.in);

            int intTarget;
            int intGuess;
            int round = 1;
            int intChoice=1;
            
            do {
                Random randomNumber = new Random();
                intTarget = randomNumber.nextInt(10) + 1;
                int intTries=0;
                System.out.println("                          ");
                do {
                    System.out.println("Round " + round++);
                    System.out.println("Please enter a guess: ");
                    intGuess = scan.nextInt();
                    System.out.println("Your guess is  " + intGuess);
                    if(intGuess < intTarget)
                    {
                        System.out.println("Your guess is too low!");
                        intTries++;
                    }
                    else if(intGuess > intTarget)
                    {
                        System.out.println("Your guess is too high!");
                        intTries++;
                    }
                    else
                    {
                        System.out.println("You guessed correct!");
                        intTries++;
                    }
                }
                while (intGuess != intTarget);

                System.out.println("You have guess correctly! It took you " + intTries + " tries to guess the number!");

                if(intTries == 1){
                    System.out.println("Either you hacked, or it was a lucky guess, but im still gonna quit you out");
                    System.exit(3000);
                }
                else if(intTries ==2){
                    System.out.println("Your GOOD");
                }
                else if (intTries >= 14){
                    System.out.println("ARE YOU BRIAN?");
                }
                else if(intTries >= 8){
                    System.out.println("You really are terrible");
                }
                else if(intTries >= 4){
                    System.out.println("Wow, U STINK");
                }

                System.out.println("Press 1 to quit");
                System.out.println();
                intChoice = scan.nextInt();
                if(intTries > 10){

                }
                else if(intTries < 10){

                }

            }
            while (intChoice != 1);
            System.out.println("Thanks for playing");

            System.exit(0);
        }
        catch(Exception e){
            System.out.println("We just caught you trying to crash this program, your going to the quarantine");
            System.exit(10000);
        }
    }
}