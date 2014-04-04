package com.apcompsci.Band;
/**
 * Nikhil Paranjape
 */



import java.util.ArrayList;
import java.util.Scanner;

public class HallOfFame {
	private static final Object[] String = null;
	private static Scanner scan;
	static ArrayList<Band> bandList = new ArrayList();

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		hall();
	}
	//search menu method
	private static void search(){
		System.out.println("What would you like to search");
		System.out.println("A: Band Name");
		System.out.println("B: Band Genre");
		System.out.println("C: Other");
		System.out.println("D: Main Menu");
		searchMenu();
	}
	private static void searchMenu(){
		if(bandList.size() == 0){
			System.out.println("There are no bands in the hall of fame");
			System.out.println("Please consider adding a band");
			addBand();
		}
		String searchResponse = scan.next();
		if(searchResponse.equalsIgnoreCase("A")){
			searchName();
		}
		else if(searchResponse.equalsIgnoreCase("B")){
			searchGenre();
		}
		else if(searchResponse.equalsIgnoreCase("C")){
			searchOther();
		}
		else if (searchResponse.equalsIgnoreCase("D")){
			hall();
		}
	}
	private static void searchName(){

		System.out.println("Tell me the band name");
		String nameOfBand = scan.next();
		System.out.println(bandList.size());
		for(int i = 0; i < bandList.size(); i++){
			if(bandList.get(i).getName().equals(nameOfBand)){
				System.out.println("That band is in the list");
				break;
			}
			else if(!bandList.get(i).equals("Name: " + nameOfBand)){
				System.out.println("That band is not in the list");
				System.out.println(bandList.get(i));
				break;
			}

		}
		hall();


	}
	private static void searchGenre(){

		System.out.println("Tell me genre");
		String genreOfBand = scan.next();
		for(int i = 0; i < bandList.size(); i++){
			if(bandList.get(i).getGenre().equals(genreOfBand)){
				System.out.println(bandList.get(i).getName() + " is a " + genreOfBand + " band");
				break;
			}
			else if(!bandList.get(i).equals(genreOfBand)){
				System.out.println("That genre is not in the list");
				break;
			}

		}
		search();
	}
	private static void searchOther(){
		System.out.println("Please note, this may not work properly");
		System.out.println("Tell me something to search");
		String searchResponse = scan.next();
		if(searchResponse.equalsIgnoreCase("activity")){
			System.out.println("Active or not active");
			String isActive = scan.nextLine();
			for(int i = 0; i < bandList.size(); i++){
				if(bandList.get(i).getActive() == true){
					System.out.println(bandList.get(i).getName() + " is " + isActive);
					break;
				}
				else if(!bandList.get(i).getActive() == false){
					System.out.println(bandList.get(i).getName() + " is not active");
					break;
				}

			}
		}
		else if(searchResponse.equalsIgnoreCase("number of members")){
			System.out.println("How many members");
			int members = scan.nextInt();
			for(int i = 0; i < bandList.size(); i++){
				if(bandList.get(i).getAlbums() == members){
					System.out.println(bandList.get(i).getName() + " has " + members + " members");
					break;
				}

			}
		}
		else if(searchResponse.equalsIgnoreCase("number of songs")){
			System.out.println("How many songs");
			int songNum = scan.nextInt();
			for(int i = 0; i < bandList.size(); i++){
				if(bandList.get(i).getAlbums() == songNum){
					System.out.println(bandList.get(i).getName() + " has " + songNum + " songs");
					break;
				}

			}
		}
		else if(searchResponse.equalsIgnoreCase("number of albums")){
			System.out.println("How many albums");
			int albNum = scan.nextInt();
			for(int i = 0; i < bandList.size(); i++){
				if(bandList.get(i).getAlbums() == albNum){
					System.out.println(bandList.get(i).getName() + " has " + albNum + " albums");
					break;
				}

			}
		}


	}

	//main menu method
	public static void hall(){
		if (bandList.size() == 0){
			System.out.println("The hall of fame is currently empty");
			System.out.println("Before continuing, please consider adding a band");
			addBand();
		}
		System.out.println("What would you like to do");
		System.out.println("A: Add Band");
		System.out.println("B: Remove Band");
		System.out.println("C: Edit Band");
		System.out.println("D: Clear Hall of Fame");
		System.out.println("E: Search");
		System.out.println("F: Quit");

		if(bandList.size() > 0){
			if(bandList.size() == 1){
				System.out.println("The hall of fame has " + bandList.size() + " band in it");
				menuAnswer();
			}
			else{
				System.out.println("The hall of fame has " + bandList.size() + " bands in it");
				menuAnswer();
			}
		}



	}
	public static void menuAnswer(){
		String answer = scan.nextLine();

		if(answer.equalsIgnoreCase("A")){
			addBand();
		}
		//removes a specific band from the hall of fame
		else if(answer.equalsIgnoreCase("B")){
			removeBand();
		}

		else if(answer.equalsIgnoreCase("C")){
			editBand();

		}
		//erases hall of fame list
		else if(answer.equalsIgnoreCase("D")){
			clearHallOfFame();
		}
		else if(answer.equalsIgnoreCase("E")){
			search();
		}
		else if(answer.equalsIgnoreCase("F")){
			System.exit(0);
		}
	}
	public static void addBand(){
		System.out.println("Tell me the band name");
		String name = scan.nextLine();
		Band b1 = new Band(name);
		bandList.add(b1); 
		System.out.println("What genre is " + name);
		String genreOfBand = scan.next();
		b1.setGenre(genreOfBand);
		System.out.println("How many members are there in " + name + "?");
		int numberOfMembers = scan.nextInt();
		b1.setNumberOfMembers(numberOfMembers);
		System.out.println("How many albums does " + name + " have");
		int albumCount = scan.nextInt();
		b1.setAlbums(albumCount);
		System.out.println("How many total songs does " + name + " have");
		int songCount = scan.nextInt();
		b1.setNumberOfSongs(songCount);			
		System.out.println("Is this band active? Y/N");
		String active = scan.next();
		if(active.equalsIgnoreCase("Y") || active.equalsIgnoreCase("Yes")){
			b1.isActive(true);
			hall(); // goes back to main menu
		}
		else{
			b1.isActive(false);
			hall(); // goes back to main menu
		}

	}
	//asks user which band they want to edit
	public static void editBand(){
		if(bandList.size() == 0){
			System.out.println("There are no bands to edit.");
			System.out.println("Please add a band");
			addBand();
		}

		System.out.println("What band would you like to edit");
		String name = scan.nextLine();
		Band b2 = new Band(name);
		for(int i = 0; i < bandList.size(); i++){

			if(bandList.get(i).getName().equals(name)){
				System.out.println("What do you want to edit about the band");
				String response = scan.nextLine();
				if(response.equalsIgnoreCase("Genre")){
					System.out.println("What do you want to change the genre to");
					String genreOfBand = scan.next();
					b2.setGenre(genreOfBand);
				}
				else if(response.contains("members")){
					System.out.println("How many members are there in " + name + "?");
					int numberOfMembers = scan.nextInt();
					b2.setNumberOfMembers(numberOfMembers);
				}
				else if(response.contains("songs")){
					System.out.println("How many total songs does " + name + " now have");
					int songCount = scan.nextInt();
					b2.setNumberOfSongs(songCount);	
				}
				else if(response.contains("albums")){
					System.out.println("How many albums does " + name + " have");
					int albumCount = scan.nextInt();
					b2.setAlbums(albumCount);
				}
				else if(response.contains("active")){
					if(bandList.get(i).getActive() == true){
						System.out.println("Is the band no longer active? Y/N");
						String activeR = scan.nextLine();
						if(activeR.equalsIgnoreCase("y")){
							b2.isActive(false);
						}
						else{
							editBand();
						}
					}
					else if(bandList.get(i).getActive() == false){
						System.out.println("Is the band active again? Y/N");
						String activeR = scan.nextLine();
						if(activeR.equalsIgnoreCase("y")){
							b2.isActive(true);
						}
						else{
							editBand();
						}
					}

				}
				String bandInfo = b2.toString();
				hall();
			}
			else if(!bandList.get(i).equals(name)){
				System.out.println("That band is not in the list");
				System.out.println(bandList.get(i));
				editBand();
			}

		}
		hall();
	}
	public static void removeBand(){
		System.out.println("What is the band name you want to remove");
		String nameOfBand = scan.next();
		for(int i = 0; i < bandList.size(); i++){
			if(bandList.get(i).getName().equals(nameOfBand)){
				System.out.println("Are you sure you want to remove that band? Y/N");
				String response = scan.nextLine();
				if(response.equalsIgnoreCase("y")){
					bandList.remove(i);
				}
				else if(response.equalsIgnoreCase("N")){
					System.out.println("That band was not removed");
				}
				break;
			}
			else if(!bandList.get(i).equals("Name: " + nameOfBand)){
				System.out.println("That band is not in the list");
				System.out.println(bandList.get(i));
				break;
			}
		}
		hall();

	}
	public static void clearHallOfFame(){
		//Asks user if they really want to remove the hall of fame
		System.out.println("Are you sure you want to erase the hall of fame. Y/N");
		String eraseAnswer = scan.next();
		if(eraseAnswer.equalsIgnoreCase("Y")){
			bandList.clear();
			System.out.println("You have deleted the hall of fame");
			hall();
		}
		else if(eraseAnswer.equalsIgnoreCase("N")){
			hall();
		}
	}

}
