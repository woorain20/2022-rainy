package com.fxmx.simple;

public class Circle2 {
	double rad;
	final double PI;
	
	public Circle2(double r) {
		rad=r;
		PI=3.14;
	}
	public double getPerimeter() {
		return (rad*2)*PI;
	}

}
