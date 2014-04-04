package com.apcompsci.GroupProject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class GroupSort {
	static ArrayList<Integer> sortList = new ArrayList<Integer>();
	static ArrayList<Integer> otherList = new ArrayList<Integer>();
	static ArrayList<String> stringList = new ArrayList<String>();
	private static Random rand;
	private static int saveName = 0;
	private static Scanner sc;
	public static void main (String[] args){
		stringList.add("Sorting .");
		menu();
	}
	public static void menu(){
		sc = new Scanner(System.in);
		System.out.println("What kind of sort would you like to do?");
		System.out.println("A: Selection Sort");
		System.out.println("B: Insertion Sort");
		String input = sc.nextLine();
		if(input.equalsIgnoreCase("A")){
			selectionSort();
		}
		else if(input.equalsIgnoreCase("B")){
			insertionSort();
		}
	}
	public static void selectionSort ()
	{
		
		rand = new Random();
		for(int i = 0; i < 50; i++){
			saveName = rand.nextInt(1000) + 1;
			System.out.println(saveName);
			sortList.add(saveName);
			otherList.add(saveName);
		}
		for( int k=0; k<sortList.size()-1; k++ )
        {
            // find the smallest value in sortList
            int minIndex = k;
            for( int j=k+1; j<sortList.size(); j++ )
            {	
            	
                if( sortList.get(j) < sortList.get(minIndex) )
                {
                    minIndex = j;
                }
            }
            
        	if(stringList.size() < 10){
        		System.out.print(stringList.get(k));
        		stringList.add(" .");
        	}
        	else{
        	
        	}
            // swap sortList[k] with sortList[minIndex]
            int temp = sortList.get(k);
            sortList.set( k, sortList.get(minIndex) );
            sortList.set( minIndex, temp );
        }  
			/*
			 * System.out.println("Unsorted:");
			for( int i=0; i<otherList.size(); i++ )
	            System.out.println(otherList.get(i) );
	        System.out.println();
	        */
	        System.out.println("           ");
			System.out.println("Sorted:");
	        for( int i=0; i<sortList.size(); i++ )
	            System.out.println(sortList.get(i) );
	        System.out.println();
	    menu();

	}

	public static void insertionSort(){
		rand = new Random();
		for(int i = 0; i < 50; i++){
			saveName = rand.nextInt(1000) + 1;
			//System.out.println(saveName);
			sortList.add(saveName);
			otherList.add(saveName);
		}
		int value;
        int slotLoc;
        for( int i=1; i<sortList.size(); i++ )
        {
            value = sortList.get(i);
            
            slotLoc = i;
            
            while( slotLoc > 0 && sortList.get(slotLoc-1) > value )
            {
                // move the slot to the left
                sortList.set( slotLoc, sortList.get(slotLoc-1) );
                slotLoc--;
            }
            
            // copy the value into the slot
            sortList.set( slotLoc, value );
        }
        System.out.println("Unsorted:");
        for( int i=0; i<otherList.size(); i++ )
            System.out.println(otherList.get(i) );
        System.out.println();
        System.out.println("                 ");
        System.out.println("Sorted:");
        for( int i=0; i<sortList.size(); i++ )
            System.out.println(sortList.get(i) );
        System.out.println();
        menu();
	}
}
