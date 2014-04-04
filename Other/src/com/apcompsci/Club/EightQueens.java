package com.apcompsci.Club;


public class EightQueens {
	private static final int BOARD_SIZE = 8;
	public static void main(String[] args) {
		int[] board = new int[BOARD_SIZE]; // Make a new array representing a chessboard
		recurse(board, 0); // Start with the empty board, first trying to place a queen in the first column
	}
 
	/**
	 * Recurse over a board and its possible permutations
	 * @param board
	 * @param column
	 */
	public static void recurse(int[] board, int column) {
		if (column == BOARD_SIZE) { // We've placed a queen in each column
			outBoard(board); // Print the board
		} else {
			for (int i = 0; i < BOARD_SIZE; i++) { // For each possible spot a queen can be in (0,1,2,3,4,5,6,7), try to find possible permutations from that spot
				board[column] = i; // store the row the queen is in as a spot in the array
				if (valid(board, column)) // Is the board valid (is every queen safe?)
					recurse(board, column+1); // Recursion! Yayyyyyyyyyyyyyyyyyyyyyyy!
			}
		}
 
	}
 
	/**
	 * Print an ASCII art representation of the board
	 * @param board The array representing the board
	 */
	public static void outBoard(int[] board) {
		for (int col = 0; col < BOARD_SIZE; col++) { // Iterate over each column in the board
			for (int row = 0; row < BOARD_SIZE; row++) { // Iterate over each possible row
				if (board[col] == row) // There is a queen in this row
					System.out.print("Q"); // "Q" stands for queen!
				else // There isn't a queen in this row
					System.out.print("x"); // "x" stands for, uh... no queen!
			}
			System.out.println();
		}
		System.out.println();
	}
 
	/**
	 * Check if a board is valid
	 * @param board An array representing a chessboard
	 * @param column An integer representing the last column with a queen in it
	 * @return boolean true if the board is valid up to this point, boolean false if it isn't.
	 */
	public static boolean valid(int[] board, int column) {
		for (int index = 0; index < column; index++) { // check all queen placements in the board
			if (board[index] == board[column]) // already a queen in this row on the board
				return false; // invalid board
			if ((board[index]-board[column]) == (column-index) || (board[column]-board[index]) == (column-index)) // there is a queen that can take another diagonally
				return false; // invalid board
		}
		return true;
	}
}