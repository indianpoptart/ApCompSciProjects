package com.apcompsci.twoArr;

public class TwoDArray {
	public static int [][] ten = new int[10][10];
	public static int i;
	public static int x;
	public static int lower;
	public static int upper;
	public static int upperBound=891;
	public static int lowerBound=672;


	public static void main(String[] args) {
		System.out.println("                    ");
		System.out.println("Populate the array");
		System.out.println("--------------------");
		populate();
		//print populated array
		print();
		//right
		shiftRight();
		print();
		//left
		shiftLeft();
		print();
		//up
		shiftUp();
		print();
		//down
		shiftDown();
		print();
		//changebounds
		changeBounds(250, 300);
		print();
		//reset
		reset();
		print();
	}


	public static int[][] reset(){
		System.out.println("                    ");
		System.out.println("Reset the array to 0");
		System.out.println("--------------------");
		for(int x=0;x<10;x++){
			for(int i =0; i<10;i++){
				ten[x][i] = 0;
			}	
		}
		System.out.println("                    ");
		return ten; 
	}
	public static int[][]  populate(){
		for(int x=0;x<10;x++){

			for(int i =0; i<10;i++){
				ten[x][i] = ((int)(Math.random()*(upperBound-lowerBound+1)+lowerBound));
			}	
		}
		System.out.println("                    ");
		return ten; 
	}
	public static int[][] shiftRight(){
		System.out.println("                    ");
		System.out.println("Shift right");
		System.out.println("--------------------");
		for(int x=9;x>=0;x--){
			int upper = ten[x][9];

			for(int i =9; i>0;i--){
				ten[x][i] = ten[x][i-1];
			}	
			ten[x][0]=upper;
		}
		System.out.println("                    ");
		return ten;
	}
	public static int[][] shiftLeft(){
		System.out.println("                    ");
		System.out.println("Shift the columns left");
		System.out.println("--------------------");
		for(int x=0;x<9;x++){
			int upper = ten[0][x];

			for(int i =0; i<9;i++)
			{
				ten[i][x] = ten[i][x+1];

			}	
			ten[9][x]=upper;
		}
		System.out.println("                    ");
		return ten;

	}
	public static int[][] shiftUp(){
		System.out.println("                    ");
		System.out.println("Shift the rows up");
		System.out.println("-----------------------------");
		for(int x=0;x<9;x++)
		{
			int upper = ten[0][x];

			for(int i =0; i<9;i++)
			{
				ten[i][x] = ten[i+1][x];

			}	
			ten[9][x]=upper;
		}
		System.out.println("                    ");
		return ten;

	}
	public static int[][] shiftDown(){
		System.out.println("                    ");
		System.out.println("Shift the rows down");
		System.out.println("-----------------------------");
		for(int x=0;x<9;x++){
			int upper = ten[9][x];

			for(int i =9; i>0;i--){
				ten[i][x] = ten[i-1][x];

			}	
			ten[0][x]=upper;
		}
		System.out.println("                    ");
		return ten;

	}
	public static void changeBounds(int newLow, int newHigh){
		System.out.println("\n");
		System.out.println("                    ");
		System.out.println("Changing Bounds");
		System.out.println("-----------------------------------------");
		lowerBound=newLow;
		upperBound=newHigh;
		populate();
		
	}
	public static void print(){
		for(int x=0;x<10;x++)
		{
			System.out.println("\n");
			for(int i =0; i<10;i++)
			{
				
				System.out.print(ten[x][i]+ " ");
			}

		}
	}
}