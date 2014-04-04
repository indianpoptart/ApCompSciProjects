package com.apcompsci.NumberTileFR;
public class NumberTile 
{
	public static int Right;
	public static int Top;
	public static int Bottom;
	public static int Left;

	public NumberTile(int Right, int Left, int Top,int Bottom)
	{
		this.Right = Right;
		this.Top = Top;
		this.Bottom = Bottom;
		this.Left = Left;
	}
	public void rotate() 
	{
		Top = Left;
		Right = Top;
		Bottom = Right;
		Left = Bottom;
	}
	public int getLeft() 
	{
		return Left;
	}

	public int getRight() 
	{
		return Right;
	}
}
