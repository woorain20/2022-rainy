package com.wxfx.smart;

public class Circle2 {
	double rad;
	final double PI;
	
	public Circle2(double r) {
		rad=r;
		PI=3.14;
	}
	public double getArea() {
		return (rad*rad)*PI;
	}
}
