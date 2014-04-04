package com.nikhilparanjape.matryoshka;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Matryoshka {
	public Matryoshka innerDoll;
	public String dollName;
	public Color hairColor;
	public boolean wearingHat;
	static ArrayList<String> dollList = new ArrayList<String>();
	static ArrayList<String> sortList = new ArrayList<String>();
	static String[] dArray = null;
	public Matryoshka()// default doll
	{
		innerDoll = null;
		dollName = "Default";
		hairColor = java.awt.Color.ORANGE;
		wearingHat = false;
	}
	public Matryoshka(Matryoshka innerDoll, String name, Color hair, boolean hat){
		this.innerDoll = innerDoll;
		dollName = name;
		hairColor = hair;
		wearingHat = hat;
		for(int i = 0; i < 1; i++){
			dollList.add(dollName);
		}
	}

	public boolean hasInnerDoll(){
		if(this.innerDoll != null){
			return true;
		}
		else{
			return false;
		}
	}

	public Matryoshka getInnerDoll(){
		return this.innerDoll;
	}

	public int howManyDolls(){
		if(hasInnerDoll() == false){
			return 1;
		}
		return 1 + innerDoll.howManyDolls();
	}

	public int howManyWearingHat(){
		/*
		 * this method returns a count of 
		 * how many dolls there are wearing hats.
		 */
		if(this.wearingHat && innerDoll == null){
			return 1;
		}
		if(innerDoll == null){ 
			return 0;
		}
		if(wearingHat == true){
			return 1 + innerDoll.howManyWearingHat();
		}
		return innerDoll.howManyWearingHat();
	}

	public int redHeadCount(){
		/*
		 * returns a count of how many dolls
		 * there are where the hair field is set to
		 * java.awt.Color.RED
		 */
		if(hairColor.equals(java.awt.Color.RED) && innerDoll == null){
			return 1;
		}
		if(innerDoll == null){
			return 0;
		}
		if(hairColor.equals(java.awt.Color.RED)){
			return 1 + innerDoll.redHeadCount();
		}
		return innerDoll.redHeadCount();
	}
	public String toString(){ // outputs the info
		String output = "";
		output += "There are " + this.howManyDolls()+ " Dolls: " +  "\n";
		output += this.howManyWearingHat() + " dolls are wearing hats: " +  "\n";
		output += this.redHeadCount() +" dolls are red heads:" + "\n";
		output += "List of Unsorted Names: " + dollList + "\n";
		output += "Last Name: " + innerDoll.lastName() + "\n";
		return output;
	}
	public String lastName(){
		if (innerDoll == null){
			return dollName; // return normal doll name from list
		}
		String tempName = innerDoll.lastName(); // creates a temp name from current last name to compare
		if (dollName.compareToIgnoreCase((tempName))>0){ //compares temp name to the doll name from mat runner
			return dollName;
		}
		else{
			return tempName; // return temp last name of doll
		}

	}

}



