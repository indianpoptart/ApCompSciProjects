package com.apcompsci.GroupProject;

import java.util.ArrayList;

//Nikhil Paranjape
public class QuickSort
{
	public static void main(String[] args){
		// declare local variables
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//insert random numbers into array
		for(int i = 0; i <= 50; i++){
			int rand = (int) (Math.random()*100 + 1);
			arr.add(rand);
		}

		// print the unsorted values
		System.out.println("The unsorted values are:");
		System.out.println(arr);
		quickSort(arr, 0, arr.size()-1); //sort the array
		// print the sorted values
		System.out.println("                      ");
		System.out.println("The sorted values are:");
		System.out.println(arr);

	}
	public static void quickSort(ArrayList<Integer> arr, int lo, int hi)
	{
		int pivot;

		//base case
		if( lo >= hi )
			return;
		//recursive method
		pivot = partition( arr, lo, hi );
		quickSort( arr, lo, pivot-1 );
		quickSort( arr, pivot+1, hi );
	}
	public static int partition(ArrayList<Integer> arr, int lo, int hi)
	{
		int pivotVal = arr.get( lo );
		int right = hi;
		int left = lo + 1;

		while( left <= right ){
			while(left <= hi && arr.get(left) <= pivotVal )
				left++;

			while(arr.get(right) > pivotVal )
				right--;

			if( left < right )
			{
				swap( arr, left, right );
				left++;
				right--;
			}
		}
		swap( arr, lo, right );

		// right contains the pivot value
		return right;
	}


	public static void swap(ArrayList<Integer> arr, int i, int j)
	{
		int temp = arr.get(i);
		arr.set( i, arr.get(j) );
		arr.set( j, temp );
		i++;
		j++;
	}
}