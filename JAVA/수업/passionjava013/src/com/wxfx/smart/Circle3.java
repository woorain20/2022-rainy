package com.wxfx.smart;

public class Circle3 {
	double rad;
	final double PI;
	
	public Circle3(double r) {
		rad=r;
		PI=3.14;
	}
	public double getArea() {
		return(rad*rad)*PI;
	}
}
