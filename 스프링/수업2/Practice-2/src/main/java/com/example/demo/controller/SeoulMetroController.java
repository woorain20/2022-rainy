package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.SeoulMetro;
import com.example.demo.service.SeoulMetroService;

@Controller
public class SeoulMetroController {

	@Autowired
	SeoulMetroService sms;
	
	@GetMapping(path="/seoul")
	public String list(@RequestParam(name="page", defaultValue="0") int page, ModelMap model) {
		List<SeoulMetro> list=sms.getSeoulMetros(page);
		int count=sms.getSeoulMetroSize();
		//페이지 추가
		int pageCount=count/SeoulMetroService.LIMIT;
		if(count%SeoulMetroService.LIMIT>0) {
			pageCount+=1;
		}
		List<Integer> pageList=new ArrayList<>();
		for(int i=0;i<pageCount;i++) {
			pageList.add(i);
		}
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageList", pageList);	
		return "seoul";
	}
	
	@PostMapping(path="/write1")
	public String write(@ModelAttribute SeoulMetro seoulMetro, HttpServletRequest request) {
		String clientIp=request.getRemoteAddr();
		sms.putSeoulMetro(seoulMetro);
		return "redirect:seoul";
	}
}
