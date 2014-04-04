package com.nikhilparanjape.matryoshka;
public class MatryoshkaRunner 
{
	public static void main(String[] args)
	{
		Matryoshka m1 = new Matryoshka(null, "Nikhil", java.awt.Color.RED, true);
		Matryoshka m2 = new Matryoshka(m1, "Jai", java.awt.Color.BLACK, false);
		Matryoshka m3 = new Matryoshka(m2, "Mike", java.awt.Color.CYAN, true);
		Matryoshka m4 = new Matryoshka(m3, "Jack", java.awt.Color.YELLOW, true);
		Matryoshka m5 = new Matryoshka(m4, "Brian", java.awt.Color.RED, true);
		Matryoshka m6 = new Matryoshka(m5, "Zip", java.awt.Color.GREEN, false);
		Matryoshka m7 = new Matryoshka(m6, "Patrick", java.awt.Color.CYAN, false);
		Matryoshka m8 = new Matryoshka(m7, "Batman", java.awt.Color.RED, false);
		Matryoshka m9 = new Matryoshka(m8, "Text", java.awt.Color.BLACK, true);
		Matryoshka m10 = new Matryoshka(m9, "Jordan", java.awt.Color.BLACK, false);

		try{
			System.out.println(m10.toString());
		} catch(NullPointerException e) {
			System.out.println("A Null Pointer Exception was caught");
			System.out.println("It seems to be an issue around here.");
		}
		catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bounds? Again?");
        }

	}

}
