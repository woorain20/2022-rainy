package com.example.diexam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //어노테이션 
//ctrl+shift+o -> 자동임포트
public class ApplicationConfig {
	//인스턴스 -> 조립 -> 프로그램
	//DI - 의존성 주입
	@Bean
	public Car car(Engine e) {
		Car c=new Car();
		c.setEngine(e);
		return c;
	}
	@Bean
	public Engine engine() {
		return new Engine();
	}
	
}
