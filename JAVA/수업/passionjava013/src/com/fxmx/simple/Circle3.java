package com.fxmx.simple;

public class Circle3 {
	double rad;
	final double PI;
	
	public Circle3(double r) {
		rad=r;
		PI=3.14;
	}
	public double getPerimeter() {
		return(rad*2)*PI;
	}
}
