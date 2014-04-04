package com.apcompsci.Club;

import java.util.Scanner;


public class CreateAccount {
	private String username, password;
	private Scanner scan;
	private double bal;
	private int psLength;

	public CreateAccount (String u , String pass , double balance){
		username = u; 
		password = pass;
		bal = balance;
	}
	public  CreateAccount(double balance){

		scan =new Scanner(System.in);

		String epass, name;
		String regex = "^(?=.*?\\p{Lu})(?=.*?[\\p{L}&&[^\\p{Lu}]])(?=.*?\\d)" + "(?=.*?[`~!@#$%^&*()\\-_=+\\\\\\|\\[{\\]};:'\",<.>/?]).*$";

		boolean n = true;

		while(n) {
			System.out.println("What is your name");

			name= scan.next();
			System.out.println("Type in a username you want " + name);
			username= scan.next();
			System.out.println("Type in a password for your account");
			password= scan.next();
			if(!password.contains(regex)){
				System.out.println("Your password is unsecure, please try to add numbers, symbols, and case sensitive letters");
				System.out.println(regex);
				password = scan.next();
				if(!password.contains(regex)){
					System.out.println("Your password is unsecure, please try to add numbers, symbols, and case sensitive letters");
					System.out.println(regex);
					password = scan.next();
				}
			}
			epass= ""+password.charAt(0);
			for(int i = 0; i<password.length()-2; i++){
				epass += "*";
			}
			String woah = null;
			String regFind = null;
			//epass += password.charAt(password.length()-1);
			psLength = password.length();
			if(password.equalsIgnoreCase(regex)){
				regFind = "Wow, just using my regex string";
				System.out.println(regFind);
			}
			if(password.length() > 50){
				woah = "What is with the long password bro";
			}

			System.out.println("Verify that this is correct, " + name +" =======>"+ " Username: " + " "+ username  + " Password: " +" "+ epass);
			System.out.println("Your password is " + psLength + " units long");
			System.out.println(woah);
			System.out.println("If this is correct press y, if not n");
			String line1= scan.next();
			if (line1.equalsIgnoreCase("y")){
				n=false;

			}


		}
		System.out.println("Continue to add your deposit");

		System.out.println("Type in how much balance you would like, THESE ARE LOANS DONOT ENTER LARGE AMOUNTS");

		initialbal ();

	}
	private void initialbal(){
		try{
			bal = Double.parseDouble(scan.next());
			if (bal < 0){
				System.out.println("This is an illegal operation");
				initialbal ();
			}
			else if(bal > 10000000){

			}
			else{
				System.out.println("Okay, your account is set-up, you have: "+ "$" + bal + " in your account, please proceed f  or validation");
			}

		}
		catch(Exception e){
			System.out.println("Please enter valid number!");
			initialbal ();
		}
	}

	public void setBal(double bal1){
		bal= bal1;
	}
	public double getBal(){
		return bal;         
	}
	public String getUsername(){
		return username;            
	}
	public String getPassword(){
		return password;
	}
	public String accinfo(){
		return username + " " + password + " " + bal + "\n";
	}

}