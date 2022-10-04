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

import com.example.demo.dto.MetroAll;
import com.example.demo.service.MetroAllService;

@Controller
public class MetroAllController {

	@Autowired
	MetroAllService mas;
	
	@GetMapping(path="/metro")
	public String list(@RequestParam(name="page", defaultValue="0") int page, ModelMap model) {
		List<MetroAll> list=mas.getMetroAlls(page);
		int count=mas.getMetroAllSize();
		//페이지 추가
		int pageCount=count/MetroAllService.LIMIT;
		if(count%MetroAllService.LIMIT>0) {
			pageCount+=1;
		}
		List<Integer> pageList=new ArrayList<>();
		for(int i=0;i<pageCount;i++) {
			pageList.add(i);
		}
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageList", pageList);		
		return "metro";
	}
	
	@PostMapping(path="/write")
	public String write(@ModelAttribute MetroAll metroAll, HttpServletRequest request) {
		String clientIp=request.getRemoteAddr();
		mas.putMetroAll(metroAll);
		return "redirect:metro";
	}
}
