package com.apcompsi.geometry;

public class Sphere {
	public double volumeSphere(double r){
		double volume;
		volume = 4*(Math.PI)*(r*r);
		return volume;
	}
	public double areaSphere(double r){
		double area;
		area =(1.333)*(Math.PI)*(r*r*r);
		return area;
	}
}
