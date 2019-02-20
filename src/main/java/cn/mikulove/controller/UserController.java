package cn.mikulove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@ResponseBody
	@RequestMapping("/users")
	public String findAll(){
		return "show all users";
	}
	
	@GetMapping("/users")
	public String findUser(){
		return "";
	}
}
