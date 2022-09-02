package com.example.diexam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Engine v8;
	//private Engine v8=new Engine(); 이런식으로 주입시키는 것도 가능
	
	public Car(){
		System.out.println("Car 생성자");
	}
	
	public void setEngine(Engine e) {
		this.v8=e;
	}
	
	public void run() {
		System.out.println("엔진을 이용하여 달립니다.");
		v8.exec();
	}
}
