package com.java.fourk;

public class Poem {
	//1.Class Variables    
	private String nameOfPoem;
	private String authorName;
	private int numberOfLines;




	//2. Constructors
	public Poem(String name)
	{
		nameOfPoem = name;
	}

	public Poem(String name, String author)
	{

	}




	//3. Methods

	//setters
	public void setName(String newName)
	{
		nameOfPoem = newName;
	}
	public void setAuthor(String newAuthor)
	{
		authorName = newAuthor;
	}
	public void setLines(int lines){
		numberOfLines = lines;
	}

	//...

	//getters
	public String getName()
	{
		return nameOfPoem;
	}
	public String getAuthor(){
		return authorName;

	}
	public int getLines(){
		return numberOfLines;
	}
}
