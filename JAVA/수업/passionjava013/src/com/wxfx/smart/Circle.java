package com.wxfx.smart;		//패키지 선언

public class Circle {	//원의 넓이 관련 클래스의 정의
	double rad;
	final double PI;
	
	public Circle(double r) {
		rad=r;
		PI=3.14;
	}
	public double getArea() {
		return(rad*rad)*PI;		//원의 넓이 반환
	}

}
