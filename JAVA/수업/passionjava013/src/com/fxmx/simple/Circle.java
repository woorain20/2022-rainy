package com.fxmx.simple;	//��Ű�� ����

public class Circle {	//���� �ѷ� ���� Ŭ���� ����
	double rad;
	final double PI;
	
	public Circle(double r) {
		rad=r;
		PI=3.14;
	}
	public double getPerimeter() {
		return (rad*2)*PI;		//���� �ѷ��� ��ȯ
	}

}
