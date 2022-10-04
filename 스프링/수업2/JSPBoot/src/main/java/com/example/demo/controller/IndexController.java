package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping(path="/")	//path의 "/"는 최상의 주소로 연결
	public String getIndex() {
//		System.out.println("/ 주소 요청 됨");
		return "index";
	}
}
