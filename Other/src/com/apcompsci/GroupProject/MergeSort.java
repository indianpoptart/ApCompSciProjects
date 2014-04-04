package com.apcompsci.GroupProject;

import java.util.Random;

public class MergeSort{
	public int a[]=new int[50];
	public void merge(int start,int end)
	{
		int mid;
		if(start<end)
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
		int b[]=new int[50];
		h=start;
		i=start;
		j=mid+1;

		while((h<=mid)&&(j<=end))
		{
			if(a[h]<=a[j])
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
		for(k=start;k<=end;k++) a[k]=b[k];
	}
	public MergeSort()
	{
		int num,i;

		System.out.println("             MERGE SORT PROGRAM            ");

		System.out.println();
		System.out.println();
		num=10;
		System.out.println();
		Random rand = new Random();
		for(i=1;i<=num;i++)
		{
			int in = rand.nextInt(50) + 1;
			a[i]= in;
		}
		System.out.println();
		System.out.println("Unsorted:");
		System.out.println();
		System.out.println();

		for(i=1;i<=num;i++){
			System.out.println(a[i]);
		}
		merge(1,num);
		System.out.println();
		System.out.println("Sorted:");
		System.out.println();
		System.out.println();

		for(i=1;i<=num;i++){
			System.out.println(a[i]);
		}


	}
	public static void main(String[] args) {
		new MergeSort();
	}
}