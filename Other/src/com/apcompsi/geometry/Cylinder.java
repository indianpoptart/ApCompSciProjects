package com.apcompsi.geometry;

public class Cylinder {
	public double volumeCylinder(double r, double h){
		double volume;
		volume = (Math.PI)*(r*r)*h;
		return volume;
		
	}
	public double areaCylinder(double r, double h){
		double area;
		area = 2*(Math.PI)*(r*r) + 2*(Math.PI)*r*h;
		return area;
	}
}
