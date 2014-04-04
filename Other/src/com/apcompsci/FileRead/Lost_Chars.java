package com.apcompsci.FileRead;

import java.util.Scanner;

public class Lost_Chars
{
    public static void main (String []args)
    {
       
       
       String[] characters = {"Ben","Charlie","Claire","Desmond","Hurley","Jack","Jin","Juliet","Kate","Locke","Sawyer","Sayid","Sun"};
       String name; 
       boolean found = false; 
       Scanner scan = new Scanner(System.in);
       System.out.println("Tell me a name from lost"); 
       name = scan.nextLine();
       
     for (String names : characters)
     {
       if (name.equalsIgnoreCase(names))
       {
           found = true;
       }
       if (found)
       {
           System.out.println (name + " \nCorrect this person is on the show.");
           break;
       }
       else
       {
    	   
           System.out.println (name + "? Really, thats not a name from lost");
           break;
       }
              
     }
    }
}
