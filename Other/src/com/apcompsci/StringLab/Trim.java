package com.apcompsci.StringLab;

import java.util.Scanner;

public class Trim {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Tell me a phrase to trim");
		String str = scan.nextLine();
		StringBuffer y = new StringBuffer (str);
		int x = y.length();
		y.replace((x-1), (x), ""); 
		y.replace(0, 1, ""); 
		System.out.println(y); 
	}
}
