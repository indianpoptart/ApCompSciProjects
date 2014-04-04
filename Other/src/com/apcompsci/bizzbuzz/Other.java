package com.apcompsci.bizzbuzz;

import java.io.IOException;
import java.util.*;


public class Other{
	static ArrayList<String> stringList = new ArrayList<String>();
	public int a[]=new int[50];
	public void merge_sort(int start,int end)
	{
		int mid;
		if(start<end)
		{
			mid=(start+end)/2;
			merge_sort(start,mid);
			merge_sort(mid+1,end);
			merge(start,mid,end);
		}
	}
	public void merge(int start,int mid,int end)
	{
		int h,i,j,k;
		int b[]=new int[50];
		h=start;
		i=start;
		j=mid+1;

		while((h<=mid)&&(j<=end)){
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
		if(h>mid){
			for(k=j;k<=end;k++)
			{
				b[i]=a[k];
				i++;
			}
		}
		else{
			for(k=h;k<=mid;k++)
			{
				b[i]=a[k];
				i++;
			}
		}
		for(k=start;k<=end;k++) a[k]=b[k];
	}
	public Other()
	{
		int num,i;

		System.out.println("             MERGE SORT PROGRAM            ");

		num = 10;
		System.out.println();

		Random rand = new Random();
		for(i=1;i<=num;i++)
		{
			a[i]= rand.nextInt(50);
		}
		System.out.println();
		System.out.println("Unsorted List:");
		System.out.println();
		System.out.println();

		for(i=1;i<=num;i++){
			System.out.print(a[i]+"\n");
		}
		merge_sort(1,num);
		System.out.println();
		System.out.println("Sorted List:");
		System.out.println();
		System.out.println();
		String z = null;
		for(i=1;i<=num;i++){
			System.out.println(a[i]);
		}


	}
	public static void main(String[] args) {
		new Other();
	}
}