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

import com.example.demo.dto.DaeguMetro;
import com.example.demo.service.DaeguMetroService;

@Controller
public class DaeguMetroController {

	@Autowired
	DaeguMetroService dms;
	
	@GetMapping(path="/daegu")
	public String list(@RequestParam(name="page", defaultValue="0") int page, ModelMap model) {
		List<DaeguMetro> list=dms.getDaeguMetros(page);
		int count=dms.getDaeguMetroSize();
		//페이지 추가
		int pageCount=count/DaeguMetroService.LIMIT;
		if(count%DaeguMetroService.LIMIT>0) {
			pageCount+=1;
		}
		List<Integer> pageList=new ArrayList<>();
		for(int i=0;i<pageCount;i++) {
			pageList.add(i);
		}
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageList", pageList);	
		return "daegu";
	}
	@PostMapping(path="/write2")
	public String write(@ModelAttribute DaeguMetro daeguMetro, HttpServletRequest request) {
		String clientIp=request.getRemoteAddr();
		dms.putDaeguMetro(daeguMetro);
		return "redirect:daegu";
	}
}
