package com.apcompsi.geometry;

public class Cone {
	public double areacone(double r, double s) {
		double area;
		area = (Math.PI) * r * s;
		return area;
		}
	public double volumecone(double r, double h){
		double volume;
		volume = (Math.PI)*(0.33)*(r*r)*h;
		return volume;
	}
	
	
}




