package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Emp;
import com.service.EmpSservice;

@Controller
public class ControllerTest {
		
	@Resource
	private EmpSservice empsevice;
	
	@RequestMapping("/index")
	public String listEmp(Model model) {
		model.addAttribute("Emplist", empsevice.listEmp());
		return "index";
	}
	
	@RequestMapping("/delete")
	public String deleteEmp(Integer eid) {
		empsevice.deleteEmp(eid);
		return "redirect:index";
	}
	
	
	@RequestMapping("/show")
	public String show(Model model,Integer eid) {
		model.addAttribute("Emp", empsevice.getbyidEmp(eid));
		return "show";
	}
	
	@RequestMapping("/updateEmp")
	public String update(Emp emp) {
		System.out.println(emp.toString());
		empsevice.updateEmp(emp);
		return "redirect:index";
	}
	
	
}
