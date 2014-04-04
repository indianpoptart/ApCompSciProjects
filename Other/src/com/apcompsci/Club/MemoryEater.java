package com.apcompsci.Club;

import java.util.Vector;

public class MemoryEater
{
	public static void main(String[] args) throws OutOfMemoryError
	{
		Vector<byte[]> v = new Vector<byte[]>();
		//for (int i=0; i<1000; i++ )
		while (true)
		{
			try{
				byte b[] = new byte[1048576];
				v.add(b);
				Runtime rt = Runtime.getRuntime();

				System.out.println( "free memory: " + rt.freeMemory() );
			}
			catch(OutOfMemoryError e){
				System.out.println("Error: " + e + " out of memory");
				break;
			}

		}



	}
}