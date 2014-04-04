package com.apcompsci.Temperature;

import java.util.Scanner;

public class Temperature {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner (System.in);
		double[] Temps = new double[7];
		System.out.println("What were the week's temperatures?");
		for(int i = 0; i < Temps.length; i++){
			int z = i + 1;
			System.out.println("Day "+ z);
			double HTemps = scan.nextInt();
			Temps[i] = HTemps;
			
			
		}
		double average = Temps[0] + Temps[1] + Temps[2] + Temps[3] + Temps[4] + Temps[5] + Temps[6];
		double avg = average / 7;
		System.out.println(avg);
		

	}

}
