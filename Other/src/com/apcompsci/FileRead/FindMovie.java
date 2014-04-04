package com.apcompsci.FileRead;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FindMovie
{
	public static void main(String args[]) throws IOException {

		String str;

		Scanner sc = new Scanner( System.in );
		System.out.print("Enter movie title -> ");
		String searchFor = sc.nextLine();


		System.out.println("Tell me filename");
		String fileName = sc.nextLine();
		String loc = "/Users/nikhilparanjape/git/apcompsciprograms/APCompSci/src/com/apcompsci/FileRead/";
		if(!fileName.contains(".txt")){
			fileName = "/APCompSci/src/com/apcompsci/FileRead/" + fileName + ".txt";
		}
		else if(!fileName.contains(loc)){
			if(!fileName.contains(".txt")){
				fileName = loc + fileName + ".txt";
			}
			else{
				fileName = loc + fileName;
			}

		}
		FileReader fin = null;
		try{
			fin = new FileReader(fileName);
		}
		catch(FileNotFoundException e){
			System.out.println("Unable to locate " + fileName);
		}
		Scanner src = null;
		try{
			src = new Scanner(fin);
		}
		catch(NullPointerException e){
			System.out.println("Source is null");
			System.exit(0);
		}
		int count = 0;

		while (src.hasNext()) {
			String in = src.nextLine();
			if(in.indexOf(searchFor) >= 0) { 
				System.out.println(searchFor + "found on line " + count);
				break;
			}
			else if(in.indexOf(searchFor) == -1){
				System.out.println(searchFor + " is an invalid movie title");
				break;
			}
			count++;
		}
	}
}