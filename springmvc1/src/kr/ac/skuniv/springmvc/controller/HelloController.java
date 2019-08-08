package kr.ac.skuniv.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.skuniv.springmvc.dto.Member;


@Controller
public class HelloController {
	
	@RequestMapping("/hello")	
	public String hello() {
		return "hello";		//view 이름
	}
	
	@RequestMapping("/tt")
	public String test(Model model) {
		
		String name = "kimtaehee";
		//request.setAttribute("name", name);
		model.addAttribute("name", name);
		
		return "test";
		
	}
	
	@RequestMapping("/inputName")
	public String name(String name ,Model model) {
		System.out.println(name);
		model.addAttribute("name", name);
		
		return "inputName";
		
	}
	
	@GetMapping("/memberForm")
	public String memberForm() {
		return "memberForm";
		
	}
	
	@PostMapping("/memberSave")
	public String memberSave(Member member) {
		System.out.println(member);
		return "redirect:hello";
		
	}

}
