package chapter8;

import java.util.Scanner;

//import java.util.*;
//*-all

import com.wxfx.smart.Circle;

public class CircleApp {
	private final String getUsersSql="select * from table";
	public static void main(String[] args) {
		Circle circle=new Circle(4);
		System.out.println("원의 넓이: "+circle.getArea());
		com.fxmx.simple.Circle circle2=new com.fxmx.simple.Circle(4);
		System.out.println("원의 둘레: "+circle2.getPerimeter());
		//ctrl+shift+o -> 자동 임포트
		Scanner scanner=new Scanner(System.in);
	}

}
