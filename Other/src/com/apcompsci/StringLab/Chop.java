package com.apcompsci.StringLab;

import java.util.Scanner;

public class Chop {
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	int midpoint = str.length() / 2;
	String secondHalf = str.substring(midpoint);
	System.out.println(secondHalf);
	}
}
