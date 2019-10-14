package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.Goods;
import com.example.demo.service.MyService;

@Controller
public class MyController {

	@Autowired
	private MyService service;
	
	@RequestMapping("list")
	public String list(Model model){
		
		List<Goods> list = service.list();
		model.addAttribute("list", list);
		return "list";
		
	}
}
