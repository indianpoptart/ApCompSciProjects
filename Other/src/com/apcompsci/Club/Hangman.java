package com.apcompsci.Club;

/*
 * File: Hangman.java
 * ------------------
 * Author: Matt Barackman (certain elements provided)
 * 
 * This program is an implementation of the game of Hangman using a side-by-side console and
 * graphics display. It is Assignment #4 in CS106A from Stanford.
 */

import java.awt.Canvas;

import acm.program.*;
import acm.util.*;

public class Hangman extends ConsoleProgram {


	/**
	 * Creates new instance of HangmanCavnas and adds it to window.
	 */
	
	public void init() {
		canvas = new HangmanCanvas();
		add(canvas);
		canvas.reset();
	}

	/**
	 * Initiates game and loops play until terminating condition is met.
	 */
	@Override
	public void run() {
		initiateGame();
		while (playOn()){
			playTurn();
		}
	}
	
	/**
	 * Returns true if terminating conditions are not yet met and false otherwise. If the 
	 * number of guesses_left is equal to zero the game ends in a loss. It prints the
	 * secret_word to the console and prints "You lose." If the current_word is equal to the
	 * secret_word, it means that you have guessed the secret word and you win. It prints the
	 * secret_word to the console and prints "You win." 
	 *  
	 */
	private boolean playOn(){
		//losing condition
		if (guesses_left == 0){
			println("The word was: " + secret_word);
			println("You lose.");
			return false;
		}
		//winning condition
		else if (current_word.equals(secret_word)){
			println("You guessed the word: " + secret_word);
			println("You win.");
			return false;
		}
		//play continues
		else {
			return true;
		}
	}
	
	/**
	 * Initiates the game by displaying a welcome message, retrieving a secret word 
	 * from the lexicon, setting it to secret_word, adding a "dashed" version of the 
	 * secret_word to the canvas, adding a "wrong guess" label to the canvas,
	 * and setting guesses_left equal to STARTING_GUESSES.
	 */
	private void initiateGame(){
		println("Welcome to Hangman!");
		getSecretWord();
		createBlankWord(secret_word);
		canvas.initLabels(current_word);
		guesses_left = STARTING_GUESSES;
		
	}

	/**
	 * Sets secret_word to a random secret word from the lexicon. 
	 */
	private void getSecretWord(){
		int i = rgen.nextInt(0,lexicon.getWordCount()-1);
		secret_word  = lexicon.getWord(i);
	}
	
	/**
	 * Sets current_word to a string the length of the secret word comprised of all dashes.
	 * This will be displayed to the user and updated with correct letters
	 * as they make progress.
	 */
	private void createBlankWord(String secret_word){
		current_word = "";
		for (int i=0; i<secret_word.length(); i++){
			current_word += "-";
		}
	}
	
	
	/**
	 * Runs through one guess/turn. It prints the player's progress and number of guesses left to
	 * the console. It reads in a guess and processes the guess.
	 */
	private void playTurn(){
		println("The word now looks like this: " + current_word);
		println("You have " + guesses_left + " guesses left.");
		Character guess = readLetterInput();
		processGuess(guess);
	}
	
	/**
	 * Returns the new guess as a Character. Reads in a character until it is a valid new guess.
	 * To be valid, it must be exactly one letter and it can't have been guessed before. It is also 
	 * case insensitive.
	 */
	private Character readLetterInput(){
		
		//prompts for guess and sets as str.
		String str = readLine("Please guess a letter: ");
		
		//ensures that guess is only one letter
		if (str.length() != 1){
			println("Your must guess exactly one letter. Try again. ");
			return readLetterInput();
		}
		
		//converts string to character
		Character ch = str.charAt(0);
		
		//ensures that the guess is a character
		if (Character.isLetter(ch) != true){
			println("You can only guess letters. Try again.");		
			return readLetterInput();
		}		
		ch = Character.toUpperCase(ch);
		
		//ensures that the guess has not been guessed previously
		if (guessed_letters.indexOf(ch) >= 0){
			println("You've already guessed the letters \"" + guessed_letters + "\". Try again. ");
			return readLetterInput();
		}
		
		//adds the guess to guessed letters.
		guessed_letters += ch;
		
		//returns guess
		return ch;
	}
	
	/**
	 * Processes a player's guess by iterating through the secret word
	 * and comparing the guess (Character) to each letter. If there is a hit, it replaces the
	 * appropriate dashes in the current_word on the canvas with the guessed letter. 
	 * Otherwise, it tells you via the console that there aren't any of the guessed letter
	 * in the secret word, it adds the incorrect letter to the wrong guesses area of the canvas, 
	 * it draws the next body part on the canvas, and decrements the number of guesses left.  
	 */
	private void processGuess(Character guess){
		int n = secret_word.length();
		boolean hit = false;
		
		// loops through the secret_word looking for hits.
		for (int i=0; i < n; i++ ){
			/* if hits is found, this substitutes the guessed letter for the correct dash 
			 * in the word in progress. 
			 */
			if (guess.equals(secret_word.charAt(i))){
				//replaces the appropriate dash with the guessed letter
				current_word =
					current_word.substring(0, i) //the current word up to the guess
					+ secret_word.charAt(i) //appends the guessed letter
					+ current_word.substring(i+1, n); //appends the current word after the guess 
				hit = true;
			}
		}
		if (hit){
			println("That guess is correct.");
		}
		
		//no hits
		else {
			println("There are no " + guess + "'s in the word.");
			guesses_left -= 1;
			wrong_guesses += guess;
			canvas.noteIncorrectGuess(guess);
		}
		canvas.displayWord(current_word);
	}

	/*Instance Variables*/
	private static final int STARTING_GUESSES = 8;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private HangmanLexicon lexicon = new HangmanLexicon();
	private String secret_word = "";
	private String current_word = "";
	private String guessed_letters = "";
	private String wrong_guesses = "";
	private int guesses_left;
	private HangmanCanvas canvas;
}