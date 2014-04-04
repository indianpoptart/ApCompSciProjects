package com.apcompsci.ArrayFlip;

public class ArrayFlip {

	public static void main(String[] args) {
		int[] numbers = new int[51];
		int flip = 0;
		for(int i = 1; i < numbers.length; i++){
			numbers[i] = numbers[numbers.length - i - 1];  

			flip = numbers[numbers.length - i - 1];
			System.out.println("Normal : " + i);
		}
		System.out.println("         ");
		System.out.println("         ");
		System.out.println("         ");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println("Reverse : " + i);
		}


	}
	


}
