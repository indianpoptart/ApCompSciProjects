package com.apcompsci.Band;

/**
 * Nikhil Paranjape
 */

public class Band
{
    //1.Class Variables    
    private String nameOfBand;
    private String[] members;
    private String genreOfBand;
    private int numberOfMembers;
    private String nameOfMembers;
    private int numberOfSongs;
    private int numberOfAlbums;
    private boolean isActive;
    
    
    
    //2. Constructors
    public Band(String name)
    {
        nameOfBand = name;
    }
    
    public Band(String name, String genre, int numMem, int numSongs, int numAlbs, boolean isActive)
    {
        
    }
    
    
    
    
    //3. Methods
    
    //setters
    public void setName(String newName)
    {
        nameOfBand = newName;
    }
    
    public void setGenre(String s)
    {
        genreOfBand = s;
    }
    
    public void setNumberOfMembers(int num)
    {
        numberOfMembers = num;
    }
    public void setNameOfMembers(String names){
    	nameOfMembers = names;
    }
    
    public void setAlbums(int alb){
    	numberOfAlbums = alb;
    }
    public void setNumberOfSongs(int songs){
    	numberOfSongs = songs;
    }
    public void isActive(boolean active){
    	isActive = active;
    }
    
    public String toString(){
    	String output = "";
    	output += "Name: " + nameOfBand + "\n";
    	output += "Genre of " + nameOfBand + ": " + genreOfBand + "\n";
    	output += "Number of members: " + numberOfMembers + "\n";
    	output += "Name of members: " + nameOfMembers + "\n";
    	output += "Number of Songs: " + numberOfSongs + "\n";
    	output += "Number of Albums: " + numberOfAlbums + "\n";
    	String bandActive;
    	if(isActive == true){
    		bandActive = "active";
    	}
    	else{
    		bandActive = "not active";
    	}
    	output += "This band is " + bandActive;
    	return output;
    }
    public String searchName(){
    	String output = nameOfBand;
    	return output;
    }
    //...

    //getters
    public String getName()
    {
        return nameOfBand;
    }
    public String getGenre(){
    	return genreOfBand;
    }
    public int getAlbums(){
    	return numberOfAlbums;
    }
    public int getSongs(){
    	return numberOfSongs;
    }
    public int getNumberOfMembers(){
    	return numberOfMembers;
    }
    public boolean getActive(){
    	return isActive;
    }
    
    //...
}