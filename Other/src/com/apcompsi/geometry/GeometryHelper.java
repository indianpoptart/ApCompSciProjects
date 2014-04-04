package com.apcompsi.geometry;

import java.util.Scanner;

public class GeometryHelper {
	public static void main(String[] args) {
		System.out.println("What do you need help with?");
		System.out.println("A: Cone");
		System.out.println("B: Cylinder");
		System.out.println("C: Spehere");
		System.out.println("D: Rectangular Prism");
		stepTwo();
	}
	public static void stepTwo(){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.equalsIgnoreCase("A")){
			System.out.println("What is the radius?");
			double rad = sc.nextDouble();
			System.out.println("What is the height?");
			double hght = sc.nextDouble();
			Cone c = new Cone();
			System.out.println("Volume: " + c.volumecone(rad,hght));
			System.out.println("Surface Area: " + c.areacone(rad,hght));

		}
		else if(input.equalsIgnoreCase("B")){
			System.out.println("What is the radius?");
			double rad = sc.nextDouble();
			System.out.println("What is the height?");
			double hght = sc.nextDouble();
			Cylinder c = new Cylinder();
			System.out.println("Volume: " + c.volumeCylinder(rad,hght));
			System.out.println("Surface Area: " + c.areaCylinder(rad,hght));
		}
		else if(input.equalsIgnoreCase("C")){
			System.out.println("What is the radius?");
			double rad = sc.nextDouble();
			Sphere c = new Sphere();
			System.out.println("Volume: " + c.volumeSphere(rad));
			System.out.println("Surface Area: " + c.areaSphere(rad));

		}
		else if(input.equalsIgnoreCase("D")){
			System.out.println("What is the length?");
			double leg = sc.nextDouble();
			System.out.println("What is the width?");
			double width = sc.nextDouble();
			System.out.println("What is the height?");
			double height = sc.nextDouble();
			RectPrism c = new RectPrism();
			System.out.println("Volume: " + c.volumePrism(leg,width,height));
			System.out.println("Surface Area: " + c.areaPrism(leg,width,height));
		}

	}


}
