package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.League;

@Controller
public class LeagueController {

	@RequestMapping(path="/main", method=RequestMethod.GET)	//여러개 넣으려면 중괄호 해주고 ,해서 추가하면 됨
	public String main() {
		return "main";
	}
	@RequestMapping(path="/regist", method=RequestMethod.POST)	//여러개 넣으려면 중괄호 해주고 ,해서 추가하면 됨
	public String regist(@ModelAttribute League league, ModelMap model) {
//		System.out.println(league);
		model.addAttribute("league", league);
		return "main";
	}
}
