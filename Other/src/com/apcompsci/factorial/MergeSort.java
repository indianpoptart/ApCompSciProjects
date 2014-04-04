package com.apcompsci.factorial;

import java.util.Random;

public class MergeSort{
	public int a[]=new int[50];
	public void merge(int start,int end)
	{
		int mid;
		if(start<end) //recursion
		{
			mid=(start+end)/2;
			merge(start,mid);
			merge(mid+1,end);
			doMergeSort(start,mid,end);
		}
	}
	public void doMergeSort(int start,int mid,int end)
	{
		int h,i,j,k;
		int b[]=new int[11]; //make temp array
		h=start;
		i=start;
		j=mid+1;

		while((h<=mid)&&(j<=end))
		{
			if(a[h]<=a[j]) //check numbers from start of array and middle +1 of array
			{
				b[i]=a[h];
				h++;
			}
			else
			{
				b[i]=a[j];
				j++;
			}
			i++;
		}
		if(h>mid)
		{
			for(k=j;k<=end;k++)
			{
				b[i]=a[k];
				i++;
			}
		}
		else
		{
			for(k=h;k<=mid;k++)
			{
				b[i]=a[k];
				i++;
			}
		}
		for(k=start;k<=end;k++) {
			a[k]=b[k]; //Set temp array to original array
		}
	}
	public MergeSort()
	{
		int num,i;

		System.out.println("             MERGE SORT PROGRAM            ");

		System.out.println();
		num=10;
		System.out.println();
		Random rand = new Random();
		for(i=1;i<=num;i++)
		{
			int in = rand.nextInt(100) + 1;
			a[i]= in;
		}
		System.out.println("-------------");
		System.out.println("Unsorted:");
		System.out.println("-------------");

		for(i=1;i<=num;i++){
			System.out.println(a[i]);
		}
		System.out.println("-------------");
		merge(1,num);
		System.out.println("Sorted:");
		System.out.println("-------------");

		for(i=1;i<=num;i++){
			System.out.println(a[i]);
		}
		System.out.println("-------------");


	}
	public static void main(String[] args) {
		new MergeSort();
	}
}