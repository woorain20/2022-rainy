package com.example.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	
	public static void main(String[] args) {
		//어노테이션 사용 전
//		Engine engine=new Engine();
//		Car car=new Car();
//		car.setEngine(engine);	//DI - 의존성이 주입이 되는 순간
//		car.run();
		
		//어노테이션 사용방법1
//		ApplicationContext ac=new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		Car car=(Car)ac.getBean("car");
		
		//어노테이션 사용방법2 - Component
		ApplicationContext ac=new AnnotationConfigApplicationContext(ApplicationConfig2.class);
		Car car=ac.getBean(Car.class);
		car.run();
	}
}
