package com.wxfx.smart;		//��Ű�� ����

public class Circle {	//���� ���� ���� Ŭ������ ����
	double rad;
	final double PI;
	
	public Circle(double r) {
		rad=r;
		PI=3.14;
	}
	public double getArea() {
		return(rad*rad)*PI;		//���� ���� ��ȯ
	}

}
