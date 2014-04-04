package com.apcompsci.bizzbuzz;

public class BizzBuzz{

	/**
	 * @param args
	 * Nikhil Paranjape
	 * 9/4/13
	 * Period 3
	 */
	public static void main(String[] args) {
		for(int i =1; i <= 100; i++){
			
			if(i % 5 == 0 && i % 7 == 0){
				System.out.println(" BizzBuzz");
			}
			else if(i % 5 == 0){
				System.out.println("  Bizz");
			}
			else if(i % 7 == 0){
				System.out.println("   Buzz");
			}
			else if((i%11) == 0){
				System.out.println("\n" + "    " + i);
			}
			
			else{
				System.out.println("     " + i);
			}
		}
			
	}

}
