package com.apcompsci.booleans;

import java.util.Scanner;
//Nikhil Paranjape 
//October 17 2013
public class LeapYear {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Tell me a year, and I will tell you if it is a leap year");
		int leapYear = scan.nextInt();
		if(leapYear < 1583 || leapYear > 9999){
			if(leapYear == 0){
				System.exit(0);
			}
			else{
				System.out.println("That is an invalid year");
			}
		}
		else if ((leapYear%4) == 0 && (leapYear%100) != 0 && (leapYear%400) != 0){
			System.out.println("The year " + leapYear + " is a leap year");
		}
		else if ((leapYear%100) == 0 && (leapYear%400) != 0){
			System.out.println("The year " + leapYear + " is not a leap year");
		}
		else if ((leapYear%100) == 0){
			System.out.println("The year " + leapYear + " is a leap year");
		}
		else{
			System.out.println("The year " + leapYear + " is not a leap year");
		}

	}
}
