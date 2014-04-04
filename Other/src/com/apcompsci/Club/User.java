package com.apcompsci.Club;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

    private static String username, password;
    private static Scanner scan;
    private static ArrayList<CreateAccount> bankAccounts;
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        bankAccounts = new ArrayList<CreateAccount>(); 



        scan = new Scanner(System.in);
        login();
    }


    private static void helper (int bank){ 

        System.out.println("Validation Successful");
        System.out.println("What would you like to do");
        System.out.println("A: Deposit Money");
        System.out.println("B: Check Money");
        System.out.println("C: Withdraw Money");
        System.out.println("D: Sign Out");

        String answer = scan.next();
        if (answer.equalsIgnoreCase("A")){
            System.out.println("How much would you like to deposit? " + "You have $" + bankAccounts.get(bank).getBal());
            String dep = scan.next();
            while (Double.parseDouble(dep) < 0){
                System.out.println("This is an illegal operation!");
                System.out.println("Enter a good input");
                dep = scan.next();
            }
            System.out.println("You have added $" + dep + " to your account. ");
            bankAccounts.get(bank).setBal(bankAccounts.get(bank).getBal() + Double.parseDouble(dep));
            System.out.println("You have $" + bankAccounts.get(bank).getBal());
        }
        else if (answer.equalsIgnoreCase("B")){
            System.out.println("You have $" + bankAccounts.get(bank).getBal());
        }
        else if (answer.equalsIgnoreCase("C")){
            System.out.println("You currently have $" + bankAccounts.get(bank).getBal() + " How much do you want to withdraw");
            String with = scan.next();
            if (bankAccounts.get(bank).getBal()- Double.parseDouble(with) < 0){
                System.out.println("You have insufficient balance");
            }
            else{
                System.out.println("You have taken out $" + with + " to your account");
                bankAccounts.get(bank).setBal(bankAccounts.get(bank).getBal()- Double.parseDouble(with));
                System.out.println("You now have $" + bankAccounts.get(bank).getBal() + " in your account");
            }
        }
        if (!answer.equalsIgnoreCase("D")){
            helper(bank);
        }
        else{
            login();
        }


    }

    private static void login(){
        System.out.println("What would you like to do");
        System.out.println("A: Sign In");
        System.out.println("B: Create an Account");
        System.out.println("C: Load Bank Account file");
        System.out.println("D: Quit");
        String login = scan.next();
        if (login.equalsIgnoreCase("A")){
            System.out.println("Please enter in your username");
            username = scan.next();
            if (username.equalsIgnoreCase("QUIT")){
                login ();
            }
            else if (login.equalsIgnoreCase("A")){
                System.out.println("Please enter in your password");
                password = scan.next();
                boolean other=false;
                for (int bank = 0; bank<bankAccounts.size(); bank++){
                    System.out.println("User input: " + username + " " + password);
                    if (username.equals(bankAccounts.get(bank).getUsername()) && password.equals(bankAccounts.get(bank).getPassword())){
                        other = true;

                        helper (bank);
                    }

                }
                if (!other){
                    System.out.println("Invalid username or password, please enter it in again, or type QUIT to return to the login screen");
                    login ();

                }   
            }
        }
        else if (login.equalsIgnoreCase("B")){
            bankAccounts.add(new CreateAccount(0.0));
            helper (bankAccounts.size()-1);
        }
        else if (login.equalsIgnoreCase ("c")){
            String openFile = IO.openFile ();
            int spaceIndex1 = openFile.indexOf(" ");
            int spaceIndex2 = openFile.indexOf(" ", openFile.indexOf(" ")+1);
            /**
            System.out.println("from 0 to " + spaceIndex1 + " " + openFile.substring(0,spaceIndex1));
            System.out.println("from " + spaceIndex1 + " to " + spaceIndex2 + " " +openFile.substring(spaceIndex1, spaceIndex2));
            System.out.println("from " + spaceIndex2 + " to end" + openFile.substring(spaceIndex2));
            **/
            bankAccounts.add(new CreateAccount(openFile.substring(0,spaceIndex1).trim(), openFile.substring(spaceIndex1, spaceIndex2).trim(), Double.parseDouble(openFile.substring(spaceIndex2))));
            login ();
            
        }

        else if (login.equalsIgnoreCase("d")){
            String save = "";
            for(int i=0; i<bankAccounts.size(); i++){
                save += bankAccounts.get(i).accinfo();
            }
            IO.saveFile(save);
            IO.openFile();
        }
        else{
            System.out.println("That is not a valid option!");
            login ();

        }
        if (login.equalsIgnoreCase("Debug")){
            System.out.println("Welcome to Debug menu version 0.9.1b");
            System.out.println("You have encountered an error in the quit function, ask the Nikhil to fix this error");


        }


    }
}






