package com.wxfx.smart;

public class Circle {
	//��Ű�� 1. �̸��浹�� ���� 2. ���� ����
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
