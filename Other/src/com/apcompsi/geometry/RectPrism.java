package com.apcompsi.geometry;

public class RectPrism {
	public double volumePrism(double l, double w, double h){
		double volume;
		volume = l*w*h;
		return volume;
	}
	public double areaPrism(double l, double w, double h){
		double area;
		area = 2*((w*h)+(l*w)+(l*h));
		return area;
	}
}
