package com.apcompsci.Dice;

import java.util.*;
import java.io.*;
/**
 *
 * 
 * @author Nikhil Paranjape 
 * @version 1/8/13 v.2.1
 */
public class Main
{
    public static void main(String [] args){
        try{
                Random r = new Random();
                boolean rolldie = false;
                PigGame game = new PigGame();
                Scanner scan = new Scanner(System.in);
                int inputside;
                String name;
            
                System.out.println("What is your name");
                name = scan.nextLine();
                if(name.equalsIgnoreCase(" ")){
                    System.out.println("Hello " + name);
                }
                else if(name.equalsIgnoreCase(name)){
                    name.equals("Unnamed");
                    System.out.println("Hello");
                }
                while(!rolldie){
                    int comproll = r.nextInt(6) + 1;
                    System.out.println("TEll me your input for die. A number from 1-6");
                    inputside = scan.nextInt();
                    if(inputside < 1){
                        System.out.println("Invalid");
                        System.exit(0);
                    }
                    else if(inputside > 6){
                        System.out.println("Invalid");
                        System.exit(0);
                    }
                    else{
                        System.out.println("Ok");
                    }
        
            
                    if(inputside == comproll){
                        System.out.println("   ");
                        System.out.println("   ");
                        System.out.println("TIE");
                        System.out.println("   ");
                        System.out.println("   ");
                    }
                    else if(inputside  < comproll){
                        System.out.println("   ");
                        System.out.println("   ");
                        System.out.println("Computer rolled the higher amount, COMPUTER WINS");
                        System.out.println("Computer rolled " + comproll);
                        System.out.println("   ");
                        System.out.println("   ");
                    }
                    else if(inputside > comproll){
                        System.out.println("   ");
                        System.out.println("   ");
                        if(name.equalsIgnoreCase(" ")){
                            System.out.println(name + " Wins!!");
                        }
                        else if(name.equalsIgnoreCase(" ")){
                            System.out.println("Unnamed Wins!!");
                        }
                        
                        System.out.println("Computer rolled " + comproll);
                        System.out.println("   ");
                        System.out.println("   ");
                    }
                    else if(inputside == 0){
                        System.exit(0);
                    }
            
            
            
            
            
                }
            }
                catch(Exception e){
                    System.out.println("Quitting"); 
                }
            }
        }