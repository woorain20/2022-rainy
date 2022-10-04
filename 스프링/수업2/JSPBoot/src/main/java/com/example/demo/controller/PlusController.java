package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlusController {
	//localhost(127.0.0.1):8080 다음부터 시작하는 상대주소
	@GetMapping(path="/plusform")
	public String plusform() {
		return "plusForm";
	}
	//get방식은 주소창에 엽력값 등의 값이 다 보임
//	@GetMapping(path="/plus")
//	public String plus(@RequestParam(name="value1") int value1, @RequestParam(name="value2") int value2, ModelMap modelMap){
////		System.out.println(value1);
////		System.out.println(value2);
//		int result=value1+value2;
//		modelMap.addAttribute("value1", value1);
//		modelMap.addAttribute("value2", value2);
//		modelMap.addAttribute("result", result);
//		return "plusResult";
//	}
	//post 방식은 주소창에 입력값 등의 값이 보이지 않음, 보안상으로 위험성이 있는 데이터 전송 받을 때는 필히 post 방식으로
	@PostMapping(path="/plus")
	public String plusPost(@RequestParam(name="value1") int value1, @RequestParam(name="value2") int value2, ModelMap modelMap){
//		System.out.println(value1);
//		System.out.println(value2);
		int result=value1+value2;
		modelMap.addAttribute("value1", value1);
		modelMap.addAttribute("value2", value2);
		modelMap.addAttribute("result", result);
		return "plusResult";
	}
}
