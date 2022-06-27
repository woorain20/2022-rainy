package com.wxfx.smart;

public class Circle {
	//패키지 1. 이름충돌이 없다 2. 정리 구분
	double rad;
	final double PI;
	public Circle(double r) {
		rad=r;
		PI=3.14;
	}
	public double getArea() {
		return (rad*rad)*PI	;
	}
}
