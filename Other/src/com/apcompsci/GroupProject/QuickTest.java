package com.apcompsci.GroupProject;

import java.util.ArrayList;

public class QuickSort {
	static ArrayList<Integer> sortList = new ArrayList<Integer>();
	static int pivot = 0;
	public static void main(String[] args)
	{
		for(int i = 0; i <= 50; i++){
			int rand = (int) (Math.random()*100 + 1);
			sortList.add(rand);
		}
		System.out.println("Unsorted:" + sortList);
		pivot = sortList.get((int) (Math.random()*sortList.size()-1 + 1));
		int lower = 0;
		int z = sortList.size() -1;
		quickSort(lower, z);
		System.out.println("Sorted:" + sortList);
	}
	public static void quickSort(int start, int end){
		if(end > start){
			partition(start, end);
			quickSort(start, pivot -1);
			quickSort(pivot + 1, end);
			System.out.println(end-start);
		}
	}
	public static void partition(int start, int end){
		if((end - start) < 2){
			return;
		}
		
		int l = start;
		int u = end;
		int pv = sortList.get(pivot);
		int lt = sortList.get(l);
		int ut = sortList.get(u);
		while(l < u){
			while(lt <= pv){
				l = l+1;
			}
			while(ut >= pv){
				u = u - 1;
			}
			swap(l, u);
		}
		
	}
	public static void swap (int x, int y)
	   {
	      sortList.set(x, y);
	      sortList.set(y, x);
	      
	   }
	
}
