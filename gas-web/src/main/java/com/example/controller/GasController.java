package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.TOrderManage;
import com.example.service.GasService;



@Controller
public class GasController {
	@Autowired
	private GasService service;
	@RequestMapping(value = "/",method = {RequestMethod.GET,RequestMethod.POST})
	public String home() {
		List<TOrderManage> data = new ArrayList<>();
		data = service.selectAll();
		System.out.println("Data ---> "+ data.size());
		return "index";
	}

}
