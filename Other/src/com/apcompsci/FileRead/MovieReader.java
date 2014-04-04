package com.apcompsci.FileRead;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MovieReader {
	public static void main (String [] args) throws FileNotFoundException, IOException{

		Scanner scan  = new Scanner(System.in);

		System.out.println("Pick your file");
		//String fileName = IO.openFile();
		String fileName = scan.nextLine();
		System.out.println("Tell me a movie title");
		String movieTitle = scan.nextLine();

		//Search String
		String searchText = movieTitle; 

		//File to search (in same directory as .class file)
		fileName = fileName + ".txt"; 
		if(!fileName.contains("/")){
			System.out.println("WHERE IS THIS FILE LOCATED, " + fileName + " doesn't have a / or dir");
			fileName = scan.nextLine();
		}
		String movies[] = fileName.split("/n");
		//System.out.println(fileName);
		Scanner scanner = new Scanner(System.in); 
		File file = new File(fileName + ".txt");

		try {
		    Scanner scanner1 = new Scanner(file);
		} catch(FileNotFoundException e) { 
		    System.out.println("File not Found");
		}
		//now read the file line by line...
		int lineNum = 0;
		while (scanner.hasNextLine()) {
		    String line = scanner.nextLine();
		    lineNum++;
		    if(movieTitle.equalsIgnoreCase(line)) { 
		        System.out.println("ho hum, i found it on line " +lineNum);
		    }
		}
		

		//creates stringbuilder
		StringBuilder sb = new StringBuilder();

		try {
			//Create the buffered input stream, which reads 
			//from a file input stream

			BufferedInputStream bIn = 
					new BufferedInputStream(
							new FileInputStream(fileName));

			//Holds the position of the last byte we have read
			int pos = 0; 

			//Holds #of available bytes in our stream 
			//(which is the file)
			int avl = bIn.available(); 

			//Read as long as we have something
			while ( avl != 0 ) {

				//Holds the bytes which we read
				byte[] buffer = new byte[avl];

				//Read from the file to the buffer
				bIn.read(buffer, pos, avl); 

				//Update the last read byte position
				pos += avl; 

				//Create a new string from byte[] we read
				String strTemp = 
						new String(buffer);

				//Append the string to the string builder
				sb.append(strTemp);

				//Get the next available set of bytes
				avl = bIn.available(); 
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

		String fileText = sb.toString();
		

		//Displays the index location in the file for a given text. 
		if(movieTitle.equalsIgnoreCase(searchText)){
			System.out.println("That is correct, " + fileText + " is a valid movie title");
		}
		else{
			System.out.println("You idiot, " + fileText + " is not a movie title");
		}
		
	}

}












