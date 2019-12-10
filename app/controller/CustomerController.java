package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dao.ICustomerDao;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerDao dao;
	
	@GetMapping("/list")
	public String getAllCust(Model map) {
		System.out.println("in controller");
		map.addAttribute("Cust_list",dao.getCustomers());
		return "/customer/list";
	}
	
}
