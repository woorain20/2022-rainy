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

import com.example.demo.dto.SeoulStation;
import com.example.demo.service.SeoulStationService;

@Controller
public class SeoulStationController {

	@Autowired
	SeoulStationService sss;
	
	@GetMapping(path="/seoulstation")
	public String list(@RequestParam(name="page", defaultValue="0") int page, ModelMap model) {
		List<SeoulStation> list=sss.getSeoulStation(page);
		int count=sss.getSeoulStationSize();
		//페이지 추가
		int pageCount=count/SeoulStationService.LIMIT;
		if(count%SeoulStationService.LIMIT>0) {
			pageCount+=1;
		}
		List<Integer> pageList=new ArrayList<>();
		for(int i=0;i<pageCount;i++) {
			pageList.add(i);
		}
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageList", pageList);
		return "seoulstation";
	}
	
	@PostMapping(path="/write3")
	public String write(@ModelAttribute SeoulStation seoulStation, HttpServletRequest request) {
		String clientIp=request.getRemoteAddr();
		sss.putSeoulStation(seoulStation);
		return "redirect:seoulstation";
	}
}
