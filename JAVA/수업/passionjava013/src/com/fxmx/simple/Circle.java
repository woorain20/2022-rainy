package com.fxmx.simple;	//패키지 선언

public class Circle {	//원의 둘레 관련 클래스 정의
	double rad;
	final double PI;
	
	public Circle(double r) {
		rad=r;
		PI=3.14;
	}
	public double getPerimeter() {
		return (rad*2)*PI;		//원의 둘레를 반환
	}

}
