package com.apcompsci.Club;

import java.util.Scanner;

public class Alphabet {
	public static void main(String... a) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Tell me a string");
		String s = scan.nextLine();
	    int i=0;
	    for(char c : s.toCharArray()) {
	        int x = Character.toUpperCase(c);
	        if (x >= 'A' && x <= 'Z') {
	            i |= 1 << (x - 'A');
	        }
	    }
	    if (i == (i | ((1 << (1 + 'Z' - 'A')) - 1))) {
	        System.out.println("Yes, this phrase contains all the letters of the alphabet");
	    }
	    else{
	    	System.out.println("No, it doesn't contain all the letters of the alphabet");
	    }
	}
}
