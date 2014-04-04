package com.java.fourk;

import java.util.ArrayList;
import java.util.Scanner;


public class PoemChooser {
	static ArrayList<Poem> poemList = new ArrayList();
	private static Scanner scan;
	public static void main(String [] args){
		poemMenu();

	}
	public static void poemMenu(){
		scan = new Scanner(System.in);
		System.out.println("What would you like to do");
		System.out.println("A: Add Poem");
		System.out.println("B: Remove Poem");
		System.out.println("C: Choose a Random Poem");
		System.out.println("D: Clear Poem List");
		System.out.println("E: Search");
		System.out.println("F: Quit");
		String choice = scan.nextLine();
		if(choice.equalsIgnoreCase("A")){
			addPoem();
		}
		else if(choice.equalsIgnoreCase("B")){
			removePoem();
		}
		else if(choice.equalsIgnoreCase("C")){

		}
		else if(choice.equalsIgnoreCase("D")){
			poemList.clear();
		}
		else if(choice.equalsIgnoreCase("E")){
			System.out.println("What search would you like to do");
			System.out.println("A: Search by Name");
			System.out.println("B: Search by Keyword");
			//System.out.println("C: Choose a Random Poem");
			//System.out.println("D: Clear Poem List");
			choice = scan.nextLine();
			if(choice.equalsIgnoreCase("A")){
				searchList();
			}
			else if(choice.equalsIgnoreCase("B")){
				searchKeyword();
			}
		}
		else if(choice.equalsIgnoreCase("F")){
			System.exit(0);
		}
	}
	public static void addPoem(){
		System.out.println("Tell me a poem name");
		String poemEnter = scan.nextLine();
		Poem p1 = new Poem(poemEnter);
		poemList.add(p1);
		System.out.println("Tell me the author");
		String authorName = scan.nextLine();
		p1.setAuthor(authorName);
		System.out.println("How many lines does " + poemEnter + " have?");
		int lines = Integer.parseInt(scan.nextLine());
		p1.setLines(lines);
		poemMenu();
	}
	public static void removePoem(){
		System.out.println("What is the poem name you want to remove");
		String nameOfPoem = scan.next();
		for(int i = 0; i < poemList.size(); i++){
			if(poemList.get(i).getName().equals(nameOfPoem)){
				System.out.println("Are you sure you want to remove that poem? Y/N");
				String response = scan.nextLine();
				if(response.equalsIgnoreCase("y")){
					poemList.remove(i);
					poemMenu();
				}
				else if(response.equalsIgnoreCase("N")){
					System.out.println("That poem was not removed");
					poemMenu();
				}
				break;
			}
			else if(!poemList.get(i).getName().equals(nameOfPoem)){
				System.out.println("That poem is not in the list");
				System.out.println(poemList.get(i));
				poemMenu();
				break;
			}
		}
	}
	public static void searchList(){
		System.out.println("Tell me the poem name");
		String nameOfPoem = scan.next();
		for(int i = 0; i < poemList.size(); i++){

			if(poemList.get(i).getName().contains(nameOfPoem)){
				System.out.println("That poem is in the list");
				System.out.println(poemList.get(i).getName() + " was written by " + poemList.get(i).getAuthor() + " and has " + poemList.get(i).getLines() + " lines");
				poemMenu();
			}
			else if(!poemList.get(i).getName().contains(nameOfPoem)){
				System.out.println("That poem is not in the list");
				System.out.println(poemList.get(i).getName());
				poemMenu();
			}

		}
	}
	public static void searchKeyword(){
		System.out.println("Tell me a keyword");
		String keyword = scan.next();

		for(int i = 0; i < poemList.size(); i++){
			String letter = poemList.get(i).getName().substring(0,1);
			//System.out.println(letter);
			if(letter.equals(keyword)){
				System.out.println("That poem is in the list");
				System.out.println(poemList.get(i).getName() + " was written by " + poemList.get(i).getAuthor() + " and has " + poemList.get(i).getLines() + " lines");

			}
			else if(!letter.equals(keyword)){
				System.out.println("That poem is not in the list");
				System.out.println(poemList.get(i).getName());
				poemMenu();
			}
			else{
				poemMenu();
			}
		}
	}
}
