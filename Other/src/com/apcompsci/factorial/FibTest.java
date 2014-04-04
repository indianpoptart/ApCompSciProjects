package com.apcompsci.factorial;

import java.util.ArrayList;
import java.util.Scanner;

public class FibTest{
	public static void main(String[] a) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Term of sequence");
		int leg = sc.nextInt();
		System.out.println(fibonacciSequence(leg));
	}
	public static int fibonacciSequence(int n)  {
		
		if (n == 0 || n == 1){
			return n;
		}
		else{
			return fibonacciSequence(n-1) + fibonacciSequence(n-2);
		}
		

	}
}


